package com.example.lab2;

public class Breed {
    private static int count = 1;

    private int id;

    private String mName;
    private String mTemperament;
    private String mDescription;

    public Breed(String mName, String mTemperament, String mDescription) {
        this.id = count++;
        this.mName = mName;
        this.mTemperament = mTemperament;
        this.mDescription = mDescription;
    }

    public String getName() {
        return mName;
    }

    public String getTemperament() {
        return mTemperament;
    }

    public static long getCount() {
        return count;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return mDescription;
    }

    public static void setCount(int count) {
        Breed.count = count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmTemperament(String mTemperament) {
        this.mTemperament = mTemperament;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}

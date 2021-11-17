package org.studyeasy;

import org.studyeasy.vehicles.Bike;
import org.studyeasy.vehicles.Truck;
import org.studyeasy.vehicles.car;

public class Demo{
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.handle="short";
		bike.engine="petrol";
		car Car=new car();
		Car.fridge="cool";
		Truck truk=new Truck();
		truk.container=2;
		System.out.println(bike.handle);
		System.out.println(bike.engine);
		System.out.println(Car.fridge);
		System.out.println(truk.container);
		
	}
}
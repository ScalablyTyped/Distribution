package typings.suncalc

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("suncalc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTime(angleInDegrees: Double, morningName: String, eveningName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTime")(angleInDegrees.asInstanceOf[js.Any], morningName.asInstanceOf[js.Any], eveningName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getMoonIllumination(timeAndDate: Date): GetMoonIlluminationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("getMoonIllumination")(timeAndDate.asInstanceOf[js.Any]).asInstanceOf[GetMoonIlluminationResult]
  
  inline def getMoonPosition(timeAndDate: Date, latitude: Double, longitude: Double): GetMoonPositionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getMoonPosition")(timeAndDate.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[GetMoonPositionResult]
  
  inline def getMoonTimes(date: Date, latitude: Double, longitude: Double): GetMoonTimes_ = (^.asInstanceOf[js.Dynamic].applyDynamic("getMoonTimes")(date.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[GetMoonTimes_]
  inline def getMoonTimes(date: Date, latitude: Double, longitude: Double, inUTC: Boolean): GetMoonTimes_ = (^.asInstanceOf[js.Dynamic].applyDynamic("getMoonTimes")(date.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], inUTC.asInstanceOf[js.Any])).asInstanceOf[GetMoonTimes_]
  
  inline def getPosition(timeAndDate: Date, latitude: Double, longitude: Double): GetSunPositionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(timeAndDate.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[GetSunPositionResult]
  
  inline def getTimes(date: Date, latitude: Double, longitude: Double): GetTimesResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimes")(date.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[GetTimesResult]
  
  trait GetMoonIlluminationResult extends StObject {
    
    var angle: Double
    
    var fraction: Double
    
    var phase: Double
  }
  object GetMoonIlluminationResult {
    
    inline def apply(angle: Double, fraction: Double, phase: Double): GetMoonIlluminationResult = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], fraction = fraction.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMoonIlluminationResult]
    }
    
    extension [Self <: GetMoonIlluminationResult](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setFraction(value: Double): Self = StObject.set(x, "fraction", value.asInstanceOf[js.Any])
      
      inline def setPhase(value: Double): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetMoonPositionResult extends StObject {
    
    var altitude: Double
    
    var azimuth: Double
    
    var distance: Double
    
    var parallacticAngle: Double
  }
  object GetMoonPositionResult {
    
    inline def apply(altitude: Double, azimuth: Double, distance: Double, parallacticAngle: Double): GetMoonPositionResult = {
      val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], azimuth = azimuth.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], parallacticAngle = parallacticAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMoonPositionResult]
    }
    
    extension [Self <: GetMoonPositionResult](x: Self) {
      
      inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      inline def setAzimuth(value: Double): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
      
      inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
      
      inline def setParallacticAngle(value: Double): Self = StObject.set(x, "parallacticAngle", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetMoonTimes_ extends StObject {
    
    var alwaysDown: Boolean
    
    var alwaysUp: Boolean
    
    var rise: Date
    
    var set: Date
  }
  object GetMoonTimes_ {
    
    inline def apply(alwaysDown: Boolean, alwaysUp: Boolean, rise: Date, set: Date): GetMoonTimes_ = {
      val __obj = js.Dynamic.literal(alwaysDown = alwaysDown.asInstanceOf[js.Any], alwaysUp = alwaysUp.asInstanceOf[js.Any], rise = rise.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMoonTimes_]
    }
    
    extension [Self <: GetMoonTimes_](x: Self) {
      
      inline def setAlwaysDown(value: Boolean): Self = StObject.set(x, "alwaysDown", value.asInstanceOf[js.Any])
      
      inline def setAlwaysUp(value: Boolean): Self = StObject.set(x, "alwaysUp", value.asInstanceOf[js.Any])
      
      inline def setRise(value: Date): Self = StObject.set(x, "rise", value.asInstanceOf[js.Any])
      
      inline def setSet(value: Date): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetSunPositionResult extends StObject {
    
    var altitude: Double
    
    var azimuth: Double
  }
  object GetSunPositionResult {
    
    inline def apply(altitude: Double, azimuth: Double): GetSunPositionResult = {
      val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], azimuth = azimuth.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSunPositionResult]
    }
    
    extension [Self <: GetSunPositionResult](x: Self) {
      
      inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      inline def setAzimuth(value: Double): Self = StObject.set(x, "azimuth", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetTimesResult extends StObject {
    
    var dawn: Date
    
    var dusk: Date
    
    var goldenHour: Date
    
    var goldenHourEnd: Date
    
    var nadir: Date
    
    var nauticalDawn: Date
    
    var nauticalDusk: Date
    
    var night: Date
    
    var nightEnd: Date
    
    var solarNoon: Date
    
    var sunrise: Date
    
    var sunriseEnd: Date
    
    var sunset: Date
    
    var sunsetStart: Date
  }
  object GetTimesResult {
    
    inline def apply(
      dawn: Date,
      dusk: Date,
      goldenHour: Date,
      goldenHourEnd: Date,
      nadir: Date,
      nauticalDawn: Date,
      nauticalDusk: Date,
      night: Date,
      nightEnd: Date,
      solarNoon: Date,
      sunrise: Date,
      sunriseEnd: Date,
      sunset: Date,
      sunsetStart: Date
    ): GetTimesResult = {
      val __obj = js.Dynamic.literal(dawn = dawn.asInstanceOf[js.Any], dusk = dusk.asInstanceOf[js.Any], goldenHour = goldenHour.asInstanceOf[js.Any], goldenHourEnd = goldenHourEnd.asInstanceOf[js.Any], nadir = nadir.asInstanceOf[js.Any], nauticalDawn = nauticalDawn.asInstanceOf[js.Any], nauticalDusk = nauticalDusk.asInstanceOf[js.Any], night = night.asInstanceOf[js.Any], nightEnd = nightEnd.asInstanceOf[js.Any], solarNoon = solarNoon.asInstanceOf[js.Any], sunrise = sunrise.asInstanceOf[js.Any], sunriseEnd = sunriseEnd.asInstanceOf[js.Any], sunset = sunset.asInstanceOf[js.Any], sunsetStart = sunsetStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTimesResult]
    }
    
    extension [Self <: GetTimesResult](x: Self) {
      
      inline def setDawn(value: Date): Self = StObject.set(x, "dawn", value.asInstanceOf[js.Any])
      
      inline def setDusk(value: Date): Self = StObject.set(x, "dusk", value.asInstanceOf[js.Any])
      
      inline def setGoldenHour(value: Date): Self = StObject.set(x, "goldenHour", value.asInstanceOf[js.Any])
      
      inline def setGoldenHourEnd(value: Date): Self = StObject.set(x, "goldenHourEnd", value.asInstanceOf[js.Any])
      
      inline def setNadir(value: Date): Self = StObject.set(x, "nadir", value.asInstanceOf[js.Any])
      
      inline def setNauticalDawn(value: Date): Self = StObject.set(x, "nauticalDawn", value.asInstanceOf[js.Any])
      
      inline def setNauticalDusk(value: Date): Self = StObject.set(x, "nauticalDusk", value.asInstanceOf[js.Any])
      
      inline def setNight(value: Date): Self = StObject.set(x, "night", value.asInstanceOf[js.Any])
      
      inline def setNightEnd(value: Date): Self = StObject.set(x, "nightEnd", value.asInstanceOf[js.Any])
      
      inline def setSolarNoon(value: Date): Self = StObject.set(x, "solarNoon", value.asInstanceOf[js.Any])
      
      inline def setSunrise(value: Date): Self = StObject.set(x, "sunrise", value.asInstanceOf[js.Any])
      
      inline def setSunriseEnd(value: Date): Self = StObject.set(x, "sunriseEnd", value.asInstanceOf[js.Any])
      
      inline def setSunset(value: Date): Self = StObject.set(x, "sunset", value.asInstanceOf[js.Any])
      
      inline def setSunsetStart(value: Date): Self = StObject.set(x, "sunsetStart", value.asInstanceOf[js.Any])
    }
  }
}

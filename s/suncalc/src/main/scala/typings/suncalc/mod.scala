package typings.suncalc

import typings.suncalc.suncalcBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("suncalc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addTime(angleInDegrees: Double, morningName: String, eveningName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTime")(angleInDegrees.asInstanceOf[js.Any], morningName.asInstanceOf[js.Any], eveningName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getMoonIllumination(timeAndDate: js.Date): GetMoonIlluminationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("getMoonIllumination")(timeAndDate.asInstanceOf[js.Any]).asInstanceOf[GetMoonIlluminationResult]
  
  inline def getMoonPosition(timeAndDate: js.Date, latitude: Double, longitude: Double): GetMoonPositionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getMoonPosition")(timeAndDate.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[GetMoonPositionResult]
  
  inline def getMoonTimes(date: js.Date, latitude: Double, longitude: Double): GetMoonTimes_ = (^.asInstanceOf[js.Dynamic].applyDynamic("getMoonTimes")(date.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[GetMoonTimes_]
  inline def getMoonTimes(date: js.Date, latitude: Double, longitude: Double, inUTC: Boolean): GetMoonTimes_ = (^.asInstanceOf[js.Dynamic].applyDynamic("getMoonTimes")(date.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any], inUTC.asInstanceOf[js.Any])).asInstanceOf[GetMoonTimes_]
  
  inline def getPosition(timeAndDate: js.Date, latitude: Double, longitude: Double): GetSunPositionResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getPosition")(timeAndDate.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[GetSunPositionResult]
  
  inline def getTimes(date: js.Date, latitude: Double, longitude: Double): GetTimesResult = (^.asInstanceOf[js.Dynamic].applyDynamic("getTimes")(date.asInstanceOf[js.Any], latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[GetTimesResult]
  
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
    
    var alwaysDown: js.UndefOr[`true`] = js.undefined
    
    var alwaysUp: js.UndefOr[`true`] = js.undefined
    
    var rise: js.Date
    
    var set: js.Date
  }
  object GetMoonTimes_ {
    
    inline def apply(rise: js.Date, set: js.Date): GetMoonTimes_ = {
      val __obj = js.Dynamic.literal(rise = rise.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetMoonTimes_]
    }
    
    extension [Self <: GetMoonTimes_](x: Self) {
      
      inline def setAlwaysDown(value: `true`): Self = StObject.set(x, "alwaysDown", value.asInstanceOf[js.Any])
      
      inline def setAlwaysDownUndefined: Self = StObject.set(x, "alwaysDown", js.undefined)
      
      inline def setAlwaysUp(value: `true`): Self = StObject.set(x, "alwaysUp", value.asInstanceOf[js.Any])
      
      inline def setAlwaysUpUndefined: Self = StObject.set(x, "alwaysUp", js.undefined)
      
      inline def setRise(value: js.Date): Self = StObject.set(x, "rise", value.asInstanceOf[js.Any])
      
      inline def setSet(value: js.Date): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
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
    
    var dawn: js.Date
    
    var dusk: js.Date
    
    var goldenHour: js.Date
    
    var goldenHourEnd: js.Date
    
    var nadir: js.Date
    
    var nauticalDawn: js.Date
    
    var nauticalDusk: js.Date
    
    var night: js.Date
    
    var nightEnd: js.Date
    
    var solarNoon: js.Date
    
    var sunrise: js.Date
    
    var sunriseEnd: js.Date
    
    var sunset: js.Date
    
    var sunsetStart: js.Date
  }
  object GetTimesResult {
    
    inline def apply(
      dawn: js.Date,
      dusk: js.Date,
      goldenHour: js.Date,
      goldenHourEnd: js.Date,
      nadir: js.Date,
      nauticalDawn: js.Date,
      nauticalDusk: js.Date,
      night: js.Date,
      nightEnd: js.Date,
      solarNoon: js.Date,
      sunrise: js.Date,
      sunriseEnd: js.Date,
      sunset: js.Date,
      sunsetStart: js.Date
    ): GetTimesResult = {
      val __obj = js.Dynamic.literal(dawn = dawn.asInstanceOf[js.Any], dusk = dusk.asInstanceOf[js.Any], goldenHour = goldenHour.asInstanceOf[js.Any], goldenHourEnd = goldenHourEnd.asInstanceOf[js.Any], nadir = nadir.asInstanceOf[js.Any], nauticalDawn = nauticalDawn.asInstanceOf[js.Any], nauticalDusk = nauticalDusk.asInstanceOf[js.Any], night = night.asInstanceOf[js.Any], nightEnd = nightEnd.asInstanceOf[js.Any], solarNoon = solarNoon.asInstanceOf[js.Any], sunrise = sunrise.asInstanceOf[js.Any], sunriseEnd = sunriseEnd.asInstanceOf[js.Any], sunset = sunset.asInstanceOf[js.Any], sunsetStart = sunsetStart.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetTimesResult]
    }
    
    extension [Self <: GetTimesResult](x: Self) {
      
      inline def setDawn(value: js.Date): Self = StObject.set(x, "dawn", value.asInstanceOf[js.Any])
      
      inline def setDusk(value: js.Date): Self = StObject.set(x, "dusk", value.asInstanceOf[js.Any])
      
      inline def setGoldenHour(value: js.Date): Self = StObject.set(x, "goldenHour", value.asInstanceOf[js.Any])
      
      inline def setGoldenHourEnd(value: js.Date): Self = StObject.set(x, "goldenHourEnd", value.asInstanceOf[js.Any])
      
      inline def setNadir(value: js.Date): Self = StObject.set(x, "nadir", value.asInstanceOf[js.Any])
      
      inline def setNauticalDawn(value: js.Date): Self = StObject.set(x, "nauticalDawn", value.asInstanceOf[js.Any])
      
      inline def setNauticalDusk(value: js.Date): Self = StObject.set(x, "nauticalDusk", value.asInstanceOf[js.Any])
      
      inline def setNight(value: js.Date): Self = StObject.set(x, "night", value.asInstanceOf[js.Any])
      
      inline def setNightEnd(value: js.Date): Self = StObject.set(x, "nightEnd", value.asInstanceOf[js.Any])
      
      inline def setSolarNoon(value: js.Date): Self = StObject.set(x, "solarNoon", value.asInstanceOf[js.Any])
      
      inline def setSunrise(value: js.Date): Self = StObject.set(x, "sunrise", value.asInstanceOf[js.Any])
      
      inline def setSunriseEnd(value: js.Date): Self = StObject.set(x, "sunriseEnd", value.asInstanceOf[js.Any])
      
      inline def setSunset(value: js.Date): Self = StObject.set(x, "sunset", value.asInstanceOf[js.Any])
      
      inline def setSunsetStart(value: js.Date): Self = StObject.set(x, "sunsetStart", value.asInstanceOf[js.Any])
    }
  }
}

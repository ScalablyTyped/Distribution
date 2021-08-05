package typings.timezoneSupport

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lookupConvertMod {
  
  @JSImport("timezone-support/dist/lookup-convert", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertDateToTime(date: Date): Time = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToTime")(date.asInstanceOf[js.Any]).asInstanceOf[Time]
  
  inline def convertTimeToDate(time: Time): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("convertTimeToDate")(time.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  inline def findTimeZone(name: String): TimeZoneInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("findTimeZone")(name.asInstanceOf[js.Any]).asInstanceOf[TimeZoneInfo]
  
  inline def getUTCOffset(date: DateInput, timeZone: TimeZoneInfo): TimeZoneOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("getUTCOffset")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[TimeZoneOffset]
  
  inline def getUnixTime(time: Time): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnixTime")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getUnixTime(time: Time, timeZone: TimeZoneInfo): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnixTime")(time.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getZonedTime(date: DateInput, timeZone: TimeZoneInfo): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("getZonedTime")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[Time]
  
  inline def listTimeZones(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listTimeZones")().asInstanceOf[js.Array[String]]
  
  inline def populateTimeZones(TimeZoneData: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("populateTimeZones")(TimeZoneData.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setTimeZone(time: Date, timeZone: TimeZoneInfo): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeZone")(time.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[Time]
  inline def setTimeZone(time: Date, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeZone")(time.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Time]
  inline def setTimeZone(time: Time, timeZone: TimeZoneInfo): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeZone")(time.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[Time]
  inline def setTimeZone(time: Time, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeZone")(time.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Time]
  
  type DateInput = Date | Double
  
  type PackedTimeZones = StringDictionary[String]
  
  trait SetTimeZoneOptions extends StObject {
    
    var useUTC: Boolean
  }
  object SetTimeZoneOptions {
    
    inline def apply(useUTC: Boolean): SetTimeZoneOptions = {
      val __obj = js.Dynamic.literal(useUTC = useUTC.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetTimeZoneOptions]
    }
    
    extension [Self <: SetTimeZoneOptions](x: Self) {
      
      inline def setUseUTC(value: Boolean): Self = StObject.set(x, "useUTC", value.asInstanceOf[js.Any])
    }
  }
  
  trait Time extends StObject {
    
    var day: Double
    
    var dayOfWeek: js.UndefOr[Double] = js.undefined
    
    var epoch: js.UndefOr[Double] = js.undefined
    
    var hours: Double
    
    var milliseconds: js.UndefOr[Double] = js.undefined
    
    var minutes: Double
    
    var month: Double
    
    var seconds: js.UndefOr[Double] = js.undefined
    
    var year: Double
    
    var zone: js.UndefOr[TimeZoneOffset] = js.undefined
  }
  object Time {
    
    inline def apply(day: Double, hours: Double, minutes: Double, month: Double, year: Double): Time = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Time]
    }
    
    extension [Self <: Time](x: Self) {
      
      inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      inline def setDayOfWeek(value: Double): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
      
      inline def setEpoch(value: Double): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
      
      inline def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      inline def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      inline def setZone(value: TimeZoneOffset): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
      
      inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    }
  }
  
  trait TimeZoneData extends StObject {
    
    var links: js.Array[String]
    
    var zones: PackedTimeZones
  }
  object TimeZoneData {
    
    inline def apply(links: js.Array[String], zones: PackedTimeZones): TimeZoneData = {
      val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any], zones = zones.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeZoneData]
    }
    
    extension [Self <: TimeZoneData](x: Self) {
      
      inline def setLinks(value: js.Array[String]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setLinksVarargs(value: String*): Self = StObject.set(x, "links", js.Array(value :_*))
      
      inline def setZones(value: PackedTimeZones): Self = StObject.set(x, "zones", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeZoneInfo extends StObject {
    
    var name: String
  }
  object TimeZoneInfo {
    
    inline def apply(name: String): TimeZoneInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeZoneInfo]
    }
    
    extension [Self <: TimeZoneInfo](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeZoneOffset extends StObject {
    
    var abbreviation: js.UndefOr[String] = js.undefined
    
    var offset: Double
  }
  object TimeZoneOffset {
    
    inline def apply(offset: Double): TimeZoneOffset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeZoneOffset]
    }
    
    extension [Self <: TimeZoneOffset](x: Self) {
      
      inline def setAbbreviation(value: String): Self = StObject.set(x, "abbreviation", value.asInstanceOf[js.Any])
      
      inline def setAbbreviationUndefined: Self = StObject.set(x, "abbreviation", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}

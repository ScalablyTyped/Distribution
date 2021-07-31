package typings.timezoneSupport

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object index19702038Mod {
  
  @JSImport("timezone-support/dist/index-1970-2038", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def convertDateToTime(date: Date): Time = ^.asInstanceOf[js.Dynamic].applyDynamic("convertDateToTime")(date.asInstanceOf[js.Any]).asInstanceOf[Time]
  
  @scala.inline
  def convertTimeToDate(time: Time): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("convertTimeToDate")(time.asInstanceOf[js.Any]).asInstanceOf[Date]
  
  @scala.inline
  def findTimeZone(name: String): TimeZoneInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("findTimeZone")(name.asInstanceOf[js.Any]).asInstanceOf[TimeZoneInfo]
  
  @scala.inline
  def getUTCOffset(date: DateInput, timeZone: TimeZoneInfo): TimeZoneOffset = (^.asInstanceOf[js.Dynamic].applyDynamic("getUTCOffset")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[TimeZoneOffset]
  
  @scala.inline
  def getUnixTime(time: Time): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getUnixTime")(time.asInstanceOf[js.Any]).asInstanceOf[Double]
  @scala.inline
  def getUnixTime(time: Time, timeZone: TimeZoneInfo): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getUnixTime")(time.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def getZonedTime(date: DateInput, timeZone: TimeZoneInfo): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("getZonedTime")(date.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[Time]
  
  @scala.inline
  def listTimeZones(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listTimeZones")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def setTimeZone(time: Date, timeZone: TimeZoneInfo): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeZone")(time.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[Time]
  @scala.inline
  def setTimeZone(time: Date, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeZone")(time.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Time]
  @scala.inline
  def setTimeZone(time: Time, timeZone: TimeZoneInfo): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeZone")(time.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[Time]
  @scala.inline
  def setTimeZone(time: Time, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeZone")(time.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Time]
  
  type DateInput = Date | Double
  
  trait SetTimeZoneOptions extends StObject {
    
    var useUTC: Boolean
  }
  object SetTimeZoneOptions {
    
    @scala.inline
    def apply(useUTC: Boolean): SetTimeZoneOptions = {
      val __obj = js.Dynamic.literal(useUTC = useUTC.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetTimeZoneOptions]
    }
    
    @scala.inline
    implicit class SetTimeZoneOptionsMutableBuilder[Self <: SetTimeZoneOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUseUTC(value: Boolean): Self = StObject.set(x, "useUTC", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(day: Double, hours: Double, minutes: Double, month: Double, year: Double): Time = {
      val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
      __obj.asInstanceOf[Time]
    }
    
    @scala.inline
    implicit class TimeMutableBuilder[Self <: Time] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayOfWeek(value: Double): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
      
      @scala.inline
      def setEpoch(value: Double): Self = StObject.set(x, "epoch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEpochUndefined: Self = StObject.set(x, "epoch", js.undefined)
      
      @scala.inline
      def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
      
      @scala.inline
      def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZone(value: TimeZoneOffset): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
    }
  }
  
  trait TimeZoneInfo extends StObject {
    
    var name: String
  }
  object TimeZoneInfo {
    
    @scala.inline
    def apply(name: String): TimeZoneInfo = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeZoneInfo]
    }
    
    @scala.inline
    implicit class TimeZoneInfoMutableBuilder[Self <: TimeZoneInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeZoneOffset extends StObject {
    
    var abbreviation: js.UndefOr[String] = js.undefined
    
    var offset: Double
  }
  object TimeZoneOffset {
    
    @scala.inline
    def apply(offset: Double): TimeZoneOffset = {
      val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeZoneOffset]
    }
    
    @scala.inline
    implicit class TimeZoneOffsetMutableBuilder[Self <: TimeZoneOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbbreviation(value: String): Self = StObject.set(x, "abbreviation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAbbreviationUndefined: Self = StObject.set(x, "abbreviation", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}

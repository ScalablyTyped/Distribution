package typings.timezoneSupport

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object index20122022Mod {
  
  @JSImport("timezone-support/dist/index-2012-2022", "convertDateToTime")
  @js.native
  def convertDateToTime(date: Date): Time = js.native
  
  @JSImport("timezone-support/dist/index-2012-2022", "convertTimeToDate")
  @js.native
  def convertTimeToDate(time: Time): Date = js.native
  
  @JSImport("timezone-support/dist/index-2012-2022", "findTimeZone")
  @js.native
  def findTimeZone(name: String): TimeZoneInfo = js.native
  
  @JSImport("timezone-support/dist/index-2012-2022", "getUTCOffset")
  @js.native
  def getUTCOffset(date: DateInput, timeZone: TimeZoneInfo): TimeZoneOffset = js.native
  
  @JSImport("timezone-support/dist/index-2012-2022", "getUnixTime")
  @js.native
  def getUnixTime(time: Time): Double = js.native
  @JSImport("timezone-support/dist/index-2012-2022", "getUnixTime")
  @js.native
  def getUnixTime(time: Time, timeZone: TimeZoneInfo): Double = js.native
  
  @JSImport("timezone-support/dist/index-2012-2022", "getZonedTime")
  @js.native
  def getZonedTime(date: DateInput, timeZone: TimeZoneInfo): Time = js.native
  
  @JSImport("timezone-support/dist/index-2012-2022", "listTimeZones")
  @js.native
  def listTimeZones(): js.Array[String] = js.native
  
  @JSImport("timezone-support/dist/index-2012-2022", "setTimeZone")
  @js.native
  def setTimeZone(time: Date, timeZone: TimeZoneInfo): Time = js.native
  @JSImport("timezone-support/dist/index-2012-2022", "setTimeZone")
  @js.native
  def setTimeZone(time: Date, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = js.native
  @JSImport("timezone-support/dist/index-2012-2022", "setTimeZone")
  @js.native
  def setTimeZone(time: Time, timeZone: TimeZoneInfo): Time = js.native
  @JSImport("timezone-support/dist/index-2012-2022", "setTimeZone")
  @js.native
  def setTimeZone(time: Time, timeZone: TimeZoneInfo, options: SetTimeZoneOptions): Time = js.native
  
  type DateInput = Date | Double
  
  @js.native
  trait SetTimeZoneOptions extends StObject {
    
    var useUTC: Boolean = js.native
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
  
  @js.native
  trait Time extends StObject {
    
    var day: Double = js.native
    
    var dayOfWeek: js.UndefOr[Double] = js.native
    
    var epoch: js.UndefOr[Double] = js.native
    
    var hours: Double = js.native
    
    var milliseconds: js.UndefOr[Double] = js.native
    
    var minutes: Double = js.native
    
    var month: Double = js.native
    
    var seconds: js.UndefOr[Double] = js.native
    
    var year: Double = js.native
    
    var zone: js.UndefOr[TimeZoneOffset] = js.native
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
  
  @js.native
  trait TimeZoneInfo extends StObject {
    
    var name: String = js.native
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
  
  @js.native
  trait TimeZoneOffset extends StObject {
    
    var abbreviation: js.UndefOr[String] = js.native
    
    var offset: Double = js.native
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

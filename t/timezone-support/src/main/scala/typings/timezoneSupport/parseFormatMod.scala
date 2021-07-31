package typings.timezoneSupport

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parseFormatMod {
  
  @JSImport("timezone-support/dist/parse-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def formatZonedTime(time: Time, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatZonedTime")(time.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def parseZonedTime(input: String, format: String): Time = (^.asInstanceOf[js.Dynamic].applyDynamic("parseZonedTime")(input.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Time]
  
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

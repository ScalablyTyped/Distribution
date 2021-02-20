package typings.vegaLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datetimeMod {
  
  @JSImport("vega-lite/build/src/datetime", "DAYS")
  @js.native
  val DAYS: js.Array[String] = js.native
  
  @JSImport("vega-lite/build/src/datetime", "MONTHS")
  @js.native
  val MONTHS: js.Array[String] = js.native
  
  @JSImport("vega-lite/build/src/datetime", "SHORT_DAYS")
  @js.native
  val SHORT_DAYS: js.Array[String] = js.native
  
  @JSImport("vega-lite/build/src/datetime", "SHORT_MONTHS")
  @js.native
  val SHORT_MONTHS: js.Array[String] = js.native
  
  @JSImport("vega-lite/build/src/datetime", "dateTimeExprToExpr")
  @js.native
  def dateTimeExprToExpr(d: DateTimeExpr): String = js.native
  
  @JSImport("vega-lite/build/src/datetime", "dateTimeToExpr")
  @js.native
  def dateTimeToExpr(d: DateTime): String = js.native
  
  @JSImport("vega-lite/build/src/datetime", "dateTimeToTimestamp")
  @js.native
  def dateTimeToTimestamp(d: DateTime): Double = js.native
  
  @JSImport("vega-lite/build/src/datetime", "isDateTime")
  @js.native
  def isDateTime(o: js.Any): /* is vega-lite.vega-lite/build/src/datetime.DateTime */ Boolean = js.native
  
  @js.native
  trait DateTime extends StObject {
    
    /**
      * Integer value representing the date (day of the month) from 1-31.
      * @minimum 1
      * @maximum 31
      * @TJS-type integer
      */
    var date: js.UndefOr[Double] = js.native
    
    /**
      * Value representing the day of a week. This can be one of:
      * (1) integer value -- `1` represents Monday;
      * (2) case-insensitive day name (e.g., `"Monday"`);
      * (3) case-insensitive, 3-character short day name (e.g., `"Mon"`).
      *
      * **Warning:** A DateTime definition object with `day`** should not be combined with `year`, `quarter`, `month`, or `date`.
      */
    var day: js.UndefOr[Day | String] = js.native
    
    /**
      * Integer value representing the hour of a day from 0-23.
      * @minimum 0
      * @maximum 24
      * @TJS-type integer
      */
    var hours: js.UndefOr[Double] = js.native
    
    /**
      * Integer value representing the millisecond segment of time.
      * @minimum 0
      * @maximum 1000
      * @TJS-type integer
      */
    var milliseconds: js.UndefOr[Double] = js.native
    
    /**
      * Integer value representing the minute segment of time from 0-59.
      * @minimum 0
      * @maximum 60
      * @TJS-type integer
      */
    var minutes: js.UndefOr[Double] = js.native
    
    /**
      * One of:
      * (1) integer value representing the month from `1`-`12`. `1` represents January;
      * (2) case-insensitive month name (e.g., `"January"`);
      * (3) case-insensitive, 3-character short month name (e.g., `"Jan"`).
      */
    var month: js.UndefOr[Month | String] = js.native
    
    /**
      * Integer value representing the quarter of the year (from 1-4).
      * @minimum 1
      * @maximum 4
      * @TJS-type integer
      */
    var quarter: js.UndefOr[Double] = js.native
    
    /**
      * Integer value representing the second segment (0-59) of a time value
      * @minimum 0
      * @maximum 60
      * @TJS-type integer
      */
    var seconds: js.UndefOr[Double] = js.native
    
    /**
      * A boolean flag indicating if date time is in utc time. If false, the date time is in local time
      */
    var utc: js.UndefOr[Boolean] = js.native
    
    /**
      * Integer value representing the year.
      * @TJS-type integer
      */
    var year: js.UndefOr[Double] = js.native
  }
  object DateTime {
    
    @scala.inline
    def apply(): DateTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTime]
    }
    
    @scala.inline
    implicit class DateTimeMutableBuilder[Self <: DateTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDay(value: Day | String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      @scala.inline
      def setMilliseconds(value: Double): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
      
      @scala.inline
      def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      @scala.inline
      def setMonth(value: Month | String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setQuarter(value: Double): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuarterUndefined: Self = StObject.set(x, "quarter", js.undefined)
      
      @scala.inline
      def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      @scala.inline
      def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
      
      @scala.inline
      def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  @js.native
  trait DateTimeExpr extends StObject {
    
    var date: js.UndefOr[String] = js.native
    
    var day: js.UndefOr[String] = js.native
    
    var hours: js.UndefOr[String] = js.native
    
    var milliseconds: js.UndefOr[String] = js.native
    
    var minutes: js.UndefOr[String] = js.native
    
    var month: js.UndefOr[String] = js.native
    
    var quarter: js.UndefOr[String] = js.native
    
    var seconds: js.UndefOr[String] = js.native
    
    var utc: js.UndefOr[Boolean] = js.native
    
    var year: js.UndefOr[String] = js.native
  }
  object DateTimeExpr {
    
    @scala.inline
    def apply(): DateTimeExpr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeExpr]
    }
    
    @scala.inline
    implicit class DateTimeExprMutableBuilder[Self <: DateTimeExpr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setDay(value: String): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
      
      @scala.inline
      def setHours(value: String): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      @scala.inline
      def setMilliseconds(value: String): Self = StObject.set(x, "milliseconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisecondsUndefined: Self = StObject.set(x, "milliseconds", js.undefined)
      
      @scala.inline
      def setMinutes(value: String): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      @scala.inline
      def setMonth(value: String): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
      
      @scala.inline
      def setQuarter(value: String): Self = StObject.set(x, "quarter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuarterUndefined: Self = StObject.set(x, "quarter", js.undefined)
      
      @scala.inline
      def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
      
      @scala.inline
      def setUtc(value: Boolean): Self = StObject.set(x, "utc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtcUndefined: Self = StObject.set(x, "utc", js.undefined)
      
      @scala.inline
      def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYearUndefined: Self = StObject.set(x, "year", js.undefined)
    }
  }
  
  type Day = Double
  
  type Month = Double
}

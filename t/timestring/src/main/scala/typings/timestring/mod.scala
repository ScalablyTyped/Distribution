package typings.timestring

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(input: String): Double = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(input: String, returnUnit: Unit, opts: Options): Double = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], returnUnit.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(input: String, returnUnit: ReturnUnit): Double = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], returnUnit.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(input: String, returnUnit: ReturnUnit, opts: Options): Double = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], returnUnit.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("timestring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * @default 7
      */
    var daysPerWeek: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 365.25s
      */
    var daysPerYear: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 24
      */
    var hoursPerDay: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 12
      */
    var monthsPerYear: js.UndefOr[Double] = js.undefined
    
    /**
      * @default 4
      */
    var weeksPerMonth: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setDaysPerWeek(value: Double): Self = StObject.set(x, "daysPerWeek", value.asInstanceOf[js.Any])
      
      inline def setDaysPerWeekUndefined: Self = StObject.set(x, "daysPerWeek", js.undefined)
      
      inline def setDaysPerYear(value: Double): Self = StObject.set(x, "daysPerYear", value.asInstanceOf[js.Any])
      
      inline def setDaysPerYearUndefined: Self = StObject.set(x, "daysPerYear", js.undefined)
      
      inline def setHoursPerDay(value: Double): Self = StObject.set(x, "hoursPerDay", value.asInstanceOf[js.Any])
      
      inline def setHoursPerDayUndefined: Self = StObject.set(x, "hoursPerDay", js.undefined)
      
      inline def setMonthsPerYear(value: Double): Self = StObject.set(x, "monthsPerYear", value.asInstanceOf[js.Any])
      
      inline def setMonthsPerYearUndefined: Self = StObject.set(x, "monthsPerYear", js.undefined)
      
      inline def setWeeksPerMonth(value: Double): Self = StObject.set(x, "weeksPerMonth", value.asInstanceOf[js.Any])
      
      inline def setWeeksPerMonthUndefined: Self = StObject.set(x, "weeksPerMonth", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.timestring.timestringStrings.ms
    - typings.timestring.timestringStrings.milli
    - typings.timestring.timestringStrings.millisecond
    - typings.timestring.timestringStrings.milliseconds
    - typings.timestring.timestringStrings.s
    - typings.timestring.timestringStrings.sec
    - typings.timestring.timestringStrings.secs
    - typings.timestring.timestringStrings.second
    - typings.timestring.timestringStrings.seconds
    - typings.timestring.timestringStrings.m
    - typings.timestring.timestringStrings.min
    - typings.timestring.timestringStrings.mins
    - typings.timestring.timestringStrings.minute
    - typings.timestring.timestringStrings.minutes
    - typings.timestring.timestringStrings.h
    - typings.timestring.timestringStrings.hr
    - typings.timestring.timestringStrings.hrs
    - typings.timestring.timestringStrings.hour
    - typings.timestring.timestringStrings.hours
    - typings.timestring.timestringStrings.d
    - typings.timestring.timestringStrings.day
    - typings.timestring.timestringStrings.days
    - typings.timestring.timestringStrings.w
    - typings.timestring.timestringStrings.week
    - typings.timestring.timestringStrings.weeks
    - typings.timestring.timestringStrings.mon
    - typings.timestring.timestringStrings.mth
    - typings.timestring.timestringStrings.mths
    - typings.timestring.timestringStrings.month
    - typings.timestring.timestringStrings.months
    - typings.timestring.timestringStrings.y
    - typings.timestring.timestringStrings.yr
    - typings.timestring.timestringStrings.yrs
    - typings.timestring.timestringStrings.year
    - typings.timestring.timestringStrings.years
  */
  trait ReturnUnit extends StObject
  object ReturnUnit {
    
    inline def d: typings.timestring.timestringStrings.d = "d".asInstanceOf[typings.timestring.timestringStrings.d]
    
    inline def day: typings.timestring.timestringStrings.day = "day".asInstanceOf[typings.timestring.timestringStrings.day]
    
    inline def days: typings.timestring.timestringStrings.days = "days".asInstanceOf[typings.timestring.timestringStrings.days]
    
    inline def h: typings.timestring.timestringStrings.h = "h".asInstanceOf[typings.timestring.timestringStrings.h]
    
    inline def hour: typings.timestring.timestringStrings.hour = "hour".asInstanceOf[typings.timestring.timestringStrings.hour]
    
    inline def hours: typings.timestring.timestringStrings.hours = "hours".asInstanceOf[typings.timestring.timestringStrings.hours]
    
    inline def hr: typings.timestring.timestringStrings.hr = "hr".asInstanceOf[typings.timestring.timestringStrings.hr]
    
    inline def hrs: typings.timestring.timestringStrings.hrs = "hrs".asInstanceOf[typings.timestring.timestringStrings.hrs]
    
    inline def m: typings.timestring.timestringStrings.m = "m".asInstanceOf[typings.timestring.timestringStrings.m]
    
    inline def milli: typings.timestring.timestringStrings.milli = "milli".asInstanceOf[typings.timestring.timestringStrings.milli]
    
    inline def millisecond: typings.timestring.timestringStrings.millisecond = "millisecond".asInstanceOf[typings.timestring.timestringStrings.millisecond]
    
    inline def milliseconds: typings.timestring.timestringStrings.milliseconds = "milliseconds".asInstanceOf[typings.timestring.timestringStrings.milliseconds]
    
    inline def min: typings.timestring.timestringStrings.min = "min".asInstanceOf[typings.timestring.timestringStrings.min]
    
    inline def mins: typings.timestring.timestringStrings.mins = "mins".asInstanceOf[typings.timestring.timestringStrings.mins]
    
    inline def minute: typings.timestring.timestringStrings.minute = "minute".asInstanceOf[typings.timestring.timestringStrings.minute]
    
    inline def minutes: typings.timestring.timestringStrings.minutes = "minutes".asInstanceOf[typings.timestring.timestringStrings.minutes]
    
    inline def mon: typings.timestring.timestringStrings.mon = "mon".asInstanceOf[typings.timestring.timestringStrings.mon]
    
    inline def month: typings.timestring.timestringStrings.month = "month".asInstanceOf[typings.timestring.timestringStrings.month]
    
    inline def months: typings.timestring.timestringStrings.months = "months".asInstanceOf[typings.timestring.timestringStrings.months]
    
    inline def ms: typings.timestring.timestringStrings.ms = "ms".asInstanceOf[typings.timestring.timestringStrings.ms]
    
    inline def mth: typings.timestring.timestringStrings.mth = "mth".asInstanceOf[typings.timestring.timestringStrings.mth]
    
    inline def mths: typings.timestring.timestringStrings.mths = "mths".asInstanceOf[typings.timestring.timestringStrings.mths]
    
    inline def s: typings.timestring.timestringStrings.s = "s".asInstanceOf[typings.timestring.timestringStrings.s]
    
    inline def sec: typings.timestring.timestringStrings.sec = "sec".asInstanceOf[typings.timestring.timestringStrings.sec]
    
    inline def second: typings.timestring.timestringStrings.second = "second".asInstanceOf[typings.timestring.timestringStrings.second]
    
    inline def seconds: typings.timestring.timestringStrings.seconds = "seconds".asInstanceOf[typings.timestring.timestringStrings.seconds]
    
    inline def secs: typings.timestring.timestringStrings.secs = "secs".asInstanceOf[typings.timestring.timestringStrings.secs]
    
    inline def w: typings.timestring.timestringStrings.w = "w".asInstanceOf[typings.timestring.timestringStrings.w]
    
    inline def week: typings.timestring.timestringStrings.week = "week".asInstanceOf[typings.timestring.timestringStrings.week]
    
    inline def weeks: typings.timestring.timestringStrings.weeks = "weeks".asInstanceOf[typings.timestring.timestringStrings.weeks]
    
    inline def y: typings.timestring.timestringStrings.y = "y".asInstanceOf[typings.timestring.timestringStrings.y]
    
    inline def year: typings.timestring.timestringStrings.year = "year".asInstanceOf[typings.timestring.timestringStrings.year]
    
    inline def years: typings.timestring.timestringStrings.years = "years".asInstanceOf[typings.timestring.timestringStrings.years]
    
    inline def yr: typings.timestring.timestringStrings.yr = "yr".asInstanceOf[typings.timestring.timestringStrings.yr]
    
    inline def yrs: typings.timestring.timestringStrings.yrs = "yrs".asInstanceOf[typings.timestring.timestringStrings.yrs]
  }
}

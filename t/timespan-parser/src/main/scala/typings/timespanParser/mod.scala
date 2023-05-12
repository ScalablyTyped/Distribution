package typings.timespanParser

import typings.timespanParser.anon.GetString
import typings.timespanParser.timespanParserStrings.m_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Returns a new `timespan` object with the defaults modified. */
  inline def apply(): GetString = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[GetString]
  inline def apply(defaults: Options): GetString = ^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any]).asInstanceOf[GetString]
  inline def apply(defaults: Unit): GetString = ^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any]).asInstanceOf[GetString]
  
  @JSImport("timespan-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a numeric value to a timespan string. The timespan string produced uses the shortest label available.
    * @param value The number of `unit`s to convert to a timespan string.
    * @param opts Options object
    */
  inline def getString(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getString(value: Double, opts: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getString")(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getString(value: Double, opts: Unit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getString")(value.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Converts a timespan string into a number of `unit`s.
    * @param timespan The timespan string to be parsed.
    * @param unit The unit to use for the conversion. Defaults to `"seconds"`.
    * @returns The number of `unit`s represented by `timespan`.
    */
  inline def parse(timespan: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(timespan.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parse(timespan: String, unit: Unit): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(timespan.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait Options extends StObject {
    
    /** Whether to abbreviate the unit labels in the resulting string. Defaults to `true`. */
    var abbv: js.UndefOr[Boolean] = js.undefined
    
    /** Whether to set the first letter of each unit label to upper case in the resulting string. Defaults to `false`. */
    var capitalize: js.UndefOr[Boolean] = js.undefined
    
    /** The unit that value represents. Defaults to `"seconds"`. */
    var unit: js.UndefOr[Unit] = js.undefined
    
    /** This string will be placed between each number and unit label in the resulting string. Defaults to `""` when `abbv` is `true`. Defaults to `" "` when `abbv` is `false`. */
    var unitSep: js.UndefOr[String] = js.undefined
    
    /** This string will be placed between each value in the resulting string. Defaults to `" "`. */
    var valueSep: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAbbv(value: Boolean): Self = StObject.set(x, "abbv", value.asInstanceOf[js.Any])
      
      inline def setAbbvUndefined: Self = StObject.set(x, "abbv", js.undefined)
      
      inline def setCapitalize(value: Boolean): Self = StObject.set(x, "capitalize", value.asInstanceOf[js.Any])
      
      inline def setCapitalizeUndefined: Self = StObject.set(x, "capitalize", js.undefined)
      
      inline def setUnit(value: Unit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setUnitSep(value: String): Self = StObject.set(x, "unitSep", value.asInstanceOf[js.Any])
      
      inline def setUnitSepUndefined: Self = StObject.set(x, "unitSep", js.undefined)
      
      inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      inline def setValueSep(value: String): Self = StObject.set(x, "valueSep", value.asInstanceOf[js.Any])
      
      inline def setValueSepUndefined: Self = StObject.set(x, "valueSep", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.timespanParser.timespanParserStrings.msec
    - typings.timespanParser.timespanParserStrings.ms
    - typings.timespanParser.timespanParserStrings.seconds
    - typings.timespanParser.timespanParserStrings.second
    - typings.timespanParser.timespanParserStrings.sec
    - typings.timespanParser.timespanParserStrings.s
    - typings.timespanParser.timespanParserStrings.minutes
    - typings.timespanParser.timespanParserStrings.minute
    - typings.timespanParser.timespanParserStrings.min
    - typings.timespanParser.timespanParserStrings.m_
    - typings.timespanParser.timespanParserStrings.hours
    - typings.timespanParser.timespanParserStrings.hour
    - typings.timespanParser.timespanParserStrings.hr
    - typings.timespanParser.timespanParserStrings.h
    - typings.timespanParser.timespanParserStrings.days
    - typings.timespanParser.timespanParserStrings.day
    - typings.timespanParser.timespanParserStrings.d
    - typings.timespanParser.timespanParserStrings.weeks
    - typings.timespanParser.timespanParserStrings.week
    - typings.timespanParser.timespanParserStrings.w
    - typings.timespanParser.timespanParserStrings.months
    - typings.timespanParser.timespanParserStrings.month
    - typings.timespanParser.timespanParserStrings.M
    - typings.timespanParser.timespanParserStrings.years
    - typings.timespanParser.timespanParserStrings.year
    - typings.timespanParser.timespanParserStrings.y
  */
  trait Unit extends StObject
  object Unit {
    
    inline def M: typings.timespanParser.timespanParserStrings.M = "M".asInstanceOf[typings.timespanParser.timespanParserStrings.M]
    
    inline def d: typings.timespanParser.timespanParserStrings.d = "d".asInstanceOf[typings.timespanParser.timespanParserStrings.d]
    
    inline def day: typings.timespanParser.timespanParserStrings.day = "day".asInstanceOf[typings.timespanParser.timespanParserStrings.day]
    
    inline def days: typings.timespanParser.timespanParserStrings.days = "days".asInstanceOf[typings.timespanParser.timespanParserStrings.days]
    
    inline def h: typings.timespanParser.timespanParserStrings.h = "h".asInstanceOf[typings.timespanParser.timespanParserStrings.h]
    
    inline def hour: typings.timespanParser.timespanParserStrings.hour = "hour".asInstanceOf[typings.timespanParser.timespanParserStrings.hour]
    
    inline def hours: typings.timespanParser.timespanParserStrings.hours = "hours".asInstanceOf[typings.timespanParser.timespanParserStrings.hours]
    
    inline def hr: typings.timespanParser.timespanParserStrings.hr = "hr".asInstanceOf[typings.timespanParser.timespanParserStrings.hr]
    
    inline def m: m_ = "m".asInstanceOf[m_]
    
    inline def min: typings.timespanParser.timespanParserStrings.min = "min".asInstanceOf[typings.timespanParser.timespanParserStrings.min]
    
    inline def minute: typings.timespanParser.timespanParserStrings.minute = "minute".asInstanceOf[typings.timespanParser.timespanParserStrings.minute]
    
    inline def minutes: typings.timespanParser.timespanParserStrings.minutes = "minutes".asInstanceOf[typings.timespanParser.timespanParserStrings.minutes]
    
    inline def month: typings.timespanParser.timespanParserStrings.month = "month".asInstanceOf[typings.timespanParser.timespanParserStrings.month]
    
    inline def months: typings.timespanParser.timespanParserStrings.months = "months".asInstanceOf[typings.timespanParser.timespanParserStrings.months]
    
    inline def ms: typings.timespanParser.timespanParserStrings.ms = "ms".asInstanceOf[typings.timespanParser.timespanParserStrings.ms]
    
    inline def msec: typings.timespanParser.timespanParserStrings.msec = "msec".asInstanceOf[typings.timespanParser.timespanParserStrings.msec]
    
    inline def s: typings.timespanParser.timespanParserStrings.s = "s".asInstanceOf[typings.timespanParser.timespanParserStrings.s]
    
    inline def sec: typings.timespanParser.timespanParserStrings.sec = "sec".asInstanceOf[typings.timespanParser.timespanParserStrings.sec]
    
    inline def second: typings.timespanParser.timespanParserStrings.second = "second".asInstanceOf[typings.timespanParser.timespanParserStrings.second]
    
    inline def seconds: typings.timespanParser.timespanParserStrings.seconds = "seconds".asInstanceOf[typings.timespanParser.timespanParserStrings.seconds]
    
    inline def w: typings.timespanParser.timespanParserStrings.w = "w".asInstanceOf[typings.timespanParser.timespanParserStrings.w]
    
    inline def week: typings.timespanParser.timespanParserStrings.week = "week".asInstanceOf[typings.timespanParser.timespanParserStrings.week]
    
    inline def weeks: typings.timespanParser.timespanParserStrings.weeks = "weeks".asInstanceOf[typings.timespanParser.timespanParserStrings.weeks]
    
    inline def y: typings.timespanParser.timespanParserStrings.y = "y".asInstanceOf[typings.timespanParser.timespanParserStrings.y]
    
    inline def year: typings.timespanParser.timespanParserStrings.year = "year".asInstanceOf[typings.timespanParser.timespanParserStrings.year]
    
    inline def years: typings.timespanParser.timespanParserStrings.years = "years".asInstanceOf[typings.timespanParser.timespanParserStrings.years]
  }
}

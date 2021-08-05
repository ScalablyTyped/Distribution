package typings.vegaTypings

import typings.vegaTypings.utilMod.Vector10
import typings.vegaTypings.utilMod.Vector12
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector7
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localeMod {
  
  trait Locale extends StObject {
    
    var number: js.UndefOr[NumberLocale] = js.undefined
    
    var time: js.UndefOr[TimeLocale] = js.undefined
  }
  object Locale {
    
    inline def apply(): Locale = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Locale]
    }
    
    extension [Self <: Locale](x: Self) {
      
      inline def setNumber(value: NumberLocale): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setTime(value: TimeLocale): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    }
  }
  
  trait NumberLocale extends StObject {
    
    /**
      * The currency prefix and suffix (e.g., ["$", ""]).
      */
    var currency: Vector2[String]
    
    /**
      * The decimal point (e.g., ".").
      */
    var decimal: String
    
    /**
      * The array of group sizes (e.g., [3]), cycled as needed.
      */
    var grouping: js.Array[Double]
    
    /**
      * The minus sign (defaults to hyphen-minus, "-").
      */
    var minus: js.UndefOr[String] = js.undefined
    
    /**
      * The not-a-number value (defaults to "NaN").
      */
    var nan: js.UndefOr[String] = js.undefined
    
    /**
      * An array of ten strings to replace the numerals 0-9.
      */
    var numerals: js.UndefOr[Vector10[String]] = js.undefined
    
    /**
      * The percent sign (defaults to "%").
      */
    var percent: js.UndefOr[String] = js.undefined
    
    /**
      * The group separator (e.g., ",").
      */
    var thousands: String
  }
  object NumberLocale {
    
    inline def apply(currency: Vector2[String], decimal: String, grouping: js.Array[Double], thousands: String): NumberLocale = {
      val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], decimal = decimal.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberLocale]
    }
    
    extension [Self <: NumberLocale](x: Self) {
      
      inline def setCurrency(value: Vector2[String]): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setDecimal(value: String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      inline def setGrouping(value: js.Array[Double]): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
      
      inline def setGroupingVarargs(value: Double*): Self = StObject.set(x, "grouping", js.Array(value :_*))
      
      inline def setMinus(value: String): Self = StObject.set(x, "minus", value.asInstanceOf[js.Any])
      
      inline def setMinusUndefined: Self = StObject.set(x, "minus", js.undefined)
      
      inline def setNan(value: String): Self = StObject.set(x, "nan", value.asInstanceOf[js.Any])
      
      inline def setNanUndefined: Self = StObject.set(x, "nan", js.undefined)
      
      inline def setNumerals(value: Vector10[String]): Self = StObject.set(x, "numerals", value.asInstanceOf[js.Any])
      
      inline def setNumeralsUndefined: Self = StObject.set(x, "numerals", js.undefined)
      
      inline def setPercent(value: String): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
      
      inline def setThousands(value: String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeLocale extends StObject {
    
    /**
      * The date (%x) format specifier (e.g., "%m/%d/%Y").
      */
    var date: String
    
    /**
      * The date and time (%c) format specifier (e.g., "%a %b %e %X %Y").
      */
    var dateTime: String
    
    /**
      * The full names of the weekdays, starting with Sunday.
      */
    var days: Vector7[String]
    
    /**
      * The full names of the months (starting with January).
      */
    var months: Vector12[String]
    
    /**
      * The A.M. and P.M. equivalents (e.g., ["AM", "PM"]).
      */
    var periods: Vector2[String]
    
    /**
      * The abbreviated names of the weekdays, starting with Sunday.
      */
    var shortDays: Vector7[String]
    
    /**
      * The abbreviated names of the months (starting with January).
      */
    var shortMonths: Vector12[String]
    
    /**
      * The time (%X) format specifier (e.g., "%H:%M:%S").
      */
    var time: String
  }
  object TimeLocale {
    
    inline def apply(
      date: String,
      dateTime: String,
      days: Vector7[String],
      months: Vector12[String],
      periods: Vector2[String],
      shortDays: Vector7[String],
      shortMonths: Vector12[String],
      time: String
    ): TimeLocale = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], dateTime = dateTime.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], periods = periods.asInstanceOf[js.Any], shortDays = shortDays.asInstanceOf[js.Any], shortMonths = shortMonths.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeLocale]
    }
    
    extension [Self <: TimeLocale](x: Self) {
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      inline def setDays(value: Vector7[String]): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: Vector12[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setPeriods(value: Vector2[String]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
      
      inline def setShortDays(value: Vector7[String]): Self = StObject.set(x, "shortDays", value.asInstanceOf[js.Any])
      
      inline def setShortMonths(value: Vector12[String]): Self = StObject.set(x, "shortMonths", value.asInstanceOf[js.Any])
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}

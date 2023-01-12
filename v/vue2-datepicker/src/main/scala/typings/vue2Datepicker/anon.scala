package typings.vue2Datepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FirstDayOfWeek extends StObject {
    
    var firstDayOfWeek: Double
    
    var firstWeekContainsDate: Double
    
    def isPM(input: String): Boolean
    
    def meridiem(h: Double, _underscore: Double, isLowercase: Boolean): Boolean
    
    var meridiemParse: js.RegExp
    
    var months: js.Array[String]
    
    var monthsShort: js.Array[String]
    
    var weekdays: js.Array[String]
    
    var weekdaysMin: js.Array[String]
    
    var weekdaysShort: js.Array[String]
  }
  object FirstDayOfWeek {
    
    inline def apply(
      firstDayOfWeek: Double,
      firstWeekContainsDate: Double,
      isPM: String => Boolean,
      meridiem: (Double, Double, Boolean) => Boolean,
      meridiemParse: js.RegExp,
      months: js.Array[String],
      monthsShort: js.Array[String],
      weekdays: js.Array[String],
      weekdaysMin: js.Array[String],
      weekdaysShort: js.Array[String]
    ): FirstDayOfWeek = {
      val __obj = js.Dynamic.literal(firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekContainsDate = firstWeekContainsDate.asInstanceOf[js.Any], isPM = js.Any.fromFunction1(isPM), meridiem = js.Any.fromFunction3(meridiem), meridiemParse = meridiemParse.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysMin = weekdaysMin.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirstDayOfWeek]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FirstDayOfWeek] (val x: Self) extends AnyVal {
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setFirstWeekContainsDate(value: Double): Self = StObject.set(x, "firstWeekContainsDate", value.asInstanceOf[js.Any])
      
      inline def setIsPM(value: String => Boolean): Self = StObject.set(x, "isPM", js.Any.fromFunction1(value))
      
      inline def setMeridiem(value: (Double, Double, Boolean) => Boolean): Self = StObject.set(x, "meridiem", js.Any.fromFunction3(value))
      
      inline def setMeridiemParse(value: js.RegExp): Self = StObject.set(x, "meridiemParse", value.asInstanceOf[js.Any])
      
      inline def setMonths(value: js.Array[String]): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
      
      inline def setMonthsShort(value: js.Array[String]): Self = StObject.set(x, "monthsShort", value.asInstanceOf[js.Any])
      
      inline def setMonthsShortVarargs(value: String*): Self = StObject.set(x, "monthsShort", js.Array(value*))
      
      inline def setMonthsVarargs(value: String*): Self = StObject.set(x, "months", js.Array(value*))
      
      inline def setWeekdays(value: js.Array[String]): Self = StObject.set(x, "weekdays", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysMin(value: js.Array[String]): Self = StObject.set(x, "weekdaysMin", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysMinVarargs(value: String*): Self = StObject.set(x, "weekdaysMin", js.Array(value*))
      
      inline def setWeekdaysShort(value: js.Array[String]): Self = StObject.set(x, "weekdaysShort", value.asInstanceOf[js.Any])
      
      inline def setWeekdaysShortVarargs(value: String*): Self = StObject.set(x, "weekdaysShort", js.Array(value*))
      
      inline def setWeekdaysVarargs(value: String*): Self = StObject.set(x, "weekdays", js.Array(value*))
    }
  }
}

package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatDay extends StObject {
  
  def formatDay(date: Any): String
  
  def formatMonthAndYear(date: Any): String
  
  def formatMonthTitle(date: Any): String
  
  def formatMonthsRange(firstDate: Any, secondDate: Any): String
  
  def formatWeekdayLong(index: Any): String
  
  def formatWeekdayShort(index: Any): String
  
  def getFirstDayOfWeek(): Any
  
  def getMonths(): js.Array[String]
}
object FormatDay {
  
  inline def apply(
    formatDay: Any => String,
    formatMonthAndYear: Any => String,
    formatMonthTitle: Any => String,
    formatMonthsRange: (Any, Any) => String,
    formatWeekdayLong: Any => String,
    formatWeekdayShort: Any => String,
    getFirstDayOfWeek: () => Any,
    getMonths: () => js.Array[String]
  ): FormatDay = {
    val __obj = js.Dynamic.literal(formatDay = js.Any.fromFunction1(formatDay), formatMonthAndYear = js.Any.fromFunction1(formatMonthAndYear), formatMonthTitle = js.Any.fromFunction1(formatMonthTitle), formatMonthsRange = js.Any.fromFunction2(formatMonthsRange), formatWeekdayLong = js.Any.fromFunction1(formatWeekdayLong), formatWeekdayShort = js.Any.fromFunction1(formatWeekdayShort), getFirstDayOfWeek = js.Any.fromFunction0(getFirstDayOfWeek), getMonths = js.Any.fromFunction0(getMonths))
    __obj.asInstanceOf[FormatDay]
  }
  
  extension [Self <: FormatDay](x: Self) {
    
    inline def setFormatDay(value: Any => String): Self = StObject.set(x, "formatDay", js.Any.fromFunction1(value))
    
    inline def setFormatMonthAndYear(value: Any => String): Self = StObject.set(x, "formatMonthAndYear", js.Any.fromFunction1(value))
    
    inline def setFormatMonthTitle(value: Any => String): Self = StObject.set(x, "formatMonthTitle", js.Any.fromFunction1(value))
    
    inline def setFormatMonthsRange(value: (Any, Any) => String): Self = StObject.set(x, "formatMonthsRange", js.Any.fromFunction2(value))
    
    inline def setFormatWeekdayLong(value: Any => String): Self = StObject.set(x, "formatWeekdayLong", js.Any.fromFunction1(value))
    
    inline def setFormatWeekdayShort(value: Any => String): Self = StObject.set(x, "formatWeekdayShort", js.Any.fromFunction1(value))
    
    inline def setGetFirstDayOfWeek(value: () => Any): Self = StObject.set(x, "getFirstDayOfWeek", js.Any.fromFunction0(value))
    
    inline def setGetMonths(value: () => js.Array[String]): Self = StObject.set(x, "getMonths", js.Any.fromFunction0(value))
  }
}

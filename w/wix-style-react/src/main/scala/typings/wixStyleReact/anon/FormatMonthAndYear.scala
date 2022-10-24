package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatMonthAndYear extends StObject {
  
  /**
    * Format the string used as aria-label for the given day.
    * @param date: Date - a given day
    * @returns {string} - formatted string that is used as aria-label for the given day
    */
  def formatDay(date: Any): String
  
  /**
    * Return the string used to format the month and year title for the given date. e.g ‘December 2021’
    * @param date - a given date
    * @returns {string} - the month and year
    */
  def formatMonthAndYear(date: Any): String
  
  /**
    * This method is required by the ReactDayPicker LocaleUtils API but is not really used since we are using our own CaptionElement - DatePickerHead component.
    *
    * Return the string used to format the month’s title for the given month. e.g ‘December 2021’
    * @param date - a given date
    * @returns {string} - the month title
    */
  def formatMonthTitle(date: Any): String
  
  /**
    * Return the string used to format the months range for the given dates. E.g ‘Dec - Jan 2022’
    * @param firstDate - first date in the range
    * @param secondDate - last date in the range
    * @returns {string} - the months range for the given dates
    */
  def formatMonthsRange(firstDate: Any, secondDate: Any): String
  
  /**
    * Return the string used to render the weekday’s long name (starting from 0 as Sunday). e.g. ‘Monday’.
    * @param index: number - a weekday index, from 0 to 6 (Sunday to Saturday)
    * @returns {string} - a weekday in long format
    */
  def formatWeekdayLong(index: Any): String
  
  /**
    * Return the string used to render the weekday’s short name, e.g. ‘Mon’ for Monday.
    * @param index: number - a weekday index, from 0 to 6 (Sunday to Saturday)
    * @returns {string} - a weekday in short format
    */
  def formatWeekdayShort(index: Any): String
  
  /**
    * Return the first day of week. Currently the default value is 1 which means Monday.
    * @returns {*|number} - a number between 0 to 6 (Sunday to Saturday) which represent the week day
    */
  def getFirstDayOfWeek(): Any | Double
  
  /**
    * Return an array with the twelve months for the given locale
    * @returns {String[]} - an array with all the translated months strings
    */
  def getMonths(): js.Array[String]
}
object FormatMonthAndYear {
  
  inline def apply(
    formatDay: Any => String,
    formatMonthAndYear: Any => String,
    formatMonthTitle: Any => String,
    formatMonthsRange: (Any, Any) => String,
    formatWeekdayLong: Any => String,
    formatWeekdayShort: Any => String,
    getFirstDayOfWeek: () => Any | Double,
    getMonths: () => js.Array[String]
  ): FormatMonthAndYear = {
    val __obj = js.Dynamic.literal(formatDay = js.Any.fromFunction1(formatDay), formatMonthAndYear = js.Any.fromFunction1(formatMonthAndYear), formatMonthTitle = js.Any.fromFunction1(formatMonthTitle), formatMonthsRange = js.Any.fromFunction2(formatMonthsRange), formatWeekdayLong = js.Any.fromFunction1(formatWeekdayLong), formatWeekdayShort = js.Any.fromFunction1(formatWeekdayShort), getFirstDayOfWeek = js.Any.fromFunction0(getFirstDayOfWeek), getMonths = js.Any.fromFunction0(getMonths))
    __obj.asInstanceOf[FormatMonthAndYear]
  }
  
  extension [Self <: FormatMonthAndYear](x: Self) {
    
    inline def setFormatDay(value: Any => String): Self = StObject.set(x, "formatDay", js.Any.fromFunction1(value))
    
    inline def setFormatMonthAndYear(value: Any => String): Self = StObject.set(x, "formatMonthAndYear", js.Any.fromFunction1(value))
    
    inline def setFormatMonthTitle(value: Any => String): Self = StObject.set(x, "formatMonthTitle", js.Any.fromFunction1(value))
    
    inline def setFormatMonthsRange(value: (Any, Any) => String): Self = StObject.set(x, "formatMonthsRange", js.Any.fromFunction2(value))
    
    inline def setFormatWeekdayLong(value: Any => String): Self = StObject.set(x, "formatWeekdayLong", js.Any.fromFunction1(value))
    
    inline def setFormatWeekdayShort(value: Any => String): Self = StObject.set(x, "formatWeekdayShort", js.Any.fromFunction1(value))
    
    inline def setGetFirstDayOfWeek(value: () => Any | Double): Self = StObject.set(x, "getFirstDayOfWeek", js.Any.fromFunction0(value))
    
    inline def setGetMonths(value: () => js.Array[String]): Self = StObject.set(x, "getMonths", js.Any.fromFunction0(value))
  }
}

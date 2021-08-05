package typings.winrt.Windows.Globalization.DateTimeFormatting

import typings.winrt.Windows.Foundation.Collections.IIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDateTimeFormatterFactory extends StObject {
  
  def createDateTimeFormatter(formatTemplate: String): DateTimeFormatter
  
  def createDateTimeFormatterContext(
    formatTemplate: String,
    languages: IIterable[String],
    geographicRegion: String,
    calendar: String,
    clock: String
  ): DateTimeFormatter
  
  def createDateTimeFormatterDate(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat
  ): DateTimeFormatter
  
  def createDateTimeFormatterDateTimeContext(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat,
    hourFormat: HourFormat,
    minuteFormat: MinuteFormat,
    secondFormat: SecondFormat,
    languages: IIterable[String],
    geographicRegion: String,
    calendar: String,
    clock: String
  ): DateTimeFormatter
  
  def createDateTimeFormatterDateTimeLanguages(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat,
    hourFormat: HourFormat,
    minuteFormat: MinuteFormat,
    secondFormat: SecondFormat,
    languages: IIterable[String]
  ): DateTimeFormatter
  
  def createDateTimeFormatterLanguages(formatTemplate: String, languages: IIterable[String]): DateTimeFormatter
  
  def createDateTimeFormatterTime(hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat): DateTimeFormatter
}
object IDateTimeFormatterFactory {
  
  inline def apply(
    createDateTimeFormatter: String => DateTimeFormatter,
    createDateTimeFormatterContext: (String, IIterable[String], String, String, String) => DateTimeFormatter,
    createDateTimeFormatterDate: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat) => DateTimeFormatter,
    createDateTimeFormatterDateTimeContext: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat, HourFormat, MinuteFormat, SecondFormat, IIterable[String], String, String, String) => DateTimeFormatter,
    createDateTimeFormatterDateTimeLanguages: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat, HourFormat, MinuteFormat, SecondFormat, IIterable[String]) => DateTimeFormatter,
    createDateTimeFormatterLanguages: (String, IIterable[String]) => DateTimeFormatter,
    createDateTimeFormatterTime: (HourFormat, MinuteFormat, SecondFormat) => DateTimeFormatter
  ): IDateTimeFormatterFactory = {
    val __obj = js.Dynamic.literal(createDateTimeFormatter = js.Any.fromFunction1(createDateTimeFormatter), createDateTimeFormatterContext = js.Any.fromFunction5(createDateTimeFormatterContext), createDateTimeFormatterDate = js.Any.fromFunction4(createDateTimeFormatterDate), createDateTimeFormatterDateTimeContext = js.Any.fromFunction11(createDateTimeFormatterDateTimeContext), createDateTimeFormatterDateTimeLanguages = js.Any.fromFunction8(createDateTimeFormatterDateTimeLanguages), createDateTimeFormatterLanguages = js.Any.fromFunction2(createDateTimeFormatterLanguages), createDateTimeFormatterTime = js.Any.fromFunction3(createDateTimeFormatterTime))
    __obj.asInstanceOf[IDateTimeFormatterFactory]
  }
  
  extension [Self <: IDateTimeFormatterFactory](x: Self) {
    
    inline def setCreateDateTimeFormatter(value: String => DateTimeFormatter): Self = StObject.set(x, "createDateTimeFormatter", js.Any.fromFunction1(value))
    
    inline def setCreateDateTimeFormatterContext(value: (String, IIterable[String], String, String, String) => DateTimeFormatter): Self = StObject.set(x, "createDateTimeFormatterContext", js.Any.fromFunction5(value))
    
    inline def setCreateDateTimeFormatterDate(value: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat) => DateTimeFormatter): Self = StObject.set(x, "createDateTimeFormatterDate", js.Any.fromFunction4(value))
    
    inline def setCreateDateTimeFormatterDateTimeContext(
      value: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat, HourFormat, MinuteFormat, SecondFormat, IIterable[String], String, String, String) => DateTimeFormatter
    ): Self = StObject.set(x, "createDateTimeFormatterDateTimeContext", js.Any.fromFunction11(value))
    
    inline def setCreateDateTimeFormatterDateTimeLanguages(
      value: (YearFormat, MonthFormat, DayFormat, DayOfWeekFormat, HourFormat, MinuteFormat, SecondFormat, IIterable[String]) => DateTimeFormatter
    ): Self = StObject.set(x, "createDateTimeFormatterDateTimeLanguages", js.Any.fromFunction8(value))
    
    inline def setCreateDateTimeFormatterLanguages(value: (String, IIterable[String]) => DateTimeFormatter): Self = StObject.set(x, "createDateTimeFormatterLanguages", js.Any.fromFunction2(value))
    
    inline def setCreateDateTimeFormatterTime(value: (HourFormat, MinuteFormat, SecondFormat) => DateTimeFormatter): Self = StObject.set(x, "createDateTimeFormatterTime", js.Any.fromFunction3(value))
  }
}

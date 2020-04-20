package typings.winrt.Windows.Globalization.DateTimeFormatting

import typings.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateTimeFormatterFactory extends js.Object {
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
  @scala.inline
  def apply(
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
}


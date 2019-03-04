package typings
package winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateTimeFormatterFactory extends js.Object {
  def createDateTimeFormatter(formatTemplate: java.lang.String): DateTimeFormatter
  def createDateTimeFormatterContext(
    formatTemplate: java.lang.String,
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    geographicRegion: java.lang.String,
    calendar: java.lang.String,
    clock: java.lang.String
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
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    geographicRegion: java.lang.String,
    calendar: java.lang.String,
    clock: java.lang.String
  ): DateTimeFormatter
  def createDateTimeFormatterDateTimeLanguages(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat,
    hourFormat: HourFormat,
    minuteFormat: MinuteFormat,
    secondFormat: SecondFormat,
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): DateTimeFormatter
  def createDateTimeFormatterLanguages(
    formatTemplate: java.lang.String,
    languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): DateTimeFormatter
  def createDateTimeFormatterTime(hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat): DateTimeFormatter
}

object IDateTimeFormatterFactory {
  @scala.inline
  def apply(
    createDateTimeFormatter: js.Function1[java.lang.String, DateTimeFormatter],
    createDateTimeFormatterContext: js.Function5[
      java.lang.String, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      DateTimeFormatter
    ],
    createDateTimeFormatterDate: js.Function4[YearFormat, MonthFormat, DayFormat, DayOfWeekFormat, DateTimeFormatter],
    createDateTimeFormatterDateTimeContext: js.Function11[
      YearFormat, 
      MonthFormat, 
      DayFormat, 
      DayOfWeekFormat, 
      HourFormat, 
      MinuteFormat, 
      SecondFormat, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], 
      java.lang.String, 
      java.lang.String, 
      java.lang.String, 
      DateTimeFormatter
    ],
    createDateTimeFormatterDateTimeLanguages: js.Function8[
      YearFormat, 
      MonthFormat, 
      DayFormat, 
      DayOfWeekFormat, 
      HourFormat, 
      MinuteFormat, 
      SecondFormat, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], 
      DateTimeFormatter
    ],
    createDateTimeFormatterLanguages: js.Function2[
      java.lang.String, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], 
      DateTimeFormatter
    ],
    createDateTimeFormatterTime: js.Function3[HourFormat, MinuteFormat, SecondFormat, DateTimeFormatter]
  ): IDateTimeFormatterFactory = {
    val __obj = js.Dynamic.literal(createDateTimeFormatter = createDateTimeFormatter, createDateTimeFormatterContext = createDateTimeFormatterContext, createDateTimeFormatterDate = createDateTimeFormatterDate, createDateTimeFormatterDateTimeContext = createDateTimeFormatterDateTimeContext, createDateTimeFormatterDateTimeLanguages = createDateTimeFormatterDateTimeLanguages, createDateTimeFormatterLanguages = createDateTimeFormatterLanguages, createDateTimeFormatterTime = createDateTimeFormatterTime)
  
    __obj.asInstanceOf[IDateTimeFormatterFactory]
  }
}


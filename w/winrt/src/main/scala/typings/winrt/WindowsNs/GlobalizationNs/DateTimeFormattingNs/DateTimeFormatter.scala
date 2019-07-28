package typings.winrt.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import typings.std.Date
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
@js.native
class DateTimeFormatter protected () extends IDateTimeFormatter {
  def this(formatTemplate: String) = this()
  def this(formatTemplate: String, languages: IIterable[String]) = this()
  def this(hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat) = this()
  def this(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat
  ) = this()
  def this(
    formatTemplate: String,
    languages: IIterable[String],
    geographicRegion: String,
    calendar: String,
    clock: String
  ) = this()
  def this(
    yearFormat: YearFormat,
    monthFormat: MonthFormat,
    dayFormat: DayFormat,
    dayOfWeekFormat: DayOfWeekFormat,
    hourFormat: HourFormat,
    minuteFormat: MinuteFormat,
    secondFormat: SecondFormat,
    languages: IIterable[String]
  ) = this()
  def this(
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
  ) = this()
  /* CompleteClass */
  override var calendar: String = js.native
  /* CompleteClass */
  override var clock: String = js.native
  /* CompleteClass */
  override var geographicRegion: String = js.native
  /* CompleteClass */
  override var includeDay: DayFormat = js.native
  /* CompleteClass */
  override var includeDayOfWeek: DayOfWeekFormat = js.native
  /* CompleteClass */
  override var includeHour: HourFormat = js.native
  /* CompleteClass */
  override var includeMinute: MinuteFormat = js.native
  /* CompleteClass */
  override var includeMonth: MonthFormat = js.native
  /* CompleteClass */
  override var includeSecond: SecondFormat = js.native
  /* CompleteClass */
  override var includeYear: YearFormat = js.native
  /* CompleteClass */
  override var languages: IVectorView[String] = js.native
  /* CompleteClass */
  override var numeralSystem: String = js.native
  /* CompleteClass */
  override var patterns: IVectorView[String] = js.native
  /* CompleteClass */
  override var resolvedGeographicRegion: String = js.native
  /* CompleteClass */
  override var resolvedLanguage: String = js.native
  /* CompleteClass */
  override var template: String = js.native
  /* CompleteClass */
  override def format(value: Date): String = js.native
}

/* static members */
@JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
@js.native
object DateTimeFormatter extends js.Object {
  var longDate: DateTimeFormatter = js.native
  var longTime: DateTimeFormatter = js.native
  var shortDate: DateTimeFormatter = js.native
  var shortTime: DateTimeFormatter = js.native
}


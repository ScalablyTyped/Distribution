package typings
package winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
@js.native
class DateTimeFormatter protected () extends IDateTimeFormatter {
  def this(formatTemplate: java.lang.String) = this()
  def this(formatTemplate: java.lang.String, languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]) = this()
  def this(hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat) = this()
  def this(yearFormat: YearFormat, monthFormat: MonthFormat, dayFormat: DayFormat, dayOfWeekFormat: DayOfWeekFormat) = this()
  def this(formatTemplate: java.lang.String, languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], geographicRegion: java.lang.String, calendar: java.lang.String, clock: java.lang.String) = this()
  def this(yearFormat: YearFormat, monthFormat: MonthFormat, dayFormat: DayFormat, dayOfWeekFormat: DayOfWeekFormat, hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat, languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]) = this()
  def this(yearFormat: YearFormat, monthFormat: MonthFormat, dayFormat: DayFormat, dayOfWeekFormat: DayOfWeekFormat, hourFormat: HourFormat, minuteFormat: MinuteFormat, secondFormat: SecondFormat, languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String], geographicRegion: java.lang.String, calendar: java.lang.String, clock: java.lang.String) = this()
  /* CompleteClass */
  override var calendar: java.lang.String = js.native
  /* CompleteClass */
  override var clock: java.lang.String = js.native
  /* CompleteClass */
  override var geographicRegion: java.lang.String = js.native
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
  override var languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /* CompleteClass */
  override var numeralSystem: java.lang.String = js.native
  /* CompleteClass */
  override var patterns: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  /* CompleteClass */
  override var resolvedGeographicRegion: java.lang.String = js.native
  /* CompleteClass */
  override var resolvedLanguage: java.lang.String = js.native
  /* CompleteClass */
  override var template: java.lang.String = js.native
  /* CompleteClass */
  override def format(value: stdLib.Date): java.lang.String = js.native
}

/* static members */
@JSGlobal("Windows.Globalization.DateTimeFormatting.DateTimeFormatter")
@js.native
object DateTimeFormatter extends js.Object {
  var longDate: winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DateTimeFormatter = js.native
  var longTime: winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DateTimeFormatter = js.native
  var shortDate: winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DateTimeFormatter = js.native
  var shortTime: winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs.DateTimeFormatter = js.native
}


package typings
package winrtLib.WindowsNs.GlobalizationNs.DateTimeFormattingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateTimeFormatter extends js.Object {
  var calendar: java.lang.String
  var clock: java.lang.String
  var geographicRegion: java.lang.String
  var includeDay: DayFormat
  var includeDayOfWeek: DayOfWeekFormat
  var includeHour: HourFormat
  var includeMinute: MinuteFormat
  var includeMonth: MonthFormat
  var includeSecond: SecondFormat
  var includeYear: YearFormat
  var languages: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var numeralSystem: java.lang.String
  var patterns: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String]
  var resolvedGeographicRegion: java.lang.String
  var resolvedLanguage: java.lang.String
  var template: java.lang.String
  def format(value: stdLib.Date): java.lang.String
}


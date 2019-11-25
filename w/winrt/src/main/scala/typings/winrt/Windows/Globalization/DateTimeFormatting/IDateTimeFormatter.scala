package typings.winrt.Windows.Globalization.DateTimeFormatting

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateTimeFormatter extends js.Object {
  var calendar: String
  var clock: String
  var geographicRegion: String
  var includeDay: DayFormat
  var includeDayOfWeek: DayOfWeekFormat
  var includeHour: HourFormat
  var includeMinute: MinuteFormat
  var includeMonth: MonthFormat
  var includeSecond: SecondFormat
  var includeYear: YearFormat
  var languages: IVectorView[String]
  var numeralSystem: String
  var patterns: IVectorView[String]
  var resolvedGeographicRegion: String
  var resolvedLanguage: String
  var template: String
  def format(value: Date): String
}

object IDateTimeFormatter {
  @scala.inline
  def apply(
    calendar: String,
    clock: String,
    format: Date => String,
    geographicRegion: String,
    includeDay: DayFormat,
    includeDayOfWeek: DayOfWeekFormat,
    includeHour: HourFormat,
    includeMinute: MinuteFormat,
    includeMonth: MonthFormat,
    includeSecond: SecondFormat,
    includeYear: YearFormat,
    languages: IVectorView[String],
    numeralSystem: String,
    patterns: IVectorView[String],
    resolvedGeographicRegion: String,
    resolvedLanguage: String,
    template: String
  ): IDateTimeFormatter = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], clock = clock.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), geographicRegion = geographicRegion.asInstanceOf[js.Any], includeDay = includeDay.asInstanceOf[js.Any], includeDayOfWeek = includeDayOfWeek.asInstanceOf[js.Any], includeHour = includeHour.asInstanceOf[js.Any], includeMinute = includeMinute.asInstanceOf[js.Any], includeMonth = includeMonth.asInstanceOf[js.Any], includeSecond = includeSecond.asInstanceOf[js.Any], includeYear = includeYear.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDateTimeFormatter]
  }
}


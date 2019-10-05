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
    val __obj = js.Dynamic.literal(calendar = calendar, clock = clock, format = js.Any.fromFunction1(format), geographicRegion = geographicRegion, includeDay = includeDay, includeDayOfWeek = includeDayOfWeek, includeHour = includeHour, includeMinute = includeMinute, includeMonth = includeMonth, includeSecond = includeSecond, includeYear = includeYear, languages = languages, numeralSystem = numeralSystem, patterns = patterns, resolvedGeographicRegion = resolvedGeographicRegion, resolvedLanguage = resolvedLanguage, template = template)
  
    __obj.asInstanceOf[IDateTimeFormatter]
  }
}


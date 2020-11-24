package typings.winrt.Windows.Globalization.DateTimeFormatting

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateTimeFormatter extends IDateTimeFormatter
object DateTimeFormatter {
  
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
  ): DateTimeFormatter = {
    val __obj = js.Dynamic.literal(calendar = calendar.asInstanceOf[js.Any], clock = clock.asInstanceOf[js.Any], format = js.Any.fromFunction1(format), geographicRegion = geographicRegion.asInstanceOf[js.Any], includeDay = includeDay.asInstanceOf[js.Any], includeDayOfWeek = includeDayOfWeek.asInstanceOf[js.Any], includeHour = includeHour.asInstanceOf[js.Any], includeMinute = includeMinute.asInstanceOf[js.Any], includeMonth = includeMonth.asInstanceOf[js.Any], includeSecond = includeSecond.asInstanceOf[js.Any], includeYear = includeYear.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeFormatter]
  }
}

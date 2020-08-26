package typings.winrt.Windows.Globalization.DateTimeFormatting

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateTimeFormatter extends js.Object {
  var calendar: String = js.native
  var clock: String = js.native
  var geographicRegion: String = js.native
  var includeDay: DayFormat = js.native
  var includeDayOfWeek: DayOfWeekFormat = js.native
  var includeHour: HourFormat = js.native
  var includeMinute: MinuteFormat = js.native
  var includeMonth: MonthFormat = js.native
  var includeSecond: SecondFormat = js.native
  var includeYear: YearFormat = js.native
  var languages: IVectorView[String] = js.native
  var numeralSystem: String = js.native
  var patterns: IVectorView[String] = js.native
  var resolvedGeographicRegion: String = js.native
  var resolvedLanguage: String = js.native
  var template: String = js.native
  def format(value: Date): String = js.native
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
  @scala.inline
  implicit class IDateTimeFormatterOps[Self <: IDateTimeFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCalendar(value: String): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def setClock(value: String): Self = this.set("clock", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: Date => String): Self = this.set("format", js.Any.fromFunction1(value))
    @scala.inline
    def setGeographicRegion(value: String): Self = this.set("geographicRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeDay(value: DayFormat): Self = this.set("includeDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeDayOfWeek(value: DayOfWeekFormat): Self = this.set("includeDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeHour(value: HourFormat): Self = this.set("includeHour", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeMinute(value: MinuteFormat): Self = this.set("includeMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeMonth(value: MonthFormat): Self = this.set("includeMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeSecond(value: SecondFormat): Self = this.set("includeSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeYear(value: YearFormat): Self = this.set("includeYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguages(value: IVectorView[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumeralSystem(value: String): Self = this.set("numeralSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setPatterns(value: IVectorView[String]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvedGeographicRegion(value: String): Self = this.set("resolvedGeographicRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolvedLanguage(value: String): Self = this.set("resolvedLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
  }
  
}


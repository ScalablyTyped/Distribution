package typings.winrt.Windows.Globalization.DateTimeFormatting

import typings.std.Date
import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDateTimeFormatter extends StObject {
  
  var calendar: String = js.native
  
  var clock: String = js.native
  
  def format(value: Date): String = js.native
  
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
  implicit class IDateTimeFormatterMutableBuilder[Self <: IDateTimeFormatter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendar(value: String): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClock(value: String): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: Date => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGeographicRegion(value: String): Self = StObject.set(x, "geographicRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDay(value: DayFormat): Self = StObject.set(x, "includeDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDayOfWeek(value: DayOfWeekFormat): Self = StObject.set(x, "includeDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeHour(value: HourFormat): Self = StObject.set(x, "includeHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeMinute(value: MinuteFormat): Self = StObject.set(x, "includeMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeMonth(value: MonthFormat): Self = StObject.set(x, "includeMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeSecond(value: SecondFormat): Self = StObject.set(x, "includeSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeYear(value: YearFormat): Self = StObject.set(x, "includeYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguages(value: IVectorView[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeralSystem(value: String): Self = StObject.set(x, "numeralSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatterns(value: IVectorView[String]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedGeographicRegion(value: String): Self = StObject.set(x, "resolvedGeographicRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedLanguage(value: String): Self = StObject.set(x, "resolvedLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
  }
}

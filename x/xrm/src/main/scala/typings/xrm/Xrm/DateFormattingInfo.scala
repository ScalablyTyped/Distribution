package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UserSettings.dateFormattingInfo response
  */
@js.native
trait DateFormattingInfo extends js.Object {
  
  var AbbreviatedDayNames: js.Array[String] = js.native
  
  var AbbreviatedMonthGenitiveNames: js.Array[String] = js.native
  
  var AbbreviatedMonthNames: js.Array[String] = js.native
  
  var AmDesignator: String = js.native
  
  var Calendar: typings.xrm.Xrm.Calendar = js.native
  
  var CalendarWeekRule: Double = js.native
  
  var DateSeparator: String = js.native
  
  var DayNames: js.Array[String] = js.native
  
  var FirstDayOfWeek: Double = js.native
  
  var FullDateTimePattern: String = js.native
  
  var LongDatePattern: String = js.native
  
  var LongTimePattern: String = js.native
  
  var MonthDayPattern: String = js.native
  
  var MonthGenitiveNames: js.Array[String] = js.native
  
  var MonthNames: js.Array[String] = js.native
  
  var PmDesignator: String = js.native
  
  var ShortDatePattern: String = js.native
  
  var ShortTimePattern: String = js.native
  
  var ShortestDayNames: js.Array[String] = js.native
  
  var SortableDateTimePattern: String = js.native
  
  var TimeSeparator: String = js.native
  
  var UniversalSortableDateTimePattern: String = js.native
  
  var YearMonthPattern: String = js.native
}
object DateFormattingInfo {
  
  @scala.inline
  def apply(
    AbbreviatedDayNames: js.Array[String],
    AbbreviatedMonthGenitiveNames: js.Array[String],
    AbbreviatedMonthNames: js.Array[String],
    AmDesignator: String,
    Calendar: Calendar,
    CalendarWeekRule: Double,
    DateSeparator: String,
    DayNames: js.Array[String],
    FirstDayOfWeek: Double,
    FullDateTimePattern: String,
    LongDatePattern: String,
    LongTimePattern: String,
    MonthDayPattern: String,
    MonthGenitiveNames: js.Array[String],
    MonthNames: js.Array[String],
    PmDesignator: String,
    ShortDatePattern: String,
    ShortTimePattern: String,
    ShortestDayNames: js.Array[String],
    SortableDateTimePattern: String,
    TimeSeparator: String,
    UniversalSortableDateTimePattern: String,
    YearMonthPattern: String
  ): DateFormattingInfo = {
    val __obj = js.Dynamic.literal(AbbreviatedDayNames = AbbreviatedDayNames.asInstanceOf[js.Any], AbbreviatedMonthGenitiveNames = AbbreviatedMonthGenitiveNames.asInstanceOf[js.Any], AbbreviatedMonthNames = AbbreviatedMonthNames.asInstanceOf[js.Any], AmDesignator = AmDesignator.asInstanceOf[js.Any], Calendar = Calendar.asInstanceOf[js.Any], CalendarWeekRule = CalendarWeekRule.asInstanceOf[js.Any], DateSeparator = DateSeparator.asInstanceOf[js.Any], DayNames = DayNames.asInstanceOf[js.Any], FirstDayOfWeek = FirstDayOfWeek.asInstanceOf[js.Any], FullDateTimePattern = FullDateTimePattern.asInstanceOf[js.Any], LongDatePattern = LongDatePattern.asInstanceOf[js.Any], LongTimePattern = LongTimePattern.asInstanceOf[js.Any], MonthDayPattern = MonthDayPattern.asInstanceOf[js.Any], MonthGenitiveNames = MonthGenitiveNames.asInstanceOf[js.Any], MonthNames = MonthNames.asInstanceOf[js.Any], PmDesignator = PmDesignator.asInstanceOf[js.Any], ShortDatePattern = ShortDatePattern.asInstanceOf[js.Any], ShortTimePattern = ShortTimePattern.asInstanceOf[js.Any], ShortestDayNames = ShortestDayNames.asInstanceOf[js.Any], SortableDateTimePattern = SortableDateTimePattern.asInstanceOf[js.Any], TimeSeparator = TimeSeparator.asInstanceOf[js.Any], UniversalSortableDateTimePattern = UniversalSortableDateTimePattern.asInstanceOf[js.Any], YearMonthPattern = YearMonthPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormattingInfo]
  }
  
  @scala.inline
  implicit class DateFormattingInfoOps[Self <: DateFormattingInfo] (val x: Self) extends AnyVal {
    
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
    def setAbbreviatedDayNamesVarargs(value: String*): Self = this.set("AbbreviatedDayNames", js.Array(value :_*))
    
    @scala.inline
    def setAbbreviatedDayNames(value: js.Array[String]): Self = this.set("AbbreviatedDayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbbreviatedMonthGenitiveNamesVarargs(value: String*): Self = this.set("AbbreviatedMonthGenitiveNames", js.Array(value :_*))
    
    @scala.inline
    def setAbbreviatedMonthGenitiveNames(value: js.Array[String]): Self = this.set("AbbreviatedMonthGenitiveNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbbreviatedMonthNamesVarargs(value: String*): Self = this.set("AbbreviatedMonthNames", js.Array(value :_*))
    
    @scala.inline
    def setAbbreviatedMonthNames(value: js.Array[String]): Self = this.set("AbbreviatedMonthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmDesignator(value: String): Self = this.set("AmDesignator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendar(value: Calendar): Self = this.set("Calendar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarWeekRule(value: Double): Self = this.set("CalendarWeekRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateSeparator(value: String): Self = this.set("DateSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayNamesVarargs(value: String*): Self = this.set("DayNames", js.Array(value :_*))
    
    @scala.inline
    def setDayNames(value: js.Array[String]): Self = this.set("DayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = this.set("FirstDayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullDateTimePattern(value: String): Self = this.set("FullDateTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongDatePattern(value: String): Self = this.set("LongDatePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongTimePattern(value: String): Self = this.set("LongTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthDayPattern(value: String): Self = this.set("MonthDayPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthGenitiveNamesVarargs(value: String*): Self = this.set("MonthGenitiveNames", js.Array(value :_*))
    
    @scala.inline
    def setMonthGenitiveNames(value: js.Array[String]): Self = this.set("MonthGenitiveNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("MonthNames", js.Array(value :_*))
    
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = this.set("MonthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPmDesignator(value: String): Self = this.set("PmDesignator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortDatePattern(value: String): Self = this.set("ShortDatePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortTimePattern(value: String): Self = this.set("ShortTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortestDayNamesVarargs(value: String*): Self = this.set("ShortestDayNames", js.Array(value :_*))
    
    @scala.inline
    def setShortestDayNames(value: js.Array[String]): Self = this.set("ShortestDayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortableDateTimePattern(value: String): Self = this.set("SortableDateTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeparator(value: String): Self = this.set("TimeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniversalSortableDateTimePattern(value: String): Self = this.set("UniversalSortableDateTimePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearMonthPattern(value: String): Self = this.set("YearMonthPattern", value.asInstanceOf[js.Any])
  }
}

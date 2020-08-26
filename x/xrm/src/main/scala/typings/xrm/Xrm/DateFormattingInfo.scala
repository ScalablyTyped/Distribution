package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UserSettings.dateFormattingInfo response
  */
@js.native
trait DateFormattingInfo extends js.Object {
  var abbreviatedDayNames: js.Array[String] = js.native
  var abbreviatedMonthGenitiveNames: js.Array[String] = js.native
  var abbreviatedMonthNames: js.Array[String] = js.native
  var amDesignator: String = js.native
  var calendar: Calendar = js.native
  var calendarWeekRule: Double = js.native
  var dateSeparator: String = js.native
  var dayNames: js.Array[String] = js.native
  var firstDayOfWeek: Double = js.native
  var fullDateTimePattern: String = js.native
  var longDatePattern: String = js.native
  var longTimePattern: String = js.native
  var monthDayPattern: String = js.native
  var monthGenitiveNames: js.Array[String] = js.native
  var monthNames: js.Array[String] = js.native
  var pmDesignator: String = js.native
  var shortDatePattern: String = js.native
  var shortTimePattern: String = js.native
  var shortestDayNames: js.Array[String] = js.native
  var sortableDateTimePattern: String = js.native
  var timeSeparator: String = js.native
  var universalSortableDateTimePattern: String = js.native
  var yearMonthPattern: String = js.native
}

object DateFormattingInfo {
  @scala.inline
  def apply(
    abbreviatedDayNames: js.Array[String],
    abbreviatedMonthGenitiveNames: js.Array[String],
    abbreviatedMonthNames: js.Array[String],
    amDesignator: String,
    calendar: Calendar,
    calendarWeekRule: Double,
    dateSeparator: String,
    dayNames: js.Array[String],
    firstDayOfWeek: Double,
    fullDateTimePattern: String,
    longDatePattern: String,
    longTimePattern: String,
    monthDayPattern: String,
    monthGenitiveNames: js.Array[String],
    monthNames: js.Array[String],
    pmDesignator: String,
    shortDatePattern: String,
    shortTimePattern: String,
    shortestDayNames: js.Array[String],
    sortableDateTimePattern: String,
    timeSeparator: String,
    universalSortableDateTimePattern: String,
    yearMonthPattern: String
  ): DateFormattingInfo = {
    val __obj = js.Dynamic.literal(abbreviatedDayNames = abbreviatedDayNames.asInstanceOf[js.Any], abbreviatedMonthGenitiveNames = abbreviatedMonthGenitiveNames.asInstanceOf[js.Any], abbreviatedMonthNames = abbreviatedMonthNames.asInstanceOf[js.Any], amDesignator = amDesignator.asInstanceOf[js.Any], calendar = calendar.asInstanceOf[js.Any], calendarWeekRule = calendarWeekRule.asInstanceOf[js.Any], dateSeparator = dateSeparator.asInstanceOf[js.Any], dayNames = dayNames.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], fullDateTimePattern = fullDateTimePattern.asInstanceOf[js.Any], longDatePattern = longDatePattern.asInstanceOf[js.Any], longTimePattern = longTimePattern.asInstanceOf[js.Any], monthDayPattern = monthDayPattern.asInstanceOf[js.Any], monthGenitiveNames = monthGenitiveNames.asInstanceOf[js.Any], monthNames = monthNames.asInstanceOf[js.Any], pmDesignator = pmDesignator.asInstanceOf[js.Any], shortDatePattern = shortDatePattern.asInstanceOf[js.Any], shortTimePattern = shortTimePattern.asInstanceOf[js.Any], shortestDayNames = shortestDayNames.asInstanceOf[js.Any], sortableDateTimePattern = sortableDateTimePattern.asInstanceOf[js.Any], timeSeparator = timeSeparator.asInstanceOf[js.Any], universalSortableDateTimePattern = universalSortableDateTimePattern.asInstanceOf[js.Any], yearMonthPattern = yearMonthPattern.asInstanceOf[js.Any])
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
    def setAbbreviatedDayNamesVarargs(value: String*): Self = this.set("abbreviatedDayNames", js.Array(value :_*))
    @scala.inline
    def setAbbreviatedDayNames(value: js.Array[String]): Self = this.set("abbreviatedDayNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbbreviatedMonthGenitiveNamesVarargs(value: String*): Self = this.set("abbreviatedMonthGenitiveNames", js.Array(value :_*))
    @scala.inline
    def setAbbreviatedMonthGenitiveNames(value: js.Array[String]): Self = this.set("abbreviatedMonthGenitiveNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbbreviatedMonthNamesVarargs(value: String*): Self = this.set("abbreviatedMonthNames", js.Array(value :_*))
    @scala.inline
    def setAbbreviatedMonthNames(value: js.Array[String]): Self = this.set("abbreviatedMonthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmDesignator(value: String): Self = this.set("amDesignator", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalendar(value: Calendar): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def setCalendarWeekRule(value: Double): Self = this.set("calendarWeekRule", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateSeparator(value: String): Self = this.set("dateSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDayNamesVarargs(value: String*): Self = this.set("dayNames", js.Array(value :_*))
    @scala.inline
    def setDayNames(value: js.Array[String]): Self = this.set("dayNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstDayOfWeek(value: Double): Self = this.set("firstDayOfWeek", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullDateTimePattern(value: String): Self = this.set("fullDateTimePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongDatePattern(value: String): Self = this.set("longDatePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongTimePattern(value: String): Self = this.set("longTimePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthDayPattern(value: String): Self = this.set("monthDayPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthGenitiveNamesVarargs(value: String*): Self = this.set("monthGenitiveNames", js.Array(value :_*))
    @scala.inline
    def setMonthGenitiveNames(value: js.Array[String]): Self = this.set("monthGenitiveNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("monthNames", js.Array(value :_*))
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setPmDesignator(value: String): Self = this.set("pmDesignator", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortDatePattern(value: String): Self = this.set("shortDatePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortTimePattern(value: String): Self = this.set("shortTimePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortestDayNamesVarargs(value: String*): Self = this.set("shortestDayNames", js.Array(value :_*))
    @scala.inline
    def setShortestDayNames(value: js.Array[String]): Self = this.set("shortestDayNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortableDateTimePattern(value: String): Self = this.set("sortableDateTimePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeSeparator(value: String): Self = this.set("timeSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniversalSortableDateTimePattern(value: String): Self = this.set("universalSortableDateTimePattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearMonthPattern(value: String): Self = this.set("yearMonthPattern", value.asInstanceOf[js.Any])
  }
  
}


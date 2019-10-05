package typings.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UserSettings.dateFormattingInfo response
  */
trait DateFormattingInfo extends js.Object {
  var abbreviatedDayNames: js.Array[String]
  var abbreviatedMonthGenitiveNames: js.Array[String]
  var abbreviatedMonthNames: js.Array[String]
  var amDesignator: String
  var calendar: Calendar
  var calendarWeekRule: Double
  var dateSeparator: String
  var dayNames: js.Array[String]
  var firstDayOfWeek: Double
  var fullDateTimePattern: String
  var longDatePattern: String
  var longTimePattern: String
  var monthDayPattern: String
  var monthGenitiveNames: js.Array[String]
  var monthNames: js.Array[String]
  var pmDesignator: String
  var shortDatePattern: String
  var shortTimePattern: String
  var shortestDayNames: js.Array[String]
  var sortableDateTimePattern: String
  var timeSeparator: String
  var universalSortableDateTimePattern: String
  var yearMonthPattern: String
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
    val __obj = js.Dynamic.literal(abbreviatedDayNames = abbreviatedDayNames, abbreviatedMonthGenitiveNames = abbreviatedMonthGenitiveNames, abbreviatedMonthNames = abbreviatedMonthNames, amDesignator = amDesignator, calendar = calendar, calendarWeekRule = calendarWeekRule, dateSeparator = dateSeparator, dayNames = dayNames, firstDayOfWeek = firstDayOfWeek, fullDateTimePattern = fullDateTimePattern, longDatePattern = longDatePattern, longTimePattern = longTimePattern, monthDayPattern = monthDayPattern, monthGenitiveNames = monthGenitiveNames, monthNames = monthNames, pmDesignator = pmDesignator, shortDatePattern = shortDatePattern, shortTimePattern = shortTimePattern, shortestDayNames = shortestDayNames, sortableDateTimePattern = sortableDateTimePattern, timeSeparator = timeSeparator, universalSortableDateTimePattern = universalSortableDateTimePattern, yearMonthPattern = yearMonthPattern)
  
    __obj.asInstanceOf[DateFormattingInfo]
  }
}


package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for UserSettings.dateFormattingInfo response
  */
trait DateFormattingInfo extends js.Object {
  var abbreviatedDayNames: js.Array[java.lang.String]
  var abbreviatedMonthGenitiveNames: js.Array[java.lang.String]
  var abbreviatedMonthNames: js.Array[java.lang.String]
  var amDesignator: java.lang.String
  var calendar: Calendar
  var calendarWeekRule: scala.Double
  var dateSeparator: java.lang.String
  var dayNames: js.Array[java.lang.String]
  var firstDayOfWeek: scala.Double
  var fullDateTimePattern: java.lang.String
  var longDatePattern: java.lang.String
  var longTimePattern: java.lang.String
  var monthDayPattern: java.lang.String
  var monthGenitiveNames: js.Array[java.lang.String]
  var monthNames: js.Array[java.lang.String]
  var pmDesignator: java.lang.String
  var shortDatePattern: java.lang.String
  var shortTimePattern: java.lang.String
  var shortestDayNames: js.Array[java.lang.String]
  var sortableDateTimePattern: java.lang.String
  var timeSeparator: java.lang.String
  var universalSortableDateTimePattern: java.lang.String
  var yearMonthPattern: java.lang.String
}

object DateFormattingInfo {
  @scala.inline
  def apply(
    abbreviatedDayNames: js.Array[java.lang.String],
    abbreviatedMonthGenitiveNames: js.Array[java.lang.String],
    abbreviatedMonthNames: js.Array[java.lang.String],
    amDesignator: java.lang.String,
    calendar: Calendar,
    calendarWeekRule: scala.Double,
    dateSeparator: java.lang.String,
    dayNames: js.Array[java.lang.String],
    firstDayOfWeek: scala.Double,
    fullDateTimePattern: java.lang.String,
    longDatePattern: java.lang.String,
    longTimePattern: java.lang.String,
    monthDayPattern: java.lang.String,
    monthGenitiveNames: js.Array[java.lang.String],
    monthNames: js.Array[java.lang.String],
    pmDesignator: java.lang.String,
    shortDatePattern: java.lang.String,
    shortTimePattern: java.lang.String,
    shortestDayNames: js.Array[java.lang.String],
    sortableDateTimePattern: java.lang.String,
    timeSeparator: java.lang.String,
    universalSortableDateTimePattern: java.lang.String,
    yearMonthPattern: java.lang.String
  ): DateFormattingInfo = {
    val __obj = js.Dynamic.literal(abbreviatedDayNames = abbreviatedDayNames, abbreviatedMonthGenitiveNames = abbreviatedMonthGenitiveNames, abbreviatedMonthNames = abbreviatedMonthNames, amDesignator = amDesignator, calendar = calendar, calendarWeekRule = calendarWeekRule, dateSeparator = dateSeparator, dayNames = dayNames, firstDayOfWeek = firstDayOfWeek, fullDateTimePattern = fullDateTimePattern, longDatePattern = longDatePattern, longTimePattern = longTimePattern, monthDayPattern = monthDayPattern, monthGenitiveNames = monthGenitiveNames, monthNames = monthNames, pmDesignator = pmDesignator, shortDatePattern = shortDatePattern, shortTimePattern = shortTimePattern, shortestDayNames = shortestDayNames, sortableDateTimePattern = sortableDateTimePattern, timeSeparator = timeSeparator, universalSortableDateTimePattern = universalSortableDateTimePattern, yearMonthPattern = yearMonthPattern)
  
    __obj.asInstanceOf[DateFormattingInfo]
  }
}


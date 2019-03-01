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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("abbreviatedDayNames")(abbreviatedDayNames)
    __obj.updateDynamic("abbreviatedMonthGenitiveNames")(abbreviatedMonthGenitiveNames)
    __obj.updateDynamic("abbreviatedMonthNames")(abbreviatedMonthNames)
    __obj.updateDynamic("amDesignator")(amDesignator)
    __obj.updateDynamic("calendar")(calendar)
    __obj.updateDynamic("calendarWeekRule")(calendarWeekRule)
    __obj.updateDynamic("dateSeparator")(dateSeparator)
    __obj.updateDynamic("dayNames")(dayNames)
    __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek)
    __obj.updateDynamic("fullDateTimePattern")(fullDateTimePattern)
    __obj.updateDynamic("longDatePattern")(longDatePattern)
    __obj.updateDynamic("longTimePattern")(longTimePattern)
    __obj.updateDynamic("monthDayPattern")(monthDayPattern)
    __obj.updateDynamic("monthGenitiveNames")(monthGenitiveNames)
    __obj.updateDynamic("monthNames")(monthNames)
    __obj.updateDynamic("pmDesignator")(pmDesignator)
    __obj.updateDynamic("shortDatePattern")(shortDatePattern)
    __obj.updateDynamic("shortTimePattern")(shortTimePattern)
    __obj.updateDynamic("shortestDayNames")(shortestDayNames)
    __obj.updateDynamic("sortableDateTimePattern")(sortableDateTimePattern)
    __obj.updateDynamic("timeSeparator")(timeSeparator)
    __obj.updateDynamic("universalSortableDateTimePattern")(universalSortableDateTimePattern)
    __obj.updateDynamic("yearMonthPattern")(yearMonthPattern)
    __obj.asInstanceOf[DateFormattingInfo]
  }
}


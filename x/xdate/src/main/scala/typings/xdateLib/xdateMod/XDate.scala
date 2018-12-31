package typings
package xdateLib.xdateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XDate extends js.Object {
  def addDays(days: scala.Double): XDate = js.native
  def addHours(hours: scala.Double): XDate = js.native
  def addMilliseconds(milliseconds: scala.Double): XDate = js.native
  def addMinutes(minutes: scala.Double): XDate = js.native
  def addMonths(months: scala.Double): XDate = js.native
  def addMonths(months: scala.Double, preventOverflow: scala.Boolean): XDate = js.native
  def addSeconds(seconds: scala.Double): XDate = js.native
  def addWeeks(weeks: scala.Double): XDate = js.native
  //------------
  //Adding
  //------------
  def addYears(years: scala.Double): XDate = js.native
  def addYears(years: scala.Double, preventOverflow: scala.Boolean): XDate = js.native
  /*
    *sets the hours, minutes, seconds, and milliseconds to zero
    */
  def clearTime(): XDate = js.native
  def diffDays(otherDate: java.lang.String): scala.Double = js.native
  def diffDays(otherDate: XDate): scala.Double = js.native
  def diffHours(otherDate: java.lang.String): scala.Double = js.native
  def diffHours(otherDate: XDate): scala.Double = js.native
  def diffMilliseconds(otherDate: java.lang.String): scala.Double = js.native
  def diffMilliseconds(otherDate: XDate): scala.Double = js.native
  def diffMinutes(otherDate: java.lang.String): scala.Double = js.native
  def diffMinutes(otherDate: XDate): scala.Double = js.native
  def diffMonths(otherDate: java.lang.String): scala.Double = js.native
  def diffMonths(otherDate: XDate): scala.Double = js.native
  def diffSeconds(otherDate: java.lang.String): scala.Double = js.native
  def diffSeconds(otherDate: XDate): scala.Double = js.native
  def diffWeeks(otherDate: java.lang.String): scala.Double = js.native
  def diffWeeks(otherDate: XDate): scala.Double = js.native
  //------------
  //Diffing
  //------------
  def diffYears(otherDate: java.lang.String): scala.Double = js.native
  def diffYears(otherDate: XDate): scala.Double = js.native
  /*
    *Returns the date of the month. (1-31)
    */
  def getDate(): scala.Double = js.native
  /*
    *Returns the day-of-week as a number. (0-6)
    *Sun=0, Mon=1, Tue=2, etc.
    */
  def getDay(): scala.Double = js.native
  //------------
  //Getters
  //------------
  /**
    * Returns the 4-digit year (ex: 2012)
    * @return {number} 4-digit year (ex: 2012)
    */
  def getFullYear(): scala.Double = js.native
  /*
    *Returns the hour of the day. (0-23)
    */
  def getHours(): scala.Double = js.native
  /*
    *Returns the millisecond of the second. (0-999)
    */
  def getMilliseconds(): scala.Double = js.native
  /*
    *Returns the minute of the hour. (0-59)
    */
  def getMinutes(): scala.Double = js.native
  /*
    *Returns the month of the year. (0-11)
    *Value is zero-index, meaning Jan=0, Feb=1, Mar=2, etc.
    */
  def getMonth(): scala.Double = js.native
  /*
    *Returns the second of the minute. (0-59)
    */
  def getSeconds(): scala.Double = js.native
  /*
    *Returns the number of milliseconds since the epoch.
    */
  def getTime(): scala.Double = js.native
  /*
    *Returns the number of minutes from UTC, just like the native Date's getTimezoneOffset.
    *However, if the XDate is in UTC-mode, 0 will be returned.
    */
  def getTimezoneOffset(): scala.Double = js.native
  def getUTCDate(): scala.Double = js.native
  def getUTCDay(): scala.Double = js.native
  //------------
  //Formatting
  //------------
  def getUTCFullYear(): scala.Double = js.native
  def getUTCHours(): scala.Double = js.native
  def getUTCMilliseconds(): scala.Double = js.native
  def getUTCMinutes(): scala.Double = js.native
  //------------
  //UTC Mode
  //------------
  /*
    *Returns true if the date is in UTC-mode and false otherwise
    */
  def getUTCMode(): scala.Boolean = js.native
  def getUTCMonth(): scala.Double = js.native
  def getUTCSeconds(): scala.Double = js.native
  def getUTCWeek(): scala.Double = js.native
  /*
    *Returns the ISO week number of the year. (1-53)
    */
  def getWeek(): scala.Double = js.native
  /*
    *Sets the date of the month. (1-31)
    */
  def setDate(date: scala.Double): XDate = js.native
  //------------
  //Setters
  //------------
  /*
    *year is a 4-digit year
    */
  def setFullYear(year: scala.Double): XDate = js.native
  def setFullYear(year: scala.Double, preventOverflow: scala.Boolean): XDate = js.native
  /*
    *Sets the hour of the day. (0-23)
    */
  def setHours(hours: scala.Double): XDate = js.native
  /*
    *Sets the millisecond of the second. (0-999)
    */
  def setMilliseconds(milliseconds: scala.Double): XDate = js.native
  /*
    *Sets the minute of the hour. (0-59)
    */
  def setMinutes(minutes: scala.Double): XDate = js.native
  /*
    month is zero-indexed, meaning Jan=0, Feb=1, Mar=2, etc.
    */
  def setMonth(month: scala.Double): XDate = js.native
  def setMonth(month: scala.Double, preventOverflow: scala.Boolean): XDate = js.native
  /*
    *Sets the second of the minute. (0-59)
    */
  def setSeconds(seconds: scala.Double): XDate = js.native
  /*
    *Sets the number of milliseconds since the epoch.
    */
  def setTime(milliseconds: scala.Double): XDate = js.native
  def setUTCDate(date: scala.Double): XDate = js.native
  def setUTCFullYear(year: scala.Double): XDate = js.native
  def setUTCHours(hours: scala.Double): XDate = js.native
  def setUTCMilliseconds(milliseconds: scala.Double): XDate = js.native
  def setUTCMinutes(minutes: scala.Double): XDate = js.native
  /*
    *utcMode must be either true or false. If the optional doCoercion parameters is set to true,
    *the underlying millisecond time of the date will be coerced in such a way that methods like
    *getDate and getHours will have the same values before and after the conversion.
    */
  def setUTCMode(utcMode: scala.Boolean): XDate = js.native
  def setUTCMode(utcMode: scala.Boolean, doCoercion: scala.Boolean): XDate = js.native
  def setUTCMonth(month: scala.Double): XDate = js.native
  def setUTCSeconds(seconds: scala.Double): XDate = js.native
  def setUTCWeek(week: scala.Double): XDate = js.native
  def setUTCWeek(week: scala.Double, year: scala.Double): XDate = js.native
  /*
    *Moves the xdate to the Monday of the given week with time 00:00:00.
    *The week is represented by a given ISO week number and an optional year. If year is omitted, the xdate's year with be used.
    */
  def setWeek(week: scala.Double): XDate = js.native
  def setWeek(week: scala.Double, year: scala.Double): XDate = js.native
  /*
    *Returns a conversion to a native Date
    */
  def toDate(): stdLib.Date = js.native
  /*
    *Same as native Date's toDateString
    */
  def toDateString(): java.lang.String = js.native
  def toGMTString(): java.lang.String = js.native
  def toGMTString(formatString: java.lang.String): java.lang.String = js.native
  def toGMTString(formatString: java.lang.String, settings: js.Object): java.lang.String = js.native
  /*
    *Returns an ISO8601 string that has been normalized to UTC. Will have a "Z" timezone indicator.
    *See the native Date's specs for toISOString.
    */
  def toISOString(): java.lang.String = js.native
  /*
    *Same as native Date's toLocaleDateString
    */
  def toLocaleDateString(): java.lang.String = js.native
  /*
    *Same as native Date's toLocaleTimeString
    */
  def toLocaleTimeString(): java.lang.String = js.native
  def toString(formatString: java.lang.String): java.lang.String = js.native
  def toString(formatString: java.lang.String, settings: js.Object): java.lang.String = js.native
  /*
    *Same as native Date's toTimeString
    */
  def toTimeString(): java.lang.String = js.native
  /*
    *Same as toString but gets its values from the UTC version of the date.
    *As a result, "Z" will be displayed as the timezone.
    */
  def toUTCString(): java.lang.String = js.native
  def toUTCString(formatString: java.lang.String): java.lang.String = js.native
  def toUTCString(formatString: java.lang.String, settings: js.Object): java.lang.String = js.native
  /*
    *return true if the XDate is a valid date, false otherwise
    */
  def valid(): scala.Boolean = js.native
}


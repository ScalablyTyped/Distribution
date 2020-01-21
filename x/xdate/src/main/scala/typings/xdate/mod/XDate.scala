package typings.xdate.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XDate extends js.Object {
  def addDays(days: Double): XDate = js.native
  def addHours(hours: Double): XDate = js.native
  def addMilliseconds(milliseconds: Double): XDate = js.native
  def addMinutes(minutes: Double): XDate = js.native
  def addMonths(months: Double): XDate = js.native
  def addMonths(months: Double, preventOverflow: Boolean): XDate = js.native
  def addSeconds(seconds: Double): XDate = js.native
  def addWeeks(weeks: Double): XDate = js.native
  //------------
  //Adding
  //------------
  def addYears(years: Double): XDate = js.native
  def addYears(years: Double, preventOverflow: Boolean): XDate = js.native
  /*
    *sets the hours, minutes, seconds, and milliseconds to zero
    */
  def clearTime(): XDate = js.native
  def diffDays(otherDate: String): Double = js.native
  def diffDays(otherDate: XDate): Double = js.native
  def diffHours(otherDate: String): Double = js.native
  def diffHours(otherDate: XDate): Double = js.native
  def diffMilliseconds(otherDate: String): Double = js.native
  def diffMilliseconds(otherDate: XDate): Double = js.native
  def diffMinutes(otherDate: String): Double = js.native
  def diffMinutes(otherDate: XDate): Double = js.native
  def diffMonths(otherDate: String): Double = js.native
  def diffMonths(otherDate: XDate): Double = js.native
  def diffSeconds(otherDate: String): Double = js.native
  def diffSeconds(otherDate: XDate): Double = js.native
  def diffWeeks(otherDate: String): Double = js.native
  def diffWeeks(otherDate: XDate): Double = js.native
  //------------
  //Diffing
  //------------
  def diffYears(otherDate: String): Double = js.native
  def diffYears(otherDate: XDate): Double = js.native
  /*
    *Returns the date of the month. (1-31)
    */
  def getDate(): Double = js.native
  /*
    *Returns the day-of-week as a number. (0-6)
    *Sun=0, Mon=1, Tue=2, etc.
    */
  def getDay(): Double = js.native
  //------------
  //Getters
  //------------
  /**
    * Returns the 4-digit year (ex: 2012)
    * @return {number} 4-digit year (ex: 2012)
    */
  def getFullYear(): Double = js.native
  /*
    *Returns the hour of the day. (0-23)
    */
  def getHours(): Double = js.native
  /*
    *Returns the millisecond of the second. (0-999)
    */
  def getMilliseconds(): Double = js.native
  /*
    *Returns the minute of the hour. (0-59)
    */
  def getMinutes(): Double = js.native
  /*
    *Returns the month of the year. (0-11)
    *Value is zero-index, meaning Jan=0, Feb=1, Mar=2, etc.
    */
  def getMonth(): Double = js.native
  /*
    *Returns the second of the minute. (0-59)
    */
  def getSeconds(): Double = js.native
  /*
    *Returns the number of milliseconds since the epoch.
    */
  def getTime(): Double = js.native
  /*
    *Returns the number of minutes from UTC, just like the native Date's getTimezoneOffset.
    *However, if the XDate is in UTC-mode, 0 will be returned.
    */
  def getTimezoneOffset(): Double = js.native
  def getUTCDate(): Double = js.native
  def getUTCDay(): Double = js.native
  //------------
  //Formatting
  //------------
  def getUTCFullYear(): Double = js.native
  def getUTCHours(): Double = js.native
  def getUTCMilliseconds(): Double = js.native
  def getUTCMinutes(): Double = js.native
  //------------
  //UTC Mode
  //------------
  /*
    *Returns true if the date is in UTC-mode and false otherwise
    */
  def getUTCMode(): Boolean = js.native
  def getUTCMonth(): Double = js.native
  def getUTCSeconds(): Double = js.native
  def getUTCWeek(): Double = js.native
  /*
    *Returns the ISO week number of the year. (1-53)
    */
  def getWeek(): Double = js.native
  /*
    *Sets the date of the month. (1-31)
    */
  def setDate(date: Double): XDate = js.native
  //------------
  //Setters
  //------------
  /*
    *year is a 4-digit year
    */
  def setFullYear(year: Double): XDate = js.native
  def setFullYear(year: Double, preventOverflow: Boolean): XDate = js.native
  /*
    *Sets the hour of the day. (0-23)
    */
  def setHours(hours: Double): XDate = js.native
  /*
    *Sets the millisecond of the second. (0-999)
    */
  def setMilliseconds(milliseconds: Double): XDate = js.native
  /*
    *Sets the minute of the hour. (0-59)
    */
  def setMinutes(minutes: Double): XDate = js.native
  /*
    month is zero-indexed, meaning Jan=0, Feb=1, Mar=2, etc.
    */
  def setMonth(month: Double): XDate = js.native
  def setMonth(month: Double, preventOverflow: Boolean): XDate = js.native
  /*
    *Sets the second of the minute. (0-59)
    */
  def setSeconds(seconds: Double): XDate = js.native
  /*
    *Sets the number of milliseconds since the epoch.
    */
  def setTime(milliseconds: Double): XDate = js.native
  def setUTCDate(date: Double): XDate = js.native
  def setUTCFullYear(year: Double): XDate = js.native
  def setUTCHours(hours: Double): XDate = js.native
  def setUTCMilliseconds(milliseconds: Double): XDate = js.native
  def setUTCMinutes(minutes: Double): XDate = js.native
  /*
    *utcMode must be either true or false. If the optional doCoercion parameters is set to true,
    *the underlying millisecond time of the date will be coerced in such a way that methods like
    *getDate and getHours will have the same values before and after the conversion.
    */
  def setUTCMode(utcMode: Boolean): XDate = js.native
  def setUTCMode(utcMode: Boolean, doCoercion: Boolean): XDate = js.native
  def setUTCMonth(month: Double): XDate = js.native
  def setUTCSeconds(seconds: Double): XDate = js.native
  def setUTCWeek(week: Double): XDate = js.native
  def setUTCWeek(week: Double, year: Double): XDate = js.native
  /*
    *Moves the xdate to the Monday of the given week with time 00:00:00.
    *The week is represented by a given ISO week number and an optional year. If year is omitted, the xdate's year with be used.
    */
  def setWeek(week: Double): XDate = js.native
  def setWeek(week: Double, year: Double): XDate = js.native
  /*
    *Returns a conversion to a native Date
    */
  def toDate(): Date = js.native
  /*
    *Same as native Date's toDateString
    */
  def toDateString(): String = js.native
  def toGMTString(): String = js.native
  def toGMTString(formatString: String): String = js.native
  def toGMTString(formatString: String, settings: js.Object): String = js.native
  /*
    *Returns an ISO8601 string that has been normalized to UTC. Will have a "Z" timezone indicator.
    *See the native Date's specs for toISOString.
    */
  def toISOString(): String = js.native
  /*
    *Same as native Date's toLocaleDateString
    */
  def toLocaleDateString(): String = js.native
  /*
    *Same as native Date's toLocaleTimeString
    */
  def toLocaleTimeString(): String = js.native
  def toString(formatString: String): String = js.native
  def toString(formatString: String, settings: js.Object): String = js.native
  /*
    *Same as native Date's toTimeString
    */
  def toTimeString(): String = js.native
  /*
    *Same as toString but gets its values from the UTC version of the date.
    *As a result, "Z" will be displayed as the timezone.
    */
  def toUTCString(): String = js.native
  def toUTCString(formatString: String): String = js.native
  def toUTCString(formatString: String, settings: js.Object): String = js.native
  /*
    *return true if the XDate is a valid date, false otherwise
    */
  def valid(): Boolean = js.native
}


package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tizen-common-web", "TZDate")
@js.native
open class TZDate () extends StObject {
  def this(datetime: js.Date) = this()
  def this(datetime: js.Date, timezone: String) = this()
  def this(datetime: Null, timezone: String) = this()
  def this(datetime: Unit, timezone: String) = this()
  def this(
    year: Double,
    month: Double,
    day: Double,
    hours: js.UndefOr[Double | Null],
    minutes: js.UndefOr[Double | Null],
    seconds: js.UndefOr[Double | Null],
    milliseconds: js.UndefOr[Double | Null],
    timezone: js.UndefOr[String | Null]
  ) = this()
  
  /**
    * Gets a new date by adding a duration to the current TZDate object.
    *
    * If the length of duration is negative, the new date/time will be
    * earlier than it used to.
    *
    * Note that calling this method does not alter the current object.
    *
    * @param duration TimeDuration to add.
    *
    * @returns The new TZDate by adding a duration.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def addDuration(duration: TimeDuration): TZDate = js.native
  
  /**
    * Calculates the difference with another TZDate object.
    *
    * Calculates the difference in time between _this_ and the other object.
    * This comparison method takes timezones into consideration for the comparison.
    *
    * The TimeDuration that is returned is effectively _this_ - other.
    * The return value is a duration in milliseconds both TZDate objects have a time component, in days, otherwise.
    * The result value will be:
    *
    * *   Negative, if other is in the future
    * *   0 if the two date/times are equal
    * *   Positive, if other is in the past
    *
    *
    * @param other The other Date/Time to compare to.
    *
    * @returns The duration in milliseconds between the two date/time objects
    * (or in days for comparison between dates with no time component).
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def difference(other: TZDate): TimeDuration = js.native
  
  /**
    * Checks whether the TZDate is earlier than another.
    *
    * This method takes the timezones into consideration.
    *
    * @param other The other Date/Time to compare to.
    *
    * @returns true, if the Date/Time is earlier than the one passed in argument.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def earlierThan(other: TZDate): Boolean = js.native
  
  /**
    * Checks whether the TZDate is equal to another.
    *
    * This method takes the timezones into consideration and will return true if
    * the two TZDate objects represent the same instant in different timezones.
    *
    * @param other Other Date/Time to compare to.
    *
    * @returns true if the 2 date/times are the same.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def equalsTo(other: TZDate): Boolean = js.native
  
  /**
    * Gets the day of the month (from 1-31).
    *
    * @returns The day of the month.
    */
  def getDate(): Double = js.native
  
  /**
    * Gets the day of the week (from 0-6). 0 denotes Sunday, 1 denotes Monday and so on.
    *
    * @returns The day of the week.
    */
  def getDay(): Double = js.native
  
  /**
    * Gets the year.
    *
    * Positive values indicate AD(Anno Domini) years. 0 and negative values indicate BC(Before Christ) years.
    * For example, 1 = AD 1, 0 = BC 1, -1 = BC 2.
    *
    * @returns The year.
    */
  def getFullYear(): Double = js.native
  
  /**
    * Gets the hour (0-23).
    *
    * @returns The hour.
    */
  def getHours(): Double = js.native
  
  /**
    * Gets the milliseconds (from 0-999).
    *
    * @returns The milliseconds.
    */
  def getMilliseconds(): Double = js.native
  
  /**
    * Gets the minutes (from 0-59).
    *
    * @returns The minutes.
    */
  def getMinutes(): Double = js.native
  
  /**
    * Gets the month (from 0-11).
    * Note: January is denoted as 0, February as 1, and so on till December, which is denoted as 11.
    *
    * @returns The month.
    */
  def getMonth(): Double = js.native
  
  /**
    * Gets the date of the next daylight saving time transition for the timezone.
    *
    * @returns The date of the next daylight saving transition (after the instant identified by the TZDate).
    *
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def getNextDSTTransition(): TZDate | Null = js.native
  
  /**
    * Gets the date of the previous daylight saving time transition for the timezone.
    *
    * @returns The date of the previous daylight saving transition (before the instant identified by the TZDate).
    *
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def getPreviousDSTTransition(): TZDate | Null = js.native
  
  /**
    * Gets the seconds (from 0-59).
    *
    * @returns The seconds.
    */
  def getSeconds(): Double = js.native
  
  /**
    * Gets the timezone identifier.
    *
    * Zero or more slashes separate different components, with the most general
    * descriptor first and the most specific one last. For example,
    * "Europe/Berlin", "America/Argentina/Buenos\_Aires".
    *
    * This attribute uniquely identifies the timezone.
    *
    * @returns The string timezone identifier. If TZDate is invalid, it will return "Invalid Date".
    */
  def getTimezone(): String = js.native
  
  /**
    * Determines the time zone abbreviation to be used at a particular date in the time zone.
    *
    * For example, in Toronto this is currently "EST" during the winter months and "EDT" during the
    * summer months when daylight savings time is in effect.
    *
    * @note _deprecated_ 2.1 Deprecated since 2.1.
    *
    * @returns DOMString The abbreviation of the time zone (such as "EST")
    * If TZDate is invalid, it will return 'Invalid Date'.
    *
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def getTimezoneAbbreviation(): String = js.native
  
  /**
    * Gets the day of the month, according to universal time (from 1-31).
    *
    * @returns The day of the month, according to universal time.
    */
  def getUTCDate(): Double = js.native
  
  /**
    * Gets the day of the week, according to universal time (from 0-6).
    *
    * @returns The day of the week, according to universal time.
    */
  def getUTCDay(): Double = js.native
  
  /**
    * Gets the year, according to universal time.
    *
    * Positive values indicate AD(Anno Domini) years. 0 and negative values indicate BC(Before Christ) years.
    * For example, 1 = AD 1, 0 = BC 1, -1 = BC 2.
    *
    * @returns The year, according to universal time.
    */
  def getUTCFullYear(): Double = js.native
  
  /**
    * Gets the hour, according to universal time (0-23).
    *
    * @returns The hour, according to universal time.
    */
  def getUTCHours(): Double = js.native
  
  /**
    * Gets the milliseconds, according to universal time (from 0-999).
    *
    * @returns The milliseconds, according to universal time.
    */
  def getUTCMilliseconds(): Double = js.native
  
  /**
    * Gets the minutes, according to universal time (from 0-59).
    *
    * @returns The minutes, according to universal time.
    */
  def getUTCMinutes(): Double = js.native
  
  /**
    * Gets the month, according to universal time (from 0-11).
    * Note: January is denoted as 0, February as 1 and so on till December, which is denoted as 11.
    *
    * @returns The month, according to universal time.
    */
  def getUTCMonth(): Double = js.native
  
  /**
    * Gets the seconds, according to universal time (from 0-59).
    *
    * @returns The seconds, according to universal time.
    */
  def getUTCSeconds(): Double = js.native
  
  /**
    * Checks whether Daylight Saving Time(DST) is active for this TZDate.
    *
    * Indicates if daylight savings are in effect for the time zone and instant
    * identified by the TZDate object.
    *
    * @returns The flag indicating whether the daylight saving are in effect.
    *
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def isDST(): Boolean = js.native
  
  /**
    * Checks whether the TZDate is later than another.
    *
    * This method takes the timezones into consideration.
    *
    * @param other The other Date/Time to compare to.
    *
    * @returns true, if the Date/Time is later than the one passed in argument.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def laterThan(other: TZDate): Boolean = js.native
  
  /**
    * Gets the number of seconds from Coordinated Universal Time (UTC) offset for the timezone.
    *
    * Returns the offset (in seconds) from UTC of the timezone, accounting for daylight
    * savings if it is in the timezone. For example, if time zone is GMT+8, it will return -32,400.
    *
    * @returns The offset from UTC in seconds.
    *
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def secondsFromUTC(): Double = js.native
  
  /**
    * Sets the day of the month (from 1-31).
    *
    * If the value passed as a parameter is greater than the last day of current month or smaller than 1, the TZDate will be automatically recalculated to reflect this.
    * For example, if TZDate's month is May and parameter is 32, it will be set to June 1.
    *
    * @param date Date to set.
    */
  def setDate(date: Double): Unit = js.native
  
  /**
    * Sets the year.
    *
    * @param year Year to set.
    */
  def setFullYear(year: Double): Unit = js.native
  
  /**
    * Sets the hour (0-23).
    *
    * If the value passed as a parameter is greater than 23 or smaller than 0, the TZDate will be automatically recalculated to reflect this.
    * For example, calling setHours(24) results in setting hour to 00:00 and date to the next day.
    *
    * @param hours Hours to set.
    */
  def setHours(hours: Double): Unit = js.native
  
  /**
    * Sets the milliseconds (from 0-999).
    *
    * If the value passed as a parameter is greater than 999 or smaller than 0, the TZDate will be automatically recalculated to reflect this.
    * For example, calling setMilliseconds(1000) results in setting milliseconds to 0 and adding one second.
    *
    * @param ms Milliseconds to set.
    */
  def setMilliseconds(ms: Double): Unit = js.native
  
  /**
    * Sets the minutes.
    *
    * If the value passed as a parameter is greater than 59 or smaller than 0, the TZDate will be automatically recalculated to reflect this.
    * For example, calling setMinutes(60) results in setting minutes to 0 and adding one hour.
    *
    * @param minutes Minutes to set.
    */
  def setMinutes(minutes: Double): Unit = js.native
  
  /**
    * Sets the month (from 0-11).
    *
    * If the value passed as a parameter is greater than 11 or smaller than 0, the TZDate will be automatically recalculated to reflect this.
    * For example, calling setMonth(12) results in setting month to 0 and adding one year.
    *
    * @param month Month to set.
    */
  def setMonth(month: Double): Unit = js.native
  
  /**
    * Sets the seconds (from 0-59).
    *
    * If the value passed as a parameter is greater than 59 or smaller than 0, the TZDate will be automatically recalculated to reflect this.
    * For example, calling setSeconds(60) results in setting seconds to 0 and adding one minute.
    *
    * @param seconds Seconds to set.
    */
  def setSeconds(seconds: Double): Unit = js.native
  
  /**
    * Sets the day of the month, according to universal time (from 1-31).
    *
    * If the value passed as a parameter is greater than the last day of current month or smaller than 0, the TZDate will be automatically recalculated to reflect this.
    * For example, calling setUTCDate(32) when TZDate's month is May results in setting it to June 1.
    *
    * @param date Date to set.
    */
  def setUTCDate(date: Double): Unit = js.native
  
  /**
    * Sets the year, according to universal time.
    *
    * @param year Year to set.
    */
  def setUTCFullYear(year: Double): Unit = js.native
  
  /**
    * Sets the hour, according to universal time (0-23).
    *
    * If the value passed as a parameter is greater than 23 or smaller than 0, the TZDate will be automatically recalculated to reflect this.
    * For example, calling setUTCHours(24) results in setting hour to 0 and adding one day.
    *
    * @param hours Hours to set.
    */
  def setUTCHours(hours: Double): Unit = js.native
  
  /**
    * Sets the milliseconds, according to universal time (from 0-999).
    *
    * If the value passed as a parameter is greater than 999 or smaller than 0, the TZDate will be automatically recalculated to reflect this.
    * For example, calling setUTCMilliseconds(1000) results in setting milliseconds to 0 and adding one second.
    *
    * @param ms Milliseconds to set.
    */
  def setUTCMilliseconds(ms: Double): Unit = js.native
  
  /**
    * Sets the minutes, according to universal time (from 0-59).
    *
    * If the value passed as a parameter is greater than 59 or smaller than 0, the TZDate will be automatically recalculated to reflect this.
    * For example, calling setUTCMinutes(60) results in setting minutes to 0 and adding one hour.
    *
    * @param minutes Minutes to set.
    */
  def setUTCMinutes(minutes: Double): Unit = js.native
  
  /**
    * Sets the month, according to universal time (from 0-11).
    *
    * If the value passed as a parameter is greater than 11 or smaller than 0, the TZDate will be automatically recalculated to reflect this.
    * For example, calling setUTCMonth(12) results in setting month to 0 and adding one year.
    *
    * @param month Month to set.
    */
  def setUTCMonth(month: Double): Unit = js.native
  
  /**
    * Sets the seconds, according to universal time (from 0-59).
    *
    * If the value passed as a parameter is greater than 59 or smaller than 0, the TZDate will be automatically recalculated to reflect this.
    * For example, calling setUTCSeconds(60) results in setting seconds to 0 and adding one minute.
    *
    * @param seconds Seconds to set.
    */
  def setUTCSeconds(seconds: Double): Unit = js.native
  
  /**
    * Gets the date portion of a TZDate object as a string.
    *
    * @returns The date portion of the TZDate object as a string. If TZDate is invalid, it will return "Invalid Date".
    */
  def toDateString(): String = js.native
  
  /**
    * Gets a copy of the TZDate converted to the local time zone.
    *
    * @returns The new TZDate in local Timezone.
    *
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def toLocalTimezone(): TZDate = js.native
  
  /**
    * Gets the date portion of a TZDate object as a string, using locale conventions.
    *
    * @returns The date portion of the TZDate object as a string, using locale conventions. If TZDate is invalid, it will return "Invalid Date".
    */
  def toLocaleDateString(): String = js.native
  
  /**
    * Gets the time portion of a TZDate object as a string, using locale conventions.
    *
    * @returns The time portion of the TZDate object as a string, using locale conventions. If TZDate is invalid, it will return "Invalid Date".
    */
  def toLocaleTimeString(): String = js.native
  
  /**
    * Gets the time portion of a TZDate object as a string.
    *
    * @returns The time portion of the TZDate object as a string. If TZDate is invalid, it will return "Invalid Date".
    */
  def toTimeString(): String = js.native
  
  /**
    * Gets a copy of the TZDate converted to a given time zone.
    *
    * @param tzid Timezone identifier to set.
    *
    * @returns The new TZDate in given Timezone.
    *
    * @throw WebAPIException with error type TypeMismatchError, if the input parameter
    * is not compatible with the expected type for that parameter.
    * @throw WebAPIException with error type InvalidValuesError, if the provided TZID
    * is not recognized as a valid timezone identifier.
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def toTimezone(tzid: String): TZDate = js.native
  
  /**
    * Gets a copy of the TZDate converted to Coordinated Universal Time (UTC).
    *
    * @returns The Date/Time in UTC.
    *
    * @throw WebAPIException with error type UnknownError, if the call failed due to an unknown error.
    */
  def toUTC(): TZDate = js.native
}

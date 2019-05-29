package typings
package timezonecompleteLib.distLibDatetimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/datetime", "DateTime")
@js.native
/**
  * Constructor. Creates current time in local timezone.
  */
class DateTime () extends js.Object {
  /**
    * Constructor. Parses ISO timestamp string.
    * Non-existing local times are normalized by rounding up to the next DST offset.
    *
    * @param isoString	String in ISO 8601 format. Instead of ISO time zone,
    *        it may include a space and then and IANA time zone.
    *        e.g. "2007-04-05T12:30:40.500"					(no time zone, naive date)
    *        e.g. "2007-04-05T12:30:40.500+01:00"				(UTC offset without daylight saving time)
    *        or   "2007-04-05T12:30:40.500Z"					(UTC)
    *        or   "2007-04-05T12:30:40.500 Europe/Amsterdam"	(IANA time zone, with daylight saving time if applicable)
    * @param timeZone	if given, the date in the string is assumed to be in this time zone.
    *        Note that it is NOT CONVERTED to the time zone. Useful
    *        for strings without a time zone
    */
  def this(isoString: java.lang.String) = this()
  /**
    * Get a date from a TimeStruct
    */
  def this(tm: timezonecompleteLib.distLibBasicsMod.TimeStruct) = this()
  /**
    * Constructor
    * @param unixTimestamp	milliseconds since 1970-01-01T00:00:00.000
    * @param timeZone	the time zone that the timestamp is assumed to be in (usually UTC).
    */
  def this(unixTimestamp: scala.Double) = this()
  /**
    * Constructor. Parses string in given LDML format.
    * NOTE: does not handle eras/quarters/weeks/weekdays.
    * Non-existing local times are normalized by rounding up to the next DST offset.
    *
    * @param dateString	Date+Time string.
    * @param format The LDML format that the string is assumed to be in
    * @param timeZone	if given, the date in the string is assumed to be in this time zone.
    *        Note that it is NOT CONVERTED to the time zone. Useful
    *        for strings without a time zone
    */
  def this(dateString: java.lang.String, format: java.lang.String) = this()
  /**
    * Constructor. You provide a date, then you say whether to take the
    * date.getYear()/getXxx methods or the date.getUTCYear()/date.getUTCXxx methods,
    * and then you state which time zone that date is in.
    * Non-existing local times are normalized by rounding up to the next DST offset.
    * Note that the Date class has bugs and inconsistencies when constructing them with times around
    * DST changes.
    *
    * @param date	A date object.
    * @param getters Specifies which set of Date getters contains the date in the given time zone: the
    *        Date.getXxx() methods or the Date.getUTCXxx() methods.
    * @param timeZone The time zone that the given date is assumed to be in (may be undefined or null for unaware dates)
    */
  def this(date: stdLib.Date, getFuncs: timezonecompleteLib.distLibJavascriptMod.DateFunctions) = this()
  def this(isoString: java.lang.String, timeZone: timezonecompleteLib.distLibTimezoneMod.TimeZone) = this()
  def this(tm: timezonecompleteLib.distLibBasicsMod.TimeStruct, timeZone: timezonecompleteLib.distLibTimezoneMod.TimeZone) = this()
  def this(unixTimestamp: scala.Double, timeZone: timezonecompleteLib.distLibTimezoneMod.TimeZone) = this()
  def this(dateString: java.lang.String, format: java.lang.String, timeZone: timezonecompleteLib.distLibTimezoneMod.TimeZone) = this()
  def this(date: stdLib.Date, getFuncs: timezonecompleteLib.distLibJavascriptMod.DateFunctions, timeZone: timezonecompleteLib.distLibTimezoneMod.TimeZone) = this()
  /**
    * Constructor. Note that unlike JavaScript dates we require fields to be in normal ranges.
    * Use the add(duration) or sub(duration) for arithmetic.
    * @param year	The full year (e.g. 2014)
    * @param month	The month [1-12] (note this deviates from JavaScript Date)
    * @param day	The day of the month [1-31]
    * @param hour	The hour of the day [0-24)
    * @param minute	The minute of the hour [0-59]
    * @param second	The second of the minute [0-59]
    * @param millisecond	The millisecond of the second [0-999]
    * @param timeZone	The time zone, or null/undefined (for unaware dates)
    */
  def this(year: scala.Double, month: scala.Double, day: scala.Double) = this()
  def this(year: scala.Double, month: scala.Double, day: scala.Double, hour: scala.Double) = this()
  def this(year: scala.Double, month: scala.Double, day: scala.Double, hour: scala.Double, minute: scala.Double) = this()
  def this(year: scala.Double, month: scala.Double, day: scala.Double, hour: scala.Double, minute: scala.Double, second: scala.Double) = this()
  def this(year: scala.Double, month: scala.Double, day: scala.Double, hour: scala.Double, minute: scala.Double, second: scala.Double, millisecond: scala.Double) = this()
  def this(year: scala.Double, month: scala.Double, day: scala.Double, hour: scala.Double, minute: scala.Double, second: scala.Double, millisecond: scala.Double, timeZone: timezonecompleteLib.distLibTimezoneMod.TimeZone) = this()
  /**
    * Add an amount of time to the given time struct. Note: does not normalize.
    * Keeps lower unit fields the same where possible, clamps day to end-of-month if
    * necessary.
    */
  var _addToTimeStruct: js.Any = js.native
  var _unixTimeStampToExcel: js.Any = js.native
  /**
    * UTC timestamp (lazily calculated)
    */
  var _utcDate: js.UndefOr[js.Any] = js.native
  /**
    * Original time zone this instance was created for.
    * Can be undefined for unaware timestamps
    */
  var _zone: js.UndefOr[js.Any] = js.native
  /**
    * Local timestamp (lazily calculated)
    */
  var _zoneDate: js.UndefOr[js.Any] = js.native
  /**
    * Allow not using instanceof
    */
  var kind: java.lang.String = js.native
  var utcDate: js.Any = js.native
  var zoneDate: js.Any = js.native
  /**
    * Add an amount of time relative to UTC, as regularly as possible. Returns a new DateTime
    *
    * Adding e.g. 1 hour will increment the utcHour() field, adding 1 month
    * increments the utcMonth() field.
    * Adding an amount of units leaves lower units intact. E.g.
    * adding a month will leave the day() field untouched if possible.
    *
    * Note adding Months or Years will clamp the date to the end-of-month if
    * the start date was at the end of a month, i.e. contrary to JavaScript
    * Date#setUTCMonth() it will not overflow into the next month
    *
    * In case of DST changes, the utc time fields are still untouched but local
    * time fields may shift.
    */
  def add(amount: scala.Double, unit: timezonecompleteLib.distLibBasicsMod.TimeUnit): DateTime = js.native
  /**
    * Add a time duration relative to UTC. Returns a new DateTime
    * @return this + duration
    */
  def add(duration: timezonecompleteLib.distLibDurationMod.Duration): DateTime = js.native
  def addLocal(amount: scala.Double, unit: timezonecompleteLib.distLibBasicsMod.TimeUnit): DateTime = js.native
  /**
    * Add an amount of time to the zone time, as regularly as possible. Returns a new DateTime
    *
    * Adding e.g. 1 hour will increment the hour() field of the zone
    * date by one. In case of DST changes, the time fields may additionally
    * increase by the DST offset, if a non-existing local time would
    * be reached otherwise.
    *
    * Adding a unit of time will leave lower-unit fields intact, unless the result
    * would be a non-existing time. Then an extra DST offset is added.
    *
    * Note adding Months or Years will clamp the date to the end-of-month if
    * the start date was at the end of a month, i.e. contrary to JavaScript
    * Date#setUTCMonth() it will not overflow into the next month
    */
  def addLocal(duration: timezonecompleteLib.distLibDurationMod.Duration): DateTime = js.native
  /**
    * Convert this date to the given time zone (in-place).
    * Throws if this date does not have a time zone.
    * @return this (for chaining)
    */
  def convert(): DateTime = js.native
  def convert(zone: timezonecompleteLib.distLibTimezoneMod.TimeZone): DateTime = js.native
  /**
    * @return The day of the month 1-31
    */
  def day(): scala.Double = js.native
  /**
    * Returns the day number within the year: Jan 1st has number 0,
    * Jan 2nd has number 1 etc.
    *
    * @return the day-of-year [0-366]
    */
  def dayOfYear(): scala.Double = js.native
  /**
    * Time difference between two DateTimes
    * @return this - other
    */
  def diff(other: DateTime): timezonecompleteLib.distLibDurationMod.Duration = js.native
  /**
    * @return True iff this and other represent the same moment in time in UTC
    */
  def equals(other: DateTime): scala.Boolean = js.native
  /**
    * Return a string representation of the DateTime according to the
    * specified format. See LDML.md for supported formats.
    *
    * @param formatString The format specification (e.g. "dd/MM/yyyy HH:mm:ss")
    * @param locale Optional, non-english format month names etc.
    * @return The string representation of this DateTime
    */
  def format(formatString: java.lang.String): java.lang.String = js.native
  def format(formatString: java.lang.String, locale: timezonecompleteLib.distLibLocaleMod.PartialLocale): java.lang.String = js.native
  /**
    * @return True iff this >= other
    */
  def greaterEqual(other: DateTime): scala.Boolean = js.native
  /**
    * @return True iff this > other
    */
  def greaterThan(other: DateTime): scala.Boolean = js.native
  /**
    * @return The hour 0-23
    */
  def hour(): scala.Double = js.native
  /**
    * @return True iff this and other represent the same time and the same zone
    */
  def identical(other: DateTime): scala.Boolean = js.native
  /**
    * @return True iff (this <= other)
    */
  def lessEqual(other: DateTime): scala.Boolean = js.native
  /**
    * @return True iff (this < other)
    */
  def lessThan(other: DateTime): scala.Boolean = js.native
  /**
    * @return The maximum of this and other
    */
  def max(other: DateTime): DateTime = js.native
  /**
    * @return the milliseconds 0-999
    */
  def millisecond(): scala.Double = js.native
  /**
    * @return The minimum of this and other
    */
  def min(other: DateTime): DateTime = js.native
  /**
    * @return the minutes 0-59
    */
  def minute(): scala.Double = js.native
  /**
    * @return The month 1-12 (note this deviates from JavaScript Date)
    */
  def month(): scala.Double = js.native
  /**
    * @return the offset including DST w.r.t. UTC in minutes. Returns 0 for unaware dates and for UTC dates.
    */
  def offset(): scala.Double = js.native
  /**
    * @return the offset including DST w.r.t. UTC as a Duration.
    */
  def offsetDuration(): timezonecompleteLib.distLibDurationMod.Duration = js.native
  /**
    * @return the seconds 0-59
    */
  def second(): scala.Double = js.native
  /**
    * Returns the number of seconds that have passed on the current day
    * Does not consider leap seconds
    *
    * @return seconds [0-86399]
    */
  def secondOfDay(): scala.Double = js.native
  /**
    * @return the standard offset WITHOUT DST w.r.t. UTC as a Duration.
    */
  def standardOffsetDuration(): timezonecompleteLib.distLibDurationMod.Duration = js.native
  /**
    * Chops off the time part, yields the same date at 00:00:00.000
    * @return a new DateTime
    */
  def startOfDay(): DateTime = js.native
  /**
    * Returns the first day of the month at 00:00:00
    * @return a new DateTime
    */
  def startOfMonth(): DateTime = js.native
  /**
    * Returns the first day of the year at 00:00:00
    * @return a new DateTime
    */
  def startOfYear(): DateTime = js.native
  /**
    * Same as add(-1*amount, unit); Returns a new DateTime
    */
  def sub(amount: scala.Double, unit: timezonecompleteLib.distLibBasicsMod.TimeUnit): DateTime = js.native
  /**
    * Same as add(-1*duration); Returns a new DateTime
    */
  def sub(duration: timezonecompleteLib.distLibDurationMod.Duration): DateTime = js.native
  def subLocal(amount: scala.Double, unit: timezonecompleteLib.distLibBasicsMod.TimeUnit): DateTime = js.native
  /**
    * Same as addLocal(-1*amount, unit); Returns a new DateTime
    */
  def subLocal(duration: timezonecompleteLib.distLibDurationMod.Duration): DateTime = js.native
  /**
    * Convert to JavaScript date with the zone time in the getX() methods.
    * Unless the timezone is local, the Date.getUTCX() methods will NOT be correct.
    * This is because Date calculates getUTCX() from getX() applying local time zone.
    */
  def toDate(): stdLib.Date = js.native
  /**
    * Create an Excel timestamp for this datetime converted to the given zone.
    * Does not work for dates < 1900
    * @param timeZone Optional. Zone to convert to, default the zone the datetime is already in.
    * @return an Excel date/time number i.e. days since 1-1-1900 where 1900 is incorrectly seen as leap year
    */
  def toExcel(): scala.Double = js.native
  def toExcel(timeZone: timezonecompleteLib.distLibTimezoneMod.TimeZone): scala.Double = js.native
  /**
    * Proper ISO 8601 format string with any IANA zone converted to ISO offset
    * E.g. "2014-01-01T23:15:33+01:00" for Europe/Amsterdam
    * Unaware dates have no zone information at the end.
    */
  def toIsoString(): java.lang.String = js.native
  /**
    * Create an Excel timestamp for this datetime converted to UTC
    * Does not work for dates < 1900
    * @return an Excel date/time number i.e. days since 1-1-1900 where 1900 is incorrectly seen as leap year
    */
  def toUtcExcel(): scala.Double = js.native
  /**
    * Convert to UTC and then return ISO string ending in 'Z'. This is equivalent to Date#toISOString()
    * e.g. "2014-01-01T23:15:33 Europe/Amsterdam" becomes "2014-01-01T22:15:33Z".
    * Unaware dates are assumed to be in UTC
    */
  def toUtcIsoString(): java.lang.String = js.native
  /**
    * Modified ISO 8601 format string in UTC without time zone info
    */
  def toUtcString(): java.lang.String = js.native
  /**
    * Returns this date converted to the given time zone.
    * Unaware dates can only be converted to unaware dates (clone)
    * Converting an unaware date to an aware date throws an exception. Use the constructor
    * if you really need to do that.
    *
    * @param zone	The new time zone. This may be null or undefined to create unaware date.
    * @return The converted date
    */
  def toZone(): DateTime = js.native
  def toZone(zone: timezonecompleteLib.distLibTimezoneMod.TimeZone): DateTime = js.native
  /**
    * @return Milliseconds since 1970-01-01T00:00:00.000Z
    */
  def unixUtcMillis(): scala.Double = js.native
  /**
    * @return The UTC day of the month 1-31
    */
  def utcDay(): scala.Double = js.native
  /**
    * Returns the UTC day number within the year: Jan 1st has number 0,
    * Jan 2nd has number 1 etc.
    *
    * @return the day-of-year [0-366]
    */
  def utcDayOfYear(): scala.Double = js.native
  /**
    * @return The UTC hour 0-23
    */
  def utcHour(): scala.Double = js.native
  /**
    * @return The UTC milliseconds 0-999
    */
  def utcMillisecond(): scala.Double = js.native
  /**
    * @return The UTC minutes 0-59
    */
  def utcMinute(): scala.Double = js.native
  /**
    * @return The UTC month 1-12 (note this deviates from JavaScript Date)
    */
  def utcMonth(): scala.Double = js.native
  /**
    * @return The UTC seconds 0-59
    */
  def utcSecond(): scala.Double = js.native
  /**
    * Returns the number of seconds that have passed on the current day
    * Does not consider leap seconds
    *
    * @return seconds [0-86399]
    */
  def utcSecondOfDay(): scala.Double = js.native
  /**
    * @return the UTC day-of-week (the enum values correspond to JavaScript
    * week day numbers)
    */
  def utcWeekDay(): timezonecompleteLib.distLibBasicsMod.WeekDay = js.native
  /**
    * The ISO 8601 UTC week number. Week 1 is the week
    * that has January 4th in it, and it starts on Monday.
    * See https://en.wikipedia.org/wiki/ISO_week_date
    *
    * @return Week number [1-53]
    */
  def utcWeekNumber(): scala.Double = js.native
  /**
    * The week of this month. There is no official standard for this,
    * but we assume the same rules for the weekNumber (i.e.
    * week 1 is the week that has the 4th day of the month in it)
    *
    * @return Week number [1-5]
    */
  def utcWeekOfMonth(): scala.Double = js.native
  /**
    * @return The full year e.g. 2014
    */
  def utcYear(): scala.Double = js.native
  /**
    * @return the day-of-week (the enum values correspond to JavaScript
    * week day numbers)
    */
  def weekDay(): timezonecompleteLib.distLibBasicsMod.WeekDay = js.native
  /**
    * The ISO 8601 week number. Week 1 is the week
    * that has January 4th in it, and it starts on Monday.
    * See https://en.wikipedia.org/wiki/ISO_week_date
    *
    * @return Week number [1-53]
    */
  def weekNumber(): scala.Double = js.native
  /**
    * The week of this month. There is no official standard for this,
    * but we assume the same rules for the weekNumber (i.e.
    * week 1 is the week that has the 4th day of the month in it)
    *
    * @return Week number [1-5]
    */
  def weekOfMonth(): scala.Double = js.native
  /**
    * Returns a new DateTime which is the date+time reinterpreted as
    * in the new zone. So e.g. 08:00 America/Chicago can be set to 08:00 Europe/Brussels.
    * No conversion is done, the value is just assumed to be in a different zone.
    * Works for naive and aware dates. The new zone may be null.
    *
    * @param zone The new time zone
    * @return A new DateTime with the original timestamp and the new zone.
    */
  def withZone(): DateTime = js.native
  def withZone(zone: timezonecompleteLib.distLibTimezoneMod.TimeZone): DateTime = js.native
  /**
    * @return The full year e.g. 2014
    */
  def year(): scala.Double = js.native
  /**
    * @return The time zone that the date is in. May be undefined for unaware dates.
    */
  def zone(): js.UndefOr[timezonecompleteLib.distLibTimezoneMod.TimeZone] = js.native
  /**
    * Zone name abbreviation at this time
    * @param dstDependent (default true) set to false for a DST-agnostic abbreviation
    * @return The abbreviation
    */
  def zoneAbbreviation(): java.lang.String = js.native
  def zoneAbbreviation(dstDependent: scala.Boolean): java.lang.String = js.native
}

/* static members */
@JSImport("timezonecomplete/dist/lib/datetime", "DateTime")
@js.native
object DateTime extends js.Object {
  /**
    * Split a combined ISO datetime and timezone into datetime and timezone
    */
  var _splitDateFromTimeZone: js.Any = js.native
  /**
    * Actual time source in use. Setting this property allows to
    * fake time in tests. DateTime.nowLocal() and DateTime.nowUtc()
    * use this property for obtaining the current time.
    */
  var timeSource: timezonecompleteLib.distLibTimesourceMod.TimeSource = js.native
  /**
    * Check whether a given date exists in the given time zone.
    * E.g. 2015-02-29 returns false (not a leap year)
    * and 2015-03-29T02:30:00 returns false (daylight saving time missing hour)
    * and 2015-04-31 returns false (April has 30 days).
    * By default, pre-1970 dates also return false since the time zone database does not contain accurate info
    * before that. You can change that with the allowPre1970 flag.
    *
    * @param allowPre1970 (optional, default false): return true for pre-1970 dates
    */
  def exists(
    year: scala.Double,
    month: js.UndefOr[scala.Double],
    day: js.UndefOr[scala.Double],
    hour: js.UndefOr[scala.Double],
    minute: js.UndefOr[scala.Double],
    second: js.UndefOr[scala.Double],
    millisecond: js.UndefOr[scala.Double],
    zone: js.UndefOr[scala.Null | timezonecompleteLib.distLibTimezoneMod.TimeZone],
    allowPre1970: js.UndefOr[scala.Boolean]
  ): scala.Boolean = js.native
  /**
    * Create a DateTime from a Lotus 123 / Microsoft Excel date-time value
    * i.e. a double representing days since 1-1-1900 where 1900 is incorrectly seen as leap year
    * Does not work for dates < 1900
    * @param n excel date/time number
    * @param timeZone Time zone to assume that the excel value is in
    * @returns a DateTime
    */
  def fromExcel(n: scala.Double): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  def fromExcel(n: scala.Double, timeZone: timezonecompleteLib.distLibTimezoneMod.TimeZone): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  /**
    * Current date+time in the given time zone
    * @param timeZone	The desired time zone (optional, defaults to UTC).
    */
  def now(): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  def now(timeZone: timezonecompleteLib.distLibTimezoneMod.TimeZone): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  /**
    * Current date+time in local time
    */
  def nowLocal(): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  /**
    * Current date+time in UTC time
    */
  def nowUtc(): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  /**
    * Parse a date in a given format
    * @param s the string to parse
    * @param format the format the string is in. See LDML.md for supported formats.
    * @param zone Optional, the zone to add (if no zone is given in the string)
    * @param locale Optional, different settings for constants like 'AM' etc
    * @param allowTrailing Allow trailing characters in the source string
    */
  def parse(s: java.lang.String, format: java.lang.String): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  def parse(
    s: java.lang.String,
    format: java.lang.String,
    zone: timezonecompleteLib.distLibTimezoneMod.TimeZone
  ): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  def parse(
    s: java.lang.String,
    format: java.lang.String,
    zone: timezonecompleteLib.distLibTimezoneMod.TimeZone,
    locale: timezonecompleteLib.distLibLocaleMod.PartialLocale
  ): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
  def parse(
    s: java.lang.String,
    format: java.lang.String,
    zone: timezonecompleteLib.distLibTimezoneMod.TimeZone,
    locale: timezonecompleteLib.distLibLocaleMod.PartialLocale,
    allowTrailing: scala.Boolean
  ): timezonecompleteLib.distLibDatetimeMod.DateTime = js.native
}


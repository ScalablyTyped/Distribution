package typings.timezonecomplete.timezonecompleteMod

import typings.std.Date
import typings.timezonecomplete.distLibLocaleMod.PartialLocale
import typings.timezonecomplete.distLibTimesourceMod.TimeSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "DateTime")
@js.native
/**
  * Constructor. Creates current time in local timezone.
  */
class DateTime ()
  extends typings.timezonecomplete.distLibDatetimeMod.DateTime {
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
  def this(isoString: String) = this()
  /**
    * Get a date from a TimeStruct
    */
  def this(tm: typings.timezonecomplete.distLibBasicsMod.TimeStruct) = this()
  /**
    * Constructor
    * @param unixTimestamp	milliseconds since 1970-01-01T00:00:00.000
    * @param timeZone	the time zone that the timestamp is assumed to be in (usually UTC).
    */
  def this(unixTimestamp: Double) = this()
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
  def this(dateString: String, format: String) = this()
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
  def this(date: Date, getFuncs: typings.timezonecomplete.distLibJavascriptMod.DateFunctions) = this()
  def this(isoString: String, timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone) = this()
  def this(
    tm: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
  ) = this()
  def this(unixTimestamp: Double, timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone) = this()
  def this(dateString: String, format: String, timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone) = this()
  def this(
    date: Date,
    getFuncs: typings.timezonecomplete.distLibJavascriptMod.DateFunctions,
    timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
  ) = this()
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
  def this(year: Double, month: Double, day: Double) = this()
  def this(year: Double, month: Double, day: Double, hour: Double) = this()
  def this(year: Double, month: Double, day: Double, hour: Double, minute: Double) = this()
  def this(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double) = this()
  def this(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    millisecond: Double
  ) = this()
  def this(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    millisecond: Double,
    timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
  ) = this()
}

/* static members */
@JSImport("timezonecomplete", "DateTime")
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
  var timeSource: TimeSource = js.native
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
    year: Double,
    month: js.UndefOr[Double],
    day: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    millisecond: js.UndefOr[Double],
    zone: js.UndefOr[Null | typings.timezonecomplete.distLibTimezoneMod.TimeZone],
    allowPre1970: js.UndefOr[Boolean]
  ): Boolean = js.native
  /**
    * Create a DateTime from a Lotus 123 / Microsoft Excel date-time value
    * i.e. a double representing days since 1-1-1900 where 1900 is incorrectly seen as leap year
    * Does not work for dates < 1900
    * @param n excel date/time number
    * @param timeZone Time zone to assume that the excel value is in
    * @returns a DateTime
    */
  def fromExcel(n: Double): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  def fromExcel(n: Double, timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  /**
    * Current date+time in the given time zone
    * @param timeZone	The desired time zone (optional, defaults to UTC).
    */
  def now(): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  def now(timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  /**
    * Current date+time in local time
    */
  def nowLocal(): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  /**
    * Current date+time in UTC time
    */
  def nowUtc(): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  /**
    * Parse a date in a given format
    * @param s the string to parse
    * @param format the format the string is in. See LDML.md for supported formats.
    * @param zone Optional, the zone to add (if no zone is given in the string)
    * @param locale Optional, different settings for constants like 'AM' etc
    * @param allowTrailing Allow trailing characters in the source string
    */
  def parse(s: String, format: String): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  def parse(s: String, format: String, zone: typings.timezonecomplete.distLibTimezoneMod.TimeZone): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  def parse(
    s: String,
    format: String,
    zone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    locale: PartialLocale
  ): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
  def parse(
    s: String,
    format: String,
    zone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    locale: PartialLocale,
    allowTrailing: Boolean
  ): typings.timezonecomplete.distLibDatetimeMod.DateTime = js.native
}


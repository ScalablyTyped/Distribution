package typings.timezonecomplete

import typings.timezonecomplete.basicsMod.TimeStruct
import typings.timezonecomplete.basicsMod.TimeUnit
import typings.timezonecomplete.basicsMod.WeekDay
import typings.timezonecomplete.durationMod.Duration
import typings.timezonecomplete.javascriptMod.DateFunctions
import typings.timezonecomplete.localeMod.PartialLocale
import typings.timezonecomplete.timesourceMod.TimeSource
import typings.timezonecomplete.timezoneMod.TimeZone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datetimeMod {
  
  @JSImport("timezonecomplete/dist/lib/datetime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("timezonecomplete/dist/lib/datetime", "DateTime")
  @js.native
  /**
    * Constructor. Creates current time in local timezone.
    * @throws nothing
    */
  open class DateTime () extends StObject {
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
      * @throws timezonecomplete.Argument.S if the given string is invalid
      * @throws timezonecomplete.Argument.TimeZone if the given time zone is invalid
      */
    def this(isoString: String) = this()
    /**
      * Get a date from a TimeStruct
      * @throws timezonecomplete.Argument.TimeZone if the given time zone argument is invalid
      */
    def this(tm: TimeStruct) = this()
    /**
      * Constructor
      * @param unixTimestamp	milliseconds since 1970-01-01T00:00:00.000
      * @param timeZone	the time zone that the timestamp is assumed to be in (usually UTC).
      * @throws timezonecomplete.Argument.TimeZone if the given time zone is invalid
      * @throws timezonecomplete.Argument.UnixMillis if the given unix timestamp is not finite
      */
    def this(unixTimestamp: Double) = this()
    /**
      * Constructor. Parses string in given LDML format.
      * NOTE: does not handle eras/quarters/weeks/weekdays.
      * Non-existing local times are normalized by rounding up to the next DST offset.
      *
      * @param dateString	Date+Time string.
      * @param formatString The LDML format that the string is assumed to be in
      * @param timeZone	if given, the date in the string is assumed to be in this time zone.
      *        Note that it is NOT CONVERTED to the time zone. Useful
      *        for strings without a time zone
      * @throws timezonecomplete.ParseError if the given dateTimeString is wrong or not according to the pattern
      * @throws timezonecomplete.Argument.FormatString if the given format string is invalid
      * @throws timezonecomplete.Argument.Timezone if the given time zone is invalid
      */
    def this(dateString: String, formatString: String) = this()
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
      * @throws timezonecomplete.Argument.GetFuncs if the getFuncs argument is invalid
      * @throws timezonecomplete.Argument.TimeZone if the time zone argument is invalid
      */
    def this(date: js.Date, getFuncs: DateFunctions) = this()
    def this(isoString: String, timeZone: TimeZone) = this()
    def this(tm: TimeStruct, timeZone: TimeZone) = this()
    def this(unixTimestamp: Double, timeZone: TimeZone) = this()
    def this(dateString: String, formatString: String, timeZone: TimeZone) = this()
    def this(date: js.Date, getFuncs: DateFunctions, timeZone: TimeZone) = this()
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
      * @throws timezonecomplete.Argument.Year if year invalid
      * @throws timezonecomplete.Argument.Month if month invalid
      * @throws timezonecomplete.Argument.Day if day invalid
      * @throws timezonecomplete.Argument.Hour if hour invalid
      * @throws timezonecomplete.Argument.Minute if minute invalid
      * @throws timezonecomplete.Argument.Second if second invalid
      * @throws timezonecomplete.Argument.Milli if milliseconds invalid
      */
    def this(year: Double, month: Double, day: Double) = this()
    def this(year: Double, month: Double, day: Double, hour: Double) = this()
    def this(year: Double, month: Double, day: Double, hour: Double, minute: Double) = this()
    def this(year: Double, month: Double, day: Double, hour: Unit, minute: Double) = this()
    def this(year: Double, month: Double, day: Double, hour: Double, minute: Double, second: Double) = this()
    def this(year: Double, month: Double, day: Double, hour: Double, minute: Unit, second: Double) = this()
    def this(year: Double, month: Double, day: Double, hour: Unit, minute: Double, second: Double) = this()
    def this(year: Double, month: Double, day: Double, hour: Unit, minute: Unit, second: Double) = this()
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
      second: Unit,
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Unit,
      second: Double,
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Unit,
      second: Unit,
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double,
      second: Double,
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double,
      second: Unit,
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Unit,
      second: Double,
      millisecond: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Unit,
      second: Unit,
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
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double,
      millisecond: Unit,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Unit,
      millisecond: Double,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Unit,
      millisecond: Unit,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Unit,
      second: Double,
      millisecond: Double,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Unit,
      second: Double,
      millisecond: Unit,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Unit,
      second: Unit,
      millisecond: Double,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Unit,
      second: Unit,
      millisecond: Unit,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double,
      second: Double,
      millisecond: Double,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double,
      second: Double,
      millisecond: Unit,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double,
      second: Unit,
      millisecond: Double,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double,
      second: Unit,
      millisecond: Unit,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Unit,
      second: Double,
      millisecond: Double,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Unit,
      second: Double,
      millisecond: Unit,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Unit,
      second: Unit,
      millisecond: Double,
      timeZone: TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Unit,
      second: Unit,
      millisecond: Unit,
      timeZone: TimeZone
    ) = this()
    
    /**
      * Add an amount of time to the given time struct. Note: does not normalize.
      * Keeps lower unit fields the same where possible, clamps day to end-of-month if
      * necessary.
      * @throws Argument.Amount if amount is not finite or if it's not an integer and you're adding months or years
      * @throws Argument.Unit for invalid time unit
      */
    /* private */ var _addToTimeStruct: Any = js.native
    
    /**
      *
      * @param n
      * @throws nothing
      */
    /* private */ var _unixTimeStampToExcel: Any = js.native
    
    /**
      * UTC timestamp (lazily calculated, use getter for utcDate instead)
      */
    /* private */ var _utcDate: Any = js.native
    
    /**
      * Original time zone this instance was created for.
      * Can be undefined for unaware timestamps
      */
    /* private */ var _zone: Any = js.native
    
    /**
      * Local timestamp (lazily calculated)
      */
    /* private */ var _zoneDate: Any = js.native
    
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
      * @throws Argument.Amount if amount is not a finite number or if you're trying to add a non-integer amount of years or months
      * @throws Argument.Unit for invalid time unit
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    def add(amount: Double, unit: TimeUnit): DateTime = js.native
    /**
      * Add a time duration relative to UTC. Returns a new DateTime
      * @return this + duration
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    def add(duration: Duration): DateTime = js.native
    
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
      * @param amount
      * @param unit
      * @throws Argument.Amount if amount is not a finite number or if you're trying to add a non-integer amount of years or months
      * @throws Argument.Unit for invalid time unit
      */
    def addLocal(amount: Double, unit: TimeUnit): DateTime = js.native
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
      * @throws nothing
      */
    def addLocal(duration: Duration): DateTime = js.native
    
    /**
      * Convert this date to the given time zone (in-place).
      * @return this (for chaining)
      * @throws timezonecomplete.UnawareToAwareConversion if you try to convert a datetime without a zone to a datetime with a zone
      */
    def convert(): DateTime = js.native
    def convert(zone: TimeZone): DateTime = js.native
    
    /**
      * @return The day of the month 1-31
      * @throws nothing
      */
    def day(): Double = js.native
    
    /**
      * Returns the day number within the year: Jan 1st has number 0,
      * Jan 2nd has number 1 etc.
      *
      * @return the day-of-year [0-366]
      * @throws nothing
      */
    def dayOfYear(): Double = js.native
    
    /**
      * Time difference between two DateTimes
      * @return this - other
      * @throws nothing
      */
    def diff(other: DateTime): Duration = js.native
    
    /**
      * @return True iff this and other represent the same moment in time in UTC
      * @throws nothing
      */
    def equals(other: DateTime): Boolean = js.native
    
    /**
      * Return a string representation of the DateTime according to the
      * specified format. See LDML.md for supported formats.
      *
      * @param formatString The format specification (e.g. "dd/MM/yyyy HH:mm:ss")
      * @param locale Optional, non-english format month names etc.
      * @return The string representation of this DateTime
      * @throws timezonecomplete.Argument.FormatString for invalid format pattern
      */
    def format(formatString: String): String = js.native
    def format(formatString: String, locale: PartialLocale): String = js.native
    
    /**
      * @return True iff this >= other
      * @throws nothing
      */
    def greaterEqual(other: DateTime): Boolean = js.native
    
    /**
      * @return True iff this > other
      * @throws nothing
      */
    def greaterThan(other: DateTime): Boolean = js.native
    
    /**
      * @return The hour 0-23
      * @throws nothing
      */
    def hour(): Double = js.native
    
    /**
      * @return True iff this and other represent the same time and the same zone
      * @throws nothing
      */
    def identical(other: DateTime): Boolean = js.native
    
    /**
      * Allow not using instanceof
      */
    var kind: String = js.native
    
    /**
      * @return True iff (this <= other)
      * @throws nothing
      */
    def lessEqual(other: DateTime): Boolean = js.native
    
    /**
      * @return True iff (this < other)
      * @throws nothing
      */
    def lessThan(other: DateTime): Boolean = js.native
    
    /**
      * @return The maximum of this and other
      * @throws nothing
      */
    def max(other: DateTime): DateTime = js.native
    
    /**
      * @return the milliseconds 0-999
      * @throws nothing
      */
    def millisecond(): Double = js.native
    
    /**
      * @return The minimum of this and other
      * @throws nothing
      */
    def min(other: DateTime): DateTime = js.native
    
    /**
      * @return the minutes 0-59
      * @throws nothing
      */
    def minute(): Double = js.native
    
    /**
      * @return The month 1-12 (note this deviates from JavaScript Date)
      * @throws nothing
      */
    def month(): Double = js.native
    
    /**
      * @return the offset including DST w.r.t. UTC in minutes. Returns 0 for unaware dates and for UTC dates.
      * @throws nothing
      */
    def offset(): Double = js.native
    
    /**
      * @return the offset including DST w.r.t. UTC as a Duration.
      * @throws nothing
      */
    def offsetDuration(): Duration = js.native
    
    /**
      * @return the seconds 0-59
      * @throws nothing
      */
    def second(): Double = js.native
    
    /**
      * Returns the number of seconds that have passed on the current day
      * Does not consider leap seconds
      *
      * @return seconds [0-86399]
      * @throws nothing
      */
    def secondOfDay(): Double = js.native
    
    /**
      * @return the standard offset WITHOUT DST w.r.t. UTC as a Duration.
      * @throws nothing
      */
    def standardOffsetDuration(): Duration = js.native
    
    /**
      * Chops off the time part, yields the same date at 00:00:00.000
      * @return a new DateTime
      * @throws nothing
      */
    def startOfDay(): DateTime = js.native
    
    /**
      * Returns the first day of the month at 00:00:00
      * @return a new DateTime
      * @throws nothing
      */
    def startOfMonth(): DateTime = js.native
    
    /**
      * Returns the first day of the year at 00:00:00
      * @return a new DateTime
      * @throws nothing
      */
    def startOfYear(): DateTime = js.native
    
    /**
      * Same as add(-1*amount, unit); Returns a new DateTime
      * @throws Argument.Amount if amount is not a finite number or if you're trying to add a non-integer amount of years or months
      * @throws Argument.Unit for invalid time unit
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    def sub(amount: Double, unit: TimeUnit): DateTime = js.native
    /**
      * Same as add(-1*duration); Returns a new DateTime
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    def sub(duration: Duration): DateTime = js.native
    
    /**
      * Same as addLocal(-1*amount, unit); Returns a new DateTime
      * @param amount
      * @param unit
      * @throws Argument.Amount if amount is not a finite number or if you're trying to add a non-integer amount of years or months
      * @throws Argument.Unit for invalid time unit
      */
    def subLocal(amount: Double, unit: TimeUnit): DateTime = js.native
    /**
      * Same as addLocal(-1*amount, unit); Returns a new DateTime
      * @throws nothing
      */
    def subLocal(duration: Duration): DateTime = js.native
    
    /**
      * Convert to JavaScript date with the zone time in the getX() methods.
      * Unless the timezone is local, the Date.getUTCX() methods will NOT be correct.
      * This is because Date calculates getUTCX() from getX() applying local time zone.
      * @throws nothing
      */
    def toDate(): js.Date = js.native
    
    /**
      * Create an Excel timestamp for this datetime converted to the given zone.
      * Does not work for dates < 1900
      * @param timeZone Optional. Zone to convert to, default the zone the datetime is already in.
      * @return an Excel date/time number i.e. days since 1-1-1900 where 1900 is incorrectly seen as leap year
      * @throws timezonecomplete.UnawareToAwareConversion if you try to convert a naive datetime to an aware one.
      */
    def toExcel(): Double = js.native
    def toExcel(timeZone: TimeZone): Double = js.native
    
    /**
      * Proper ISO 8601 format string with any IANA zone converted to ISO offset
      * E.g. "2014-01-01T23:15:33+01:00" for Europe/Amsterdam
      * Unaware dates have no zone information at the end.
      * @throws nothing
      */
    def toIsoString(): String = js.native
    
    /**
      * Create an Excel timestamp for this datetime converted to UTC
      * Does not work for dates < 1900
      * @return an Excel date/time number i.e. days since 1-1-1900 where 1900 is incorrectly seen as leap year
      * @throws nothing
      */
    def toUtcExcel(): Double = js.native
    
    /**
      * Convert to UTC and then return ISO string ending in 'Z'. This is equivalent to Date#toISOString()
      * e.g. "2014-01-01T23:15:33 Europe/Amsterdam" becomes "2014-01-01T22:15:33Z".
      * Unaware dates are assumed to be in UTC
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    def toUtcIsoString(): String = js.native
    
    /**
      * Modified ISO 8601 format string in UTC without time zone info
      * @throws nothing
      */
    def toUtcString(): String = js.native
    
    /**
      * Returns this date converted to the given time zone.
      * Unaware dates can only be converted to unaware dates (clone)
      * Converting an unaware date to an aware date throws an exception. Use the constructor
      * if you really need to do that.
      *
      * @param zone	The new time zone. This may be null or undefined to create unaware date.
      * @return The converted date
      * @throws timezonecomplete.UnawareToAwareConversion if you try to convert a naive datetime to an aware one.
      */
    def toZone(): DateTime = js.native
    def toZone(zone: TimeZone): DateTime = js.native
    
    /**
      * @return Milliseconds since 1970-01-01T00:00:00.000Z
      * @throws nothing
      */
    def unixUtcMillis(): Double = js.native
    
    /**
      * UTC timestamp (lazily calculated)
      * @throws nothing
      */
    /* private */ def utcDate: Any = js.native
    /* private */ def utcDate_=(value: Any): Unit = js.native
    
    /**
      * @return The UTC day of the month 1-31
      * @throws nothing
      */
    def utcDay(): Double = js.native
    
    /**
      * Returns the UTC day number within the year: Jan 1st has number 0,
      * Jan 2nd has number 1 etc.
      *
      * @return the day-of-year [0-366]
      * @throws nothing
      */
    def utcDayOfYear(): Double = js.native
    
    /**
      * @return The UTC hour 0-23
      * @throws nothing
      */
    def utcHour(): Double = js.native
    
    /**
      * @return The UTC milliseconds 0-999
      * @throws nothing
      */
    def utcMillisecond(): Double = js.native
    
    /**
      * @return The UTC minutes 0-59
      * @throws nothing
      */
    def utcMinute(): Double = js.native
    
    /**
      * @return The UTC month 1-12 (note this deviates from JavaScript Date)
      * @throws nothing
      */
    def utcMonth(): Double = js.native
    
    /**
      * @return The UTC seconds 0-59
      * @throws nothing
      */
    def utcSecond(): Double = js.native
    
    /**
      * Returns the number of seconds that have passed on the current day
      * Does not consider leap seconds
      *
      * @return seconds [0-86399]
      * @throws nothing
      */
    def utcSecondOfDay(): Double = js.native
    
    /**
      * @return the UTC day-of-week (the enum values correspond to JavaScript
      * week day numbers)
      * @throws nothing
      */
    def utcWeekDay(): WeekDay = js.native
    
    /**
      * The ISO 8601 UTC week number. Week 1 is the week
      * that has January 4th in it, and it starts on Monday.
      * See https://en.wikipedia.org/wiki/ISO_week_date
      *
      * @return Week number [1-53]
      * @throws nothing
      */
    def utcWeekNumber(): Double = js.native
    
    /**
      * The week of this month. There is no official standard for this,
      * but we assume the same rules for the weekNumber (i.e.
      * week 1 is the week that has the 4th day of the month in it)
      *
      * @return Week number [1-5]
      * @throws nothing
      */
    def utcWeekOfMonth(): Double = js.native
    
    /**
      * @return The full year e.g. 2014
      * @throws nothing
      */
    def utcYear(): Double = js.native
    
    /**
      * @return the day-of-week (the enum values correspond to JavaScript
      * week day numbers)
      * @throws nothing
      */
    def weekDay(): WeekDay = js.native
    
    /**
      * The ISO 8601 week number. Week 1 is the week
      * that has January 4th in it, and it starts on Monday.
      * See https://en.wikipedia.org/wiki/ISO_week_date
      *
      * @return Week number [1-53]
      * @throws nothing
      */
    def weekNumber(): Double = js.native
    
    /**
      * The week of this month. There is no official standard for this,
      * but we assume the same rules for the weekNumber (i.e.
      * week 1 is the week that has the 4th day of the month in it)
      *
      * @return Week number [1-5]
      * @throws nothing
      */
    def weekOfMonth(): Double = js.native
    
    /**
      * Returns a new DateTime which is the date+time reinterpreted as
      * in the new zone. So e.g. 08:00 America/Chicago can be set to 08:00 Europe/Brussels.
      * No conversion is done, the value is just assumed to be in a different zone.
      * Works for naive and aware dates. The new zone may be null.
      *
      * @param zone The new time zone
      * @return A new DateTime with the original timestamp and the new zone.
      * @throws nothing
      */
    def withZone(): DateTime = js.native
    def withZone(zone: TimeZone): DateTime = js.native
    
    /**
      * @return The full year e.g. 2014
      * @throws nothing
      */
    def year(): Double = js.native
    
    /**
      * @return The time zone that the date is in. May be undefined for unaware dates.
      * @throws nothing
      */
    def zone(): js.UndefOr[TimeZone] = js.native
    
    /**
      * Zone name abbreviation at this time
      * @param dstDependent (default true) set to false for a DST-agnostic abbreviation
      * @return The abbreviation
      * @throws nothing
      */
    def zoneAbbreviation(): String = js.native
    def zoneAbbreviation(dstDependent: Boolean): String = js.native
    
    /**
      * Local timestamp (lazily calculated)
      * @throws nothing
      */
    /* private */ def zoneDate: Any = js.native
    /* private */ def zoneDate_=(value: Any): Unit = js.native
  }
  /* static members */
  object DateTime {
    
    @JSImport("timezonecomplete/dist/lib/datetime", "DateTime")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Split a combined ISO datetime and timezone into datetime and timezone
      * @throws nothing
      */
    @JSImport("timezonecomplete/dist/lib/datetime", "DateTime._splitDateFromTimeZone")
    @js.native
    def _splitDateFromTimeZone: Any = js.native
    inline def _splitDateFromTimeZone_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_splitDateFromTimeZone")(x.asInstanceOf[js.Any])
    
    /**
      * Check whether a given date exists in the given time zone.
      * E.g. 2015-02-29 returns false (not a leap year)
      * and 2015-03-29T02:30:00 returns false (daylight saving time missing hour)
      * and 2015-04-31 returns false (April has 30 days).
      * By default, pre-1970 dates also return false since the time zone database does not contain accurate info
      * before that. You can change that with the allowPre1970 flag.
      *
      * @param allowPre1970 (optional, default false): return true for pre-1970 dates
      * @throws nothing
      */
    inline def exists(
      year: Double,
      month: js.UndefOr[Double],
      day: js.UndefOr[Double],
      hour: js.UndefOr[Double],
      minute: js.UndefOr[Double],
      second: js.UndefOr[Double],
      millisecond: js.UndefOr[Double],
      zone: js.UndefOr[TimeZone | Null],
      allowPre1970: js.UndefOr[Boolean]
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], millisecond.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], allowPre1970.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Create a DateTime from a Lotus 123 / Microsoft Excel date-time value
      * i.e. a double representing days since 1-1-1900 where 1900 is incorrectly seen as leap year
      * Does not work for dates < 1900
      * @param n excel date/time number
      * @param timeZone Time zone to assume that the excel value is in
      * @returns a DateTime
      * @throws timezonecomplete.Argument.N if n is not a finite number
      * @throws timezonecomplete.Argument.TimeZone if the given time zone is invalid
      */
    inline def fromExcel(n: Double): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExcel")(n.asInstanceOf[js.Any]).asInstanceOf[DateTime]
    inline def fromExcel(n: Double, timeZone: TimeZone): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExcel")(n.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[DateTime]
    
    /**
      * Current date+time in the given time zone
      * @param timeZone	The desired time zone (optional, defaults to UTC).
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    inline def now(): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[DateTime]
    inline def now(timeZone: TimeZone): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(timeZone.asInstanceOf[js.Any]).asInstanceOf[DateTime]
    
    /**
      * Current date+time in local time
      * @throws nothing
      */
    inline def nowLocal(): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("nowLocal")().asInstanceOf[DateTime]
    
    /**
      * Current date+time in UTC time
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    inline def nowUtc(): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("nowUtc")().asInstanceOf[DateTime]
    
    /**
      * Parse a date in a given format
      * @param s the string to parse
      * @param format the format the string is in. See LDML.md for supported formats.
      * @param zone Optional, the zone to add (if no zone is given in the string)
      * @param locale Optional, different settings for constants like 'AM' etc
      * @param allowTrailing Allow trailing characters in the source string
      * @throws timezonecomplete.ParseError if the given dateTimeString is wrong or not according to the pattern
      * @throws timezonecomplete.Argument.FormatString if the given format string is invalid
      */
    inline def parse(s: String, format: String): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[DateTime]
    inline def parse(s: String, format: String, zone: Unit, locale: Unit, allowTrailing: Boolean): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[DateTime]
    inline def parse(s: String, format: String, zone: Unit, locale: PartialLocale): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[DateTime]
    inline def parse(s: String, format: String, zone: Unit, locale: PartialLocale, allowTrailing: Boolean): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[DateTime]
    inline def parse(s: String, format: String, zone: TimeZone): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[DateTime]
    inline def parse(s: String, format: String, zone: TimeZone, locale: Unit, allowTrailing: Boolean): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[DateTime]
    inline def parse(s: String, format: String, zone: TimeZone, locale: PartialLocale): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[DateTime]
    inline def parse(s: String, format: String, zone: TimeZone, locale: PartialLocale, allowTrailing: Boolean): DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[DateTime]
    
    /**
      * Actual time source in use. Setting this property allows to
      * fake time in tests. DateTime.nowLocal() and DateTime.nowUtc()
      * use this property for obtaining the current time.
      */
    @JSImport("timezonecomplete/dist/lib/datetime", "DateTime.timeSource")
    @js.native
    def timeSource: TimeSource = js.native
    inline def timeSource_=(x: TimeSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeSource")(x.asInstanceOf[js.Any])
  }
  
  inline def isDateTime(value: Any): /* is timezonecomplete.timezonecomplete/dist/lib/datetime.DateTime */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTime")(value.asInstanceOf[js.Any]).asInstanceOf[/* is timezonecomplete.timezonecomplete/dist/lib/datetime.DateTime */ Boolean]
  
  inline def now(): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[DateTime]
  inline def now(timeZone: TimeZone): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(timeZone.asInstanceOf[js.Any]).asInstanceOf[DateTime]
  
  inline def nowLocal(): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("nowLocal")().asInstanceOf[DateTime]
  
  inline def nowUtc(): DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("nowUtc")().asInstanceOf[DateTime]
}

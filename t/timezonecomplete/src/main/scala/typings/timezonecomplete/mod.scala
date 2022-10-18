package typings.timezonecomplete

import typings.timezonecomplete.distLibBasicsMod.TimeComponentOpts
import typings.timezonecomplete.distLibBasicsMod.TimeComponents
import typings.timezonecomplete.distLibBasicsMod.TimeUnit
import typings.timezonecomplete.distLibBasicsMod.WeekDay
import typings.timezonecomplete.distLibJavascriptMod.DateFunctions
import typings.timezonecomplete.distLibLocaleMod.Locale
import typings.timezonecomplete.distLibLocaleMod.PartialLocale
import typings.timezonecomplete.distLibParseMod.AwareTimeStruct
import typings.timezonecomplete.distLibPeriodMod.PeriodDst
import typings.timezonecomplete.distLibPeriodMod.PeriodJson
import typings.timezonecomplete.distLibPeriodMod.WeekTimeOpts
import typings.timezonecomplete.distLibTimesourceMod.TimeSource
import typings.timezonecomplete.distLibTzDatabaseMod.AtType
import typings.timezonecomplete.distLibTzDatabaseMod.OnType
import typings.timezonecomplete.distLibTzDatabaseMod.RuleType
import typings.timezonecomplete.distLibTzDatabaseMod.ToType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timezonecomplete", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("timezonecomplete", "AtType")
  @js.native
  object AtType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.timezonecomplete.distLibTzDatabaseMod.AtType & Double] = js.native
    
    /* 0 */ val Standard: typings.timezonecomplete.distLibTzDatabaseMod.AtType.Standard & Double = js.native
    
    /* 2 */ val Utc: typings.timezonecomplete.distLibTzDatabaseMod.AtType.Utc & Double = js.native
    
    /* 1 */ val Wall: typings.timezonecomplete.distLibTzDatabaseMod.AtType.Wall & Double = js.native
  }
  
  object DAY_PERIODS_ABBREVIATED {
    
    @JSImport("timezonecomplete", "DAY_PERIODS_ABBREVIATED")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("timezonecomplete", "DAY_PERIODS_ABBREVIATED.am")
    @js.native
    def am: String = js.native
    inline def am_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("am")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_ABBREVIATED.midnight")
    @js.native
    def midnight: String = js.native
    inline def midnight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midnight")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_ABBREVIATED.noon")
    @js.native
    def noon: String = js.native
    inline def noon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noon")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_ABBREVIATED.pm")
    @js.native
    def pm: String = js.native
    inline def pm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pm")(x.asInstanceOf[js.Any])
  }
  
  object DAY_PERIODS_NARROW {
    
    @JSImport("timezonecomplete", "DAY_PERIODS_NARROW")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("timezonecomplete", "DAY_PERIODS_NARROW.am")
    @js.native
    def am: String = js.native
    inline def am_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("am")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_NARROW.midnight")
    @js.native
    def midnight: String = js.native
    inline def midnight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midnight")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_NARROW.noon")
    @js.native
    def noon: String = js.native
    inline def noon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noon")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_NARROW.pm")
    @js.native
    def pm: String = js.native
    inline def pm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pm")(x.asInstanceOf[js.Any])
  }
  
  object DAY_PERIODS_WIDE {
    
    @JSImport("timezonecomplete", "DAY_PERIODS_WIDE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("timezonecomplete", "DAY_PERIODS_WIDE.am")
    @js.native
    def am: String = js.native
    inline def am_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("am")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_WIDE.midnight")
    @js.native
    def midnight: String = js.native
    inline def midnight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midnight")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_WIDE.noon")
    @js.native
    def noon: String = js.native
    inline def noon_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noon")(x.asInstanceOf[js.Any])
    
    @JSImport("timezonecomplete", "DAY_PERIODS_WIDE.pm")
    @js.native
    def pm: String = js.native
    inline def pm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pm")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("timezonecomplete", "DEFAULT_LOCALE")
  @js.native
  val DEFAULT_LOCALE: Locale = js.native
  
  @JSImport("timezonecomplete", "DateFunctions")
  @js.native
  object DateFunctions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.timezonecomplete.distLibJavascriptMod.DateFunctions & Double] = js.native
    
    /* 0 */ val Get: typings.timezonecomplete.distLibJavascriptMod.DateFunctions.Get & Double = js.native
    
    /* 1 */ val GetUTC: typings.timezonecomplete.distLibJavascriptMod.DateFunctions.GetUTC & Double = js.native
  }
  
  @JSImport("timezonecomplete", "DateTime")
  @js.native
  /**
    * Constructor. Creates current time in local timezone.
    * @throws nothing
    */
  open class DateTime ()
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
      * @throws timezonecomplete.Argument.S if the given string is invalid
      * @throws timezonecomplete.Argument.TimeZone if the given time zone is invalid
      */
    def this(isoString: String) = this()
    /**
      * Get a date from a TimeStruct
      * @throws timezonecomplete.Argument.TimeZone if the given time zone argument is invalid
      */
    def this(tm: typings.timezonecomplete.distLibBasicsMod.TimeStruct) = this()
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
    def this(isoString: String, timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone) = this()
    def this(
      tm: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(unixTimestamp: Double, timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone) = this()
    def this(
      dateString: String,
      formatString: String,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      date: js.Date,
      getFuncs: DateFunctions,
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
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Double,
      millisecond: Unit,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Unit,
      millisecond: Double,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Double,
      second: Unit,
      millisecond: Unit,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Unit,
      second: Double,
      millisecond: Double,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Unit,
      second: Double,
      millisecond: Unit,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Unit,
      second: Unit,
      millisecond: Double,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Double,
      minute: Unit,
      second: Unit,
      millisecond: Unit,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double,
      second: Double,
      millisecond: Double,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double,
      second: Double,
      millisecond: Unit,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double,
      second: Unit,
      millisecond: Double,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Double,
      second: Unit,
      millisecond: Unit,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Unit,
      second: Double,
      millisecond: Double,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Unit,
      second: Double,
      millisecond: Unit,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Unit,
      second: Unit,
      millisecond: Double,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hour: Unit,
      minute: Unit,
      second: Unit,
      millisecond: Unit,
      timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
    ) = this()
  }
  /* static members */
  object DateTime {
    
    @JSImport("timezonecomplete", "DateTime")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Split a combined ISO datetime and timezone into datetime and timezone
      * @throws nothing
      */
    @JSImport("timezonecomplete", "DateTime._splitDateFromTimeZone")
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
      zone: js.UndefOr[typings.timezonecomplete.distLibTimezoneMod.TimeZone | Null],
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
    inline def fromExcel(n: Double): typings.timezonecomplete.distLibDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExcel")(n.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    inline def fromExcel(n: Double, timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone): typings.timezonecomplete.distLibDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExcel")(n.asInstanceOf[js.Any], timeZone.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    
    /**
      * Current date+time in the given time zone
      * @param timeZone	The desired time zone (optional, defaults to UTC).
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    inline def now(): typings.timezonecomplete.distLibDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    inline def now(timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone): typings.timezonecomplete.distLibDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(timeZone.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    
    /**
      * Current date+time in local time
      * @throws nothing
      */
    inline def nowLocal(): typings.timezonecomplete.distLibDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("nowLocal")().asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    
    /**
      * Current date+time in UTC time
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    inline def nowUtc(): typings.timezonecomplete.distLibDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("nowUtc")().asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    
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
    inline def parse(s: String, format: String): typings.timezonecomplete.distLibDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    inline def parse(s: String, format: String, zone: Unit, locale: Unit, allowTrailing: Boolean): typings.timezonecomplete.distLibDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    inline def parse(s: String, format: String, zone: Unit, locale: PartialLocale): typings.timezonecomplete.distLibDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    inline def parse(s: String, format: String, zone: Unit, locale: PartialLocale, allowTrailing: Boolean): typings.timezonecomplete.distLibDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    inline def parse(s: String, format: String, zone: typings.timezonecomplete.distLibTimezoneMod.TimeZone): typings.timezonecomplete.distLibDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    inline def parse(
      s: String,
      format: String,
      zone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
      locale: Unit,
      allowTrailing: Boolean
    ): typings.timezonecomplete.distLibDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    inline def parse(
      s: String,
      format: String,
      zone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
      locale: PartialLocale
    ): typings.timezonecomplete.distLibDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    inline def parse(
      s: String,
      format: String,
      zone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
      locale: PartialLocale,
      allowTrailing: Boolean
    ): typings.timezonecomplete.distLibDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], format.asInstanceOf[js.Any], zone.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
    
    /**
      * Actual time source in use. Setting this property allows to
      * fake time in tests. DateTime.nowLocal() and DateTime.nowUtc()
      * use this property for obtaining the current time.
      */
    @JSImport("timezonecomplete", "DateTime.timeSource")
    @js.native
    def timeSource: TimeSource = js.native
    inline def timeSource_=(x: TimeSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeSource")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("timezonecomplete", "Duration")
  @js.native
  /**
    * Construct a time duration of 0 milliseconds
    * @throws nothing
    */
  open class Duration ()
    extends typings.timezonecomplete.distLibDurationMod.Duration {
    /**
      * Construct a duration from an amount and a time unit.
      * @param amount	Number of units
      * @param unit	A time unit i.e. TimeUnit.Second, TimeUnit.Hour etc. Default Millisecond.
      * @throws timezonecomplete.Argument.Amount if `amount` is not a finite number
      * @throws timezonecomplete.Argument.Unit for invalid `unit`
      */
    def this(amount: Double) = this()
    /**
      * Construct a time duration from a string in one of two formats:
      * 1) [-]hhhh[:mm[:ss[.nnn]]] e.g. '-01:00:30.501'
      * 2) amount and unit e.g. '-1 days' or '1 year'. The unit may be in singular or plural form and is case-insensitive
      * @throws timezonecomplete.Argument.S for invalid string
      */
    def this(s: String) = this()
    def this(amount: Double, unit: TimeUnit) = this()
  }
  /* static members */
  object Duration {
    
    @JSImport("timezonecomplete", "Duration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Construct a time duration
      * @param amount Number of days (may be fractional or negative)
      * @return A duration of n days
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    inline def days(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("days")(amount.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
    
    /**
      * Construct a time duration
      * @param amount Number of hours (may be fractional or negative)
      * @return A duration of n hours
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    inline def hours(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("hours")(amount.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
    
    /**
      * Construct a time duration
      * @param amount Number of milliseconds (may be fractional or negative)
      * @return A duration of n milliseconds
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    inline def milliseconds(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("milliseconds")(amount.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
    
    /**
      * Construct a time duration
      * @param amount Number of minutes (may be fractional or negative)
      * @return A duration of n minutes
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    inline def minutes(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("minutes")(amount.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
    
    /**
      * Construct a time duration
      * @param amount Number of months (may be fractional or negative)
      * @return A duration of n months
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    inline def months(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("months")(amount.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
    
    /**
      * Construct a time duration
      * @param amount Number of seconds (may be fractional or negative)
      * @return A duration of n seconds
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    inline def seconds(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("seconds")(amount.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
    
    /**
      * Construct a time duration
      * @param amount Number of years (may be fractional or negative)
      * @return A duration of n years
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    inline def years(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("years")(amount.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
  }
  
  @JSImport("timezonecomplete", "ERA_NAMES_ABBREVIATED")
  @js.native
  val ERA_NAMES_ABBREVIATED: js.Tuple2[String, String] = js.native
  
  @JSImport("timezonecomplete", "ERA_NAMES_NARROW")
  @js.native
  val ERA_NAMES_NARROW: js.Tuple2[String, String] = js.native
  
  @JSImport("timezonecomplete", "ERA_NAMES_WIDE")
  @js.native
  val ERA_NAMES_WIDE: js.Tuple2[String, String] = js.native
  
  @JSImport("timezonecomplete", "LONG_MONTH_NAMES")
  @js.native
  val LONG_MONTH_NAMES: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "LONG_WEEKDAY_NAMES")
  @js.native
  val LONG_WEEKDAY_NAMES: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "MONTH_LETTERS")
  @js.native
  val MONTH_LETTERS: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "NormalizeOption")
  @js.native
  object NormalizeOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.timezonecomplete.distLibTzDatabaseMod.NormalizeOption & Double] = js.native
    
    /* 1 */ val Down: typings.timezonecomplete.distLibTzDatabaseMod.NormalizeOption.Down & Double = js.native
    
    /* 0 */ val Up: typings.timezonecomplete.distLibTzDatabaseMod.NormalizeOption.Up & Double = js.native
  }
  
  @JSImport("timezonecomplete", "OnType")
  @js.native
  object OnType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.timezonecomplete.distLibTzDatabaseMod.OnType & Double] = js.native
    
    /* 0 */ val DayNum: typings.timezonecomplete.distLibTzDatabaseMod.OnType.DayNum & Double = js.native
    
    /* 2 */ val GreqX: typings.timezonecomplete.distLibTzDatabaseMod.OnType.GreqX & Double = js.native
    
    /* 1 */ val LastX: typings.timezonecomplete.distLibTzDatabaseMod.OnType.LastX & Double = js.native
    
    /* 3 */ val LeqX: typings.timezonecomplete.distLibTzDatabaseMod.OnType.LeqX & Double = js.native
  }
  
  @JSImport("timezonecomplete", "Period")
  @js.native
  open class Period protected ()
    extends typings.timezonecomplete.distLibPeriodMod.Period {
    /**
      * Constructor
      * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
      * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
      * This is due to the enormous processing power required by these cases. They are not
      * implemented and you will get an assert.
      *
      * @param json period represented as JSON object
      * @throws timezonecomplete.Argument.Json for invalid JSON (missing reference, unparseable reference or interval)
      * @throws timezonecomplete.Argument.Interval if amount not positive integer
      * @throws timezonecomplete.Argument.Interval.NotImplemented if dst=RegularLocalTime and the interval is not a multiple of one day
      */
    def this(json: PeriodJson) = this()
    /**
      * Constructor
      * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
      * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
      * This is due to the enormous processing power required by these cases. They are not
      * implemented and you will get an assert.
      *
      * @param reference The reference date of the period. If the period is in Months or Years, and
      *                  the day is 29 or 30 or 31, the results are maximised to end-of-month.
      * @param interval The interval of the period
      * @param dst Specifies how to handle Daylight Saving Time. Not relevant
      *            if the time zone of the reference datetime does not have DST.
      *            Defaults to RegularLocalTime.
      * @throws timezonecomplete.Argument.Dst for invalid dst value
      * @throws timezonecomplete.Argument.Interval if amount not positive integer
      * @throws timezonecomplete.Argument.Interval.NotImplemented if dst=RegularLocalTime and the interval is not a multiple of one day
      */
    def this(
      reference: typings.timezonecomplete.distLibDatetimeMod.DateTime,
      interval: typings.timezonecomplete.distLibDurationMod.Duration
    ) = this()
    /**
      * Constructor
      * LIMITATION: if dst equals RegularLocalTime, and unit is Second, Minute or Hour,
      * then the amount must be a factor of 24. So 120 seconds is allowed while 121 seconds is not.
      * This is due to the enormous processing power required by these cases. They are not
      * implemented and you will get an assert.
      *
      * @param reference The reference of the period. If the period is in Months or Years, and
      *                  the day is 29 or 30 or 31, the results are maximised to end-of-month.
      * @param amount The amount of units.
      * @param unit The unit.
      * @param dst Specifies how to handle Daylight Saving Time. Not relevant
      *              if the time zone of the reference datetime does not have DST.
      *              Defaults to RegularLocalTime.
      * @throws timezonecomplete.Argument.Amount for invalid amount
      * @throws timezonecomplete.Argument.Unit for invalid time unit
      * @throws timezonecomplete.Argument.Interval if amount not positive integer
      * @throws timezonecomplete.Argument.Interval.NotImplemented if dst=RegularLocalTime and the interval is not a multiple of one day
      * @throws timezonecomplete.Argument.Dst for invalid dst value
      */
    def this(reference: typings.timezonecomplete.distLibDatetimeMod.DateTime, amount: Double, unit: TimeUnit) = this()
    def this(
      reference: typings.timezonecomplete.distLibDatetimeMod.DateTime,
      interval: typings.timezonecomplete.distLibDurationMod.Duration,
      dst: PeriodDst
    ) = this()
    def this(
      reference: typings.timezonecomplete.distLibDatetimeMod.DateTime,
      amount: Double,
      unit: TimeUnit,
      dst: PeriodDst
    ) = this()
  }
  
  @JSImport("timezonecomplete", "PeriodDst")
  @js.native
  object PeriodDst extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.timezonecomplete.distLibPeriodMod.PeriodDst & Double] = js.native
    
    /* 2 */ val MAX: typings.timezonecomplete.distLibPeriodMod.PeriodDst.MAX & Double = js.native
    
    /* 0 */ val RegularIntervals: typings.timezonecomplete.distLibPeriodMod.PeriodDst.RegularIntervals & Double = js.native
    
    /* 1 */ val RegularLocalTime: typings.timezonecomplete.distLibPeriodMod.PeriodDst.RegularLocalTime & Double = js.native
  }
  
  @JSImport("timezonecomplete", "QUARTER_ABBREVIATIONS")
  @js.native
  val QUARTER_ABBREVIATIONS: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "QUARTER_LETTER")
  @js.native
  val QUARTER_LETTER: String = js.native
  
  @JSImport("timezonecomplete", "QUARTER_WORD")
  @js.native
  val QUARTER_WORD: String = js.native
  
  @JSImport("timezonecomplete", "RealTimeSource")
  @js.native
  open class RealTimeSource ()
    extends typings.timezonecomplete.distLibTimesourceMod.RealTimeSource
  
  @JSImport("timezonecomplete", "RuleInfo")
  @js.native
  open class RuleInfo protected ()
    extends typings.timezonecomplete.distLibTzDatabaseMod.RuleInfo {
    /**
      * Constructor
      * @param from
      * @param toType
      * @param toYear
      * @param type
      * @param inMonth
      * @param onType
      * @param onDay
      * @param onWeekDay
      * @param atHour
      * @param atMinute
      * @param atSecond
      * @param atType
      * @param save
      * @param letter
      * @throws nothing
      */
    def this(
      /**
      * FROM column year number.
      */
    from: Double,
      /**
      * TO column type: Year for year numbers and "only" values, Max for "max" value.
      */
    toType: ToType,
      /**
      * If TO column is a year, the year number. If TO column is "only", the FROM year.
      */
    toYear: Double,
      /**
      * TYPE column, not used so far
      */
    `type`: String,
      /**
      * IN column month number 1-12
      */
    inMonth: Double,
      /**
      * ON column type
      */
    onType: OnType,
      /**
      * If onType is DayNum, the day number
      */
    onDay: Double,
      /**
      * If onType is not DayNum, the weekday
      */
    onWeekDay: WeekDay,
      /**
      * AT column hour
      */
    atHour: Double,
      /**
      * AT column minute
      */
    atMinute: Double,
      /**
      * AT column second
      */
    atSecond: Double,
      /**
      * AT column type
      */
    atType: AtType,
      /**
      * DST offset from local standard time (NOT from UTC!)
      */
    save: typings.timezonecomplete.distLibDurationMod.Duration,
      /**
      * Character to insert in %s for time zone abbreviation
      * Note if TZ database indicates "-" this is the empty string
      */
    letter: String
    ) = this()
  }
  
  @JSImport("timezonecomplete", "RuleType")
  @js.native
  object RuleType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.timezonecomplete.distLibTzDatabaseMod.RuleType & Double] = js.native
    
    /* 0 */ val None: typings.timezonecomplete.distLibTzDatabaseMod.RuleType.None & Double = js.native
    
    /* 1 */ val Offset: typings.timezonecomplete.distLibTzDatabaseMod.RuleType.Offset & Double = js.native
    
    /* 2 */ val RuleName: typings.timezonecomplete.distLibTzDatabaseMod.RuleType.RuleName & Double = js.native
  }
  
  @JSImport("timezonecomplete", "SHORT_MONTH_NAMES")
  @js.native
  val SHORT_MONTH_NAMES: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "SHORT_WEEKDAY_NAMES")
  @js.native
  val SHORT_WEEKDAY_NAMES: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "STAND_ALONE_LONG_MONTH_NAMES")
  @js.native
  val STAND_ALONE_LONG_MONTH_NAMES: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "STAND_ALONE_MONTH_LETTERS")
  @js.native
  val STAND_ALONE_MONTH_LETTERS: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "STAND_ALONE_QUARTER_ABBREVIATIONS")
  @js.native
  val STAND_ALONE_QUARTER_ABBREVIATIONS: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "STAND_ALONE_QUARTER_LETTER")
  @js.native
  val STAND_ALONE_QUARTER_LETTER: String = js.native
  
  @JSImport("timezonecomplete", "STAND_ALONE_QUARTER_WORD")
  @js.native
  val STAND_ALONE_QUARTER_WORD: String = js.native
  
  @JSImport("timezonecomplete", "STAND_ALONE_SHORT_MONTH_NAMES")
  @js.native
  val STAND_ALONE_SHORT_MONTH_NAMES: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "TimeStruct")
  @js.native
  open class TimeStruct protected ()
    extends typings.timezonecomplete.distLibBasicsMod.TimeStruct {
    /**
      * Constructor
      *
      * @param components Separate timestamp components (year, month, ...)
      * @throws timezonecomplete.Argument.Components if `components` is not an object
      * @throws timezonecomplete.Argument.* for invalid components (* = Year, Month, Day, Hour, Minute, Second, Milli)
      */
    def this(components: TimeComponentOpts) = this()
    /**
      * Constructor
      *
      * @param unixMillis milliseconds since 1-1-1970
      * @throws timezonecomplete.Argument.UnixMillis for non-integer unixMillis
      */
    def this(unixMillis: Double) = this()
  }
  /* static members */
  object TimeStruct {
    
    @JSImport("timezonecomplete", "TimeStruct")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a TimeStruct from the given year, month, day etc
      *
      * @param year	Year e.g. 1970
      * @param month	Month 1-12
      * @param day	Day 1-31
      * @param hour	Hour 0-23
      * @param minute	Minute 0-59
      * @param second	Second 0-59 (no leap seconds)
      * @param milli	Millisecond 0-999
      * @throws timezonecomplete.Argument.Year for invalid year
      * @throws timezonecomplete.Argument.Month for invalid month
      * @throws timezonecomplete.Argument.Day for invalid day of month
      * @throws timezonecomplete.Argument.Hour for invalid hour
      * @throws timezonecomplete.Argument.Minute for invalid minute
      * @throws timezonecomplete.Argument.Second for invalid second
      * @throws timezonecomplete.Argument.Milli for invalid milliseconds
      */
    inline def fromComponents(
      year: js.UndefOr[Double],
      month: js.UndefOr[Double],
      day: js.UndefOr[Double],
      hour: js.UndefOr[Double],
      minute: js.UndefOr[Double],
      second: js.UndefOr[Double],
      milli: js.UndefOr[Double]
    ): typings.timezonecomplete.distLibBasicsMod.TimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("fromComponents")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], milli.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibBasicsMod.TimeStruct]
    
    /**
      * Create a TimeStruct from a JavaScript date
      *
      * @param d	The date
      * @param df Which functions to take (getX() or getUTCX())
      * @throws nothing
      */
    inline def fromDate(d: js.Date, df: DateFunctions): typings.timezonecomplete.distLibBasicsMod.TimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(d.asInstanceOf[js.Any], df.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibBasicsMod.TimeStruct]
    
    /**
      * Returns a TimeStruct from an ISO 8601 string WITHOUT time zone
      * @throws timezonecomplete.Argument.S if `s` is not a proper iso string
      */
    inline def fromString(s: String): typings.timezonecomplete.distLibBasicsMod.TimeStruct = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(s.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibBasicsMod.TimeStruct]
    
    /**
      * Create a TimeStruct from a number of unix milliseconds
      * (backward compatibility)
      * @throws timezonecomplete.Argument.UnixMillis for non-integer milliseconds
      */
    inline def fromUnix(unixMillis: Double): typings.timezonecomplete.distLibBasicsMod.TimeStruct = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUnix")(unixMillis.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibBasicsMod.TimeStruct]
  }
  
  @JSImport("timezonecomplete", "TimeUnit")
  @js.native
  object TimeUnit extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.timezonecomplete.distLibBasicsMod.TimeUnit & Double] = js.native
    
    /* 4 */ val Day: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Day & Double = js.native
    
    /* 3 */ val Hour: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Hour & Double = js.native
    
    /* 8 */ val MAX: typings.timezonecomplete.distLibBasicsMod.TimeUnit.MAX & Double = js.native
    
    /* 0 */ val Millisecond: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Millisecond & Double = js.native
    
    /* 2 */ val Minute: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Minute & Double = js.native
    
    /* 6 */ val Month: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Month & Double = js.native
    
    /* 1 */ val Second: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Second & Double = js.native
    
    /* 5 */ val Week: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Week & Double = js.native
    
    /* 7 */ val Year: typings.timezonecomplete.distLibBasicsMod.TimeUnit.Year & Double = js.native
  }
  
  @JSImport("timezonecomplete", "TimeZone")
  @js.native
  /**
    * Do not use this constructor, use the static
    * TimeZone.zone() method instead.
    * @param name NORMALIZED name, assumed to be correct
    * @param dst Adhere to Daylight Saving Time if applicable, ignored for local time and fixed offsets
    * @throws timezonecomplete.NotFound.Zone if the given zone name doesn't exist
    * @throws timezonecomplete.InvalidTimeZoneData if the time zone database is invalid
    */
  /* private */ open class TimeZone ()
    extends typings.timezonecomplete.distLibTimezoneMod.TimeZone
  /* static members */
  object TimeZone {
    
    @JSImport("timezonecomplete", "TimeZone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Time zone cache.
      */
    @JSImport("timezonecomplete", "TimeZone._cache")
    @js.native
    def _cache: Any = js.native
    inline def _cache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_cache")(x.asInstanceOf[js.Any])
    
    /**
      * Find in cache or create zone
      * @param name	Time zone name
      * @param dst	Adhere to Daylight Saving Time?
      * @throws timezonecomplete.NotFound.Zone if the zone doesn't exist in the time zone database
      */
    @JSImport("timezonecomplete", "TimeZone._findOrCreate")
    @js.native
    def _findOrCreate: Any = js.native
    inline def _findOrCreate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_findOrCreate")(x.asInstanceOf[js.Any])
    
    /**
      * Returns true iff the first non-whitespace character of s is +, -, or Z
      * @param s
      * @throws nothing
      */
    @JSImport("timezonecomplete", "TimeZone._isOffsetString")
    @js.native
    def _isOffsetString: Any = js.native
    inline def _isOffsetString_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isOffsetString")(x.asInstanceOf[js.Any])
    
    /**
      * Normalize a string so it can be used as a key for a cache lookup
      * @throws Argument.S if s is empty
      */
    @JSImport("timezonecomplete", "TimeZone._normalizeString")
    @js.native
    def _normalizeString: Any = js.native
    inline def _normalizeString_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_normalizeString")(x.asInstanceOf[js.Any])
    
    /**
      * The local time zone for a given date. Note that
      * the time zone varies with the date: amsterdam time for
      * 2014-01-01 is +01:00 and amsterdam time for 2014-07-01 is +02:00
      * @throws nothing
      */
    inline def local(): typings.timezonecomplete.distLibTimezoneMod.TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("local")().asInstanceOf[typings.timezonecomplete.distLibTimezoneMod.TimeZone]
    
    /**
      * Convert an offset number into an offset string
      * @param offset The offset in minutes from UTC e.g. 90 minutes
      * @return the offset in ISO notation "+01:30" for +90 minutes
      * @throws Argument.Offset if offset is not a finite number or not within -24 * 60 ... +24 * 60 minutes
      */
    inline def offsetToString(offset: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("offsetToString")(offset.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * String to offset conversion.
      * @param s	Formats: "-01:00", "-0100", "-01", "Z"
      * @return offset w.r.t. UTC in minutes
      * @throws timezonecomplete.Argument.S if s cannot be parsed
      */
    inline def stringToOffset(s: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToOffset")(s.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    /**
      * The UTC time zone.
      * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
      */
    inline def utc(): typings.timezonecomplete.distLibTimezoneMod.TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[typings.timezonecomplete.distLibTimezoneMod.TimeZone]
    
    /**
      * Time zone with a fixed offset
      * @param offset	offset w.r.t. UTC in minutes, e.g. 90 for +01:30
      * @throws timezonecomplete.Argument.Offset if the offset is not within -24h...+24h (in minutes)
      */
    inline def zone(offset: Double): typings.timezonecomplete.distLibTimezoneMod.TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("zone")(offset.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibTimezoneMod.TimeZone]
    /**
      * Time zone for an offset string or an IANA time zone string. Note that time zones are cached
      * so you don't necessarily get a new object each time.
      * @param s "localtime" for local time,
      *          a TZ database time zone name (e.g. Europe/Amsterdam),
      *          or an offset string (either +01:30, +0130, +01, Z). For a full list of names, see:
      *          https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
      *          TZ database zone name may be suffixed with " without DST" to indicate no DST should be applied.
      *          In that case, the dst parameter is ignored.
      * @param dst	Optional, default true: adhere to Daylight Saving Time if applicable. Note for
      *              "localtime", timezonecomplete will adhere to the computer settings, the DST flag
      *              does not have any effect.
      * @throws timezonecomplete.Argument.S if s cannot be parsed
      * @throws timezonecomplete.NotFound.Zone if the zone name doesn't exist in the time zone database
      */
    inline def zone(s: String): typings.timezonecomplete.distLibTimezoneMod.TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("zone")(s.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibTimezoneMod.TimeZone]
    inline def zone(s: String, dst: Boolean): typings.timezonecomplete.distLibTimezoneMod.TimeZone = (^.asInstanceOf[js.Dynamic].applyDynamic("zone")(s.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibTimezoneMod.TimeZone]
  }
  
  @JSImport("timezonecomplete", "TimeZoneKind")
  @js.native
  object TimeZoneKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.timezonecomplete.distLibTimezoneMod.TimeZoneKind & Double] = js.native
    
    /* 0 */ val Local: typings.timezonecomplete.distLibTimezoneMod.TimeZoneKind.Local & Double = js.native
    
    /* 1 */ val Offset: typings.timezonecomplete.distLibTimezoneMod.TimeZoneKind.Offset & Double = js.native
    
    /* 2 */ val Proper: typings.timezonecomplete.distLibTimezoneMod.TimeZoneKind.Proper & Double = js.native
  }
  
  @JSImport("timezonecomplete", "ToType")
  @js.native
  object ToType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.timezonecomplete.distLibTzDatabaseMod.ToType & Double] = js.native
    
    /* 1 */ val Max: typings.timezonecomplete.distLibTzDatabaseMod.ToType.Max & Double = js.native
    
    /* 0 */ val Year: typings.timezonecomplete.distLibTzDatabaseMod.ToType.Year & Double = js.native
  }
  
  @JSImport("timezonecomplete", "Transition")
  @js.native
  open class Transition protected ()
    extends typings.timezonecomplete.distLibTzDatabaseMod.Transition {
    /**
      * Constructor
      * @param at
      * @param offset
      * @param letter
      * @throws nothing
      */
    def this(
      /**
      * Transition time in UTC millis
      */
    at: Double,
      /**
      * New offset (type of offset depends on the function)
      */
    offset: typings.timezonecomplete.distLibDurationMod.Duration,
      /**
      * New timzone abbreviation letter
      */
    letter: String
    ) = this()
  }
  
  @JSImport("timezonecomplete", "TzDatabase")
  @js.native
  /**
    * Constructor - do not use, this is a singleton class. Use TzDatabase.instance() instead
    * @throws AlreadyCreated if an instance already exists
    * @throws timezonecomplete.InvalidTimeZoneData if `data` is empty or invalid
    */
  /* private */ open class TzDatabase ()
    extends typings.timezonecomplete.distLibTzDatabaseMod.TzDatabase
  /* static members */
  object TzDatabase {
    
    @JSImport("timezonecomplete", "TzDatabase")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Single instance member
      */
    @JSImport("timezonecomplete", "TzDatabase._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /**
      * (re-) initialize timezonecomplete with time zone data
      *
      * @param data TZ data as JSON object (from one of the tzdata NPM modules).
      *             If not given, Timezonecomplete will search for installed modules.
      * @throws timezonecomplete.InvalidTimeZoneData if `data` or the global time zone data is invalid
      */
    inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
    inline def init(data: js.Array[Any]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def init(data: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Single instance of this database
      * @throws timezonecomplete.InvalidTimeZoneData if the global time zone data is invalid
      */
    inline def instance(): typings.timezonecomplete.distLibTzDatabaseMod.TzDatabase = ^.asInstanceOf[js.Dynamic].applyDynamic("instance")().asInstanceOf[typings.timezonecomplete.distLibTzDatabaseMod.TzDatabase]
  }
  
  @JSImport("timezonecomplete", "WEEKDAY_LETTERS")
  @js.native
  val WEEKDAY_LETTERS: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "WEEKDAY_TWO_LETTERS")
  @js.native
  val WEEKDAY_TWO_LETTERS: js.Array[String] = js.native
  
  @JSImport("timezonecomplete", "WeekDay")
  @js.native
  object WeekDay extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.timezonecomplete.distLibBasicsMod.WeekDay & Double] = js.native
    
    /* 5 */ val Friday: typings.timezonecomplete.distLibBasicsMod.WeekDay.Friday & Double = js.native
    
    /* 1 */ val Monday: typings.timezonecomplete.distLibBasicsMod.WeekDay.Monday & Double = js.native
    
    /* 6 */ val Saturday: typings.timezonecomplete.distLibBasicsMod.WeekDay.Saturday & Double = js.native
    
    /* 0 */ val Sunday: typings.timezonecomplete.distLibBasicsMod.WeekDay.Sunday & Double = js.native
    
    /* 4 */ val Thursday: typings.timezonecomplete.distLibBasicsMod.WeekDay.Thursday & Double = js.native
    
    /* 2 */ val Tuesday: typings.timezonecomplete.distLibBasicsMod.WeekDay.Tuesday & Double = js.native
    
    /* 3 */ val Wednesday: typings.timezonecomplete.distLibBasicsMod.WeekDay.Wednesday & Double = js.native
  }
  
  @JSImport("timezonecomplete", "ZoneInfo")
  @js.native
  open class ZoneInfo protected ()
    extends typings.timezonecomplete.distLibTzDatabaseMod.ZoneInfo {
    /**
      * Constructor
      * @param gmtoff
      * @param ruleType
      * @param ruleOffset
      * @param ruleName
      * @param format
      * @param until
      * @throws nothing
      */
    def this(
      /**
      * GMT offset in fractional minutes, POSITIVE to UTC (note JavaScript.Date gives offsets
      * contrary to what you might expect).  E.g. Europe/Amsterdam has +60 minutes in this field because
      * it is one hour ahead of UTC
      */
    gmtoff: typings.timezonecomplete.distLibDurationMod.Duration,
      /**
      * The RULES column tells us whether daylight saving time is being observed:
      * A hyphen, a kind of null value, means that we have not set our clocks ahead of standard time.
      * An amount of time (usually but not necessarily “1:00” meaning one hour) means that we have set our clocks ahead by that amount.
      * Some alphabetic string means that we might have set our clocks ahead; and we need to check the rule
      * the name of which is the given alphabetic string.
      */
    ruleType: RuleType,
      /**
      * If the rule column is an offset, this is the offset
      */
    ruleOffset: typings.timezonecomplete.distLibDurationMod.Duration,
      /**
      * If the rule column is a rule name, this is the rule name
      */
    ruleName: String,
      /**
      * The FORMAT column specifies the usual abbreviation of the time zone name. It can have one of four forms:
      * the string, “zzz,” which is a kind of null value (don’t ask)
      * a single alphabetic string other than “zzz,” in which case that’s the abbreviation
      * a pair of strings separated by a slash (‘/’), in which case the first string is the abbreviation
      * for the standard time name and the second string is the abbreviation for the daylight saving time name
      * a string containing “%s,” in which case the “%s” will be replaced by the text in the appropriate Rule’s LETTER column
      */
    format: String
    ) = this()
    def this(
      /**
      * GMT offset in fractional minutes, POSITIVE to UTC (note JavaScript.Date gives offsets
      * contrary to what you might expect).  E.g. Europe/Amsterdam has +60 minutes in this field because
      * it is one hour ahead of UTC
      */
    gmtoff: typings.timezonecomplete.distLibDurationMod.Duration,
      /**
      * The RULES column tells us whether daylight saving time is being observed:
      * A hyphen, a kind of null value, means that we have not set our clocks ahead of standard time.
      * An amount of time (usually but not necessarily “1:00” meaning one hour) means that we have set our clocks ahead by that amount.
      * Some alphabetic string means that we might have set our clocks ahead; and we need to check the rule
      * the name of which is the given alphabetic string.
      */
    ruleType: RuleType,
      /**
      * If the rule column is an offset, this is the offset
      */
    ruleOffset: typings.timezonecomplete.distLibDurationMod.Duration,
      /**
      * If the rule column is a rule name, this is the rule name
      */
    ruleName: String,
      /**
      * The FORMAT column specifies the usual abbreviation of the time zone name. It can have one of four forms:
      * the string, “zzz,” which is a kind of null value (don’t ask)
      * a single alphabetic string other than “zzz,” in which case that’s the abbreviation
      * a pair of strings separated by a slash (‘/’), in which case the first string is the abbreviation
      * for the standard time name and the second string is the abbreviation for the daylight saving time name
      * a string containing “%s,” in which case the “%s” will be replaced by the text in the appropriate Rule’s LETTER column
      */
    format: String,
      /**
      * Until timestamp in unix utc millis. The zone info is valid up to
      * and excluding this timestamp.
      * Note this value can be undefined (for the first rule)
      */
    until: Double
    ) = this()
  }
  
  inline def abs(d: typings.timezonecomplete.distLibDurationMod.Duration): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("abs")(d.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
  
  inline def binaryInsertionIndex[T](arr: js.Array[T], compare: js.Function1[/* a */ T, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binaryInsertionIndex")(arr.asInstanceOf[js.Any], compare.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def dayOfYear(year: Double, month: Double, day: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("dayOfYear")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def days(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("days")(n.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
  
  inline def daysInMonth(year: Double, month: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("daysInMonth")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def daysInYear(year: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("daysInYear")(year.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def firstWeekDayOfMonth(year: Double, month: Double, weekDay: WeekDay): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("firstWeekDayOfMonth")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], weekDay.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def format(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: Null,
    formatString: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateTime.asInstanceOf[js.Any], utcTime.asInstanceOf[js.Any], localZone.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: Null,
    formatString: String,
    locale: PartialLocale
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateTime.asInstanceOf[js.Any], utcTime.asInstanceOf[js.Any], localZone.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: Unit,
    formatString: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateTime.asInstanceOf[js.Any], utcTime.asInstanceOf[js.Any], localZone.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: Unit,
    formatString: String,
    locale: PartialLocale
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateTime.asInstanceOf[js.Any], utcTime.asInstanceOf[js.Any], localZone.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    formatString: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateTime.asInstanceOf[js.Any], utcTime.asInstanceOf[js.Any], localZone.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(
    dateTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    utcTime: typings.timezonecomplete.distLibBasicsMod.TimeStruct,
    localZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    formatString: String,
    locale: PartialLocale
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(dateTime.asInstanceOf[js.Any], utcTime.asInstanceOf[js.Any], localZone.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hours(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("hours")(n.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
  
  inline def isDateTime(value: Any): /* is timezonecomplete.timezonecomplete/dist/lib/datetime.DateTime */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDateTime")(value.asInstanceOf[js.Any]).asInstanceOf[/* is timezonecomplete.timezonecomplete/dist/lib/datetime.DateTime */ Boolean]
  
  inline def isDuration(value: Any): /* is timezonecomplete.timezonecomplete/dist/lib/duration.Duration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(value.asInstanceOf[js.Any]).asInstanceOf[/* is timezonecomplete.timezonecomplete/dist/lib/duration.Duration */ Boolean]
  
  inline def isLeapYear(year: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLeapYear")(year.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPeriod(value: Any): /* is timezonecomplete.timezonecomplete/dist/lib/period.Period */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPeriod")(value.asInstanceOf[js.Any]).asInstanceOf[/* is timezonecomplete.timezonecomplete/dist/lib/period.Period */ Boolean]
  
  inline def isTimeZone(value: Any): /* is timezonecomplete.timezonecomplete/dist/lib/timezone.TimeZone */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeZone")(value.asInstanceOf[js.Any]).asInstanceOf[/* is timezonecomplete.timezonecomplete/dist/lib/timezone.TimeZone */ Boolean]
  
  inline def isValidOffsetString(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidOffsetString")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidPeriodJson(json: PeriodJson): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidPeriodJson")(json.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def lastWeekDayOfMonth(year: Double, month: Double, weekDay: WeekDay): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lastWeekDayOfMonth")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], weekDay.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def local(): typings.timezonecomplete.distLibTimezoneMod.TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("local")().asInstanceOf[typings.timezonecomplete.distLibTimezoneMod.TimeZone]
  
  inline def max(
    d1: typings.timezonecomplete.distLibDatetimeMod.DateTime,
    d2: typings.timezonecomplete.distLibDatetimeMod.DateTime
  ): typings.timezonecomplete.distLibDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
  inline def max(
    d1: typings.timezonecomplete.distLibDurationMod.Duration,
    d2: typings.timezonecomplete.distLibDurationMod.Duration
  ): typings.timezonecomplete.distLibDurationMod.Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("max")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
  
  inline def milliseconds(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("milliseconds")(n.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
  
  inline def min(
    d1: typings.timezonecomplete.distLibDatetimeMod.DateTime,
    d2: typings.timezonecomplete.distLibDatetimeMod.DateTime
  ): typings.timezonecomplete.distLibDatetimeMod.DateTime = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
  inline def min(
    d1: typings.timezonecomplete.distLibDurationMod.Duration,
    d2: typings.timezonecomplete.distLibDurationMod.Duration
  ): typings.timezonecomplete.distLibDurationMod.Duration = (^.asInstanceOf[js.Dynamic].applyDynamic("min")(d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
  
  inline def minutes(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("minutes")(n.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
  
  inline def months(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("months")(n.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
  
  inline def now(): typings.timezonecomplete.distLibDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
  inline def now(timeZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone): typings.timezonecomplete.distLibDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("now")(timeZone.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
  
  inline def nowLocal(): typings.timezonecomplete.distLibDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("nowLocal")().asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
  
  inline def nowUtc(): typings.timezonecomplete.distLibDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("nowUtc")().asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
  
  inline def parse(dateTimeString: String, formatString: String): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  inline def parse(dateTimeString: String, formatString: String, overrideZone: Null, allowTrailing: Boolean): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  inline def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Null,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  inline def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Null,
    allowTrailing: Unit,
    locale: PartialLocale
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  inline def parse(dateTimeString: String, formatString: String, overrideZone: Unit, allowTrailing: Boolean): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  inline def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Unit,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  inline def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: Unit,
    allowTrailing: Unit,
    locale: PartialLocale
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  inline def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  inline def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    allowTrailing: Boolean
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  inline def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    allowTrailing: Boolean,
    locale: PartialLocale
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  inline def parse(
    dateTimeString: String,
    formatString: String,
    overrideZone: typings.timezonecomplete.distLibTimezoneMod.TimeZone,
    allowTrailing: Unit,
    locale: PartialLocale
  ): AwareTimeStruct = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], overrideZone.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[AwareTimeStruct]
  
  inline def parseable(dateTimeString: String, formatString: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parseable")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def parseable(dateTimeString: String, formatString: String, allowTrailing: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parseable")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def parseable(dateTimeString: String, formatString: String, allowTrailing: Boolean, locale: PartialLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parseable")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def parseable(dateTimeString: String, formatString: String, allowTrailing: Unit, locale: PartialLocale): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("parseable")(dateTimeString.asInstanceOf[js.Any], formatString.asInstanceOf[js.Any], allowTrailing.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def periodDstToString(p: PeriodDst): String = ^.asInstanceOf[js.Dynamic].applyDynamic("periodDstToString")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def secondOfDay(hour: Double, minute: Double, second: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("secondOfDay")(hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def seconds(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("seconds")(n.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
  
  inline def stringToTimeUnit(s: String): TimeUnit = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToTimeUnit")(s.asInstanceOf[js.Any]).asInstanceOf[TimeUnit]
  
  inline def timeToUnixNoLeapSecs(components: TimeComponentOpts): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timeToUnixNoLeapSecs")(components.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def timeToUnixNoLeapSecs(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    milli: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("timeToUnixNoLeapSecs")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], hour.asInstanceOf[js.Any], minute.asInstanceOf[js.Any], second.asInstanceOf[js.Any], milli.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def timeUnitToMilliseconds(unit: TimeUnit): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("timeUnitToMilliseconds")(unit.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def timeUnitToString(unit: TimeUnit): String = ^.asInstanceOf[js.Dynamic].applyDynamic("timeUnitToString")(unit.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def timeUnitToString(unit: TimeUnit, amount: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeUnitToString")(unit.asInstanceOf[js.Any], amount.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def timestampOnWeekTimeGreaterThanOrEqualTo(opts: WeekTimeOpts): typings.timezonecomplete.distLibDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampOnWeekTimeGreaterThanOrEqualTo")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
  
  inline def timestampOnWeekTimeLessThan(opts: WeekTimeOpts): typings.timezonecomplete.distLibDatetimeMod.DateTime = ^.asInstanceOf[js.Dynamic].applyDynamic("timestampOnWeekTimeLessThan")(opts.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDatetimeMod.DateTime]
  
  inline def unixToTimeNoLeapSecs(unixMillis: Double): TimeComponents = ^.asInstanceOf[js.Dynamic].applyDynamic("unixToTimeNoLeapSecs")(unixMillis.asInstanceOf[js.Any]).asInstanceOf[TimeComponents]
  
  inline def utc(): typings.timezonecomplete.distLibTimezoneMod.TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[typings.timezonecomplete.distLibTimezoneMod.TimeZone]
  
  inline def weekDayNoLeapSecs(unixMillis: Double): WeekDay = ^.asInstanceOf[js.Dynamic].applyDynamic("weekDayNoLeapSecs")(unixMillis.asInstanceOf[js.Any]).asInstanceOf[WeekDay]
  
  inline def weekDayOnOrAfter(year: Double, month: Double, day: Double, weekDay: WeekDay): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekDayOnOrAfter")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], weekDay.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def weekDayOnOrBefore(year: Double, month: Double, day: Double, weekDay: WeekDay): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekDayOnOrBefore")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any], weekDay.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def weekNumber(year: Double, month: Double, day: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekNumber")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def weekOfMonth(year: Double, month: Double, day: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekOfMonth")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], day.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def years(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("years")(n.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibDurationMod.Duration]
  
  inline def zone(name: String): typings.timezonecomplete.distLibTimezoneMod.TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("zone")(name.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibTimezoneMod.TimeZone]
  inline def zone(name: String, dst: Boolean): typings.timezonecomplete.distLibTimezoneMod.TimeZone = (^.asInstanceOf[js.Dynamic].applyDynamic("zone")(name.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[typings.timezonecomplete.distLibTimezoneMod.TimeZone]
  inline def zone(offset: Double): typings.timezonecomplete.distLibTimezoneMod.TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("zone")(offset.asInstanceOf[js.Any]).asInstanceOf[typings.timezonecomplete.distLibTimezoneMod.TimeZone]
}

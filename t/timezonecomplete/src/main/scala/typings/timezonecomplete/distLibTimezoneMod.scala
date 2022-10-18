package typings.timezonecomplete

import typings.timezonecomplete.distLibBasicsMod.TimeStruct
import typings.timezonecomplete.distLibJavascriptMod.DateFunctions
import typings.timezonecomplete.distLibTzDatabaseMod.NormalizeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibTimezoneMod {
  
  @JSImport("timezonecomplete/dist/lib/timezone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("timezonecomplete/dist/lib/timezone", "TimeZone")
  @js.native
  /**
    * Do not use this constructor, use the static
    * TimeZone.zone() method instead.
    * @param name NORMALIZED name, assumed to be correct
    * @param dst Adhere to Daylight Saving Time if applicable, ignored for local time and fixed offsets
    * @throws timezonecomplete.NotFound.Zone if the given zone name doesn't exist
    * @throws timezonecomplete.InvalidTimeZoneData if the time zone database is invalid
    */
  /* private */ open class TimeZone () extends StObject {
    
    /**
      * Adhere to Daylight Saving Time if applicable
      */
    /* private */ var _dst: Any = js.native
    
    /**
      * The kind of time zone specified by _name
      */
    /* private */ var _kind: Any = js.native
    
    /**
      * Time zone identifier:
      *  "localtime" string for local time
      *  E.g. "-01:30" for a fixed offset from UTC
      *  E.g. "UTC" or "Europe/Amsterdam" for an Olsen TZ database time
      */
    /* private */ var _name: Any = js.native
    
    /**
      * Only for fixed offsets: the offset in minutes
      */
    /* private */ var _offset: Any = js.native
    
    /**
      * Zone abbreviation at given UTC timestamp e.g. CEST for Central European Summer Time.
      *
      * @param utcTime
      * @param dstDependent
      * @throws timezonecomplete.NotFound.Zone if zone name not found or a linked zone not found
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def abbreviationForUtc(utcTime: TimeStruct): String = js.native
    def abbreviationForUtc(utcTime: TimeStruct, dstDependent: Boolean): String = js.native
    /**
      * Zone abbreviation at given UTC timestamp e.g. CEST for Central European Summer Time.
      *
      * @param year Full year
      * @param month Month 1-12 (note this deviates from JavaScript date)
      * @param day Day of month 1-31
      * @param hour Hour 0-23
      * @param minute Minute 0-59
      * @param second Second 0-59
      * @param millisecond Millisecond 0-999
      * @param dstDependent (default true) set to false for a DST-agnostic abbreviation
      *
      * @return "local" for local timezone, the offset for an offset zone, or the abbreviation for a proper zone.
      * @throws timezonecomplete.NotFound.Zone if zone name not found or a linked zone not found
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def abbreviationForUtc(
      year: js.UndefOr[Double],
      month: js.UndefOr[Double],
      day: js.UndefOr[Double],
      hour: js.UndefOr[Double],
      minute: js.UndefOr[Double],
      second: js.UndefOr[Double],
      milli: js.UndefOr[Double],
      dstDependent: js.UndefOr[Boolean]
    ): String = js.native
    
    /**
      * Allow not using instanceof
      */
    var classKind: String = js.native
    
    /**
      * Whether DST is enabled
      * @throws nothing
      */
    def dst(): Boolean = js.native
    
    /**
      * Equality operator. Maps zero offsets and different names for UTC onto
      * each other. Other time zones are not mapped onto each other.
      * @throws timezonecomplete.InvalidTimeZoneData if the global time zone data is invalid
      */
    def equals(other: TimeZone): Boolean = js.native
    
    /**
      * Does this zone have Daylight Saving Time at all?
      * @throws timezonecomplete.InvalidTimeZoneData if the global time zone data is invalid
      */
    def hasDst(): Boolean = js.native
    
    /**
      * Returns true iff the constructor arguments were identical, so UTC !== GMT
      * @throws nothing
      */
    def identical(other: TimeZone): Boolean = js.native
    
    /**
      * Is this zone equivalent to UTC?
      * @throws timezonecomplete.InvalidTimeZoneData if the global time zone data is invalid
      */
    def isUtc(): Boolean = js.native
    
    /**
      * The kind of time zone (Local/Offset/Proper)
      * @throws nothing
      */
    def kind(): TimeZoneKind = js.native
    
    /**
      * The time zone identifier. Can be an offset "-01:30" or an
      * IANA time zone name "Europe/Amsterdam", or "localtime" for
      * the local time zone.
      * @throws nothing
      */
    def name(): String = js.native
    
    /**
      * Normalizes non-existing local times by adding a forward offset change.
      * During a forward standard offset change or DST offset change, some amount of
      * local time is skipped. Therefore, this amount of local time does not exist.
      * This function adds the amount of forward change to any non-existing time. After all,
      * this is probably what the user meant.
      *
      * @param localTime	zone time timestamp
      * @param opt	(optional) Round up or down? Default: up
      *
      * @returns	time struct in zone time, normalized.
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def normalizeZoneTime(localTime: TimeStruct): TimeStruct = js.native
    def normalizeZoneTime(localTime: TimeStruct, opt: NormalizeOption): TimeStruct = js.native
    /**
      * Normalizes non-existing local times by adding a forward offset change.
      * During a forward standard offset change or DST offset change, some amount of
      * local time is skipped. Therefore, this amount of local time does not exist.
      * This function adds the amount of forward change to any non-existing time. After all,
      * this is probably what the user meant.
      *
      * @param localTime	zone time timestamp as unix milliseconds
      * @param opt	(optional) Round up or down? Default: up
      *
      * @returns	unix milliseconds in zone time, normalized.
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def normalizeZoneTime(localUnixMillis: Double): Double = js.native
    def normalizeZoneTime(localUnixMillis: Double, opt: NormalizeOption): Double = js.native
    
    /**
      * Calculate timezone offset including DST from a UTC time.
      * @return the offset of this time zone with respect to UTC at the given time, in minutes.
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def offsetForUtc(offsetForUtc: TimeStruct): Double = js.native
    /**
      * Calculate timezone offset including DST from a UTC time.
      * @param year
      * @param month 1-12
      * @param day
      * @param hour
      * @param minute
      * @param second
      * @param milli
      * @return the offset of this time zone with respect to UTC at the given time, in minutes.
      * @throws timezonecomplete.Argument.Year for invalid year
      * @throws timezonecomplete.Argument.Month for invalid month
      * @throws timezonecomplete.Argument.Day for invalid day
      * @throws timezonecomplete.Argument.Hour for invalid hour
      * @throws timezonecomplete.Argument.Minute for invalid minute
      * @throws timezonecomplete.Argument.Second for invalid second
      * @throws timezonecomplete.Argument.Milli for invalid milliseconds
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def offsetForUtc(
      year: js.UndefOr[Double],
      month: js.UndefOr[Double],
      day: js.UndefOr[Double],
      hour: js.UndefOr[Double],
      minute: js.UndefOr[Double],
      second: js.UndefOr[Double],
      milli: js.UndefOr[Double]
    ): Double = js.native
    
    /**
      * Note: will be removed in version 2.0.0
      *
      * Convenience function, takes values from a Javascript Date
      * Calls offsetForUtc() with the contents of the date
      *
      * @param date: the date
      * @param funcs: the set of functions to use: get() or getUTC()
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def offsetForUtcDate(date: js.Date, funcs: DateFunctions): Double = js.native
    
    /**
      * Calculate timezone offset from a zone-local time (NOT a UTC time).
      * @param localTime the local time
      * @return the offset of this time zone with respect to UTC at the given time, in minutes.
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def offsetForZone(localTime: TimeStruct): Double = js.native
    /**
      * Calculate timezone offset from a zone-local time (NOT a UTC time).
      * @param year local full year
      * @param month local month 1-12 (note this deviates from JavaScript date)
      * @param day local day of month 1-31
      * @param hour local hour 0-23
      * @param minute local minute 0-59
      * @param second local second 0-59
      * @param millisecond local millisecond 0-999
      * @return the offset of this time zone with respect to UTC at the given time, in minutes.
      * @throws timezonecomplete.Argument.Year for invalid year
      * @throws timezonecomplete.Argument.Month for invalid month
      * @throws timezonecomplete.Argument.Day for invalid day
      * @throws timezonecomplete.Argument.Hour for invalid hour
      * @throws timezonecomplete.Argument.Minute for invalid minute
      * @throws timezonecomplete.Argument.Second for invalid second
      * @throws timezonecomplete.Argument.Milli for invalid milliseconds
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def offsetForZone(
      year: js.UndefOr[Double],
      month: js.UndefOr[Double],
      day: js.UndefOr[Double],
      hour: js.UndefOr[Double],
      minute: js.UndefOr[Double],
      second: js.UndefOr[Double],
      milli: js.UndefOr[Double]
    ): Double = js.native
    
    /**
      * Note: will be removed in version 2.0.0
      *
      * Convenience function, takes values from a Javascript Date
      * Calls offsetForUtc() with the contents of the date
      *
      * @param date: the date
      * @param funcs: the set of functions to use: get() or getUTC()
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def offsetForZoneDate(date: js.Date, funcs: DateFunctions): Double = js.native
    
    /**
      * Calculate timezone standard offset excluding DST from a UTC time.
      * @return the standard offset of this time zone with respect to UTC at the given time, in minutes.
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def standardOffsetForUtc(offsetForUtc: TimeStruct): Double = js.native
    /**
      * Calculate timezone standard offset excluding DST from a UTC time.
      * @return the standard offset of this time zone with respect to UTC at the given time, in minutes.
      * @param year
      * @param month 1-12
      * @param day
      * @param hour
      * @param minute
      * @param second
      * @param milli
      * @throws timezonecomplete.Argument.Year for invalid year
      * @throws timezonecomplete.Argument.Month for invalid month
      * @throws timezonecomplete.Argument.Day for invalid day
      * @throws timezonecomplete.Argument.Hour for invalid hour
      * @throws timezonecomplete.Argument.Minute for invalid minute
      * @throws timezonecomplete.Argument.Second for invalid second
      * @throws timezonecomplete.Argument.Milli for invalid milliseconds
      * @throws timezonecomplete.InvalidTimeZoneData if values in the time zone database are invalid
      */
    def standardOffsetForUtc(
      year: js.UndefOr[Double],
      month: js.UndefOr[Double],
      day: js.UndefOr[Double],
      hour: js.UndefOr[Double],
      minute: js.UndefOr[Double],
      second: js.UndefOr[Double],
      milli: js.UndefOr[Double]
    ): Double = js.native
  }
  /* static members */
  object TimeZone {
    
    @JSImport("timezonecomplete/dist/lib/timezone", "TimeZone")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Time zone cache.
      */
    @JSImport("timezonecomplete/dist/lib/timezone", "TimeZone._cache")
    @js.native
    def _cache: Any = js.native
    inline def _cache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_cache")(x.asInstanceOf[js.Any])
    
    /**
      * Find in cache or create zone
      * @param name	Time zone name
      * @param dst	Adhere to Daylight Saving Time?
      * @throws timezonecomplete.NotFound.Zone if the zone doesn't exist in the time zone database
      */
    @JSImport("timezonecomplete/dist/lib/timezone", "TimeZone._findOrCreate")
    @js.native
    def _findOrCreate: Any = js.native
    inline def _findOrCreate_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_findOrCreate")(x.asInstanceOf[js.Any])
    
    /**
      * Returns true iff the first non-whitespace character of s is +, -, or Z
      * @param s
      * @throws nothing
      */
    @JSImport("timezonecomplete/dist/lib/timezone", "TimeZone._isOffsetString")
    @js.native
    def _isOffsetString: Any = js.native
    inline def _isOffsetString_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_isOffsetString")(x.asInstanceOf[js.Any])
    
    /**
      * Normalize a string so it can be used as a key for a cache lookup
      * @throws Argument.S if s is empty
      */
    @JSImport("timezonecomplete/dist/lib/timezone", "TimeZone._normalizeString")
    @js.native
    def _normalizeString: Any = js.native
    inline def _normalizeString_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_normalizeString")(x.asInstanceOf[js.Any])
    
    /**
      * The local time zone for a given date. Note that
      * the time zone varies with the date: amsterdam time for
      * 2014-01-01 is +01:00 and amsterdam time for 2014-07-01 is +02:00
      * @throws nothing
      */
    inline def local(): TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("local")().asInstanceOf[TimeZone]
    
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
    inline def utc(): TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[TimeZone]
    
    /**
      * Time zone with a fixed offset
      * @param offset	offset w.r.t. UTC in minutes, e.g. 90 for +01:30
      * @throws timezonecomplete.Argument.Offset if the offset is not within -24h...+24h (in minutes)
      */
    inline def zone(offset: Double): TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("zone")(offset.asInstanceOf[js.Any]).asInstanceOf[TimeZone]
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
    inline def zone(s: String): TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("zone")(s.asInstanceOf[js.Any]).asInstanceOf[TimeZone]
    inline def zone(s: String, dst: Boolean): TimeZone = (^.asInstanceOf[js.Dynamic].applyDynamic("zone")(s.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[TimeZone]
  }
  
  @js.native
  sealed trait TimeZoneKind extends StObject
  @JSImport("timezonecomplete/dist/lib/timezone", "TimeZoneKind")
  @js.native
  object TimeZoneKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TimeZoneKind & Double] = js.native
    
    /**
      * Local time offset as determined by JavaScript Date class.
      */
    @js.native
    sealed trait Local
      extends StObject
         with TimeZoneKind
    /* 0 */ val Local: typings.timezonecomplete.distLibTimezoneMod.TimeZoneKind.Local & Double = js.native
    
    /**
      * Fixed offset from UTC, without DST.
      */
    @js.native
    sealed trait Offset
      extends StObject
         with TimeZoneKind
    /* 1 */ val Offset: typings.timezonecomplete.distLibTimezoneMod.TimeZoneKind.Offset & Double = js.native
    
    /**
      * IANA timezone managed through Olsen TZ database. Includes
      * DST if applicable.
      */
    @js.native
    sealed trait Proper
      extends StObject
         with TimeZoneKind
    /* 2 */ val Proper: typings.timezonecomplete.distLibTimezoneMod.TimeZoneKind.Proper & Double = js.native
  }
  
  inline def isTimeZone(value: Any): /* is timezonecomplete.timezonecomplete/dist/lib/timezone.TimeZone */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeZone")(value.asInstanceOf[js.Any]).asInstanceOf[/* is timezonecomplete.timezonecomplete/dist/lib/timezone.TimeZone */ Boolean]
  
  inline def local(): TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("local")().asInstanceOf[TimeZone]
  
  inline def utc(): TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("utc")().asInstanceOf[TimeZone]
  
  inline def zone(name: String): TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("zone")(name.asInstanceOf[js.Any]).asInstanceOf[TimeZone]
  inline def zone(name: String, dst: Boolean): TimeZone = (^.asInstanceOf[js.Dynamic].applyDynamic("zone")(name.asInstanceOf[js.Any], dst.asInstanceOf[js.Any])).asInstanceOf[TimeZone]
  inline def zone(offset: Double): TimeZone = ^.asInstanceOf[js.Dynamic].applyDynamic("zone")(offset.asInstanceOf[js.Any]).asInstanceOf[TimeZone]
}

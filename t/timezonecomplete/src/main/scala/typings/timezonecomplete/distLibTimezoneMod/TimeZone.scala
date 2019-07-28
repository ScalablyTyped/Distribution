package typings.timezonecomplete.distLibTimezoneMod

import typings.std.Date
import typings.timezonecomplete.distLibBasicsMod.TimeStruct
import typings.timezonecomplete.distLibJavascriptMod.DateFunctions
import typings.timezonecomplete.distLibTzDashDatabaseMod.NormalizeOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/timezone", "TimeZone")
@js.native
/**
  * Do not use this constructor, use the static
  * TimeZone.zone() method instead.
  * @param name NORMALIZED name, assumed to be correct
  * @param dst	Adhere to Daylight Saving Time if applicable, ignored for local time and fixed offsets
  */
class TimeZone protected () extends js.Object {
  /**
    * Adhere to Daylight Saving Time if applicable
    */
  var _dst: js.Any = js.native
  /**
    * The kind of time zone specified by _name
    */
  var _kind: js.Any = js.native
  /**
    * Time zone identifier:
    *  "localtime" string for local time
    *  E.g. "-01:30" for a fixed offset from UTC
    *  E.g. "UTC" or "Europe/Amsterdam" for an Olsen TZ database time
    */
  var _name: js.Any = js.native
  /**
    * Only for fixed offsets: the offset in minutes
    */
  var _offset: js.Any = js.native
  /**
    * Allow not using instanceof
    */
  var classKind: String = js.native
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
  def dst(): Boolean = js.native
  /**
    * Equality operator. Maps zero offsets and different names for UTC onto
    * each other. Other time zones are not mapped onto each other.
    */
  def equals(other: TimeZone): Boolean = js.native
  /**
    * Does this zone have Daylight Saving Time at all?
    */
  def hasDst(): Boolean = js.native
  /**
    * Returns true iff the constructor arguments were identical, so UTC !== GMT
    */
  def identical(other: TimeZone): Boolean = js.native
  /**
    * Is this zone equivalent to UTC?
    */
  def isUtc(): Boolean = js.native
  /**
    * The kind of time zone (Local/Offset/Proper)
    */
  def kind(): TimeZoneKind = js.native
  /**
    * The time zone identifier. Can be an offset "-01:30" or an
    * IANA time zone name "Europe/Amsterdam", or "localtime" for
    * the local time zone.
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
    */
  def normalizeZoneTime(localUnixMillis: Double): Double = js.native
  def normalizeZoneTime(localUnixMillis: Double, opt: NormalizeOption): Double = js.native
  /**
    * Calculate timezone offset including DST from a UTC time.
    * @return the offset of this time zone with respect to UTC at the given time, in minutes.
    */
  def offsetForUtc(offsetForUtc: TimeStruct): Double = js.native
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
    */
  def offsetForUtcDate(date: Date, funcs: DateFunctions): Double = js.native
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
    */
  def offsetForZone(localTime: TimeStruct): Double = js.native
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
    */
  def offsetForZoneDate(date: Date, funcs: DateFunctions): Double = js.native
  /**
    * Calculate timezone standard offset excluding DST from a UTC time.
    * @return the standard offset of this time zone with respect to UTC at the given time, in minutes.
    */
  def standardOffsetForUtc(offsetForUtc: TimeStruct): Double = js.native
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
@JSImport("timezonecomplete/dist/lib/timezone", "TimeZone")
@js.native
object TimeZone extends js.Object {
  /**
    * Time zone cache.
    */
  var _cache: js.Any = js.native
  /**
    * Find in cache or create zone
    * @param name	Time zone name
    * @param dst	Adhere to Daylight Saving Time?
    */
  var _findOrCreate: js.Any = js.native
  var _isOffsetString: js.Any = js.native
  /**
    * Normalize a string so it can be used as a key for a
    * cache lookup
    */
  var _normalizeString: js.Any = js.native
  /**
    * The local time zone for a given date. Note that
    * the time zone varies with the date: amsterdam time for
    * 2014-01-01 is +01:00 and amsterdam time for 2014-07-01 is +02:00
    */
  def local(): TimeZone = js.native
  /**
    * Convert an offset number into an offset string
    * @param offset The offset in minutes from UTC e.g. 90 minutes
    * @return the offset in ISO notation "+01:30" for +90 minutes
    */
  def offsetToString(offset: Double): String = js.native
  /**
    * String to offset conversion.
    * @param s	Formats: "-01:00", "-0100", "-01", "Z"
    * @return offset w.r.t. UTC in minutes
    */
  def stringToOffset(s: String): Double = js.native
  /**
    * The UTC time zone.
    */
  def utc(): TimeZone = js.native
  /**
    * Time zone with a fixed offset
    * @param offset	offset w.r.t. UTC in minutes, e.g. 90 for +01:30
    */
  def zone(offset: Double): TimeZone = js.native
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
    */
  def zone(s: String): TimeZone = js.native
  def zone(s: String, dst: Boolean): TimeZone = js.native
}


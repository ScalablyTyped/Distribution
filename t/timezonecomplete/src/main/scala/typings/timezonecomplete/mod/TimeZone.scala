package typings.timezonecomplete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
class TimeZone protected ()
  extends typings.timezonecomplete.timezoneMod.TimeZone

/* static members */
@JSImport("timezonecomplete", "TimeZone")
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
    * @throws timezonecomplete.NotFound.Zone if the zone doesn't exist in the time zone database
    */
  var _findOrCreate: js.Any = js.native
  /**
    * Returns true iff the first non-whitespace character of s is +, -, or Z
    * @param s
    * @throws nothing
    */
  var _isOffsetString: js.Any = js.native
  /**
    * Normalize a string so it can be used as a key for a cache lookup
    * @throws Argument.S if s is empty
    */
  var _normalizeString: js.Any = js.native
  /**
    * The local time zone for a given date. Note that
    * the time zone varies with the date: amsterdam time for
    * 2014-01-01 is +01:00 and amsterdam time for 2014-07-01 is +02:00
    * @throws nothing
    */
  def local(): typings.timezonecomplete.timezoneMod.TimeZone = js.native
  /**
    * Convert an offset number into an offset string
    * @param offset The offset in minutes from UTC e.g. 90 minutes
    * @return the offset in ISO notation "+01:30" for +90 minutes
    * @throws Argument.Offset if offset is not a finite number or not within -24 * 60 ... +24 * 60 minutes
    */
  def offsetToString(offset: Double): String = js.native
  /**
    * String to offset conversion.
    * @param s	Formats: "-01:00", "-0100", "-01", "Z"
    * @return offset w.r.t. UTC in minutes
    * @throws timezonecomplete.Argument.S if s cannot be parsed
    */
  def stringToOffset(s: String): Double = js.native
  /**
    * The UTC time zone.
    * @throws timezonecomplete.NotFound.Zone if the UTC time zone doesn't exist in the time zone database
    */
  def utc(): typings.timezonecomplete.timezoneMod.TimeZone = js.native
  /**
    * Time zone with a fixed offset
    * @param offset	offset w.r.t. UTC in minutes, e.g. 90 for +01:30
    * @throws timezonecomplete.Argument.Offset if the offset is not within -24h...+24h (in minutes)
    */
  def zone(offset: Double): typings.timezonecomplete.timezoneMod.TimeZone = js.native
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
  def zone(s: String): typings.timezonecomplete.timezoneMod.TimeZone = js.native
  def zone(s: String, dst: Boolean): typings.timezonecomplete.timezoneMod.TimeZone = js.native
}


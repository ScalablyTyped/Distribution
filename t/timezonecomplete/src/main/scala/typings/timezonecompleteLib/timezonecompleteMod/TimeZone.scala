package typings
package timezonecompleteLib.timezonecompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "TimeZone")
@js.native
/**
  * Do not use this constructor, use the static
  * TimeZone.zone() method instead.
  * @param name NORMALIZED name, assumed to be correct
  * @param dst	Adhere to Daylight Saving Time if applicable, ignored for local time and fixed offsets
  */
class TimeZone protected ()
  extends timezonecompleteLib.distLibTimezoneMod.TimeZone

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
  def local(): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
  /**
    * Convert an offset number into an offset string
    * @param offset The offset in minutes from UTC e.g. 90 minutes
    * @return the offset in ISO notation "+01:30" for +90 minutes
    */
  def offsetToString(offset: scala.Double): java.lang.String = js.native
  /**
    * String to offset conversion.
    * @param s	Formats: "-01:00", "-0100", "-01", "Z"
    * @return offset w.r.t. UTC in minutes
    */
  def stringToOffset(s: java.lang.String): scala.Double = js.native
  /**
    * The UTC time zone.
    */
  def utc(): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
  /**
    * Time zone with a fixed offset
    * @param offset	offset w.r.t. UTC in minutes, e.g. 90 for +01:30
    */
  def zone(offset: scala.Double): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
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
  def zone(s: java.lang.String): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
  def zone(s: java.lang.String, dst: scala.Boolean): timezonecompleteLib.distLibTimezoneMod.TimeZone = js.native
}


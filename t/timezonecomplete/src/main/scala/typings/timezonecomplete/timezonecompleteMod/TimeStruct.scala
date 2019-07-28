package typings.timezonecomplete.timezonecompleteMod

import typings.std.Date
import typings.timezonecomplete.distLibBasicsMod.TimeComponentOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "TimeStruct")
@js.native
class TimeStruct protected ()
  extends typings.timezonecomplete.distLibBasicsMod.TimeStruct {
  /**
    * Constructor
    *
    * @param components Separate timestamp components (year, month, ...)
    */
  def this(components: TimeComponentOpts) = this()
  /**
    * Constructor
    *
    * @param unixMillis milliseconds since 1-1-1970
    */
  def this(unixMillis: Double) = this()
}

/* static members */
@JSImport("timezonecomplete", "TimeStruct")
@js.native
object TimeStruct extends js.Object {
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
    */
  def fromComponents(
    year: js.UndefOr[Double],
    month: js.UndefOr[Double],
    day: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    milli: js.UndefOr[Double]
  ): typings.timezonecomplete.distLibBasicsMod.TimeStruct = js.native
  /**
    * Create a TimeStruct from a JavaScript date
    *
    * @param d	The date
    * @param df	Which functions to take (getX() or getUTCX())
    */
  def fromDate(d: Date, df: typings.timezonecomplete.distLibJavascriptMod.DateFunctions): typings.timezonecomplete.distLibBasicsMod.TimeStruct = js.native
  /**
    * Returns a TimeStruct from an ISO 8601 string WITHOUT time zone
    */
  def fromString(s: String): typings.timezonecomplete.distLibBasicsMod.TimeStruct = js.native
  /**
    * Create a TimeStruct from a number of unix milliseconds
    * (backward compatibility)
    */
  def fromUnix(unixMillis: Double): typings.timezonecomplete.distLibBasicsMod.TimeStruct = js.native
}


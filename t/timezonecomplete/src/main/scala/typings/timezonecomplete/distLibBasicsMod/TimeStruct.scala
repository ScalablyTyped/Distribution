package typings.timezonecomplete.distLibBasicsMod

import typings.std.Date
import typings.timezonecomplete.distLibJavascriptMod.DateFunctions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/basics", "TimeStruct")
@js.native
class TimeStruct protected () extends js.Object {
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
  /**
    * The time value in separate year/month/... components
    */
  var _components: js.Any = js.native
  /**
    * The time value in unix milliseconds
    */
  var _unixMillis: js.Any = js.native
  val components: TimeComponents = js.native
  val day: Double = js.native
  val hour: Double = js.native
  val milli: Double = js.native
  val minute: Double = js.native
  val month: Double = js.native
  val second: Double = js.native
  val unixMillis: Double = js.native
  val year: Double = js.native
  def equals(other: TimeStruct): Boolean = js.native
  /**
    * Validate a timestamp. Filters out non-existing values for all time components
    * @returns true iff the timestamp is valid
    */
  def validate(): Boolean = js.native
  /**
    * The day-of-year 0-365
    */
  def yearDay(): Double = js.native
}

/* static members */
@JSImport("timezonecomplete/dist/lib/basics", "TimeStruct")
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
  ): TimeStruct = js.native
  /**
    * Create a TimeStruct from a JavaScript date
    *
    * @param d	The date
    * @param df	Which functions to take (getX() or getUTCX())
    */
  def fromDate(d: Date, df: DateFunctions): TimeStruct = js.native
  /**
    * Returns a TimeStruct from an ISO 8601 string WITHOUT time zone
    */
  def fromString(s: String): TimeStruct = js.native
  /**
    * Create a TimeStruct from a number of unix milliseconds
    * (backward compatibility)
    */
  def fromUnix(unixMillis: Double): TimeStruct = js.native
}


package typings
package timezonecompleteLib.distLibBasicsMod

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
  def this(unixMillis: scala.Double) = this()
  /**
       * The time value in separate year/month/... components
       */
  var _components: js.Any = js.native
  /**
       * The time value in unix milliseconds
       */
  var _unixMillis: js.Any = js.native
  val components: TimeComponents = js.native
  val day: scala.Double = js.native
  val hour: scala.Double = js.native
  val milli: scala.Double = js.native
  val minute: scala.Double = js.native
  val month: scala.Double = js.native
  val second: scala.Double = js.native
  val unixMillis: scala.Double = js.native
  val year: scala.Double = js.native
  def equals(other: TimeStruct): scala.Boolean = js.native
  /**
       * Validate a timestamp. Filters out non-existing values for all time components
       * @returns true iff the timestamp is valid
       */
  def validate(): scala.Boolean = js.native
  /**
       * The day-of-year 0-365
       */
  def yearDay(): scala.Double = js.native
}

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
    year: js.UndefOr[scala.Double],
    month: js.UndefOr[scala.Double],
    day: js.UndefOr[scala.Double],
    hour: js.UndefOr[scala.Double],
    minute: js.UndefOr[scala.Double],
    second: js.UndefOr[scala.Double],
    milli: js.UndefOr[scala.Double]
  ): timezonecompleteLib.distLibBasicsMod.TimeStruct = js.native
  /**
       * Create a TimeStruct from a JavaScript date
       *
       * @param d	The date
       * @param df	Which functions to take (getX() or getUTCX())
       */
  def fromDate(d: stdLib.Date, df: timezonecompleteLib.distLibJavascriptMod.DateFunctions): timezonecompleteLib.distLibBasicsMod.TimeStruct = js.native
  /**
       * Returns a TimeStruct from an ISO 8601 string WITHOUT time zone
       */
  def fromString(s: java.lang.String): timezonecompleteLib.distLibBasicsMod.TimeStruct = js.native
  /**
       * Create a TimeStruct from a number of unix milliseconds
       * (backward compatibility)
       */
  def fromUnix(unixMillis: scala.Double): timezonecompleteLib.distLibBasicsMod.TimeStruct = js.native
}


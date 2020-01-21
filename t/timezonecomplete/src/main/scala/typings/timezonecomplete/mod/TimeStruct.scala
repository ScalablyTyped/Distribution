package typings.timezonecomplete.mod

import typings.std.Date
import typings.timezonecomplete.basicsMod.TimeComponentOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "TimeStruct")
@js.native
class TimeStruct protected ()
  extends typings.timezonecomplete.basicsMod.TimeStruct {
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
    * @throws timezonecomplete.Argument.Year for invalid year
    * @throws timezonecomplete.Argument.Month for invalid month
    * @throws timezonecomplete.Argument.Day for invalid day of month
    * @throws timezonecomplete.Argument.Hour for invalid hour
    * @throws timezonecomplete.Argument.Minute for invalid minute
    * @throws timezonecomplete.Argument.Second for invalid second
    * @throws timezonecomplete.Argument.Milli for invalid milliseconds
    */
  def fromComponents(
    year: js.UndefOr[Double],
    month: js.UndefOr[Double],
    day: js.UndefOr[Double],
    hour: js.UndefOr[Double],
    minute: js.UndefOr[Double],
    second: js.UndefOr[Double],
    milli: js.UndefOr[Double]
  ): typings.timezonecomplete.basicsMod.TimeStruct = js.native
  /**
    * Create a TimeStruct from a JavaScript date
    *
    * @param d	The date
    * @param df Which functions to take (getX() or getUTCX())
    * @throws nothing
    */
  def fromDate(d: Date, df: typings.timezonecomplete.javascriptMod.DateFunctions): typings.timezonecomplete.basicsMod.TimeStruct = js.native
  /**
    * Returns a TimeStruct from an ISO 8601 string WITHOUT time zone
    * @throws timezonecomplete.Argument.S if `s` is not a proper iso string
    */
  def fromString(s: String): typings.timezonecomplete.basicsMod.TimeStruct = js.native
  /**
    * Create a TimeStruct from a number of unix milliseconds
    * (backward compatibility)
    * @throws timezonecomplete.Argument.UnixMillis for non-integer milliseconds
    */
  def fromUnix(unixMillis: Double): typings.timezonecomplete.basicsMod.TimeStruct = js.native
}


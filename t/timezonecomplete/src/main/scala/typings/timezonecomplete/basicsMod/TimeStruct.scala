package typings.timezonecomplete.basicsMod

import typings.std.Date
import typings.timezonecomplete.javascriptMod.DateFunctions
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
  /**
    * The time value in separate year/month/... components
    */
  var _components: js.Any = js.native
  /**
    * The time value in unix milliseconds
    */
  var _unixMillis: js.Any = js.native
  def components(): TimeComponents = js.native
  def day(): Double = js.native
  /**
    * Equality function
    * @param other
    * @throws TypeError if other is not an Object
    */
  def equals(other: TimeStruct): Boolean = js.native
  def hour(): Double = js.native
  def milli(): Double = js.native
  def minute(): Double = js.native
  def month(): Double = js.native
  def second(): Double = js.native
  def unixMillis(): Double = js.native
  /**
    * Validate a timestamp. Filters out non-existing values for all time components
    * @returns true iff the timestamp is valid
    * @throws nothing
    */
  def validate(): Boolean = js.native
  def year(): Double = js.native
  /**
    * The day-of-year 0-365
    * @throws nothing
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
  ): TimeStruct = js.native
  /**
    * Create a TimeStruct from a JavaScript date
    *
    * @param d	The date
    * @param df Which functions to take (getX() or getUTCX())
    * @throws nothing
    */
  def fromDate(d: Date, df: DateFunctions): TimeStruct = js.native
  /**
    * Returns a TimeStruct from an ISO 8601 string WITHOUT time zone
    * @throws timezonecomplete.Argument.S if `s` is not a proper iso string
    */
  def fromString(s: String): TimeStruct = js.native
  /**
    * Create a TimeStruct from a number of unix milliseconds
    * (backward compatibility)
    * @throws timezonecomplete.Argument.UnixMillis for non-integer milliseconds
    */
  def fromUnix(unixMillis: Double): TimeStruct = js.native
}


package typings.timezonecomplete.timezonecompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "Duration")
@js.native
/**
  * Construct a time duration of 0
  */
class Duration ()
  extends typings.timezonecomplete.distLibDurationMod.Duration {
  /**
    * Construct a duration from an amount and a time unit.
    * @param amount	Number of units
    * @param unit	A time unit i.e. TimeUnit.Second, TimeUnit.Hour etc. Default Millisecond.
    */
  def this(amount: Double) = this()
  /**
    * Construct a time duration from a string in one of two formats:
    * 1) [-]hhhh[:mm[:ss[.nnn]]] e.g. '-01:00:30.501'
    * 2) amount and unit e.g. '-1 days' or '1 year'. The unit may be in singular or plural form and is case-insensitive
    */
  def this(input: String) = this()
  def this(amount: Double, unit: typings.timezonecomplete.distLibBasicsMod.TimeUnit) = this()
}

/* static members */
@JSImport("timezonecomplete", "Duration")
@js.native
object Duration extends js.Object {
  /**
    * Construct a time duration
    * @param n	Number of days (may be fractional or negative)
    * @return A duration of n days
    */
  def days(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  /**
    * Construct a time duration
    * @param n	Number of hours (may be fractional or negative)
    * @return A duration of n hours
    */
  def hours(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  /**
    * Construct a time duration
    * @param n	Number of milliseconds (may be fractional or negative)
    * @return A duration of n milliseconds
    */
  def milliseconds(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  /**
    * Construct a time duration
    * @param n	Number of minutes (may be fractional or negative)
    * @return A duration of n minutes
    */
  def minutes(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  /**
    * Construct a time duration
    * @param n	Number of months (may be fractional or negative)
    * @return A duration of n months
    */
  def months(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  /**
    * Construct a time duration
    * @param n	Number of seconds (may be fractional or negative)
    * @return A duration of n seconds
    */
  def seconds(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  /**
    * Construct a time duration
    * @param n	Number of years (may be fractional or negative)
    * @return A duration of n years
    */
  def years(n: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
}


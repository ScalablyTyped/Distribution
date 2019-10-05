package typings.timezonecomplete.timezonecompleteMod

import typings.timezonecomplete.distLibBasicsMod.TimeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete", "Duration")
@js.native
/**
  * Construct a time duration of 0 milliseconds
  * @throws nothing
  */
class Duration ()
  extends typings.timezonecomplete.distLibDurationMod.Duration {
  /**
    * Construct a duration from an amount and a time unit.
    * @param amount	Number of units
    * @param unit	A time unit i.e. TimeUnit.Second, TimeUnit.Hour etc. Default Millisecond.
    * @throws timezonecomplete.Argument.Amount if `amount` is not a finite number
    * @throws timezonecomplete.Argument.Unit for invalid `unit`
    */
  def this(amount: Double) = this()
  /**
    * Construct a time duration from a string in one of two formats:
    * 1) [-]hhhh[:mm[:ss[.nnn]]] e.g. '-01:00:30.501'
    * 2) amount and unit e.g. '-1 days' or '1 year'. The unit may be in singular or plural form and is case-insensitive
    * @throws timezonecomplete.Argument.S for invalid string
    */
  def this(s: String) = this()
  def this(amount: Double, unit: TimeUnit) = this()
}

/* static members */
@JSImport("timezonecomplete", "Duration")
@js.native
object Duration extends js.Object {
  /**
    * Construct a time duration
    * @param amount Number of days (may be fractional or negative)
    * @return A duration of n days
    * @throws timezonecomplete.Argument.Amount if n is not a finite number
    */
  def days(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  /**
    * Construct a time duration
    * @param amount Number of hours (may be fractional or negative)
    * @return A duration of n hours
    * @throws timezonecomplete.Argument.Amount if n is not a finite number
    */
  def hours(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  /**
    * Construct a time duration
    * @param amount Number of milliseconds (may be fractional or negative)
    * @return A duration of n milliseconds
    * @throws timezonecomplete.Argument.Amount if n is not a finite number
    */
  def milliseconds(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  /**
    * Construct a time duration
    * @param amount Number of minutes (may be fractional or negative)
    * @return A duration of n minutes
    * @throws timezonecomplete.Argument.Amount if n is not a finite number
    */
  def minutes(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  /**
    * Construct a time duration
    * @param amount Number of months (may be fractional or negative)
    * @return A duration of n months
    * @throws timezonecomplete.Argument.Amount if n is not a finite number
    */
  def months(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  /**
    * Construct a time duration
    * @param amount Number of seconds (may be fractional or negative)
    * @return A duration of n seconds
    * @throws timezonecomplete.Argument.Amount if n is not a finite number
    */
  def seconds(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
  /**
    * Construct a time duration
    * @param amount Number of years (may be fractional or negative)
    * @return A duration of n years
    * @throws timezonecomplete.Argument.Amount if n is not a finite number
    */
  def years(amount: Double): typings.timezonecomplete.distLibDurationMod.Duration = js.native
}


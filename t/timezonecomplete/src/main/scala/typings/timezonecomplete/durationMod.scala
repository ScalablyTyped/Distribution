package typings.timezonecomplete

import typings.timezonecomplete.basicsMod.TimeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/duration", JSImport.Namespace)
@js.native
object durationMod extends js.Object {
  @js.native
  /**
    * Construct a time duration of 0 milliseconds
    * @throws nothing
    */
  class Duration () extends js.Object {
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
    /**
      * Given amount in constructor
      */
    var _amount: js.Any = js.native
    /**
      * Return this % unit, always positive
      * @throws nothing
      */
    var _part: js.Any = js.native
    /**
      * Unit
      */
    var _unit: js.Any = js.native
    /**
      * Allow not using instanceof
      */
    var kind: String = js.native
    /**
      * Return the absolute value of the duration i.e. remove the sign.
      * @throws nothing
      */
    def abs(): Duration = js.native
    /**
      * Add a duration.
      * @return a new Duration of (this + value) with the unit of this duration
      * @throws nothing
      */
    def add(value: Duration): Duration = js.native
    /**
      * Amount of units (positive or negative, fractional)
      * @throws nothing
      */
    def amount(): Double = js.native
    /**
      * Returns this duration expressed in different unit (positive or negative, fractional).
      * This is precise for Year <-> Month and for time-to-time conversion (i.e. Hour-or-less to Hour-or-less).
      * It is approximate for any other conversion
      * @throws nothing
      */
    def as(unit: TimeUnit): Double = js.native
    /**
      * Convert this duration to a Duration in another unit. You always get a clone even if you specify
      * the same unit.
      * This is precise for Year <-> Month and for time-to-time conversion (i.e. Hour-or-less to Hour-or-less).
      * It is approximate for any other conversion
      * @throws nothing
      */
    def convert(unit: TimeUnit): Duration = js.native
    /**
      * The day part of a duration. This assumes that a month has 30 days.
      * @throws nothing
      */
    def day(): Double = js.native
    /**
      * The entire duration in days (negative or positive, fractional)
      * This is approximate if this duration is not in days!
      * @throws nothing
      */
    def days(): Double = js.native
    /**
      * Divide by a unitless number. The result is a Duration, e.g. 1 year / 2 = 0.5 year
      * The result is approximate if this duration as a unit that cannot be converted to a number (e.g. 1 month has variable length)
      * @return a new Duration of (this / value)
      * @throws timezonecomplete.Argument.Value if value is 0 or non-finite
      */
    def divide(value: Double): Duration = js.native
    /**
      * Divide this Duration by a Duration. The result is a unitless number e.g. 1 year / 1 month = 12
      * The result is approximate if this duration as a unit that cannot be converted to a number (e.g. 1 month has variable length)
      * @return a new Duration of (this / value)
      * @throws timezonecomplete.Argument.Value if the duration is 0
      */
    def divide(value: Duration): Double = js.native
    /**
      * Similar but not identical
      * Approximate if the durations have units that cannot be converted
      * @return True iff this and other represent the same time duration
      * @throws nothing
      */
    def equals(other: Duration): Boolean = js.native
    /**
      * Similar but not identical
      * Returns false if we cannot determine whether they are equal in all time zones
      * so e.g. 60 minutes equals 1 hour, but 24 hours do NOT equal 1 day
      *
      * @return True iff this and other represent the same time duration
      * @throws nothing
      */
    def equalsExact(other: Duration): Boolean = js.native
    /**
      * Approximate if the durations have units that cannot be converted
      * @return True iff this >= other
      * @throws nothing
      */
    def greaterEqual(other: Duration): Boolean = js.native
    /**
      * Approximate if the durations have units that cannot be converted
      * @return True iff this > other
      * @throws nothing
      */
    def greaterThan(other: Duration): Boolean = js.native
    /**
      * The hour part of a duration. This assumes that a day has 24 hours (which is not the case
      * during DST changes).
      * @throws nothing
      */
    def hour(): Double = js.native
    /**
      * The entire duration in hours (negative or positive, fractional)
      * For Day/Month/Year durations, this is approximate!
      * @return e.g. 1.5 for a 5400000 milliseconds duration
      * @throws nothing
      */
    def hours(): Double = js.native
    /**
      * Same unit and same amount
      * @throws nothing
      */
    def identical(other: Duration): Boolean = js.native
    /**
      * Approximate if the durations have units that cannot be converted
      * @return True iff (this <= other)
      * @throws nothing
      */
    def lessEqual(other: Duration): Boolean = js.native
    /**
      * Approximate if the durations have units that cannot be converted
      * @return True iff (this < other)
      * @throws nothing
      */
    def lessThan(other: Duration): Boolean = js.native
    /**
      * Approximate if the durations have units that cannot be converted
      * @return The maximum (most positive) of this and other
      * @throws nothing
      */
    def max(other: Duration): Duration = js.native
    /**
      * The millisecond part of the duration (always positive)
      * For Day/Month/Year durations, this is approximate!
      * @return e.g. 400 for a -01:02:03.400 duration
      * @throws nothing
      */
    def millisecond(): Double = js.native
    /**
      * The entire duration in milliseconds (negative or positive)
      * For Day/Month/Year durations, this is approximate!
      * @throws nothing
      */
    def milliseconds(): Double = js.native
    /**
      * Approximate if the durations have units that cannot be converted
      * @return The minimum (most negative) of this and other
      * @throws nothing
      */
    def min(other: Duration): Duration = js.native
    /**
      * The minute part of the duration (always positive)
      * For Day/Month/Year durations, this is approximate!
      * @return e.g. 2 for a -01:02:03.400 duration
      * @throws nothing
      */
    def minute(): Double = js.native
    /**
      * The entire duration in minutes (negative or positive, fractional)
      * For Day/Month/Year durations, this is approximate!
      * @return e.g. 1.5 for a 90000 milliseconds duration
      * @throws nothing
      */
    def minutes(): Double = js.native
    /**
      * The month part of a duration.
      * @throws nothing
      */
    def month(): Double = js.native
    /**
      * The entire duration in days (negative or positive, fractional)
      * This is approximate if this duration is not in Months or Years!
      * @throws nothing
      */
    def months(): Double = js.native
    /**
      * Multiply with a fixed number.
      * Approximate if the durations have units that cannot be converted
      * @return a new Duration of (this * value)
      * @throws nothing
      */
    def multiply(value: Double): Duration = js.native
    /**
      * The second part of the duration (always positive)
      * For Day/Month/Year durations, this is approximate!
      * @return e.g. 3 for a -01:02:03.400 duration
      * @throws nothing
      */
    def second(): Double = js.native
    /**
      * The entire duration in seconds (negative or positive, fractional)
      * For Day/Month/Year durations, this is approximate!
      * @return e.g. 1.5 for a 1500 milliseconds duration
      * @throws nothing
      */
    def seconds(): Double = js.native
    /**
      * Sign
      * @return "-" if the duration is negative
      * @throws nothing
      */
    def sign(): String = js.native
    /**
      * Subtract a duration.
      * @return a new Duration of (this - value) with the unit of this duration
      * @throws nothing
      */
    def sub(value: Duration): Duration = js.native
    /**
      * String in [-]hhhh:mm:ss.nnn notation. All fields are always present except the sign.
      * @throws nothing
      */
    def toFullString(): String = js.native
    /**
      * String in [-]hhhh:mm[:ss[.nnn]] notation.
      * @param full If true, then all fields are always present except the sign. Otherwise, seconds and milliseconds
      * are chopped off if zero
      * @throws nothing
      */
    def toHmsString(): String = js.native
    def toHmsString(full: Boolean): String = js.native
    /**
      * String in ISO 8601 notation e.g. 'P1M' for one month or 'PT1M' for one minute
      * @throws nothing
      */
    def toIsoString(): String = js.native
    /**
      * The unit this duration was created with
      * @throws nothing
      */
    def unit(): TimeUnit = js.native
    /**
      * The hour part of the duration (always positive).
      * Note that this part can exceed 23 hours, because for
      * now, we do not have a days() function
      * For Day/Month/Year durations, this is approximate!
      * @return e.g. 25 for a -25:02:03.400 duration
      * @throws nothing
      */
    def wholeHours(): Double = js.native
    /**
      * Non-fractional positive years
      * @throws nothing
      */
    def wholeYears(): Double = js.native
    /**
      * The entire duration in years (negative or positive, fractional)
      * This is approximate if this duration is not in Months or Years!
      * @throws nothing
      */
    def years(): Double = js.native
  }
  
  def days(n: Double): Duration = js.native
  def hours(n: Double): Duration = js.native
  def isDuration(value: js.Any): /* is timezonecomplete.timezonecomplete/dist/lib/duration.Duration */ Boolean = js.native
  def milliseconds(n: Double): Duration = js.native
  def minutes(n: Double): Duration = js.native
  def months(n: Double): Duration = js.native
  def seconds(n: Double): Duration = js.native
  def years(n: Double): Duration = js.native
  /* static members */
  @js.native
  object Duration extends js.Object {
    /**
      * Construct a time duration
      * @param amount Number of days (may be fractional or negative)
      * @return A duration of n days
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    def days(amount: Double): Duration = js.native
    /**
      * Construct a time duration
      * @param amount Number of hours (may be fractional or negative)
      * @return A duration of n hours
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    def hours(amount: Double): Duration = js.native
    /**
      * Construct a time duration
      * @param amount Number of milliseconds (may be fractional or negative)
      * @return A duration of n milliseconds
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    def milliseconds(amount: Double): Duration = js.native
    /**
      * Construct a time duration
      * @param amount Number of minutes (may be fractional or negative)
      * @return A duration of n minutes
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    def minutes(amount: Double): Duration = js.native
    /**
      * Construct a time duration
      * @param amount Number of months (may be fractional or negative)
      * @return A duration of n months
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    def months(amount: Double): Duration = js.native
    /**
      * Construct a time duration
      * @param amount Number of seconds (may be fractional or negative)
      * @return A duration of n seconds
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    def seconds(amount: Double): Duration = js.native
    /**
      * Construct a time duration
      * @param amount Number of years (may be fractional or negative)
      * @return A duration of n years
      * @throws timezonecomplete.Argument.Amount if n is not a finite number
      */
    def years(amount: Double): Duration = js.native
  }
  
}


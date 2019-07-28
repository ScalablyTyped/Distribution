package typings.timezonecomplete.distLibDurationMod

import typings.timezonecomplete.distLibBasicsMod.TimeUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/duration", "Duration")
@js.native
/**
  * Construct a time duration of 0
  */
class Duration () extends js.Object {
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
  def this(amount: Double, unit: TimeUnit) = this()
  /**
    * Given amount in constructor
    */
  var _amount: js.Any = js.native
  var _fromString: js.Any = js.native
  /**
    * Return this % unit, always positive
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
    */
  def abs(): Duration = js.native
  /**
    * Add a duration.
    * @return a new Duration of (this + value) with the unit of this duration
    */
  def add(value: Duration): Duration = js.native
  /**
    * Amount of units (positive or negative, fractional)
    */
  def amount(): Double = js.native
  /**
    * Returns this duration expressed in different unit (positive or negative, fractional).
    * This is precise for Year <-> Month and for time-to-time conversion (i.e. Hour-or-less to Hour-or-less).
    * It is approximate for any other conversion
    */
  def as(unit: TimeUnit): Double = js.native
  /**
    * Convert this duration to a Duration in another unit. You always get a clone even if you specify
    * the same unit.
    * This is precise for Year <-> Month and for time-to-time conversion (i.e. Hour-or-less to Hour-or-less).
    * It is approximate for any other conversion
    */
  def convert(unit: TimeUnit): Duration = js.native
  /**
    * The day part of a duration. This assumes that a month has 30 days.
    */
  def day(): Double = js.native
  /**
    * The entire duration in days (negative or positive, fractional)
    * This is approximate if this duration is not in days!
    */
  def days(): Double = js.native
  /**
    * Divide by a unitless number. The result is a Duration, e.g. 1 year / 2 = 0.5 year
    * The result is approximate if this duration as a unit that cannot be converted to a number (e.g. 1 month has variable length)
    * @return a new Duration of (this / value)
    */
  def divide(value: Double): Duration = js.native
  /**
    * Divide this Duration by a Duration. The result is a unitless number e.g. 1 year / 1 month = 12
    * The result is approximate if this duration as a unit that cannot be converted to a number (e.g. 1 month has variable length)
    * @return a new Duration of (this / value)
    */
  def divide(value: Duration): Double = js.native
  /**
    * Similar but not identical
    * Approximate if the durations have units that cannot be converted
    * @return True iff this and other represent the same time duration
    */
  def equals(other: Duration): Boolean = js.native
  /**
    * Similar but not identical
    * Returns false if we cannot determine whether they are equal in all time zones
    * so e.g. 60 minutes equals 1 hour, but 24 hours do NOT equal 1 day
    *
    * @return True iff this and other represent the same time duration
    */
  def equalsExact(other: Duration): Boolean = js.native
  /**
    * Approximate if the durations have units that cannot be converted
    * @return True iff this >= other
    */
  def greaterEqual(other: Duration): Boolean = js.native
  /**
    * Approximate if the durations have units that cannot be converted
    * @return True iff this > other
    */
  def greaterThan(other: Duration): Boolean = js.native
  /**
    * The hour part of a duration. This assumes that a day has 24 hours (which is not the case
    * during DST changes).
    */
  def hour(): Double = js.native
  /**
    * The entire duration in hours (negative or positive, fractional)
    * For Day/Month/Year durations, this is approximate!
    * @return e.g. 1.5 for a 5400000 milliseconds duration
    */
  def hours(): Double = js.native
  /**
    * Same unit and same amount
    */
  def identical(other: Duration): Boolean = js.native
  /**
    * Approximate if the durations have units that cannot be converted
    * @return True iff (this <= other)
    */
  def lessEqual(other: Duration): Boolean = js.native
  /**
    * Approximate if the durations have units that cannot be converted
    * @return True iff (this < other)
    */
  def lessThan(other: Duration): Boolean = js.native
  /**
    * Approximate if the durations have units that cannot be converted
    * @return The maximum (most positive) of this and other
    */
  def max(other: Duration): Duration = js.native
  /**
    * The millisecond part of the duration (always positive)
    * For Day/Month/Year durations, this is approximate!
    * @return e.g. 400 for a -01:02:03.400 duration
    */
  def millisecond(): Double = js.native
  /**
    * The entire duration in milliseconds (negative or positive)
    * For Day/Month/Year durations, this is approximate!
    */
  def milliseconds(): Double = js.native
  /**
    * Approximate if the durations have units that cannot be converted
    * @return The minimum (most negative) of this and other
    */
  def min(other: Duration): Duration = js.native
  /**
    * The minute part of the duration (always positive)
    * For Day/Month/Year durations, this is approximate!
    * @return e.g. 2 for a -01:02:03.400 duration
    */
  def minute(): Double = js.native
  /**
    * The entire duration in minutes (negative or positive, fractional)
    * For Day/Month/Year durations, this is approximate!
    * @return e.g. 1.5 for a 90000 milliseconds duration
    */
  def minutes(): Double = js.native
  /**
    * The month part of a duration.
    */
  def month(): Double = js.native
  /**
    * The entire duration in days (negative or positive, fractional)
    * This is approximate if this duration is not in Months or Years!
    */
  def months(): Double = js.native
  /**
    * Multiply with a fixed number.
    * Approximate if the durations have units that cannot be converted
    * @return a new Duration of (this * value)
    */
  def multiply(value: Double): Duration = js.native
  /**
    * The second part of the duration (always positive)
    * For Day/Month/Year durations, this is approximate!
    * @return e.g. 3 for a -01:02:03.400 duration
    */
  def second(): Double = js.native
  /**
    * The entire duration in seconds (negative or positive, fractional)
    * For Day/Month/Year durations, this is approximate!
    * @return e.g. 1.5 for a 1500 milliseconds duration
    */
  def seconds(): Double = js.native
  /**
    * Sign
    * @return "-" if the duration is negative
    */
  def sign(): String = js.native
  /**
    * Subtract a duration.
    * @return a new Duration of (this - value) with the unit of this duration
    */
  def sub(value: Duration): Duration = js.native
  /**
    * String in [-]hhhh:mm:ss.nnn notation. All fields are
    * always present except the sign.
    */
  def toFullString(): String = js.native
  /**
    * String in [-]hhhh:mm[:ss[.nnn]] notation.
    * @param full If true, then all fields are always present except the sign. Otherwise, seconds and milliseconds
    *             are chopped off if zero
    */
  def toHmsString(): String = js.native
  def toHmsString(full: Boolean): String = js.native
  /**
    * String in ISO 8601 notation e.g. 'P1M' for one month or 'PT1M' for one minute
    */
  def toIsoString(): String = js.native
  /**
    * The unit this duration was created with
    */
  def unit(): TimeUnit = js.native
  /**
    * The hour part of the duration (always positive).
    * Note that this part can exceed 23 hours, because for
    * now, we do not have a days() function
    * For Day/Month/Year durations, this is approximate!
    * @return e.g. 25 for a -25:02:03.400 duration
    */
  def wholeHours(): Double = js.native
  /**
    * Non-fractional positive years
    */
  def wholeYears(): Double = js.native
  /**
    * The entire duration in years (negative or positive, fractional)
    * This is approximate if this duration is not in Months or Years!
    */
  def years(): Double = js.native
}

/* static members */
@JSImport("timezonecomplete/dist/lib/duration", "Duration")
@js.native
object Duration extends js.Object {
  /**
    * Construct a time duration
    * @param n	Number of days (may be fractional or negative)
    * @return A duration of n days
    */
  def days(n: Double): Duration = js.native
  /**
    * Construct a time duration
    * @param n	Number of hours (may be fractional or negative)
    * @return A duration of n hours
    */
  def hours(n: Double): Duration = js.native
  /**
    * Construct a time duration
    * @param n	Number of milliseconds (may be fractional or negative)
    * @return A duration of n milliseconds
    */
  def milliseconds(n: Double): Duration = js.native
  /**
    * Construct a time duration
    * @param n	Number of minutes (may be fractional or negative)
    * @return A duration of n minutes
    */
  def minutes(n: Double): Duration = js.native
  /**
    * Construct a time duration
    * @param n	Number of months (may be fractional or negative)
    * @return A duration of n months
    */
  def months(n: Double): Duration = js.native
  /**
    * Construct a time duration
    * @param n	Number of seconds (may be fractional or negative)
    * @return A duration of n seconds
    */
  def seconds(n: Double): Duration = js.native
  /**
    * Construct a time duration
    * @param n	Number of years (may be fractional or negative)
    * @return A duration of n years
    */
  def years(n: Double): Duration = js.native
}


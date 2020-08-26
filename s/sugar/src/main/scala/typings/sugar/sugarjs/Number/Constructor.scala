package typings.sugar.sugarjs.Number

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.sugar.Array
import typings.sugar.Date
import typings.sugar.sugarjs.Date.DateCreateOptions
import typings.sugar.sugarjs.Range
import typings.sugar.sugarjs.SugarNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends SugarNamespace
     with Instantiable0[Chainable[Double]]
     with Instantiable1[/* raw */ Double, Chainable[Double]] {
  def apply(): Chainable[Double] = js.native
  def apply(raw: Double): Chainable[Double] = js.native
  def abbr(instance: Double): String = js.native
  def abbr(instance: Double, precision: Double): String = js.native
  def abs(instance: Double): Double = js.native
  def acos(instance: Double): Double = js.native
  def asin(instance: Double): Double = js.native
  def atan(instance: Double): Double = js.native
  def bytes(instance: Double): String = js.native
  def bytes(
    instance: Double,
    precision: js.UndefOr[scala.Nothing],
    binary: js.UndefOr[scala.Nothing],
    units: String
  ): String = js.native
  def bytes(instance: Double, precision: js.UndefOr[scala.Nothing], binary: Boolean): String = js.native
  def bytes(instance: Double, precision: js.UndefOr[scala.Nothing], binary: Boolean, units: String): String = js.native
  def bytes(instance: Double, precision: Double): String = js.native
  def bytes(instance: Double, precision: Double, binary: js.UndefOr[scala.Nothing], units: String): String = js.native
  def bytes(instance: Double, precision: Double, binary: Boolean): String = js.native
  def bytes(instance: Double, precision: Double, binary: Boolean, units: String): String = js.native
  def cap(instance: Double): Double = js.native
  def cap(instance: Double, max: Double): Double = js.native
  def ceil(instance: Double): Double = js.native
  def ceil(instance: Double, precision: Double): Double = js.native
  def chr(instance: Double): String = js.native
  def clamp(instance: Double): Double = js.native
  def clamp(instance: Double, start: js.UndefOr[scala.Nothing], end: Double): Double = js.native
  def clamp(instance: Double, start: Double): Double = js.native
  def clamp(instance: Double, start: Double, end: Double): Double = js.native
  def cos(instance: Double): Double = js.native
  def day(instance: Double): Double = js.native
  def dayAfter(instance: Double, d: String): Date = js.native
  def dayAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def dayAfter(instance: Double, d: Double): Date = js.native
  def dayAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def dayAfter(instance: Double, d: Date): Date = js.native
  def dayAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def dayAgo(instance: Double): Date = js.native
  def dayBefore(instance: Double, d: String): Date = js.native
  def dayBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def dayBefore(instance: Double, d: Double): Date = js.native
  def dayBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def dayBefore(instance: Double, d: Date): Date = js.native
  def dayBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def dayFromNow(instance: Double): Date = js.native
  def days(instance: Double): Double = js.native
  def daysAfter(instance: Double, d: String): Date = js.native
  def daysAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def daysAfter(instance: Double, d: Double): Date = js.native
  def daysAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def daysAfter(instance: Double, d: Date): Date = js.native
  def daysAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def daysAgo(instance: Double): Date = js.native
  def daysBefore(instance: Double, d: String): Date = js.native
  def daysBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def daysBefore(instance: Double, d: Double): Date = js.native
  def daysBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def daysBefore(instance: Double, d: Date): Date = js.native
  def daysBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def daysFromNow(instance: Double): Date = js.native
  def downto[T](instance: Double, num: Double): Array[T] = js.native
  def downto[T](
    instance: Double,
    num: Double,
    everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
  ): Array[T] = js.native
  def downto[T](
    instance: Double,
    num: Double,
    step: js.UndefOr[scala.Nothing],
    everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
  ): Array[T] = js.native
  def downto[T](instance: Double, num: Double, step: Double): Array[T] = js.native
  def downto[T](
    instance: Double,
    num: Double,
    step: Double,
    everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
  ): Array[T] = js.native
  def duration(instance: Double): String = js.native
  def duration(instance: Double, localeCode: String): String = js.native
  def exp(instance: Double): Double = js.native
  def floor(instance: Double): Double = js.native
  def floor(instance: Double, precision: Double): Double = js.native
  def format(instance: Double): String = js.native
  def format(instance: Double, place: Double): String = js.native
  def getOption[T](name: String): T = js.native
  def hex(instance: Double): String = js.native
  def hex(instance: Double, pad: Double): String = js.native
  def hour(instance: Double): Double = js.native
  def hourAfter(instance: Double, d: String): Date = js.native
  def hourAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def hourAfter(instance: Double, d: Double): Date = js.native
  def hourAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def hourAfter(instance: Double, d: Date): Date = js.native
  def hourAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def hourAgo(instance: Double): Date = js.native
  def hourBefore(instance: Double, d: String): Date = js.native
  def hourBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def hourBefore(instance: Double, d: Double): Date = js.native
  def hourBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def hourBefore(instance: Double, d: Date): Date = js.native
  def hourBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def hourFromNow(instance: Double): Date = js.native
  def hours(instance: Double): Double = js.native
  def hoursAfter(instance: Double, d: String): Date = js.native
  def hoursAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def hoursAfter(instance: Double, d: Double): Date = js.native
  def hoursAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def hoursAfter(instance: Double, d: Date): Date = js.native
  def hoursAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def hoursAgo(instance: Double): Date = js.native
  def hoursBefore(instance: Double, d: String): Date = js.native
  def hoursBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def hoursBefore(instance: Double, d: Double): Date = js.native
  def hoursBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def hoursBefore(instance: Double, d: Date): Date = js.native
  def hoursBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def hoursFromNow(instance: Double): Date = js.native
  def isEven(instance: Double): Boolean = js.native
  def isInteger(instance: Double): Boolean = js.native
  def isMultipleOf(instance: Double, num: Double): Boolean = js.native
  def isOdd(instance: Double): Boolean = js.native
  def log(instance: Double): Double = js.native
  def log(instance: Double, base: Double): Double = js.native
  def metric(instance: Double): String = js.native
  def metric(instance: Double, precision: js.UndefOr[scala.Nothing], units: String): String = js.native
  def metric(instance: Double, precision: Double): String = js.native
  def metric(instance: Double, precision: Double, units: String): String = js.native
  def millisecond(instance: Double): Double = js.native
  def millisecondAfter(instance: Double, d: String): Date = js.native
  def millisecondAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def millisecondAfter(instance: Double, d: Double): Date = js.native
  def millisecondAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def millisecondAfter(instance: Double, d: Date): Date = js.native
  def millisecondAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def millisecondAgo(instance: Double): Date = js.native
  def millisecondBefore(instance: Double, d: String): Date = js.native
  def millisecondBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def millisecondBefore(instance: Double, d: Double): Date = js.native
  def millisecondBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def millisecondBefore(instance: Double, d: Date): Date = js.native
  def millisecondBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def millisecondFromNow(instance: Double): Date = js.native
  def milliseconds(instance: Double): Double = js.native
  def millisecondsAfter(instance: Double, d: String): Date = js.native
  def millisecondsAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def millisecondsAfter(instance: Double, d: Double): Date = js.native
  def millisecondsAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def millisecondsAfter(instance: Double, d: Date): Date = js.native
  def millisecondsAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def millisecondsAgo(instance: Double): Date = js.native
  def millisecondsBefore(instance: Double, d: String): Date = js.native
  def millisecondsBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def millisecondsBefore(instance: Double, d: Double): Date = js.native
  def millisecondsBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def millisecondsBefore(instance: Double, d: Date): Date = js.native
  def millisecondsBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def millisecondsFromNow(instance: Double): Date = js.native
  def minute(instance: Double): Double = js.native
  def minuteAfter(instance: Double, d: String): Date = js.native
  def minuteAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def minuteAfter(instance: Double, d: Double): Date = js.native
  def minuteAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def minuteAfter(instance: Double, d: Date): Date = js.native
  def minuteAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def minuteAgo(instance: Double): Date = js.native
  def minuteBefore(instance: Double, d: String): Date = js.native
  def minuteBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def minuteBefore(instance: Double, d: Double): Date = js.native
  def minuteBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def minuteBefore(instance: Double, d: Date): Date = js.native
  def minuteBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def minuteFromNow(instance: Double): Date = js.native
  def minutes(instance: Double): Double = js.native
  def minutesAfter(instance: Double, d: String): Date = js.native
  def minutesAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def minutesAfter(instance: Double, d: Double): Date = js.native
  def minutesAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def minutesAfter(instance: Double, d: Date): Date = js.native
  def minutesAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def minutesAgo(instance: Double): Date = js.native
  def minutesBefore(instance: Double, d: String): Date = js.native
  def minutesBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def minutesBefore(instance: Double, d: Double): Date = js.native
  def minutesBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def minutesBefore(instance: Double, d: Date): Date = js.native
  def minutesBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def minutesFromNow(instance: Double): Date = js.native
  def month(instance: Double): Double = js.native
  def monthAfter(instance: Double, d: String): Date = js.native
  def monthAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def monthAfter(instance: Double, d: Double): Date = js.native
  def monthAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def monthAfter(instance: Double, d: Date): Date = js.native
  def monthAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def monthAgo(instance: Double): Date = js.native
  def monthBefore(instance: Double, d: String): Date = js.native
  def monthBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def monthBefore(instance: Double, d: Double): Date = js.native
  def monthBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def monthBefore(instance: Double, d: Date): Date = js.native
  def monthBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def monthFromNow(instance: Double): Date = js.native
  def months(instance: Double): Double = js.native
  def monthsAfter(instance: Double, d: String): Date = js.native
  def monthsAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def monthsAfter(instance: Double, d: Double): Date = js.native
  def monthsAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def monthsAfter(instance: Double, d: Date): Date = js.native
  def monthsAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def monthsAgo(instance: Double): Date = js.native
  def monthsBefore(instance: Double, d: String): Date = js.native
  def monthsBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def monthsBefore(instance: Double, d: Double): Date = js.native
  def monthsBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def monthsBefore(instance: Double, d: Date): Date = js.native
  def monthsBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def monthsFromNow(instance: Double): Date = js.native
  def ordinalize(instance: Double): String = js.native
  def pad(instance: Double): String = js.native
  def pad(instance: Double, place: js.UndefOr[scala.Nothing], sign: js.UndefOr[scala.Nothing], base: Double): String = js.native
  def pad(instance: Double, place: js.UndefOr[scala.Nothing], sign: Boolean): String = js.native
  def pad(instance: Double, place: js.UndefOr[scala.Nothing], sign: Boolean, base: Double): String = js.native
  def pad(instance: Double, place: Double): String = js.native
  def pad(instance: Double, place: Double, sign: js.UndefOr[scala.Nothing], base: Double): String = js.native
  def pad(instance: Double, place: Double, sign: Boolean): String = js.native
  def pad(instance: Double, place: Double, sign: Boolean, base: Double): String = js.native
  def pow(instance: Double): Double = js.native
  def random(): Double = js.native
  def random(n1: js.UndefOr[scala.Nothing], n2: Double): Double = js.native
  def random(n1: Double): Double = js.native
  def random(n1: Double, n2: Double): Double = js.native
  def range(): Range = js.native
  def range(start: js.UndefOr[scala.Nothing], end: Double): Range = js.native
  def range(start: Double): Range = js.native
  def range(start: Double, end: Double): Range = js.native
  def round(instance: Double): Double = js.native
  def round(instance: Double, precision: Double): Double = js.native
  def second(instance: Double): Double = js.native
  def secondAfter(instance: Double, d: String): Date = js.native
  def secondAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def secondAfter(instance: Double, d: Double): Date = js.native
  def secondAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def secondAfter(instance: Double, d: Date): Date = js.native
  def secondAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def secondAgo(instance: Double): Date = js.native
  def secondBefore(instance: Double, d: String): Date = js.native
  def secondBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def secondBefore(instance: Double, d: Double): Date = js.native
  def secondBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def secondBefore(instance: Double, d: Date): Date = js.native
  def secondBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def secondFromNow(instance: Double): Date = js.native
  def seconds(instance: Double): Double = js.native
  def secondsAfter(instance: Double, d: String): Date = js.native
  def secondsAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def secondsAfter(instance: Double, d: Double): Date = js.native
  def secondsAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def secondsAfter(instance: Double, d: Date): Date = js.native
  def secondsAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def secondsAgo(instance: Double): Date = js.native
  def secondsBefore(instance: Double, d: String): Date = js.native
  def secondsBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def secondsBefore(instance: Double, d: Double): Date = js.native
  def secondsBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def secondsBefore(instance: Double, d: Date): Date = js.native
  def secondsBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def secondsFromNow(instance: Double): Date = js.native
  def setOption(name: String, value: js.Any): Unit = js.native
  def setOption(options: NumberOptions): Unit = js.native
  def sin(instance: Double): Double = js.native
  def sqrt(instance: Double): Double = js.native
  def tan(instance: Double): Double = js.native
  def times[T](instance: Double, indexMapFn: js.Function1[/* i */ Double, _]): T = js.native
  def toNumber(instance: Double): Double = js.native
  def upto[T](instance: Double, num: Double): Array[T] = js.native
  def upto[T](
    instance: Double,
    num: Double,
    everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
  ): Array[T] = js.native
  def upto[T](
    instance: Double,
    num: Double,
    step: js.UndefOr[scala.Nothing],
    everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
  ): Array[T] = js.native
  def upto[T](instance: Double, num: Double, step: Double): Array[T] = js.native
  def upto[T](
    instance: Double,
    num: Double,
    step: Double,
    everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
  ): Array[T] = js.native
  def week(instance: Double): Double = js.native
  def weekAfter(instance: Double, d: String): Date = js.native
  def weekAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def weekAfter(instance: Double, d: Double): Date = js.native
  def weekAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def weekAfter(instance: Double, d: Date): Date = js.native
  def weekAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def weekAgo(instance: Double): Date = js.native
  def weekBefore(instance: Double, d: String): Date = js.native
  def weekBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def weekBefore(instance: Double, d: Double): Date = js.native
  def weekBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def weekBefore(instance: Double, d: Date): Date = js.native
  def weekBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def weekFromNow(instance: Double): Date = js.native
  def weeks(instance: Double): Double = js.native
  def weeksAfter(instance: Double, d: String): Date = js.native
  def weeksAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def weeksAfter(instance: Double, d: Double): Date = js.native
  def weeksAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def weeksAfter(instance: Double, d: Date): Date = js.native
  def weeksAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def weeksAgo(instance: Double): Date = js.native
  def weeksBefore(instance: Double, d: String): Date = js.native
  def weeksBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def weeksBefore(instance: Double, d: Double): Date = js.native
  def weeksBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def weeksBefore(instance: Double, d: Date): Date = js.native
  def weeksBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def weeksFromNow(instance: Double): Date = js.native
  def year(instance: Double): Double = js.native
  def yearAfter(instance: Double, d: String): Date = js.native
  def yearAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def yearAfter(instance: Double, d: Double): Date = js.native
  def yearAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def yearAfter(instance: Double, d: Date): Date = js.native
  def yearAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def yearAgo(instance: Double): Date = js.native
  def yearBefore(instance: Double, d: String): Date = js.native
  def yearBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def yearBefore(instance: Double, d: Double): Date = js.native
  def yearBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def yearBefore(instance: Double, d: Date): Date = js.native
  def yearBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def yearFromNow(instance: Double): Date = js.native
  def years(instance: Double): Double = js.native
  def yearsAfter(instance: Double, d: String): Date = js.native
  def yearsAfter(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def yearsAfter(instance: Double, d: Double): Date = js.native
  def yearsAfter(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def yearsAfter(instance: Double, d: Date): Date = js.native
  def yearsAfter(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def yearsAgo(instance: Double): Date = js.native
  def yearsBefore(instance: Double, d: String): Date = js.native
  def yearsBefore(instance: Double, d: String, options: DateCreateOptions): Date = js.native
  def yearsBefore(instance: Double, d: Double): Date = js.native
  def yearsBefore(instance: Double, d: Double, options: DateCreateOptions): Date = js.native
  def yearsBefore(instance: Double, d: Date): Date = js.native
  def yearsBefore(instance: Double, d: Date, options: DateCreateOptions): Date = js.native
  def yearsFromNow(instance: Double): Date = js.native
}


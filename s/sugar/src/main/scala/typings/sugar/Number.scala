package typings.sugar

import typings.sugar.sugarjs.Date.DateCreateOptions
import typings.sugar.sugarjs.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Number extends StObject {
  
  def abbr(): java.lang.String = js.native
  def abbr(precision: Double): java.lang.String = js.native
  
  def abs(): Double = js.native
  
  def acos(): Double = js.native
  
  def asin(): Double = js.native
  
  def atan(): Double = js.native
  
  def bytes(): java.lang.String = js.native
  def bytes(precision: Double): java.lang.String = js.native
  def bytes(precision: Double, binary: Boolean): java.lang.String = js.native
  def bytes(precision: Double, binary: Boolean, units: java.lang.String): java.lang.String = js.native
  def bytes(precision: Double, binary: Unit, units: java.lang.String): java.lang.String = js.native
  def bytes(precision: Unit, binary: Boolean): java.lang.String = js.native
  def bytes(precision: Unit, binary: Boolean, units: java.lang.String): java.lang.String = js.native
  def bytes(precision: Unit, binary: Unit, units: java.lang.String): java.lang.String = js.native
  
  def cap(): Double = js.native
  def cap(max: Double): Double = js.native
  
  def ceil(): Double = js.native
  def ceil(precision: Double): Double = js.native
  
  def chr(): java.lang.String = js.native
  
  def clamp(): Double = js.native
  def clamp(start: Double): Double = js.native
  def clamp(start: Double, end: Double): Double = js.native
  def clamp(start: Unit, end: Double): Double = js.native
  
  def cos(): Double = js.native
  
  def day(): Double = js.native
  
  def dayAfter(d: java.lang.String): Date = js.native
  def dayAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def dayAfter(d: Double): Date = js.native
  def dayAfter(d: Double, options: DateCreateOptions): Date = js.native
  def dayAfter(d: Date): Date = js.native
  def dayAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def dayAgo(): Date = js.native
  
  def dayBefore(d: java.lang.String): Date = js.native
  def dayBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def dayBefore(d: Double): Date = js.native
  def dayBefore(d: Double, options: DateCreateOptions): Date = js.native
  def dayBefore(d: Date): Date = js.native
  def dayBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def dayFromNow(): Date = js.native
  
  def days(): Double = js.native
  
  def daysAfter(d: java.lang.String): Date = js.native
  def daysAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def daysAfter(d: Double): Date = js.native
  def daysAfter(d: Double, options: DateCreateOptions): Date = js.native
  def daysAfter(d: Date): Date = js.native
  def daysAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def daysAgo(): Date = js.native
  
  def daysBefore(d: java.lang.String): Date = js.native
  def daysBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def daysBefore(d: Double): Date = js.native
  def daysBefore(d: Double, options: DateCreateOptions): Date = js.native
  def daysBefore(d: Date): Date = js.native
  def daysBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def daysFromNow(): Date = js.native
  
  def downto[T](num: Double): Array[T] = js.native
  def downto[T](num: Double, everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]): Array[T] = js.native
  def downto[T](num: Double, step: Double): Array[T] = js.native
  def downto[T](num: Double, step: Double, everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]): Array[T] = js.native
  def downto[T](num: Double, step: Unit, everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]): Array[T] = js.native
  
  def duration(): java.lang.String = js.native
  def duration(localeCode: java.lang.String): java.lang.String = js.native
  
  def exp(): Double = js.native
  
  def floor(): Double = js.native
  def floor(precision: Double): Double = js.native
  
  def format(): java.lang.String = js.native
  def format(place: Double): java.lang.String = js.native
  
  def hex(): java.lang.String = js.native
  def hex(pad: Double): java.lang.String = js.native
  
  def hour(): Double = js.native
  
  def hourAfter(d: java.lang.String): Date = js.native
  def hourAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def hourAfter(d: Double): Date = js.native
  def hourAfter(d: Double, options: DateCreateOptions): Date = js.native
  def hourAfter(d: Date): Date = js.native
  def hourAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def hourAgo(): Date = js.native
  
  def hourBefore(d: java.lang.String): Date = js.native
  def hourBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def hourBefore(d: Double): Date = js.native
  def hourBefore(d: Double, options: DateCreateOptions): Date = js.native
  def hourBefore(d: Date): Date = js.native
  def hourBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def hourFromNow(): Date = js.native
  
  def hours(): Double = js.native
  
  def hoursAfter(d: java.lang.String): Date = js.native
  def hoursAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def hoursAfter(d: Double): Date = js.native
  def hoursAfter(d: Double, options: DateCreateOptions): Date = js.native
  def hoursAfter(d: Date): Date = js.native
  def hoursAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def hoursAgo(): Date = js.native
  
  def hoursBefore(d: java.lang.String): Date = js.native
  def hoursBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def hoursBefore(d: Double): Date = js.native
  def hoursBefore(d: Double, options: DateCreateOptions): Date = js.native
  def hoursBefore(d: Date): Date = js.native
  def hoursBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def hoursFromNow(): Date = js.native
  
  def isEven(): Boolean = js.native
  
  def isInteger(): Boolean = js.native
  
  def isMultipleOf(num: Double): Boolean = js.native
  
  def isOdd(): Boolean = js.native
  
  def log(): Double = js.native
  def log(base: Double): Double = js.native
  
  def metric(): java.lang.String = js.native
  def metric(precision: Double): java.lang.String = js.native
  def metric(precision: Double, units: java.lang.String): java.lang.String = js.native
  def metric(precision: Unit, units: java.lang.String): java.lang.String = js.native
  
  def millisecond(): Double = js.native
  
  def millisecondAfter(d: java.lang.String): Date = js.native
  def millisecondAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def millisecondAfter(d: Double): Date = js.native
  def millisecondAfter(d: Double, options: DateCreateOptions): Date = js.native
  def millisecondAfter(d: Date): Date = js.native
  def millisecondAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def millisecondAgo(): Date = js.native
  
  def millisecondBefore(d: java.lang.String): Date = js.native
  def millisecondBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def millisecondBefore(d: Double): Date = js.native
  def millisecondBefore(d: Double, options: DateCreateOptions): Date = js.native
  def millisecondBefore(d: Date): Date = js.native
  def millisecondBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def millisecondFromNow(): Date = js.native
  
  def milliseconds(): Double = js.native
  
  def millisecondsAfter(d: java.lang.String): Date = js.native
  def millisecondsAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def millisecondsAfter(d: Double): Date = js.native
  def millisecondsAfter(d: Double, options: DateCreateOptions): Date = js.native
  def millisecondsAfter(d: Date): Date = js.native
  def millisecondsAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def millisecondsAgo(): Date = js.native
  
  def millisecondsBefore(d: java.lang.String): Date = js.native
  def millisecondsBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def millisecondsBefore(d: Double): Date = js.native
  def millisecondsBefore(d: Double, options: DateCreateOptions): Date = js.native
  def millisecondsBefore(d: Date): Date = js.native
  def millisecondsBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def millisecondsFromNow(): Date = js.native
  
  def minute(): Double = js.native
  
  def minuteAfter(d: java.lang.String): Date = js.native
  def minuteAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def minuteAfter(d: Double): Date = js.native
  def minuteAfter(d: Double, options: DateCreateOptions): Date = js.native
  def minuteAfter(d: Date): Date = js.native
  def minuteAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def minuteAgo(): Date = js.native
  
  def minuteBefore(d: java.lang.String): Date = js.native
  def minuteBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def minuteBefore(d: Double): Date = js.native
  def minuteBefore(d: Double, options: DateCreateOptions): Date = js.native
  def minuteBefore(d: Date): Date = js.native
  def minuteBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def minuteFromNow(): Date = js.native
  
  def minutes(): Double = js.native
  
  def minutesAfter(d: java.lang.String): Date = js.native
  def minutesAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def minutesAfter(d: Double): Date = js.native
  def minutesAfter(d: Double, options: DateCreateOptions): Date = js.native
  def minutesAfter(d: Date): Date = js.native
  def minutesAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def minutesAgo(): Date = js.native
  
  def minutesBefore(d: java.lang.String): Date = js.native
  def minutesBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def minutesBefore(d: Double): Date = js.native
  def minutesBefore(d: Double, options: DateCreateOptions): Date = js.native
  def minutesBefore(d: Date): Date = js.native
  def minutesBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def minutesFromNow(): Date = js.native
  
  def month(): Double = js.native
  
  def monthAfter(d: java.lang.String): Date = js.native
  def monthAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def monthAfter(d: Double): Date = js.native
  def monthAfter(d: Double, options: DateCreateOptions): Date = js.native
  def monthAfter(d: Date): Date = js.native
  def monthAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def monthAgo(): Date = js.native
  
  def monthBefore(d: java.lang.String): Date = js.native
  def monthBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def monthBefore(d: Double): Date = js.native
  def monthBefore(d: Double, options: DateCreateOptions): Date = js.native
  def monthBefore(d: Date): Date = js.native
  def monthBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def monthFromNow(): Date = js.native
  
  def months(): Double = js.native
  
  def monthsAfter(d: java.lang.String): Date = js.native
  def monthsAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def monthsAfter(d: Double): Date = js.native
  def monthsAfter(d: Double, options: DateCreateOptions): Date = js.native
  def monthsAfter(d: Date): Date = js.native
  def monthsAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def monthsAgo(): Date = js.native
  
  def monthsBefore(d: java.lang.String): Date = js.native
  def monthsBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def monthsBefore(d: Double): Date = js.native
  def monthsBefore(d: Double, options: DateCreateOptions): Date = js.native
  def monthsBefore(d: Date): Date = js.native
  def monthsBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def monthsFromNow(): Date = js.native
  
  def ordinalize(): java.lang.String = js.native
  
  def pad(): java.lang.String = js.native
  def pad(place: Double): java.lang.String = js.native
  def pad(place: Double, sign: Boolean): java.lang.String = js.native
  def pad(place: Double, sign: Boolean, base: Double): java.lang.String = js.native
  def pad(place: Double, sign: Unit, base: Double): java.lang.String = js.native
  def pad(place: Unit, sign: Boolean): java.lang.String = js.native
  def pad(place: Unit, sign: Boolean, base: Double): java.lang.String = js.native
  def pad(place: Unit, sign: Unit, base: Double): java.lang.String = js.native
  
  def pow(): Double = js.native
  
  def round(): Double = js.native
  def round(precision: Double): Double = js.native
  
  def second(): Double = js.native
  
  def secondAfter(d: java.lang.String): Date = js.native
  def secondAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def secondAfter(d: Double): Date = js.native
  def secondAfter(d: Double, options: DateCreateOptions): Date = js.native
  def secondAfter(d: Date): Date = js.native
  def secondAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def secondAgo(): Date = js.native
  
  def secondBefore(d: java.lang.String): Date = js.native
  def secondBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def secondBefore(d: Double): Date = js.native
  def secondBefore(d: Double, options: DateCreateOptions): Date = js.native
  def secondBefore(d: Date): Date = js.native
  def secondBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def secondFromNow(): Date = js.native
  
  def seconds(): Double = js.native
  
  def secondsAfter(d: java.lang.String): Date = js.native
  def secondsAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def secondsAfter(d: Double): Date = js.native
  def secondsAfter(d: Double, options: DateCreateOptions): Date = js.native
  def secondsAfter(d: Date): Date = js.native
  def secondsAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def secondsAgo(): Date = js.native
  
  def secondsBefore(d: java.lang.String): Date = js.native
  def secondsBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def secondsBefore(d: Double): Date = js.native
  def secondsBefore(d: Double, options: DateCreateOptions): Date = js.native
  def secondsBefore(d: Date): Date = js.native
  def secondsBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def secondsFromNow(): Date = js.native
  
  def sin(): Double = js.native
  
  def sqrt(): Double = js.native
  
  def tan(): Double = js.native
  
  def times[T](indexMapFn: js.Function1[/* i */ Double, js.Any]): T = js.native
  
  def toNumber(): Double = js.native
  
  def upto[T](num: Double): Array[T] = js.native
  def upto[T](num: Double, everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]): Array[T] = js.native
  def upto[T](num: Double, step: Double): Array[T] = js.native
  def upto[T](num: Double, step: Double, everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]): Array[T] = js.native
  def upto[T](num: Double, step: Unit, everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]): Array[T] = js.native
  
  def week(): Double = js.native
  
  def weekAfter(d: java.lang.String): Date = js.native
  def weekAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def weekAfter(d: Double): Date = js.native
  def weekAfter(d: Double, options: DateCreateOptions): Date = js.native
  def weekAfter(d: Date): Date = js.native
  def weekAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def weekAgo(): Date = js.native
  
  def weekBefore(d: java.lang.String): Date = js.native
  def weekBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def weekBefore(d: Double): Date = js.native
  def weekBefore(d: Double, options: DateCreateOptions): Date = js.native
  def weekBefore(d: Date): Date = js.native
  def weekBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def weekFromNow(): Date = js.native
  
  def weeks(): Double = js.native
  
  def weeksAfter(d: java.lang.String): Date = js.native
  def weeksAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def weeksAfter(d: Double): Date = js.native
  def weeksAfter(d: Double, options: DateCreateOptions): Date = js.native
  def weeksAfter(d: Date): Date = js.native
  def weeksAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def weeksAgo(): Date = js.native
  
  def weeksBefore(d: java.lang.String): Date = js.native
  def weeksBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def weeksBefore(d: Double): Date = js.native
  def weeksBefore(d: Double, options: DateCreateOptions): Date = js.native
  def weeksBefore(d: Date): Date = js.native
  def weeksBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def weeksFromNow(): Date = js.native
  
  def year(): Double = js.native
  
  def yearAfter(d: java.lang.String): Date = js.native
  def yearAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def yearAfter(d: Double): Date = js.native
  def yearAfter(d: Double, options: DateCreateOptions): Date = js.native
  def yearAfter(d: Date): Date = js.native
  def yearAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def yearAgo(): Date = js.native
  
  def yearBefore(d: java.lang.String): Date = js.native
  def yearBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def yearBefore(d: Double): Date = js.native
  def yearBefore(d: Double, options: DateCreateOptions): Date = js.native
  def yearBefore(d: Date): Date = js.native
  def yearBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def yearFromNow(): Date = js.native
  
  def years(): Double = js.native
  
  def yearsAfter(d: java.lang.String): Date = js.native
  def yearsAfter(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def yearsAfter(d: Double): Date = js.native
  def yearsAfter(d: Double, options: DateCreateOptions): Date = js.native
  def yearsAfter(d: Date): Date = js.native
  def yearsAfter(d: Date, options: DateCreateOptions): Date = js.native
  
  def yearsAgo(): Date = js.native
  
  def yearsBefore(d: java.lang.String): Date = js.native
  def yearsBefore(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def yearsBefore(d: Double): Date = js.native
  def yearsBefore(d: Double, options: DateCreateOptions): Date = js.native
  def yearsBefore(d: Date): Date = js.native
  def yearsBefore(d: Date, options: DateCreateOptions): Date = js.native
  
  def yearsFromNow(): Date = js.native
}

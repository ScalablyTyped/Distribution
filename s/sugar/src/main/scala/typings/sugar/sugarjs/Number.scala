package typings.sugar.sugarjs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.std.Intl.NumberFormatOptions
import typings.sugar.sugarjs.Date.DateCreateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Number {
  
  type Chainable[RawValue] = ChainableBase[RawValue] with typings.sugar.sugarjs.Object.ChainableBase[RawValue]
  
  @js.native
  trait ChainableBase[RawValue] extends StObject {
    
    def abbr(): SugarDefaultChainable[java.lang.String] = js.native
    def abbr(precision: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def abs(): SugarDefaultChainable[Double] = js.native
    
    def acos(): SugarDefaultChainable[Double] = js.native
    
    def asin(): SugarDefaultChainable[Double] = js.native
    
    def atan(): SugarDefaultChainable[Double] = js.native
    
    def bytes(): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: js.UndefOr[scala.Nothing], binary: js.UndefOr[scala.Nothing], units: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: js.UndefOr[scala.Nothing], binary: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: js.UndefOr[scala.Nothing], binary: Boolean, units: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: Double): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: Double, binary: js.UndefOr[scala.Nothing], units: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: Double, binary: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    def bytes(precision: Double, binary: Boolean, units: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def cap(): SugarDefaultChainable[Double] = js.native
    def cap(max: Double): SugarDefaultChainable[Double] = js.native
    
    def ceil(): SugarDefaultChainable[Double] = js.native
    def ceil(precision: Double): SugarDefaultChainable[Double] = js.native
    
    def chr(): SugarDefaultChainable[java.lang.String] = js.native
    
    def clamp(): SugarDefaultChainable[Double] = js.native
    def clamp(start: js.UndefOr[scala.Nothing], end: Double): SugarDefaultChainable[Double] = js.native
    def clamp(start: Double): SugarDefaultChainable[Double] = js.native
    def clamp(start: Double, end: Double): SugarDefaultChainable[Double] = js.native
    
    def cos(): SugarDefaultChainable[Double] = js.native
    
    def day(): SugarDefaultChainable[Double] = js.native
    
    def dayAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def dayAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def dayAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def dayAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def dayAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def dayAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def dayAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def dayBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def dayBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def dayBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def dayBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def dayBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def dayBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def dayFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def days(): SugarDefaultChainable[Double] = js.native
    
    def daysAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def daysAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def daysAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def daysAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def daysAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def daysAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def daysAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def daysBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def daysBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def daysBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def daysBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def daysBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def daysBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def daysFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def downto[T](num: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def downto[T](
      num: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def downto[T](
      num: Double,
      step: js.UndefOr[scala.Nothing],
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def downto[T](num: Double, step: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def downto[T](
      num: Double,
      step: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def duration(): SugarDefaultChainable[java.lang.String] = js.native
    def duration(localeCode: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def exp(): SugarDefaultChainable[Double] = js.native
    
    def floor(): SugarDefaultChainable[Double] = js.native
    def floor(precision: Double): SugarDefaultChainable[Double] = js.native
    
    def format(): SugarDefaultChainable[java.lang.String] = js.native
    def format(place: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def hex(): SugarDefaultChainable[java.lang.String] = js.native
    def hex(pad: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def hour(): SugarDefaultChainable[Double] = js.native
    
    def hourAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hourAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hourAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hourAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hourAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hourAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def hourAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def hourBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hourBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hourBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hourBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hourBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hourBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def hourFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def hours(): SugarDefaultChainable[Double] = js.native
    
    def hoursAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hoursAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hoursAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hoursAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hoursAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hoursAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def hoursAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def hoursBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hoursBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hoursBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hoursBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hoursBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def hoursBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def hoursFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def isEven(): SugarDefaultChainable[Boolean] = js.native
    
    def isInteger(): SugarDefaultChainable[Boolean] = js.native
    
    def isMultipleOf(num: Double): SugarDefaultChainable[Boolean] = js.native
    
    def isOdd(): SugarDefaultChainable[Boolean] = js.native
    
    def log(): SugarDefaultChainable[Double] = js.native
    def log(base: Double): SugarDefaultChainable[Double] = js.native
    
    def metric(): SugarDefaultChainable[java.lang.String] = js.native
    def metric(precision: js.UndefOr[scala.Nothing], units: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def metric(precision: Double): SugarDefaultChainable[java.lang.String] = js.native
    def metric(precision: Double, units: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    
    def millisecond(): SugarDefaultChainable[Double] = js.native
    
    def millisecondAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def millisecondAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def millisecondBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def millisecondFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def milliseconds(): SugarDefaultChainable[Double] = js.native
    
    def millisecondsAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondsAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondsAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondsAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondsAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondsAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def millisecondsAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def millisecondsBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondsBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondsBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondsBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondsBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def millisecondsBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def millisecondsFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def minute(): SugarDefaultChainable[Double] = js.native
    
    def minuteAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minuteAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minuteAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minuteAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minuteAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minuteAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def minuteAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def minuteBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minuteBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minuteBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minuteBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minuteBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minuteBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def minuteFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def minutes(): SugarDefaultChainable[Double] = js.native
    
    def minutesAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minutesAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minutesAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minutesAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minutesAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minutesAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def minutesAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def minutesBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minutesBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minutesBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minutesBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minutesBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def minutesBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def minutesFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def month(): SugarDefaultChainable[Double] = js.native
    
    def monthAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def monthAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def monthBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def monthFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def months(): SugarDefaultChainable[Double] = js.native
    
    def monthsAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthsAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthsAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthsAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthsAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthsAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def monthsAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def monthsBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthsBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthsBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthsBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthsBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def monthsBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def monthsFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def ordinalize(): SugarDefaultChainable[java.lang.String] = js.native
    
    def pad(): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: js.UndefOr[scala.Nothing], sign: js.UndefOr[scala.Nothing], base: Double): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: js.UndefOr[scala.Nothing], sign: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: js.UndefOr[scala.Nothing], sign: Boolean, base: Double): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: Double): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: Double, sign: js.UndefOr[scala.Nothing], base: Double): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: Double, sign: Boolean): SugarDefaultChainable[java.lang.String] = js.native
    def pad(place: Double, sign: Boolean, base: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def pow(): SugarDefaultChainable[Double] = js.native
    
    var raw: RawValue = js.native
    
    def round(): SugarDefaultChainable[Double] = js.native
    def round(precision: Double): SugarDefaultChainable[Double] = js.native
    
    def second(): SugarDefaultChainable[Double] = js.native
    
    def secondAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def secondAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def secondBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def secondFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def seconds(): SugarDefaultChainable[Double] = js.native
    
    def secondsAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondsAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondsAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondsAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondsAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondsAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def secondsAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def secondsBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondsBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondsBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondsBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondsBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def secondsBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def secondsFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def sin(): SugarDefaultChainable[Double] = js.native
    
    def sqrt(): SugarDefaultChainable[Double] = js.native
    
    def tan(): SugarDefaultChainable[Double] = js.native
    
    def times[T](indexMapFn: js.Function1[/* i */ Double, SugarDefaultChainable[_]]): SugarDefaultChainable[T] = js.native
    
    def toExponential(): SugarDefaultChainable[java.lang.String] = js.native
    def toExponential(fractionDigits: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def toFixed(): SugarDefaultChainable[java.lang.String] = js.native
    def toFixed(fractionDigits: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def toLocaleString(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: java.lang.String): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: java.lang.String, options: NumberFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: typings.sugar.Array[java.lang.String]): SugarDefaultChainable[java.lang.String] = js.native
    def toLocaleString(locales: typings.sugar.Array[java.lang.String], options: NumberFormatOptions): SugarDefaultChainable[java.lang.String] = js.native
    
    def toNumber(): SugarDefaultChainable[Double] = js.native
    
    def toPrecision(): SugarDefaultChainable[java.lang.String] = js.native
    def toPrecision(precision: Double): SugarDefaultChainable[java.lang.String] = js.native
    
    def upto[T](num: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def upto[T](
      num: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def upto[T](
      num: Double,
      step: js.UndefOr[scala.Nothing],
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def upto[T](num: Double, step: Double): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    def upto[T](
      num: Double,
      step: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, SugarDefaultChainable[Unit]]
    ): SugarDefaultChainable[typings.sugar.Array[T]] = js.native
    
    def week(): SugarDefaultChainable[Double] = js.native
    
    def weekAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weekAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weekAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weekAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weekAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weekAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def weekAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def weekBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weekBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weekBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weekBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weekBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weekBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def weekFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def weeks(): SugarDefaultChainable[Double] = js.native
    
    def weeksAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weeksAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weeksAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weeksAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weeksAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weeksAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def weeksAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def weeksBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weeksBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weeksBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weeksBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weeksBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def weeksBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def weeksFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def year(): SugarDefaultChainable[Double] = js.native
    
    def yearAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def yearAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def yearBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def yearFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def years(): SugarDefaultChainable[Double] = js.native
    
    def yearsAfter(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearsAfter(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearsAfter(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearsAfter(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearsAfter(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearsAfter(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def yearsAgo(): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def yearsBefore(d: java.lang.String): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearsBefore(d: java.lang.String, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearsBefore(d: Double): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearsBefore(d: Double, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearsBefore(d: typings.sugar.Date): SugarDefaultChainable[typings.sugar.Date] = js.native
    def yearsBefore(d: typings.sugar.Date, options: DateCreateOptions): SugarDefaultChainable[typings.sugar.Date] = js.native
    
    def yearsFromNow(): SugarDefaultChainable[typings.sugar.Date] = js.native
  }
  
  @js.native
  trait Constructor
    extends SugarNamespace
       with Instantiable0[Chainable[Double]]
       with Instantiable1[/* raw */ Double, Chainable[Double]] {
    
    def apply(): Chainable[Double] = js.native
    def apply(raw: Double): Chainable[Double] = js.native
    
    def abbr(instance: Double): java.lang.String = js.native
    def abbr(instance: Double, precision: Double): java.lang.String = js.native
    
    def abs(instance: Double): Double = js.native
    
    def acos(instance: Double): Double = js.native
    
    def asin(instance: Double): Double = js.native
    
    def atan(instance: Double): Double = js.native
    
    def bytes(instance: Double): java.lang.String = js.native
    def bytes(
      instance: Double,
      precision: js.UndefOr[scala.Nothing],
      binary: js.UndefOr[scala.Nothing],
      units: java.lang.String
    ): java.lang.String = js.native
    def bytes(instance: Double, precision: js.UndefOr[scala.Nothing], binary: Boolean): java.lang.String = js.native
    def bytes(instance: Double, precision: js.UndefOr[scala.Nothing], binary: Boolean, units: java.lang.String): java.lang.String = js.native
    def bytes(instance: Double, precision: Double): java.lang.String = js.native
    def bytes(instance: Double, precision: Double, binary: js.UndefOr[scala.Nothing], units: java.lang.String): java.lang.String = js.native
    def bytes(instance: Double, precision: Double, binary: Boolean): java.lang.String = js.native
    def bytes(instance: Double, precision: Double, binary: Boolean, units: java.lang.String): java.lang.String = js.native
    
    def cap(instance: Double): Double = js.native
    def cap(instance: Double, max: Double): Double = js.native
    
    def ceil(instance: Double): Double = js.native
    def ceil(instance: Double, precision: Double): Double = js.native
    
    def chr(instance: Double): java.lang.String = js.native
    
    def clamp(instance: Double): Double = js.native
    def clamp(instance: Double, start: js.UndefOr[scala.Nothing], end: Double): Double = js.native
    def clamp(instance: Double, start: Double): Double = js.native
    def clamp(instance: Double, start: Double, end: Double): Double = js.native
    
    def cos(instance: Double): Double = js.native
    
    def day(instance: Double): Double = js.native
    
    def dayAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def dayAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def dayAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def dayAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def dayAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def dayAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def dayAgo(instance: Double): typings.sugar.Date = js.native
    
    def dayBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def dayBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def dayBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def dayBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def dayBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def dayBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def dayFromNow(instance: Double): typings.sugar.Date = js.native
    
    def days(instance: Double): Double = js.native
    
    def daysAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def daysAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def daysAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def daysAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def daysAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def daysAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def daysAgo(instance: Double): typings.sugar.Date = js.native
    
    def daysBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def daysBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def daysBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def daysBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def daysBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def daysBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def daysFromNow(instance: Double): typings.sugar.Date = js.native
    
    def downto[T](instance: Double, num: Double): typings.sugar.Array[T] = js.native
    def downto[T](
      instance: Double,
      num: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
    ): typings.sugar.Array[T] = js.native
    def downto[T](
      instance: Double,
      num: Double,
      step: js.UndefOr[scala.Nothing],
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
    ): typings.sugar.Array[T] = js.native
    def downto[T](instance: Double, num: Double, step: Double): typings.sugar.Array[T] = js.native
    def downto[T](
      instance: Double,
      num: Double,
      step: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
    ): typings.sugar.Array[T] = js.native
    
    def duration(instance: Double): java.lang.String = js.native
    def duration(instance: Double, localeCode: java.lang.String): java.lang.String = js.native
    
    def exp(instance: Double): Double = js.native
    
    def floor(instance: Double): Double = js.native
    def floor(instance: Double, precision: Double): Double = js.native
    
    def format(instance: Double): java.lang.String = js.native
    def format(instance: Double, place: Double): java.lang.String = js.native
    
    def getOption[T](name: java.lang.String): T = js.native
    
    def hex(instance: Double): java.lang.String = js.native
    def hex(instance: Double, pad: Double): java.lang.String = js.native
    
    def hour(instance: Double): Double = js.native
    
    def hourAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def hourAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def hourAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def hourAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def hourAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def hourAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def hourAgo(instance: Double): typings.sugar.Date = js.native
    
    def hourBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def hourBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def hourBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def hourBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def hourBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def hourBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def hourFromNow(instance: Double): typings.sugar.Date = js.native
    
    def hours(instance: Double): Double = js.native
    
    def hoursAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def hoursAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def hoursAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def hoursAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def hoursAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def hoursAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def hoursAgo(instance: Double): typings.sugar.Date = js.native
    
    def hoursBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def hoursBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def hoursBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def hoursBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def hoursBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def hoursBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def hoursFromNow(instance: Double): typings.sugar.Date = js.native
    
    def isEven(instance: Double): Boolean = js.native
    
    def isInteger(instance: Double): Boolean = js.native
    
    def isMultipleOf(instance: Double, num: Double): Boolean = js.native
    
    def isOdd(instance: Double): Boolean = js.native
    
    def log(instance: Double): Double = js.native
    def log(instance: Double, base: Double): Double = js.native
    
    def metric(instance: Double): java.lang.String = js.native
    def metric(instance: Double, precision: js.UndefOr[scala.Nothing], units: java.lang.String): java.lang.String = js.native
    def metric(instance: Double, precision: Double): java.lang.String = js.native
    def metric(instance: Double, precision: Double, units: java.lang.String): java.lang.String = js.native
    
    def millisecond(instance: Double): Double = js.native
    
    def millisecondAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def millisecondAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def millisecondAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def millisecondAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def millisecondAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def millisecondAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def millisecondAgo(instance: Double): typings.sugar.Date = js.native
    
    def millisecondBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def millisecondBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def millisecondBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def millisecondBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def millisecondBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def millisecondBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def millisecondFromNow(instance: Double): typings.sugar.Date = js.native
    
    def milliseconds(instance: Double): Double = js.native
    
    def millisecondsAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def millisecondsAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def millisecondsAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def millisecondsAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def millisecondsAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def millisecondsAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def millisecondsAgo(instance: Double): typings.sugar.Date = js.native
    
    def millisecondsBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def millisecondsBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def millisecondsBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def millisecondsBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def millisecondsBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def millisecondsBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def millisecondsFromNow(instance: Double): typings.sugar.Date = js.native
    
    def minute(instance: Double): Double = js.native
    
    def minuteAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def minuteAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def minuteAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def minuteAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def minuteAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def minuteAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def minuteAgo(instance: Double): typings.sugar.Date = js.native
    
    def minuteBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def minuteBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def minuteBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def minuteBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def minuteBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def minuteBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def minuteFromNow(instance: Double): typings.sugar.Date = js.native
    
    def minutes(instance: Double): Double = js.native
    
    def minutesAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def minutesAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def minutesAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def minutesAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def minutesAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def minutesAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def minutesAgo(instance: Double): typings.sugar.Date = js.native
    
    def minutesBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def minutesBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def minutesBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def minutesBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def minutesBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def minutesBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def minutesFromNow(instance: Double): typings.sugar.Date = js.native
    
    def month(instance: Double): Double = js.native
    
    def monthAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def monthAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def monthAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def monthAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def monthAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def monthAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def monthAgo(instance: Double): typings.sugar.Date = js.native
    
    def monthBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def monthBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def monthBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def monthBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def monthBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def monthBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def monthFromNow(instance: Double): typings.sugar.Date = js.native
    
    def months(instance: Double): Double = js.native
    
    def monthsAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def monthsAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def monthsAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def monthsAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def monthsAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def monthsAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def monthsAgo(instance: Double): typings.sugar.Date = js.native
    
    def monthsBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def monthsBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def monthsBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def monthsBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def monthsBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def monthsBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def monthsFromNow(instance: Double): typings.sugar.Date = js.native
    
    def ordinalize(instance: Double): java.lang.String = js.native
    
    def pad(instance: Double): java.lang.String = js.native
    def pad(instance: Double, place: js.UndefOr[scala.Nothing], sign: js.UndefOr[scala.Nothing], base: Double): java.lang.String = js.native
    def pad(instance: Double, place: js.UndefOr[scala.Nothing], sign: Boolean): java.lang.String = js.native
    def pad(instance: Double, place: js.UndefOr[scala.Nothing], sign: Boolean, base: Double): java.lang.String = js.native
    def pad(instance: Double, place: Double): java.lang.String = js.native
    def pad(instance: Double, place: Double, sign: js.UndefOr[scala.Nothing], base: Double): java.lang.String = js.native
    def pad(instance: Double, place: Double, sign: Boolean): java.lang.String = js.native
    def pad(instance: Double, place: Double, sign: Boolean, base: Double): java.lang.String = js.native
    
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
    
    def secondAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def secondAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def secondAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def secondAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def secondAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def secondAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def secondAgo(instance: Double): typings.sugar.Date = js.native
    
    def secondBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def secondBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def secondBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def secondBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def secondBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def secondBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def secondFromNow(instance: Double): typings.sugar.Date = js.native
    
    def seconds(instance: Double): Double = js.native
    
    def secondsAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def secondsAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def secondsAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def secondsAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def secondsAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def secondsAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def secondsAgo(instance: Double): typings.sugar.Date = js.native
    
    def secondsBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def secondsBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def secondsBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def secondsBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def secondsBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def secondsBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def secondsFromNow(instance: Double): typings.sugar.Date = js.native
    
    def setOption(name: java.lang.String, value: js.Any): Unit = js.native
    def setOption(options: NumberOptions): Unit = js.native
    
    def sin(instance: Double): Double = js.native
    
    def sqrt(instance: Double): Double = js.native
    
    def tan(instance: Double): Double = js.native
    
    def times[T](instance: Double, indexMapFn: js.Function1[/* i */ Double, _]): T = js.native
    
    def toNumber(instance: Double): Double = js.native
    
    def upto[T](instance: Double, num: Double): typings.sugar.Array[T] = js.native
    def upto[T](
      instance: Double,
      num: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
    ): typings.sugar.Array[T] = js.native
    def upto[T](
      instance: Double,
      num: Double,
      step: js.UndefOr[scala.Nothing],
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
    ): typings.sugar.Array[T] = js.native
    def upto[T](instance: Double, num: Double, step: Double): typings.sugar.Array[T] = js.native
    def upto[T](
      instance: Double,
      num: Double,
      step: Double,
      everyFn: js.Function3[/* el */ T, /* i */ Double, /* r */ Range, Unit]
    ): typings.sugar.Array[T] = js.native
    
    def week(instance: Double): Double = js.native
    
    def weekAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def weekAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def weekAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def weekAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def weekAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def weekAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def weekAgo(instance: Double): typings.sugar.Date = js.native
    
    def weekBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def weekBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def weekBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def weekBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def weekBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def weekBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def weekFromNow(instance: Double): typings.sugar.Date = js.native
    
    def weeks(instance: Double): Double = js.native
    
    def weeksAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def weeksAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def weeksAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def weeksAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def weeksAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def weeksAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def weeksAgo(instance: Double): typings.sugar.Date = js.native
    
    def weeksBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def weeksBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def weeksBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def weeksBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def weeksBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def weeksBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def weeksFromNow(instance: Double): typings.sugar.Date = js.native
    
    def year(instance: Double): Double = js.native
    
    def yearAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def yearAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def yearAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def yearAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def yearAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def yearAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def yearAgo(instance: Double): typings.sugar.Date = js.native
    
    def yearBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def yearBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def yearBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def yearBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def yearBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def yearBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def yearFromNow(instance: Double): typings.sugar.Date = js.native
    
    def years(instance: Double): Double = js.native
    
    def yearsAfter(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def yearsAfter(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def yearsAfter(instance: Double, d: Double): typings.sugar.Date = js.native
    def yearsAfter(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def yearsAfter(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def yearsAfter(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def yearsAgo(instance: Double): typings.sugar.Date = js.native
    
    def yearsBefore(instance: Double, d: java.lang.String): typings.sugar.Date = js.native
    def yearsBefore(instance: Double, d: java.lang.String, options: DateCreateOptions): typings.sugar.Date = js.native
    def yearsBefore(instance: Double, d: Double): typings.sugar.Date = js.native
    def yearsBefore(instance: Double, d: Double, options: DateCreateOptions): typings.sugar.Date = js.native
    def yearsBefore(instance: Double, d: typings.sugar.Date): typings.sugar.Date = js.native
    def yearsBefore(instance: Double, d: typings.sugar.Date, options: DateCreateOptions): typings.sugar.Date = js.native
    
    def yearsFromNow(instance: Double): typings.sugar.Date = js.native
  }
  
  @js.native
  trait NumberOptions extends StObject {
    
    var decimal: java.lang.String = js.native
    
    var thousands: java.lang.String = js.native
  }
  object NumberOptions {
    
    @scala.inline
    def apply(decimal: java.lang.String, thousands: java.lang.String): NumberOptions = {
      val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
      __obj.asInstanceOf[NumberOptions]
    }
    
    @scala.inline
    implicit class NumberOptionsMutableBuilder[Self <: NumberOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimal(value: java.lang.String): Self = StObject.set(x, "decimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThousands(value: java.lang.String): Self = StObject.set(x, "thousands", value.asInstanceOf[js.Any])
    }
  }
}

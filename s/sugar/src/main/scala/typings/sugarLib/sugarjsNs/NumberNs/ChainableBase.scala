package typings
package sugarLib.sugarjsNs.NumberNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableBase[RawValue] extends js.Object {
  var raw: RawValue = js.native
  def abbr(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def abbr(precision: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def abs(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def acos(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def asin(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def atan(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def bytes(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def bytes(precision: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def bytes(precision: scala.Double, binary: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def bytes(precision: scala.Double, binary: scala.Boolean, units: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def cap(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def cap(max: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def ceil(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def ceil(precision: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def chr(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def clamp(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def clamp(start: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def clamp(start: scala.Double, end: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def cos(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def day(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def dayAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def dayAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def dayAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def dayAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def dayAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def dayAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def dayAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def dayBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def dayBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def dayBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def dayBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def dayBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def dayBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def dayFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def days(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def daysAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def daysFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def downto[T](num: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def downto[T](
    num: scala.Double,
    everyFn: js.Function3[
      /* el */ T, 
      /* i */ scala.Double, 
      /* r */ sugarLib.sugarjsNs.Range, 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def downto[T](num: scala.Double, step: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def downto[T](
    num: scala.Double,
    step: scala.Double,
    everyFn: js.Function3[
      /* el */ T, 
      /* i */ scala.Double, 
      /* r */ sugarLib.sugarjsNs.Range, 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def duration(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def duration(localeCode: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def exp(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def floor(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def floor(precision: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def format(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def format(place: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def hex(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def hex(pad: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def hour(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hourAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hourAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hourAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hourAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hourAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hourAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hourAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hourBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hourBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hourBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hourBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hourBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hourBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hourFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hours(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def hoursAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hoursAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hoursAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hoursAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hoursAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hoursAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hoursAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hoursBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hoursBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hoursBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hoursBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hoursBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hoursBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def hoursFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def isEven(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isInteger(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isMultipleOf(num: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def isOdd(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Boolean] = js.native
  def log(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def log(base: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def metric(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def metric(precision: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def metric(precision: scala.Double, units: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def millisecond(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def milliseconds(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def millisecondsAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondsAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondsAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondsAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondsAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondsAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondsAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondsBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondsBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondsBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondsBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondsBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondsBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def millisecondsFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minute(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minuteAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minuteAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minuteAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minuteAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minuteAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minuteAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minuteAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minuteBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minuteBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minuteBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minuteBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minuteBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minuteBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minuteFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutes(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def minutesAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutesAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutesAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutesAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutesAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutesAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutesAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutesBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutesBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutesBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutesBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutesBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutesBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def minutesFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def month(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def months(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def monthsAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthsAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthsAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthsAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthsAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthsAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthsAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthsBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthsBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthsBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthsBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthsBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthsBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def monthsFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def ordinalize(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def pad(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def pad(place: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def pad(place: scala.Double, sign: scala.Boolean): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def pad(place: scala.Double, sign: scala.Boolean, base: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def pow(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def round(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def round(precision: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def second(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def seconds(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def secondsAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def secondsFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def sin(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def sqrt(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def tan(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def times[T](indexMapFn: js.Function1[/* i */ scala.Double, sugarLib.sugarjsNs.SugarDefaultChainable[_]]): sugarLib.sugarjsNs.SugarDefaultChainable[T] = js.native
  def toExponential(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toExponential(fractionDigits: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toFixed(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toFixed(fractionDigits: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleString(locales: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleString(locales: java.lang.String, options: stdLib.IntlNs.NumberFormatOptions): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleString(locales: js.Array[java.lang.String]): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toLocaleString(locales: js.Array[java.lang.String], options: stdLib.IntlNs.NumberFormatOptions): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toNumber(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def toPrecision(): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def toPrecision(precision: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[java.lang.String] = js.native
  def upto[T](num: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def upto[T](
    num: scala.Double,
    everyFn: js.Function3[
      /* el */ T, 
      /* i */ scala.Double, 
      /* r */ sugarLib.sugarjsNs.Range, 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def upto[T](num: scala.Double, step: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def upto[T](
    num: scala.Double,
    step: scala.Double,
    everyFn: js.Function3[
      /* el */ T, 
      /* i */ scala.Double, 
      /* r */ sugarLib.sugarjsNs.Range, 
      sugarLib.sugarjsNs.SugarDefaultChainable[scala.Unit]
    ]
  ): sugarLib.sugarjsNs.SugarDefaultChainable[js.Array[T]] = js.native
  def week(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weekAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weekAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weekAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weekAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weekAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weekAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weekAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weekBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weekBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weekBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weekBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weekBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weekBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weekFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeks(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def weeksAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeksAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeksAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeksAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeksAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeksAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeksAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeksBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeksBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeksBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeksBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeksBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeksBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def weeksFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def year(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def years(): sugarLib.sugarjsNs.SugarDefaultChainable[scala.Double] = js.native
  def yearsAfter(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearsAfter(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearsAfter(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearsAfter(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearsAfter(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearsAfter(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearsAgo(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearsBefore(d: java.lang.String): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearsBefore(d: java.lang.String, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearsBefore(d: scala.Double): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearsBefore(d: scala.Double, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearsBefore(d: stdLib.Date): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearsBefore(d: stdLib.Date, options: sugarLib.sugarjsNs.DateNs.DateCreateOptions): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
  def yearsFromNow(): sugarLib.sugarjsNs.SugarDefaultChainable[stdLib.Date] = js.native
}


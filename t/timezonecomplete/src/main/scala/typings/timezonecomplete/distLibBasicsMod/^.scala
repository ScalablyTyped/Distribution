package typings.timezonecomplete.distLibBasicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/basics", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def binaryInsertionIndex[T](arr: js.Array[T], compare: js.Function1[/* a */ T, Double]): Double = js.native
  def dayOfYear(year: Double, month: Double, day: Double): Double = js.native
  def daysInMonth(year: Double, month: Double): Double = js.native
  def daysInYear(year: Double): Double = js.native
  def firstWeekDayOfMonth(year: Double, month: Double, weekDay: WeekDay): Double = js.native
  def isLeapYear(year: Double): Boolean = js.native
  def lastWeekDayOfMonth(year: Double, month: Double, weekDay: WeekDay): Double = js.native
  def secondOfDay(hour: Double, minute: Double, second: Double): Double = js.native
  def stringToTimeUnit(s: String): TimeUnit = js.native
  def timeToUnixNoLeapSecs(components: TimeComponentOpts): Double = js.native
  def timeToUnixNoLeapSecs(
    year: Double,
    month: Double,
    day: Double,
    hour: Double,
    minute: Double,
    second: Double,
    milli: Double
  ): Double = js.native
  def timeUnitToMilliseconds(unit: TimeUnit): Double = js.native
  def timeUnitToString(unit: TimeUnit): String = js.native
  def timeUnitToString(unit: TimeUnit, amount: Double): String = js.native
  def unixToTimeNoLeapSecs(unixMillis: Double): TimeComponents = js.native
  def weekDayNoLeapSecs(unixMillis: Double): WeekDay = js.native
  def weekDayOnOrAfter(year: Double, month: Double, day: Double, weekDay: WeekDay): Double = js.native
  def weekDayOnOrBefore(year: Double, month: Double, day: Double, weekDay: WeekDay): Double = js.native
  def weekNumber(year: Double, month: Double, day: Double): Double = js.native
  def weekOfMonth(year: Double, month: Double, day: Double): Double = js.native
}


package typings
package timezonecompleteLib.distLibBasicsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("timezonecomplete/dist/lib/basics", JSImport.Namespace)
@js.native
object distLibBasicsModMembers extends js.Object {
  def binaryInsertionIndex[T](arr: js.Array[T], compare: js.Function1[/* a */ T, scala.Double]): scala.Double = js.native
  def dayOfYear(year: scala.Double, month: scala.Double, day: scala.Double): scala.Double = js.native
  def daysInMonth(year: scala.Double, month: scala.Double): scala.Double = js.native
  def daysInYear(year: scala.Double): scala.Double = js.native
  def firstWeekDayOfMonth(year: scala.Double, month: scala.Double, weekDay: WeekDay): scala.Double = js.native
  def isLeapYear(year: scala.Double): scala.Boolean = js.native
  def lastWeekDayOfMonth(year: scala.Double, month: scala.Double, weekDay: WeekDay): scala.Double = js.native
  def secondOfDay(hour: scala.Double, minute: scala.Double, second: scala.Double): scala.Double = js.native
  def stringToTimeUnit(s: java.lang.String): TimeUnit = js.native
  def timeToUnixNoLeapSecs(components: TimeComponentOpts): scala.Double = js.native
  def timeToUnixNoLeapSecs(
    year: scala.Double,
    month: scala.Double,
    day: scala.Double,
    hour: scala.Double,
    minute: scala.Double,
    second: scala.Double,
    milli: scala.Double
  ): scala.Double = js.native
  def timeUnitToMilliseconds(unit: TimeUnit): scala.Double = js.native
  def timeUnitToString(unit: TimeUnit): java.lang.String = js.native
  def timeUnitToString(unit: TimeUnit, amount: scala.Double): java.lang.String = js.native
  def unixToTimeNoLeapSecs(unixMillis: scala.Double): TimeComponents = js.native
  def weekDayNoLeapSecs(unixMillis: scala.Double): WeekDay = js.native
  def weekDayOnOrAfter(year: scala.Double, month: scala.Double, day: scala.Double, weekDay: WeekDay): scala.Double = js.native
  def weekDayOnOrBefore(year: scala.Double, month: scala.Double, day: scala.Double, weekDay: WeekDay): scala.Double = js.native
  def weekNumber(year: scala.Double, month: scala.Double, day: scala.Double): scala.Double = js.native
  def weekOfMonth(year: scala.Double, month: scala.Double, day: scala.Double): scala.Double = js.native
}


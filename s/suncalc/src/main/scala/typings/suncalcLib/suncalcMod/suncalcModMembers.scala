package typings
package suncalcLib.suncalcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("suncalc", JSImport.Namespace)
@js.native
object suncalcModMembers extends js.Object {
  def addTime(angleInDegrees: scala.Double, morningName: java.lang.String, eveningName: java.lang.String): scala.Unit = js.native
  def getMoonIllumination(timeAndDate: stdLib.Date): GetMoonIlluminationResult = js.native
  def getMoonPosition(timeAndDate: stdLib.Date, latitude: scala.Double, longitude: scala.Double): GetMoonPositionResult = js.native
  def getMoonTimes(date: stdLib.Date, latitude: scala.Double, longitude: scala.Double): GetMoonTimes = js.native
  def getMoonTimes(date: stdLib.Date, latitude: scala.Double, longitude: scala.Double, inUTC: scala.Boolean): GetMoonTimes = js.native
  def getPosition(timeAndDate: stdLib.Date, latitude: scala.Double, longitude: scala.Double): GetSunPositionResult = js.native
  def getTimes(date: stdLib.Date, latitude: scala.Double, longitude: scala.Double): GetTimesResult = js.native
}


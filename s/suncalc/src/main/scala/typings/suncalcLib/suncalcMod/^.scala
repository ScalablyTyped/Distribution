package typings
package suncalcLib.suncalcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("suncalc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addTime(angleInDegrees: scala.Double, morningName: java.lang.String, eveningName: java.lang.String): scala.Unit = js.native
  def getMoonIllumination(timeAndDate: stdLib.Date): suncalcLib.suncalcMod.GetMoonIlluminationResult = js.native
  def getMoonPosition(timeAndDate: stdLib.Date, latitude: scala.Double, longitude: scala.Double): suncalcLib.suncalcMod.GetMoonPositionResult = js.native
  def getMoonTimes(date: stdLib.Date, latitude: scala.Double, longitude: scala.Double): suncalcLib.suncalcMod.GetMoonTimes = js.native
  def getMoonTimes(date: stdLib.Date, latitude: scala.Double, longitude: scala.Double, inUTC: scala.Boolean): suncalcLib.suncalcMod.GetMoonTimes = js.native
  def getPosition(timeAndDate: stdLib.Date, latitude: scala.Double, longitude: scala.Double): suncalcLib.suncalcMod.GetSunPositionResult = js.native
  def getTimes(date: stdLib.Date, latitude: scala.Double, longitude: scala.Double): suncalcLib.suncalcMod.GetTimesResult = js.native
}


package typings.suncalc.suncalcMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("suncalc", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addTime(angleInDegrees: Double, morningName: String, eveningName: String): Unit = js.native
  def getMoonIllumination(timeAndDate: Date): GetMoonIlluminationResult = js.native
  def getMoonPosition(timeAndDate: Date, latitude: Double, longitude: Double): GetMoonPositionResult = js.native
  def getMoonTimes(date: Date, latitude: Double, longitude: Double): GetMoonTimes = js.native
  def getMoonTimes(date: Date, latitude: Double, longitude: Double, inUTC: Boolean): GetMoonTimes = js.native
  def getPosition(timeAndDate: Date, latitude: Double, longitude: Double): GetSunPositionResult = js.native
  def getTimes(date: Date, latitude: Double, longitude: Double): GetTimesResult = js.native
}


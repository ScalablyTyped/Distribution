package typings.sunriseDashSunsetDashJs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sunrise-sunset-js", JSImport.Namespace)
@js.native
object sunriseDashSunsetDashJsMod extends js.Object {
  def getSunrise(latitude: Double, longitude: Double): Date = js.native
  def getSunrise(latitude: Double, longitude: Double, date: Date): Date = js.native
  def getSunset(latitude: Double, longitude: Double): Date = js.native
  def getSunset(latitude: Double, longitude: Double, date: Date): Date = js.native
}


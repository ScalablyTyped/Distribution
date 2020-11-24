package typings.suncalc.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("suncalc", "getMoonTimes")
@js.native
object getMoonTimes extends js.Object {
  
  def apply(date: Date, latitude: Double, longitude: Double): GetMoonTimes_ = js.native
  def apply(date: Date, latitude: Double, longitude: Double, inUTC: Boolean): GetMoonTimes_ = js.native
}

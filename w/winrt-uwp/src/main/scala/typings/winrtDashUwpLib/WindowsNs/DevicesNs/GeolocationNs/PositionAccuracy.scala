package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionAccuracy extends js.Object

/** Indicates the requested accuracy level for the location data that the application uses. */
@JSGlobal("Windows.Devices.Geolocation.PositionAccuracy")
@js.native
object PositionAccuracy extends js.Object {
  /** Optimize for power, performance, and other cost considerations. */
  @js.native
  sealed trait default
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionAccuracy
  
  /** Deliver the most accurate report possible. This includes using services that might charge money, or consuming higher levels of battery power or connection bandwidth. An accuracy level of High may degrade system performance and should be used only when necessary. */
  @js.native
  sealed trait high
    extends winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionAccuracy
  
  val default: default with java.lang.String = js.native
  val high: high with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.GeolocationNs.PositionAccuracy with java.lang.String
  ] = js.native
}


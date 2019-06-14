package typings
package winrtLib.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionAccuracy extends js.Object

@JSGlobal("Windows.Devices.Geolocation.PositionAccuracy")
@js.native
object PositionAccuracy extends js.Object {
  @js.native
  sealed trait default
    extends winrtLib.WindowsNs.DevicesNs.GeolocationNs.PositionAccuracy
  
  @js.native
  sealed trait high
    extends winrtLib.WindowsNs.DevicesNs.GeolocationNs.PositionAccuracy
  
  /* 0 */ val default: default with scala.Double = js.native
  /* 1 */ val high: high with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.GeolocationNs.PositionAccuracy with scala.Double] = js.native
}


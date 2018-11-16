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
  
  val default: default with java.lang.String = js.native
  val high: high with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.DevicesNs.GeolocationNs.PositionAccuracy with java.lang.String
  ] = js.native
}


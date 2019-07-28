package typings.winrt.WindowsNs.DevicesNs.GeolocationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PositionAccuracy extends js.Object

@JSGlobal("Windows.Devices.Geolocation.PositionAccuracy")
@js.native
object PositionAccuracy extends js.Object {
  @js.native
  sealed trait default extends PositionAccuracy
  
  @js.native
  sealed trait high extends PositionAccuracy
  
  /* 0 */ val default: typings.winrt.WindowsNs.DevicesNs.GeolocationNs.PositionAccuracy.default with Double = js.native
  /* 1 */ val high: typings.winrt.WindowsNs.DevicesNs.GeolocationNs.PositionAccuracy.high with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PositionAccuracy with Double] = js.native
}


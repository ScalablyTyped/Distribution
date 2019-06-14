package typings
package winrtLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerDeviceType extends js.Object

@JSGlobal("Windows.Devices.Input.PointerDeviceType")
@js.native
object PointerDeviceType extends js.Object {
  @js.native
  sealed trait mouse
    extends winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  
  @js.native
  sealed trait pen
    extends winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  
  @js.native
  sealed trait touch
    extends winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  
  /* 2 */ val mouse: mouse with scala.Double = js.native
  /* 1 */ val pen: pen with scala.Double = js.native
  /* 0 */ val touch: touch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType with scala.Double] = js.native
}


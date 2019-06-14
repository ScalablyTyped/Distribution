package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.InputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerDeviceType extends js.Object

/** Enumerates pointer device types. */
@JSGlobal("Windows.Devices.Input.PointerDeviceType")
@js.native
object PointerDeviceType extends js.Object {
  /** Mouse */
  @js.native
  sealed trait mouse
    extends winrtDashUwpLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  
  /** Pen */
  @js.native
  sealed trait pen
    extends winrtDashUwpLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  
  /** A touch-enabled device */
  @js.native
  sealed trait touch
    extends winrtDashUwpLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType
  
  /* 2 */ val mouse: mouse with scala.Double = js.native
  /* 1 */ val pen: pen with scala.Double = js.native
  /* 0 */ val touch: touch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType with scala.Double] = js.native
}


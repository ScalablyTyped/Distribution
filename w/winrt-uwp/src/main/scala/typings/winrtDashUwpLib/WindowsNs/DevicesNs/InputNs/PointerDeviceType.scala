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
  
  val mouse: mouse with java.lang.String = js.native
  val pen: pen with java.lang.String = js.native
  val touch: touch with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType with java.lang.String
  ] = js.native
}


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
  
  val mouse: mouse with java.lang.String = js.native
  val pen: pen with java.lang.String = js.native
  val touch: touch with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DevicesNs.InputNs.PointerDeviceType with java.lang.String] = js.native
}


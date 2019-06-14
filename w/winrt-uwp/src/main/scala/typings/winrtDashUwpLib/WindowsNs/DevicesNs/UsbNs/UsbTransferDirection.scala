package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UsbTransferDirection extends js.Object

/** Defines constants that indicate the direction of USB transfer: IN or OUT transfers. */
@JSGlobal("Windows.Devices.Usb.UsbTransferDirection")
@js.native
object UsbTransferDirection extends js.Object {
  /** Indicates an IN transfer from the device to the host. */
  @js.native
  sealed trait in
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbTransferDirection
  
  /** Indicates an OUT transfer from the host to the device. */
  @js.native
  sealed trait out
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbTransferDirection
  
  /* 1 */ val in: in with scala.Double = js.native
  /* 0 */ val out: out with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbTransferDirection with scala.Double] = js.native
}


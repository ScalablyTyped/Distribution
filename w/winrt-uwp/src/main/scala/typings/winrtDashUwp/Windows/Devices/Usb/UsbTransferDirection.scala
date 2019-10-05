package typings.winrtDashUwp.Windows.Devices.Usb

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
  sealed trait in extends UsbTransferDirection
  
  /** Indicates an OUT transfer from the host to the device. */
  @js.native
  sealed trait out extends UsbTransferDirection
  
  /* 1 */ val in: typings.winrtDashUwp.Windows.Devices.Usb.UsbTransferDirection.in with Double = js.native
  /* 0 */ val out: typings.winrtDashUwp.Windows.Devices.Usb.UsbTransferDirection.out with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UsbTransferDirection with Double] = js.native
}


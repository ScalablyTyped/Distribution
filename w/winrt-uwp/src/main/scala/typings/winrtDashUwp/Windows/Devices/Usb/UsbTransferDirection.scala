package typings.winrtDashUwp.Windows.Devices.Usb

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Usb.UsbTransferDirection.in
import typings.winrtDashUwp.Windows.Devices.Usb.UsbTransferDirection.out
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UsbTransferDirection with Double] = js.native
  /* 1 */ @js.native
  object in extends TopLevel[in with Double]
  
  /* 0 */ @js.native
  object out extends TopLevel[out with Double]
  
}


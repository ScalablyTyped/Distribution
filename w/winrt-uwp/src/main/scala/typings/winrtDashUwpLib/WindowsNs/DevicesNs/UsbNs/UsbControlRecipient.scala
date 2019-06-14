package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UsbControlRecipient extends js.Object

/** Defines constants that indicate the recipient of a USB control transfer. The recipient is defined in the setup packet of the control request. See Table 9.2 of section 9.3 of the Universal Serial Bus (USB) specification (www.usb.org). */
@JSGlobal("Windows.Devices.Usb.UsbControlRecipient")
@js.native
object UsbControlRecipient extends js.Object {
  /** The recipient of the control transfer is the default (or the first) USB interface in the selected configuration of the device. */
  @js.native
  sealed trait defaultInterface
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbControlRecipient
  
  /** The recipient of the control transfer is the device. */
  @js.native
  sealed trait device
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbControlRecipient
  
  /** The recipient of the control transfer is an endpoint. */
  @js.native
  sealed trait endpoint
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbControlRecipient
  
  /** The recipient of the control transfer is other. */
  @js.native
  sealed trait other
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbControlRecipient
  
  /** The recipient of the control transfer is the USB interface that is specified in the request. */
  @js.native
  sealed trait specifiedInterface
    extends winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbControlRecipient
  
  /* 4 */ val defaultInterface: defaultInterface with scala.Double = js.native
  /* 0 */ val device: device with scala.Double = js.native
  /* 2 */ val endpoint: endpoint with scala.Double = js.native
  /* 3 */ val other: other with scala.Double = js.native
  /* 1 */ val specifiedInterface: specifiedInterface with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs.UsbControlRecipient with scala.Double] = js.native
}


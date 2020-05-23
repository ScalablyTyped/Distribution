package typings.winrtUwp.global.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines constants that indicate the recipient of a USB control transfer. The recipient is defined in the setup packet of the control request. See Table 9.2 of section 9.3 of the Universal Serial Bus (USB) specification (www.usb.org). */
@JSGlobal("Windows.Devices.Usb.UsbControlRecipient")
@js.native
object UsbControlRecipient extends js.Object {
  /* 4 */ val defaultInterface: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.defaultInterface with Double = js.native
  /* 0 */ val device: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.device with Double = js.native
  /* 2 */ val endpoint: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.endpoint with Double = js.native
  /* 3 */ val other: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.other with Double = js.native
  /* 1 */ val specifiedInterface: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient.specifiedInterface with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient with Double] = js.native
}


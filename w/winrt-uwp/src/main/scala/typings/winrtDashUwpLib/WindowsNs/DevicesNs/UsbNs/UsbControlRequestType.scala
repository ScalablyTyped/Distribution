package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the USB control transfer, the type of control request, whether the data is sent from or to the host, and the recipient of the request in the device. */
@JSGlobal("Windows.Devices.Usb.UsbControlRequestType")
@js.native
/** Creates a UsbControlRequestType object. */
class UsbControlRequestType () extends js.Object {
  /** Gets or sets the bmRequestType value as a byte. */
  var asByte: scala.Double = js.native
  /** Gets or sets the type of USB control transfer: standard, class, or vendor. */
  var controlTransferType: UsbControlTransferType = js.native
  /** Gets or sets the direction of the USB control transfer. */
  var direction: UsbTransferDirection = js.native
  /** Gets or sets the recipient of the USB control transfer. */
  var recipient: UsbControlRecipient = js.native
}


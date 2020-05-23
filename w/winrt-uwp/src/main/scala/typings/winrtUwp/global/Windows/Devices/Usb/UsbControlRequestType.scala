package typings.winrtUwp.global.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the USB control transfer, the type of control request, whether the data is sent from or to the host, and the recipient of the request in the device. */
@JSGlobal("Windows.Devices.Usb.UsbControlRequestType")
@js.native
/** Creates a UsbControlRequestType object. */
class UsbControlRequestType ()
  extends typings.winrtUwp.Windows.Devices.Usb.UsbControlRequestType {
  /** Gets or sets the bmRequestType value as a byte. */
  /* CompleteClass */
  override var asByte: Double = js.native
  /** Gets or sets the type of USB control transfer: standard, class, or vendor. */
  /* CompleteClass */
  override var controlTransferType: typings.winrtUwp.Windows.Devices.Usb.UsbControlTransferType = js.native
  /** Gets or sets the direction of the USB control transfer. */
  /* CompleteClass */
  override var direction: typings.winrtUwp.Windows.Devices.Usb.UsbTransferDirection = js.native
  /** Gets or sets the recipient of the USB control transfer. */
  /* CompleteClass */
  override var recipient: typings.winrtUwp.Windows.Devices.Usb.UsbControlRecipient = js.native
}


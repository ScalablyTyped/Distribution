package typings.winrtUwp.global.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The endpoint descriptor for a USB bulk OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. */
@JSGlobal("Windows.Devices.Usb.UsbBulkOutEndpointDescriptor")
@js.native
abstract class UsbBulkOutEndpointDescriptor ()
  extends typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutEndpointDescriptor {
  /** Gets the USB endpoint number of the bulk OUT endpoint. */
  /* CompleteClass */
  override var endpointNumber: Double = js.native
  /** Gets the maximum number of bytes that can be sent to or received from this endpoint. */
  /* CompleteClass */
  override var maxPacketSize: Double = js.native
  /** Gets the object that represents the pipe that the host opens to communicate with the bulk IN endpoint. */
  /* CompleteClass */
  override var pipe: typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutPipe = js.native
}


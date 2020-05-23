package typings.winrtUwp.global.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The endpoint descriptor for a USB bulk IN endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be read from the endpoint, in a single transfer. */
@JSGlobal("Windows.Devices.Usb.UsbBulkInEndpointDescriptor")
@js.native
abstract class UsbBulkInEndpointDescriptor ()
  extends typings.winrtUwp.Windows.Devices.Usb.UsbBulkInEndpointDescriptor {
  /** Gets the USB endpoint number of the bulk IN endpoint. */
  /* CompleteClass */
  override var endpointNumber: Double = js.native
  /** Gets the maximum number of bytes that can be sent to or received from this endpoint, in a single packet. */
  /* CompleteClass */
  override var maxPacketSize: Double = js.native
  /** Gets the object that represents the pipe that the host opens to communicate with the bulk IN endpoint. */
  /* CompleteClass */
  override var pipe: typings.winrtUwp.Windows.Devices.Usb.UsbBulkInPipe = js.native
}


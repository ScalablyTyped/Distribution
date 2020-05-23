package typings.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The endpoint descriptor for a USB bulk OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. */
trait UsbBulkOutEndpointDescriptor extends js.Object {
  /** Gets the USB endpoint number of the bulk OUT endpoint. */
  var endpointNumber: Double
  /** Gets the maximum number of bytes that can be sent to or received from this endpoint. */
  var maxPacketSize: Double
  /** Gets the object that represents the pipe that the host opens to communicate with the bulk IN endpoint. */
  var pipe: UsbBulkOutPipe
}

object UsbBulkOutEndpointDescriptor {
  @scala.inline
  def apply(endpointNumber: Double, maxPacketSize: Double, pipe: UsbBulkOutPipe): UsbBulkOutEndpointDescriptor = {
    val __obj = js.Dynamic.literal(endpointNumber = endpointNumber.asInstanceOf[js.Any], maxPacketSize = maxPacketSize.asInstanceOf[js.Any], pipe = pipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbBulkOutEndpointDescriptor]
  }
}


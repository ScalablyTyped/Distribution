package typings.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The endpoint descriptor for a USB bulk OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. */
@js.native
trait UsbBulkOutEndpointDescriptor extends js.Object {
  /** Gets the USB endpoint number of the bulk OUT endpoint. */
  var endpointNumber: Double = js.native
  /** Gets the maximum number of bytes that can be sent to or received from this endpoint. */
  var maxPacketSize: Double = js.native
  /** Gets the object that represents the pipe that the host opens to communicate with the bulk IN endpoint. */
  var pipe: UsbBulkOutPipe = js.native
}

object UsbBulkOutEndpointDescriptor {
  @scala.inline
  def apply(endpointNumber: Double, maxPacketSize: Double, pipe: UsbBulkOutPipe): UsbBulkOutEndpointDescriptor = {
    val __obj = js.Dynamic.literal(endpointNumber = endpointNumber.asInstanceOf[js.Any], maxPacketSize = maxPacketSize.asInstanceOf[js.Any], pipe = pipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbBulkOutEndpointDescriptor]
  }
  @scala.inline
  implicit class UsbBulkOutEndpointDescriptorOps[Self <: UsbBulkOutEndpointDescriptor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndpointNumber(value: Double): Self = this.set("endpointNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxPacketSize(value: Double): Self = this.set("maxPacketSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setPipe(value: UsbBulkOutPipe): Self = this.set("pipe", value.asInstanceOf[js.Any])
  }
  
}


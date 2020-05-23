package typings.winrtUwp.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The endpoint descriptor for a USB interrupt OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. The app can also get information about how often the host polls the endpoint to send data. */
trait UsbInterruptOutEndpointDescriptor extends js.Object {
  /** Gets the USB endpoint number of the interrupt OUT endpoint. */
  var endpointNumber: Double
  /** Gets the poling interval of the USB interrupt endpoint. */
  var interval: Double
  /** Gets the maximum number of bytes that can be sent to or received from this endpoint. */
  var maxPacketSize: Double
  /** Gets the object that represents the pipe that the host opens to communicate with the interrupt OUT endpoint. */
  var pipe: UsbInterruptOutPipe
}

object UsbInterruptOutEndpointDescriptor {
  @scala.inline
  def apply(endpointNumber: Double, interval: Double, maxPacketSize: Double, pipe: UsbInterruptOutPipe): UsbInterruptOutEndpointDescriptor = {
    val __obj = js.Dynamic.literal(endpointNumber = endpointNumber.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], maxPacketSize = maxPacketSize.asInstanceOf[js.Any], pipe = pipe.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbInterruptOutEndpointDescriptor]
  }
}


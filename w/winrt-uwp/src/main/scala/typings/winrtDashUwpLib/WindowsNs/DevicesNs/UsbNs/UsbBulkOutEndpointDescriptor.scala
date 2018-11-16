package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The endpoint descriptor for a USB bulk OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. */
@JSGlobal("Windows.Devices.Usb.UsbBulkOutEndpointDescriptor")
@js.native
abstract class UsbBulkOutEndpointDescriptor () extends js.Object {
  /** Gets the USB endpoint number of the bulk OUT endpoint. */
  var endpointNumber: scala.Double = js.native
  /** Gets the maximum number of bytes that can be sent to or received from this endpoint. */
  var maxPacketSize: scala.Double = js.native
  /** Gets the object that represents the pipe that the host opens to communicate with the bulk IN endpoint. */
  var pipe: UsbBulkOutPipe = js.native
}


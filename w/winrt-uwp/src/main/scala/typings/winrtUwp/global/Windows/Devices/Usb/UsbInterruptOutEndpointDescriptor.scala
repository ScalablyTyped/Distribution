package typings.winrtUwp.global.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The endpoint descriptor for a USB interrupt OUT endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be written to the endpoint, in a single transfer. The app can also get information about how often the host polls the endpoint to send data. */
@JSGlobal("Windows.Devices.Usb.UsbInterruptOutEndpointDescriptor")
@js.native
abstract class UsbInterruptOutEndpointDescriptor ()
  extends typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutEndpointDescriptor {
  /** Gets the USB endpoint number of the interrupt OUT endpoint. */
  /* CompleteClass */
  override var endpointNumber: Double = js.native
  /** Gets the poling interval of the USB interrupt endpoint. */
  /* CompleteClass */
  override var interval: Double = js.native
  /** Gets the maximum number of bytes that can be sent to or received from this endpoint. */
  /* CompleteClass */
  override var maxPacketSize: Double = js.native
  /** Gets the object that represents the pipe that the host opens to communicate with the interrupt OUT endpoint. */
  /* CompleteClass */
  override var pipe: typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutPipe = js.native
}


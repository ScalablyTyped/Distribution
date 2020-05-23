package typings.winrtUwp.global.Windows.Devices.Usb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The endpoint descriptor for a USB interrupt IN endpoint. The descriptor specifies the endpoint type, direction, number and also the maximum number of bytes that can be read from the endpoint, in a single transfer. The app can also get information about how often the host polls the endpoint for data. */
@JSGlobal("Windows.Devices.Usb.UsbInterruptInEndpointDescriptor")
@js.native
abstract class UsbInterruptInEndpointDescriptor ()
  extends typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInEndpointDescriptor {
  /** Gets the USB endpoint number of the interrupt IN endpoint. */
  /* CompleteClass */
  override var endpointNumber: Double = js.native
  /** Gets the poling interval of the USB interrupt endpoint. */
  /* CompleteClass */
  override var interval: Double = js.native
  /** Gets the maximum number of bytes that can be sent to or received (in a packet) from this endpoint. */
  /* CompleteClass */
  override var maxPacketSize: Double = js.native
  /** Gets the object that represents the pipe that the host opens to communicate with the interrupt IN endpoint. */
  /* CompleteClass */
  override var pipe: typings.winrtUwp.Windows.Devices.Usb.UsbInterruptInPipe = js.native
}


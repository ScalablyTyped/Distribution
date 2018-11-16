package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.UsbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the pipe that the underlying USB driver opens to communicate with a USB bulk IN endpoint of the device. The app can get an input stream from the pipe and access data is being read from the endpoint. */
@JSGlobal("Windows.Devices.Usb.UsbBulkInPipe")
@js.native
abstract class UsbBulkInPipe () extends js.Object {
  /** Gets the object that represents endpoint descriptor associated with the USB bulk IN endpoint. */
  var endpointDescriptor: UsbBulkInEndpointDescriptor = js.native
  /** Input stream that stores the data that the bulk IN pipe received from the endpoint. */
  var inputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
  /** Gets the maximum number of bytes that can be read from the bulk IN pipe in a single transfer. */
  var maxTransferSizeBytes: scala.Double = js.native
  /** Gets or sets configuration flags that controls the behavior of the pipe that reads data from a USB bulk IN endpoint. */
  var readOptions: UsbReadOptions = js.native
  /**
                   * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB bulk IN endpoint that is associated with the pipe.
                   * @return An IAsyncAction object that is used to control the asynchronous operation.
                   */
  def clearStallAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /** Discards any data that is cached in the bulk IN pipe. */
  def flushBuffer(): scala.Unit = js.native
}


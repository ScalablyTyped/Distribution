package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the pipe that the underlying USB driver opens to communicate with a USB bulk IN endpoint of the device. The app can get an input stream from the pipe and access data is being read from the endpoint. */
trait UsbBulkInPipe extends js.Object {
  /** Gets the object that represents endpoint descriptor associated with the USB bulk IN endpoint. */
  var endpointDescriptor: UsbBulkInEndpointDescriptor
  /** Input stream that stores the data that the bulk IN pipe received from the endpoint. */
  var inputStream: IInputStream
  /** Gets the maximum number of bytes that can be read from the bulk IN pipe in a single transfer. */
  var maxTransferSizeBytes: Double
  /** Gets or sets configuration flags that controls the behavior of the pipe that reads data from a USB bulk IN endpoint. */
  var readOptions: UsbReadOptions
  /**
    * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB bulk IN endpoint that is associated with the pipe.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def clearStallAsync(): IPromiseWithIAsyncAction
  /** Discards any data that is cached in the bulk IN pipe. */
  def flushBuffer(): Unit
}

object UsbBulkInPipe {
  @scala.inline
  def apply(
    clearStallAsync: () => IPromiseWithIAsyncAction,
    endpointDescriptor: UsbBulkInEndpointDescriptor,
    flushBuffer: () => Unit,
    inputStream: IInputStream,
    maxTransferSizeBytes: Double,
    readOptions: UsbReadOptions
  ): UsbBulkInPipe = {
    val __obj = js.Dynamic.literal(clearStallAsync = js.Any.fromFunction0(clearStallAsync), endpointDescriptor = endpointDescriptor.asInstanceOf[js.Any], flushBuffer = js.Any.fromFunction0(flushBuffer), inputStream = inputStream.asInstanceOf[js.Any], maxTransferSizeBytes = maxTransferSizeBytes.asInstanceOf[js.Any], readOptions = readOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbBulkInPipe]
  }
}


package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the pipe that the underlying USB driver opens to communicate with a USB bulk OUT endpoint of the device. The object provides access to an output stream to which the app can write data to send to the endpoint. */
trait UsbBulkOutPipe extends js.Object {
  /** Gets the object that represents the endpoint descriptor associated with the USB bulk OUT endpoint. */
  var endpointDescriptor: UsbBulkOutEndpointDescriptor
  /** Gets an output stream to which the app can write data to send to the endpoint. */
  var outputStream: IOutputStream
  /** Gets or sets configuration flags that controls the behavior of the pipe that writes data to a USB bulk IN endpoint. */
  var writeOptions: UsbWriteOptions
  /**
    * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB bulk OUT endpoint that is associated with the pipe.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def clearStallAsync(): IPromiseWithIAsyncAction
}

object UsbBulkOutPipe {
  @scala.inline
  def apply(
    clearStallAsync: () => IPromiseWithIAsyncAction,
    endpointDescriptor: UsbBulkOutEndpointDescriptor,
    outputStream: IOutputStream,
    writeOptions: UsbWriteOptions
  ): UsbBulkOutPipe = {
    val __obj = js.Dynamic.literal(clearStallAsync = js.Any.fromFunction0(clearStallAsync), endpointDescriptor = endpointDescriptor.asInstanceOf[js.Any], outputStream = outputStream.asInstanceOf[js.Any], writeOptions = writeOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbBulkOutPipe]
  }
}


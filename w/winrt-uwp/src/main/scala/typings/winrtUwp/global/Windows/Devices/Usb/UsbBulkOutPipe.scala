package typings.winrtUwp.global.Windows.Devices.Usb

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the pipe that the underlying USB driver opens to communicate with a USB bulk OUT endpoint of the device. The object provides access to an output stream to which the app can write data to send to the endpoint. */
@JSGlobal("Windows.Devices.Usb.UsbBulkOutPipe")
@js.native
abstract class UsbBulkOutPipe ()
  extends typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutPipe {
  /** Gets the object that represents the endpoint descriptor associated with the USB bulk OUT endpoint. */
  /* CompleteClass */
  override var endpointDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbBulkOutEndpointDescriptor = js.native
  /** Gets an output stream to which the app can write data to send to the endpoint. */
  /* CompleteClass */
  override var outputStream: IOutputStream = js.native
  /** Gets or sets configuration flags that controls the behavior of the pipe that writes data to a USB bulk IN endpoint. */
  /* CompleteClass */
  override var writeOptions: typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions = js.native
  /**
    * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB bulk OUT endpoint that is associated with the pipe.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def clearStallAsync(): IPromiseWithIAsyncAction = js.native
}


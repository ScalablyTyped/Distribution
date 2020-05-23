package typings.winrtUwp.global.Windows.Devices.Usb

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the pipe that the underlying USB driver opens to communicate with a USB interrupt OUT endpoint of the device. The object provides access to an output stream to which the app can write data to send to the endpoint. */
@JSGlobal("Windows.Devices.Usb.UsbInterruptOutPipe")
@js.native
abstract class UsbInterruptOutPipe ()
  extends typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutPipe {
  /** Gets the object that represents the endpoint descriptor associated with the USB interrupt OUT endpoint. */
  /* CompleteClass */
  override var endpointDescriptor: typings.winrtUwp.Windows.Devices.Usb.UsbInterruptOutEndpointDescriptor = js.native
  /** Gets an output stream to which the app can write data to send to the endpoint. */
  /* CompleteClass */
  override var outputStream: IOutputStream = js.native
  /** Gets or sets configuration flags that controls the behavior of the pipe that writes data to a USB interrupt OUT endpoint. */
  /* CompleteClass */
  override var writeOptions: typings.winrtUwp.Windows.Devices.Usb.UsbWriteOptions = js.native
  /**
    * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB interrupt OUT endpoint that is associated with the pipe.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def clearStallAsync(): IPromiseWithIAsyncAction = js.native
}


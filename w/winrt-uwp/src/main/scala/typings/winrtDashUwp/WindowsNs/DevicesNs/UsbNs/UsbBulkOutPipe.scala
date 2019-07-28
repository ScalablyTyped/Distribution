package typings.winrtDashUwp.WindowsNs.DevicesNs.UsbNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the pipe that the underlying USB driver opens to communicate with a USB bulk OUT endpoint of the device. The object provides access to an output stream to which the app can write data to send to the endpoint. */
@JSGlobal("Windows.Devices.Usb.UsbBulkOutPipe")
@js.native
abstract class UsbBulkOutPipe () extends js.Object {
  /** Gets the object that represents the endpoint descriptor associated with the USB bulk OUT endpoint. */
  var endpointDescriptor: UsbBulkOutEndpointDescriptor = js.native
  /** Gets an output stream to which the app can write data to send to the endpoint. */
  var outputStream: IOutputStream = js.native
  /** Gets or sets configuration flags that controls the behavior of the pipe that writes data to a USB bulk IN endpoint. */
  var writeOptions: UsbWriteOptions = js.native
  /**
    * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB bulk OUT endpoint that is associated with the pipe.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def clearStallAsync(): IPromiseWithIAsyncAction = js.native
}


package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the pipe that the underlying USB driver opens to communicate with a USB bulk OUT endpoint of the device. The object provides access to an output stream to which the app can write data to send to the endpoint. */
@js.native
trait UsbBulkOutPipe extends StObject {
  
  /**
    * Starts an asynchronous operation to clear a stall condition (endpoint halt) on the USB bulk OUT endpoint that is associated with the pipe.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def clearStallAsync(): IPromiseWithIAsyncAction = js.native
  
  /** Gets the object that represents the endpoint descriptor associated with the USB bulk OUT endpoint. */
  var endpointDescriptor: UsbBulkOutEndpointDescriptor = js.native
  
  /** Gets an output stream to which the app can write data to send to the endpoint. */
  var outputStream: IOutputStream = js.native
  
  /** Gets or sets configuration flags that controls the behavior of the pipe that writes data to a USB bulk IN endpoint. */
  var writeOptions: UsbWriteOptions = js.native
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
  
  @scala.inline
  implicit class UsbBulkOutPipeMutableBuilder[Self <: UsbBulkOutPipe] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearStallAsync(value: () => IPromiseWithIAsyncAction): Self = StObject.set(x, "clearStallAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEndpointDescriptor(value: UsbBulkOutEndpointDescriptor): Self = StObject.set(x, "endpointDescriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputStream(value: IOutputStream): Self = StObject.set(x, "outputStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteOptions(value: UsbWriteOptions): Self = StObject.set(x, "writeOptions", value.asInstanceOf[js.Any])
  }
}

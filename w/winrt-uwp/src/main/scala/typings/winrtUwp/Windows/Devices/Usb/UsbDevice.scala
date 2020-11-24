package typings.winrtUwp.Windows.Devices.Usb

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a USB device. The object provides methods and properties that an app can use to find the device (in the system) with which the app wants to communicate, and sends IN and OUT control transfers to the device. */
@js.native
trait UsbDevice extends js.Object {
  
  /** Releases the reference to the UsbDevice object that was previously obtained by calling FromIdAsync . */
  def close(): Unit = js.native
  
  /** Gets an object that represents a USB configuration including all interfaces and their endpoints. */
  var configuration: UsbConfiguration = js.native
  
  /** Gets the object that represents the default or the first interface in a USB configuration. */
  var defaultInterface: UsbInterface = js.native
  
  /** Gets the object that represents the USB device descriptor. */
  var deviceDescriptor: UsbDeviceDescriptor = js.native
  
  /**
    * Starts a zero-length USB control transfer that reads from the default control endpoint of the device.
    * @param setupPacket A UsbSetupPacket object that contains the setup packet for the control transfer.
    * @return Returns an IAsyncOperation(IBuffer) object that returns the results of the operation.
    */
  def sendControlInTransferAsync(setupPacket: UsbSetupPacket): IPromiseWithIAsyncOperation[IBuffer] = js.native
  /**
    * Starts a USB control transfer to receive data from the default control endpoint of the device.
    * @param setupPacket A UsbSetupPacket object that contains the setup packet for the control transfer.
    * @param buffer A caller-supplied buffer that contains transfer data.
    * @return Returns an IAsyncOperation(IBuffer) object that returns the results of the operation.
    */
  def sendControlInTransferAsync(setupPacket: UsbSetupPacket, buffer: IBuffer): IPromiseWithIAsyncOperation[IBuffer] = js.native
  
  /**
    * Starts a zero-length USB control transfer that writes to the default control endpoint of the device.
    * @param setupPacket A UsbSetupPacket object that contains the setup packet for the control transfer.
    * @return Returns an IAsyncOperation(UInt32) object that returns the results of the operation.
    */
  def sendControlOutTransferAsync(setupPacket: UsbSetupPacket): IPromiseWithIAsyncOperation[Double] = js.native
  /**
    * Starts a USB control transfer to send data to the default control endpoint of the device.
    * @param setupPacket A UsbSetupPacket object that contains the setup packet for the control transfer.
    * @param buffer A caller-supplied buffer that contains the transfer data.
    * @return Returns an IAsyncOperation(UInt32) object that returns the results of the operation.
    */
  def sendControlOutTransferAsync(setupPacket: UsbSetupPacket, buffer: IBuffer): IPromiseWithIAsyncOperation[Double] = js.native
}

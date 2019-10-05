package typings.winrtDashUwp.Windows.Devices.Usb

import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a USB device. The object provides methods and properties that an app can use to find the device (in the system) with which the app wants to communicate, and sends IN and OUT control transfers to the device. */
@JSGlobal("Windows.Devices.Usb.UsbDevice")
@js.native
abstract class UsbDevice () extends js.Object {
  /** Gets an object that represents a USB configuration including all interfaces and their endpoints. */
  var configuration: UsbConfiguration = js.native
  /** Gets the object that represents the default or the first interface in a USB configuration. */
  var defaultInterface: UsbInterface = js.native
  /** Gets the object that represents the USB device descriptor. */
  var deviceDescriptor: UsbDeviceDescriptor = js.native
  /** Releases the reference to the UsbDevice object that was previously obtained by calling FromIdAsync . */
  def close(): Unit = js.native
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

/* static members */
@JSGlobal("Windows.Devices.Usb.UsbDevice")
@js.native
object UsbDevice extends js.Object {
  /**
    * Starts an asynchronous operation that creates a UsbDevice object.
    * @param deviceId The device instance path of the device. To obtain that value, get the DeviceInformation.Id property value.
    * @return Returns an IAsyncOperation(UsbDevice) object that returns the results of the operation.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[UsbDevice] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that the app can pass to DeviceInformation.FindAllAsync in order to find a specific type of USB device.
    * @param usbClass A UsbDeviceClass object for the device class specified by the app.
    * @return String formatted as an AQS query.
    */
  def getDeviceClassSelector(usbClass: UsbDeviceClass): String = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string, based on vendor and product identifiers, specified by the app. The app passes the string to DeviceInformation.FindAllAsync in order to find a specific type of USB device.
    * @param vendorId Specifies the vendor identifier for the device as assigned by the USB specification committee. Possible values are 0 through 0xffff.
    * @param productId Specifies the product identifier. This value is assigned by the manufacturer and is device-specific. Possible values are 0 through 0xffff.
    * @return String formatted as an AQS query.
    */
  def getDeviceSelector(vendorId: Double, productId: Double): String = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string, based on vendor, product, and device interface GUID identifiers, specified by the app. The app passes the string to DeviceInformation.FindAllAsync in order to find a specific type of USB device.
    * @param vendorId Specifies the vendor identifier for the device as assigned by the USB specification committee. Possible values are 0 through 0xffff.
    * @param productId Specifies the product identifier. This value is assigned by the manufacturer and is device-specific. Possible values are 0 through 0xffff.
    * @param winUsbInterfaceClass The device interface GUID exposed by the Winusb.sys driver. See the remarks section.
    * @return String formatted as an AQS query.
    */
  def getDeviceSelector(vendorId: Double, productId: Double, winUsbInterfaceClass: String): String = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string, based on the device interface GUID identifier, specified by the app. The app passes the string to DeviceInformation.FindAllAsync in order to find a specific type of USB device.
    * @param winUsbInterfaceClass The device interface GUID exposed by the Winusb.sys driver. See the remarks section.
    * @return String formatted as an AQS query.
    */
  def getDeviceSelector(winUsbInterfaceClass: String): String = js.native
}


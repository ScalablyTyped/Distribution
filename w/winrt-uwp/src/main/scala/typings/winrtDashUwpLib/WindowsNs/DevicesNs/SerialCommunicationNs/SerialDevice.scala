package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a serial port. The object provides methods and properties that an app can use to find the port (in the system). */
@JSGlobal("Windows.Devices.SerialCommunication.SerialDevice")
@js.native
abstract class SerialDevice () extends js.Object {
  /** Gets or sets the baud rate. */
  var baudRate: scala.Double = js.native
  /** Gets or sets the break signal state. */
  var breakSignalState: scala.Boolean = js.native
  /** Represents the number of bytes received by the last read operation of the input stream. */
  var bytesReceived: scala.Double = js.native
  /** Gets the state of the Carrier Detect (CD) line. */
  var carrierDetectState: scala.Boolean = js.native
  /** Gets the state of the Clear-to-Send (CTS) line. */
  var clearToSendState: scala.Boolean = js.native
  /** The number of data bits in each character value that is transmitted or received, and does not include parity bits or stop bits. */
  var dataBits: scala.Double = js.native
  /** Gets the state of the Data Set Ready (DSR) signal. */
  var dataSetReadyState: scala.Boolean = js.native
  /** Gets or sets the handshaking protocol for flow control. */
  var handshake: SerialHandshake = js.native
  /** Input stream that contains the data received on the serial port. */
  var inputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
  /** Gets or sets a value that enables the Data Terminal Ready (DTR) signal. */
  var isDataTerminalReadyEnabled: scala.Boolean = js.native
  /** Gets or sets a value that enables the Request to Send (RTS) signal. */
  var isRequestToSendEnabled: scala.Boolean = js.native
  /** Event handler that is invoked when error occurs on the serial port. */
  @JSName("onerrorreceived")
  var onerrorreceived_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SerialDevice, ErrorReceivedEventArgs] = js.native
  /** Event handler that is invoked when the state of a signal or line changes on the serial port. */
  @JSName("onpinchanged")
  var onpinchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SerialDevice, PinChangedEventArgs] = js.native
  /** Gets an output stream to which the app can write data to transmit through the serial port. */
  var outputStream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IOutputStream = js.native
  /** Gets or sets the parity bit for error-checking. */
  var parity: SerialParity = js.native
  /** Gets the port name for serial communications. */
  var portName: java.lang.String = js.native
  /** Gets or sets the time-out value for a read operation. */
  var readTimeout: scala.Double = js.native
  /** Gets or sets the standard number of stop bits per byte. */
  var stopBits: SerialStopBitCount = js.native
  /** Gets the idProduct field of the USB device descriptor. This value indicates the device-specific product identifier and is assigned by the manufacturer. */
  var usbProductId: scala.Double = js.native
  /** Gets the idVendor field of the USB device descriptor. The value indicates the vendor identifier for the device as assigned by the USB specification committee. */
  var usbVendorId: scala.Double = js.native
  /** Gets or sets the time-out value for a write operation. */
  var writeTimeout: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_errorreceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.errorreceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SerialDevice, ErrorReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pinchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.pinchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SerialDevice, PinChangedEventArgs]
  ): scala.Unit = js.native
  /** Releases the reference to the SerialDevice object that was previously obtained by calling FromIdAsync . */
  def close(): scala.Unit = js.native
  /** Event handler that is invoked when error occurs on the serial port. */
  def onerrorreceived(ev: ErrorReceivedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SerialDevice]): scala.Unit = js.native
  /** Event handler that is invoked when the state of a signal or line changes on the serial port. */
  def onpinchanged(ev: PinChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[SerialDevice]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_errorreceived(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.errorreceived,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SerialDevice, ErrorReceivedEventArgs]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pinchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.pinchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SerialDevice, PinChangedEventArgs]
  ): scala.Unit = js.native
}

/** Represents a serial port. The object provides methods and properties that an app can use to find the port (in the system). */
@JSGlobal("Windows.Devices.SerialCommunication.SerialDevice")
@js.native
object SerialDevice extends js.Object {
  /**
    * Starts an asynchronous operation that creates a SerialDevice object.
    * @param deviceId The device instance path of the device. To obtain that value, get the DeviceInformation.Id property value.
    * @return Returns an IAsyncOperation(SerialDevice) object that returns the results of the operation.
    */
  def fromIdAsync(deviceId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialDevice] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that the app can pass to DeviceInformation.FindAllAsync in order to find all serial devices on the system.
    * @return String formatted as an AQS query.
    */
  def getDeviceSelector(): java.lang.String = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that the app can pass to DeviceInformation.FindAllAsync in order to find a serial device by specifying its port name.
    * @param portName The serial port name. For example, "COM1".
    * @return String formatted as an AQS query.
    */
  def getDeviceSelector(portName: java.lang.String): java.lang.String = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that the app can pass to DeviceInformation.FindAllAsync in order to find a specific Serial-to-USB device by specifying it's VID and PID.
    * @param vendorId Specifies the vendor identifier for the device as assigned by the USB specification committee. Possible values are 0 through 0xffff.
    * @param productId Specifies the product identifier. This value is assigned by the manufacturer and is device-specific. Possible values are 0 through 0xffff.
    * @return String formatted as an AQS query.
    */
  def getDeviceSelectorFromUsbVidPid(vendorId: scala.Double, productId: scala.Double): java.lang.String = js.native
}


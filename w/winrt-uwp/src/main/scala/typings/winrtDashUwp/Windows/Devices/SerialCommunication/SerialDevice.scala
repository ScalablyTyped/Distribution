package typings.winrtDashUwp.Windows.Devices.SerialCommunication

import typings.winrtDashUwp.Windows.Foundation.EventHandler
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Foundation.TypedEventHandler
import typings.winrtDashUwp.Windows.Storage.Streams.IInputStream
import typings.winrtDashUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtDashUwp.Windows.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.errorreceived
import typings.winrtDashUwp.winrtDashUwpStrings.pinchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a serial port. The object provides methods and properties that an app can use to find the port (in the system). */
@JSGlobal("Windows.Devices.SerialCommunication.SerialDevice")
@js.native
abstract class SerialDevice () extends js.Object {
  /** Gets or sets the baud rate. */
  var baudRate: Double = js.native
  /** Gets or sets the break signal state. */
  var breakSignalState: Boolean = js.native
  /** Represents the number of bytes received by the last read operation of the input stream. */
  var bytesReceived: Double = js.native
  /** Gets the state of the Carrier Detect (CD) line. */
  var carrierDetectState: Boolean = js.native
  /** Gets the state of the Clear-to-Send (CTS) line. */
  var clearToSendState: Boolean = js.native
  /** The number of data bits in each character value that is transmitted or received, and does not include parity bits or stop bits. */
  var dataBits: Double = js.native
  /** Gets the state of the Data Set Ready (DSR) signal. */
  var dataSetReadyState: Boolean = js.native
  /** Gets or sets the handshaking protocol for flow control. */
  var handshake: SerialHandshake = js.native
  /** Input stream that contains the data received on the serial port. */
  var inputStream: IInputStream = js.native
  /** Gets or sets a value that enables the Data Terminal Ready (DTR) signal. */
  var isDataTerminalReadyEnabled: Boolean = js.native
  /** Gets or sets a value that enables the Request to Send (RTS) signal. */
  var isRequestToSendEnabled: Boolean = js.native
  /** Event handler that is invoked when error occurs on the serial port. */
  @JSName("onerrorreceived")
  var onerrorreceived_Original: TypedEventHandler[SerialDevice, ErrorReceivedEventArgs] = js.native
  /** Event handler that is invoked when the state of a signal or line changes on the serial port. */
  @JSName("onpinchanged")
  var onpinchanged_Original: TypedEventHandler[SerialDevice, PinChangedEventArgs] = js.native
  /** Gets an output stream to which the app can write data to transmit through the serial port. */
  var outputStream: IOutputStream = js.native
  /** Gets or sets the parity bit for error-checking. */
  var parity: SerialParity = js.native
  /** Gets the port name for serial communications. */
  var portName: String = js.native
  /** Gets or sets the time-out value for a read operation. */
  var readTimeout: Double = js.native
  /** Gets or sets the standard number of stop bits per byte. */
  var stopBits: SerialStopBitCount = js.native
  /** Gets the idProduct field of the USB device descriptor. This value indicates the device-specific product identifier and is assigned by the manufacturer. */
  var usbProductId: Double = js.native
  /** Gets the idVendor field of the USB device descriptor. The value indicates the vendor identifier for the device as assigned by the USB specification committee. */
  var usbVendorId: Double = js.native
  /** Gets or sets the time-out value for a write operation. */
  var writeTimeout: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_errorreceived(`type`: errorreceived, listener: TypedEventHandler[SerialDevice, ErrorReceivedEventArgs]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pinchanged(`type`: pinchanged, listener: TypedEventHandler[SerialDevice, PinChangedEventArgs]): Unit = js.native
  /** Releases the reference to the SerialDevice object that was previously obtained by calling FromIdAsync . */
  def close(): Unit = js.native
  /** Event handler that is invoked when error occurs on the serial port. */
  def onerrorreceived(ev: ErrorReceivedEventArgs with WinRTEvent[SerialDevice]): Unit = js.native
  /** Event handler that is invoked when the state of a signal or line changes on the serial port. */
  def onpinchanged(ev: PinChangedEventArgs with WinRTEvent[SerialDevice]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_errorreceived(`type`: errorreceived, listener: TypedEventHandler[SerialDevice, ErrorReceivedEventArgs]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pinchanged(`type`: pinchanged, listener: TypedEventHandler[SerialDevice, PinChangedEventArgs]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.SerialCommunication.SerialDevice")
@js.native
object SerialDevice extends js.Object {
  /**
    * Starts an asynchronous operation that creates a SerialDevice object.
    * @param deviceId The device instance path of the device. To obtain that value, get the DeviceInformation.Id property value.
    * @return Returns an IAsyncOperation(SerialDevice) object that returns the results of the operation.
    */
  def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[SerialDevice] = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that the app can pass to DeviceInformation.FindAllAsync in order to find all serial devices on the system.
    * @return String formatted as an AQS query.
    */
  def getDeviceSelector(): String = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that the app can pass to DeviceInformation.FindAllAsync in order to find a serial device by specifying its port name.
    * @param portName The serial port name. For example, "COM1".
    * @return String formatted as an AQS query.
    */
  def getDeviceSelector(portName: String): String = js.native
  /**
    * Gets an Advanced Query Syntax (AQS) string that the app can pass to DeviceInformation.FindAllAsync in order to find a specific Serial-to-USB device by specifying it's VID and PID.
    * @param vendorId Specifies the vendor identifier for the device as assigned by the USB specification committee. Possible values are 0 through 0xffff.
    * @param productId Specifies the product identifier. This value is assigned by the manufacturer and is device-specific. Possible values are 0 through 0xffff.
    * @return String formatted as an AQS query.
    */
  def getDeviceSelectorFromUsbVidPid(vendorId: Double, productId: Double): String = js.native
}


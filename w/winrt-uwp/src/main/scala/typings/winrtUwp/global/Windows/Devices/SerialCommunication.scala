package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError
import typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The Windows.Devices.SerialCommunication namespace defines Windows Runtime classes that a Windows store app can use to communicate with a device that exposes a serial port or some abstraction of a serial port. The classes provide functionality to discover such serial device, read and write data, and control serial-specific properties for flow control, such as setting baud rate, signal states. */
@JSGlobal("Windows.Devices.SerialCommunication")
@js.native
object SerialCommunication extends js.Object {
  /** Represents the object that is passed as a parameter to the event handler that is invoked when error occurs on the serial port. */
  @js.native
  abstract class ErrorReceivedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.SerialCommunication.ErrorReceivedEventArgs {
    /** Gets the character type received that caused the event on the serial port. */
    /* CompleteClass */
    override var error: SerialError = js.native
  }
  
  /** Represents the object that is passed as a parameter to the event handler that is invoked when the state of a signal line changes on the serial port. */
  @js.native
  abstract class PinChangedEventArgs ()
    extends typings.winrtUwp.Windows.Devices.SerialCommunication.PinChangedEventArgs {
    /** Gets the type of signal change that caused the event on the serial port. */
    /* CompleteClass */
    override var pinChange: SerialPinChange = js.native
  }
  
  /** Represents a serial port. The object provides methods and properties that an app can use to find the port (in the system). */
  @js.native
  abstract class SerialDevice ()
    extends typings.winrtUwp.Windows.Devices.SerialCommunication.SerialDevice
  
  /* static members */
  @js.native
  object SerialDevice extends js.Object {
    /**
      * Starts an asynchronous operation that creates a SerialDevice object.
      * @param deviceId The device instance path of the device. To obtain that value, get the DeviceInformation.Id property value.
      * @return Returns an IAsyncOperation(SerialDevice) object that returns the results of the operation.
      */
    def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SerialCommunication.SerialDevice] = js.native
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
  
  /** Defines values for error conditions that can occur on the serial port. */
  @js.native
  object SerialError extends js.Object {
    /* 1 */ val bufferOverrun: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError.bufferOverrun with Double = js.native
    /* 0 */ val frame: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError.frame with Double = js.native
    /* 2 */ val receiveFull: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError.receiveFull with Double = js.native
    /* 3 */ val receiveParity: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError.receiveParity with Double = js.native
    /* 4 */ val transmitFull: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError.transmitFull with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError with Double] = js.native
  }
  
  /** Defines values for hardware and software flow control protocols used in serial communication. The values are used by Handshake property on the SerialDevice object. */
  @js.native
  object SerialHandshake extends js.Object {
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialHandshake.none with Double = js.native
    /* 1 */ val requestToSend: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialHandshake.requestToSend with Double = js.native
    /* 3 */ val requestToSendXOnXOff: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialHandshake.requestToSendXOnXOff with Double = js.native
    /* 2 */ val xonXOff: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialHandshake.xonXOff with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SerialCommunication.SerialHandshake with Double] = js.native
  }
  
  /** Defines values for the parity bit for the serial data transmission. The values are used by the Parity property on the SerialDevice object. */
  @js.native
  object SerialParity extends js.Object {
    /* 2 */ val even: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialParity.even with Double = js.native
    /* 3 */ val mark: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialParity.mark with Double = js.native
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialParity.none with Double = js.native
    /* 1 */ val odd: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialParity.odd with Double = js.native
    /* 4 */ val space: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialParity.space with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SerialCommunication.SerialParity with Double] = js.native
  }
  
  /** Defines values for types of signal state changes on the serial port. */
  @js.native
  object SerialPinChange extends js.Object {
    /* 0 */ val breakSignal: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange.breakSignal with Double = js.native
    /* 1 */ val carrierDetect: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange.carrierDetect with Double = js.native
    /* 2 */ val clearToSend: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange.clearToSend with Double = js.native
    /* 3 */ val dataSetReady: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange.dataSetReady with Double = js.native
    /* 4 */ val ringIndicator: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange.ringIndicator with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange with Double] = js.native
  }
  
  /** Defines values that indicate the number of stop bits used in a transmission. The values are used by the StopBits property on the SerialDevice object. */
  @js.native
  object SerialStopBitCount extends js.Object {
    /* 0 */ val one: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialStopBitCount.one with Double = js.native
    /* 1 */ val onePointFive: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialStopBitCount.onePointFive with Double = js.native
    /* 2 */ val two: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialStopBitCount.two with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.winrtUwp.Windows.Devices.SerialCommunication.SerialStopBitCount with Double
      ] = js.native
  }
  
}


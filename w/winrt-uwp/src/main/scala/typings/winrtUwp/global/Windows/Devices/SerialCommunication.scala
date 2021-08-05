package typings.winrtUwp.global.Windows.Devices

import typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError
import typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Devices.SerialCommunication namespace defines Windows Runtime classes that a Windows store app can use to communicate with a device that exposes a serial port or some abstraction of a serial port. The classes provide functionality to discover such serial device, read and write data, and control serial-specific properties for flow control, such as setting baud rate, signal states. */
object SerialCommunication {
  
  /** Represents the object that is passed as a parameter to the event handler that is invoked when error occurs on the serial port. */
  @JSGlobal("Windows.Devices.SerialCommunication.ErrorReceivedEventArgs")
  @js.native
  abstract class ErrorReceivedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.SerialCommunication.ErrorReceivedEventArgs {
    
    /** Gets the character type received that caused the event on the serial port. */
    /* CompleteClass */
    var error: SerialError = js.native
  }
  
  /** Represents the object that is passed as a parameter to the event handler that is invoked when the state of a signal line changes on the serial port. */
  @JSGlobal("Windows.Devices.SerialCommunication.PinChangedEventArgs")
  @js.native
  abstract class PinChangedEventArgs ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.SerialCommunication.PinChangedEventArgs {
    
    /** Gets the type of signal change that caused the event on the serial port. */
    /* CompleteClass */
    var pinChange: SerialPinChange = js.native
  }
  
  /** Represents a serial port. The object provides methods and properties that an app can use to find the port (in the system). */
  @JSGlobal("Windows.Devices.SerialCommunication.SerialDevice")
  @js.native
  abstract class SerialDevice ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.SerialCommunication.SerialDevice
  object SerialDevice {
    
    @JSGlobal("Windows.Devices.SerialCommunication.SerialDevice")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Starts an asynchronous operation that creates a SerialDevice object.
      * @param deviceId The device instance path of the device. To obtain that value, get the DeviceInformation.Id property value.
      * @return Returns an IAsyncOperation(SerialDevice) object that returns the results of the operation.
      */
    /* static member */
    inline def fromIdAsync(deviceId: String): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SerialCommunication.SerialDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIdAsync")(deviceId.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.SerialCommunication.SerialDevice]]
    
    /**
      * Gets an Advanced Query Syntax (AQS) string that the app can pass to DeviceInformation.FindAllAsync in order to find all serial devices on the system.
      * @return String formatted as an AQS query.
      */
    /* static member */
    inline def getDeviceSelector(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")().asInstanceOf[String]
    /**
      * Gets an Advanced Query Syntax (AQS) string that the app can pass to DeviceInformation.FindAllAsync in order to find a serial device by specifying its port name.
      * @param portName The serial port name. For example, "COM1".
      * @return String formatted as an AQS query.
      */
    /* static member */
    inline def getDeviceSelector(portName: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelector")(portName.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Gets an Advanced Query Syntax (AQS) string that the app can pass to DeviceInformation.FindAllAsync in order to find a specific Serial-to-USB device by specifying it's VID and PID.
      * @param vendorId Specifies the vendor identifier for the device as assigned by the USB specification committee. Possible values are 0 through 0xffff.
      * @param productId Specifies the product identifier. This value is assigned by the manufacturer and is device-specific. Possible values are 0 through 0xffff.
      * @return String formatted as an AQS query.
      */
    /* static member */
    inline def getDeviceSelectorFromUsbVidPid(vendorId: Double, productId: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getDeviceSelectorFromUsbVidPid")(vendorId.asInstanceOf[js.Any], productId.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  /** Defines values for error conditions that can occur on the serial port. */
  @JSGlobal("Windows.Devices.SerialCommunication.SerialError")
  @js.native
  object SerialError extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError & Double] = js.native
    
    /* 1 */ val bufferOverrun: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError.bufferOverrun & Double = js.native
    
    /* 0 */ val frame: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError.frame & Double = js.native
    
    /* 2 */ val receiveFull: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError.receiveFull & Double = js.native
    
    /* 3 */ val receiveParity: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError.receiveParity & Double = js.native
    
    /* 4 */ val transmitFull: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialError.transmitFull & Double = js.native
  }
  
  /** Defines values for hardware and software flow control protocols used in serial communication. The values are used by Handshake property on the SerialDevice object. */
  @JSGlobal("Windows.Devices.SerialCommunication.SerialHandshake")
  @js.native
  object SerialHandshake extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SerialCommunication.SerialHandshake & Double] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialHandshake.none & Double = js.native
    
    /* 1 */ val requestToSend: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialHandshake.requestToSend & Double = js.native
    
    /* 3 */ val requestToSendXOnXOff: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialHandshake.requestToSendXOnXOff & Double = js.native
    
    /* 2 */ val xonXOff: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialHandshake.xonXOff & Double = js.native
  }
  
  /** Defines values for the parity bit for the serial data transmission. The values are used by the Parity property on the SerialDevice object. */
  @JSGlobal("Windows.Devices.SerialCommunication.SerialParity")
  @js.native
  object SerialParity extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SerialCommunication.SerialParity & Double] = js.native
    
    /* 2 */ val even: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialParity.even & Double = js.native
    
    /* 3 */ val mark: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialParity.mark & Double = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialParity.none & Double = js.native
    
    /* 1 */ val odd: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialParity.odd & Double = js.native
    
    /* 4 */ val space: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialParity.space & Double = js.native
  }
  
  /** Defines values for types of signal state changes on the serial port. */
  @JSGlobal("Windows.Devices.SerialCommunication.SerialPinChange")
  @js.native
  object SerialPinChange extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange & Double] = js.native
    
    /* 0 */ val breakSignal: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange.breakSignal & Double = js.native
    
    /* 1 */ val carrierDetect: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange.carrierDetect & Double = js.native
    
    /* 2 */ val clearToSend: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange.clearToSend & Double = js.native
    
    /* 3 */ val dataSetReady: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange.dataSetReady & Double = js.native
    
    /* 4 */ val ringIndicator: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialPinChange.ringIndicator & Double = js.native
  }
  
  /** Defines values that indicate the number of stop bits used in a transmission. The values are used by the StopBits property on the SerialDevice object. */
  @JSGlobal("Windows.Devices.SerialCommunication.SerialStopBitCount")
  @js.native
  object SerialStopBitCount extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Devices.SerialCommunication.SerialStopBitCount & Double] = js.native
    
    /* 0 */ val one: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialStopBitCount.one & Double = js.native
    
    /* 1 */ val onePointFive: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialStopBitCount.onePointFive & Double = js.native
    
    /* 2 */ val two: typings.winrtUwp.Windows.Devices.SerialCommunication.SerialStopBitCount.two & Double = js.native
  }
}

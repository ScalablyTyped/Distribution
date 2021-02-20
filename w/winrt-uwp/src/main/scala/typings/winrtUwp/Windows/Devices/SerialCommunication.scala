package typings.winrtUwp.Windows.Devices

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.errorreceived
import typings.winrtUwp.winrtUwpStrings.pinchanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The Windows.Devices.SerialCommunication namespace defines Windows Runtime classes that a Windows store app can use to communicate with a device that exposes a serial port or some abstraction of a serial port. The classes provide functionality to discover such serial device, read and write data, and control serial-specific properties for flow control, such as setting baud rate, signal states. */
object SerialCommunication {
  
  @js.native
  sealed trait SerialError extends StObject
  /** Defines values for error conditions that can occur on the serial port. */
  @JSGlobal("Windows.Devices.SerialCommunication.SerialError")
  @js.native
  object SerialError extends StObject {
    
    /** A character-buffer overrun has occurred. The next character is lost. */
    @js.native
    sealed trait bufferOverrun extends SerialError
    
    /** The hardware detected a framing error. */
    @js.native
    sealed trait frame extends SerialError
    
    /** An input buffer overflow has occurred. There is either no room in the input buffer, or a character was received after the end-of-file (EOF) character. */
    @js.native
    sealed trait receiveFull extends SerialError
    
    /** The hardware detected a parity error. */
    @js.native
    sealed trait receiveParity extends SerialError
    
    /** The application tried to transmit a character, but the output buffer was full. */
    @js.native
    sealed trait transmitFull extends SerialError
  }
  
  @js.native
  sealed trait SerialHandshake extends StObject
  /** Defines values for hardware and software flow control protocols used in serial communication. The values are used by Handshake property on the SerialDevice object. */
  @JSGlobal("Windows.Devices.SerialCommunication.SerialHandshake")
  @js.native
  object SerialHandshake extends StObject {
    
    /** No protocol is used for the handshake. */
    @js.native
    sealed trait none extends SerialHandshake
    
    /** When the port is receiving data and if the read buffer is full, the Request-to-Send (RTS) line is set to false. When buffer is available, the line is set to true. When the serial port is transmitting data, CTS line is set to false and the port does not send data until there is room in the write buffer. */
    @js.native
    sealed trait requestToSend extends SerialHandshake
    
    /** Both RequestToSend and XOnXOff controls are used for flow control. */
    @js.native
    sealed trait requestToSendXOnXOff extends SerialHandshake
    
    /** The serial port sends an Xoff control to inform the sender to stop sending data. When ready, the port sends an Xon control to inform the sender that the port is now ready to receive data. */
    @js.native
    sealed trait xonXOff extends SerialHandshake
  }
  
  @js.native
  sealed trait SerialParity extends StObject
  /** Defines values for the parity bit for the serial data transmission. The values are used by the Parity property on the SerialDevice object. */
  @JSGlobal("Windows.Devices.SerialCommunication.SerialParity")
  @js.native
  object SerialParity extends StObject {
    
    /** Sets the parity bit so that the total count of data bits set is an even number. */
    @js.native
    sealed trait even extends SerialParity
    
    /** Leaves the parity bit set to 1. */
    @js.native
    sealed trait mark extends SerialParity
    
    /** No parity check occurs. */
    @js.native
    sealed trait none extends SerialParity
    
    /** Sets the parity bit so that the total count of data bits set is an odd number. */
    @js.native
    sealed trait odd extends SerialParity
    
    /** Leaves the parity bit set to 0. */
    @js.native
    sealed trait space extends SerialParity
  }
  
  @js.native
  sealed trait SerialPinChange extends StObject
  /** Defines values for types of signal state changes on the serial port. */
  @JSGlobal("Windows.Devices.SerialCommunication.SerialPinChange")
  @js.native
  object SerialPinChange extends StObject {
    
    /** Change in the break signal state. */
    @js.native
    sealed trait breakSignal extends SerialPinChange
    
    /** Change in the Carrier Detect line for the port. */
    @js.native
    sealed trait carrierDetect extends SerialPinChange
    
    /** Change in the Clear-to-Send line for the port. */
    @js.native
    sealed trait clearToSend extends SerialPinChange
    
    /** Change in the state of the Data Set Ready (DSR) signal. */
    @js.native
    sealed trait dataSetReady extends SerialPinChange
    
    /** Change in the ring indicator state. */
    @js.native
    sealed trait ringIndicator extends SerialPinChange
  }
  
  @js.native
  sealed trait SerialStopBitCount extends StObject
  /** Defines values that indicate the number of stop bits used in a transmission. The values are used by the StopBits property on the SerialDevice object. */
  @JSGlobal("Windows.Devices.SerialCommunication.SerialStopBitCount")
  @js.native
  object SerialStopBitCount extends StObject {
    
    /** One stop bit is used. */
    @js.native
    sealed trait one extends SerialStopBitCount
    
    /** 1.5 stop bits are used. */
    @js.native
    sealed trait onePointFive extends SerialStopBitCount
    
    /** Two stop bits are used. */
    @js.native
    sealed trait two extends SerialStopBitCount
  }
  
  /** Represents the object that is passed as a parameter to the event handler that is invoked when error occurs on the serial port. */
  @js.native
  trait ErrorReceivedEventArgs extends StObject {
    
    /** Gets the character type received that caused the event on the serial port. */
    var error: SerialError = js.native
  }
  object ErrorReceivedEventArgs {
    
    @scala.inline
    def apply(error: SerialError): ErrorReceivedEventArgs = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorReceivedEventArgs]
    }
    
    @scala.inline
    implicit class ErrorReceivedEventArgsMutableBuilder[Self <: ErrorReceivedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: SerialError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the object that is passed as a parameter to the event handler that is invoked when the state of a signal line changes on the serial port. */
  @js.native
  trait PinChangedEventArgs extends StObject {
    
    /** Gets the type of signal change that caused the event on the serial port. */
    var pinChange: SerialPinChange = js.native
  }
  object PinChangedEventArgs {
    
    @scala.inline
    def apply(pinChange: SerialPinChange): PinChangedEventArgs = {
      val __obj = js.Dynamic.literal(pinChange = pinChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[PinChangedEventArgs]
    }
    
    @scala.inline
    implicit class PinChangedEventArgsMutableBuilder[Self <: PinChangedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPinChange(value: SerialPinChange): Self = StObject.set(x, "pinChange", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents a serial port. The object provides methods and properties that an app can use to find the port (in the system). */
  @js.native
  trait SerialDevice extends StObject {
    
    def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_errorreceived(`type`: errorreceived, listener: TypedEventHandler[SerialDevice, ErrorReceivedEventArgs]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_pinchanged(`type`: pinchanged, listener: TypedEventHandler[SerialDevice, PinChangedEventArgs]): Unit = js.native
    
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
    
    /** Releases the reference to the SerialDevice object that was previously obtained by calling FromIdAsync . */
    def close(): Unit = js.native
    
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
    def onerrorreceived(ev: ErrorReceivedEventArgs with WinRTEvent[SerialDevice]): Unit = js.native
    /** Event handler that is invoked when error occurs on the serial port. */
    @JSName("onerrorreceived")
    var onerrorreceived_Original: TypedEventHandler[SerialDevice, ErrorReceivedEventArgs] = js.native
    
    /** Event handler that is invoked when the state of a signal or line changes on the serial port. */
    def onpinchanged(ev: PinChangedEventArgs with WinRTEvent[SerialDevice]): Unit = js.native
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
    
    def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_errorreceived(`type`: errorreceived, listener: TypedEventHandler[SerialDevice, ErrorReceivedEventArgs]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_pinchanged(`type`: pinchanged, listener: TypedEventHandler[SerialDevice, PinChangedEventArgs]): Unit = js.native
    
    /** Gets or sets the standard number of stop bits per byte. */
    var stopBits: SerialStopBitCount = js.native
    
    /** Gets the idProduct field of the USB device descriptor. This value indicates the device-specific product identifier and is assigned by the manufacturer. */
    var usbProductId: Double = js.native
    
    /** Gets the idVendor field of the USB device descriptor. The value indicates the vendor identifier for the device as assigned by the USB specification committee. */
    var usbVendorId: Double = js.native
    
    /** Gets or sets the time-out value for a write operation. */
    var writeTimeout: Double = js.native
  }
}

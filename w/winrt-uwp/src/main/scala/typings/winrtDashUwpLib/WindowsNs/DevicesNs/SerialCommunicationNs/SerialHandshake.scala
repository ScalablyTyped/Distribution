package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SerialHandshake extends js.Object

/** Defines values for hardware and software flow control protocols used in serial communication. The values are used by Handshake property on the SerialDevice object. */
@JSGlobal("Windows.Devices.SerialCommunication.SerialHandshake")
@js.native
object SerialHandshake extends js.Object {
  /** No protocol is used for the handshake. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialHandshake
  
  /** When the port is receiving data and if the read buffer is full, the Request-to-Send (RTS) line is set to false. When buffer is available, the line is set to true. When the serial port is transmitting data, CTS line is set to false and the port does not send data until there is room in the write buffer. */
  @js.native
  sealed trait requestToSend
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialHandshake
  
  /** Both RequestToSend and XOnXOff controls are used for flow control. */
  @js.native
  sealed trait requestToSendXOnXOff
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialHandshake
  
  /** The serial port sends an Xoff control to inform the sender to stop sending data. When ready, the port sends an Xon control to inform he sender that the port is now ready to receive data. */
  @js.native
  sealed trait xonXOff
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialHandshake
  
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val requestToSend: requestToSend with scala.Double = js.native
  /* 3 */ val requestToSendXOnXOff: requestToSendXOnXOff with scala.Double = js.native
  /* 2 */ val xonXOff: xonXOff with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialHandshake with scala.Double
  ] = js.native
}


package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SerialError extends js.Object

/** Defines values for error conditions that can occur on the serial port. */
@JSGlobal("Windows.Devices.SerialCommunication.SerialError")
@js.native
object SerialError extends js.Object {
  /** A character-buffer overrun has occurred. The next character is lost. */
  @js.native
  sealed trait bufferOverrun
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialError
  
  /** The hardware detected a framing error. */
  @js.native
  sealed trait frame
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialError
  
  /** An input buffer overflow has occurred. There is either no room in the input buffer, or a character was received after the end-of-file (EOF) character. */
  @js.native
  sealed trait receiveFull
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialError
  
  /** The hardware detected a parity error. */
  @js.native
  sealed trait receiveParity
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialError
  
  /** The application tried to transmit a character, but the output buffer was full. */
  @js.native
  sealed trait transmitFull
    extends winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialError
  
  /* 1 */ val bufferOverrun: bufferOverrun with scala.Double = js.native
  /* 0 */ val frame: frame with scala.Double = js.native
  /* 2 */ val receiveFull: receiveFull with scala.Double = js.native
  /* 3 */ val receiveParity: receiveParity with scala.Double = js.native
  /* 4 */ val transmitFull: transmitFull with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.SerialCommunicationNs.SerialError with scala.Double
  ] = js.native
}


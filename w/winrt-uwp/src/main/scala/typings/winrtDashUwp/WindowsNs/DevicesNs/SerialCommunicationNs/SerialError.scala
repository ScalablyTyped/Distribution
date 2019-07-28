package typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs

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
  
  /* 1 */ val bufferOverrun: typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs.SerialError.bufferOverrun with Double = js.native
  /* 0 */ val frame: typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs.SerialError.frame with Double = js.native
  /* 2 */ val receiveFull: typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs.SerialError.receiveFull with Double = js.native
  /* 3 */ val receiveParity: typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs.SerialError.receiveParity with Double = js.native
  /* 4 */ val transmitFull: typings.winrtDashUwp.WindowsNs.DevicesNs.SerialCommunicationNs.SerialError.transmitFull with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SerialError with Double] = js.native
}


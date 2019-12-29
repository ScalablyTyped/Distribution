package typings.winrtDashUwp.Windows.Devices.SerialCommunication

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SerialError with Double] = js.native
  /* 1 */ @js.native
  object bufferOverrun extends TopLevel[bufferOverrun with Double]
  
  /* 0 */ @js.native
  object frame extends TopLevel[frame with Double]
  
  /* 2 */ @js.native
  object receiveFull extends TopLevel[receiveFull with Double]
  
  /* 3 */ @js.native
  object receiveParity extends TopLevel[receiveParity with Double]
  
  /* 4 */ @js.native
  object transmitFull extends TopLevel[transmitFull with Double]
  
}


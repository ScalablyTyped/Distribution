package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoggingOpcode extends js.Object

/** Specifies an event opcode. Opcodes represent an operation within a component of an application and are used to logically group events. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingOpcode")
@js.native
object LoggingOpcode extends js.Object {
  /** An informational event. */
  @js.native
  sealed trait info
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingOpcode
  
  /** A reply event. */
  @js.native
  sealed trait reply
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingOpcode
  
  /** An event that represents an activity resuming after being suspended. */
  @js.native
  sealed trait resume
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingOpcode
  
  /** An event that represents transferring activity to another component. */
  @js.native
  sealed trait send
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingOpcode
  
  /** An event that represents the start of an activity. */
  @js.native
  sealed trait start
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingOpcode
  
  /** An event that represents the end of an activity. The event corresponds to the last unpaired Start event. */
  @js.native
  sealed trait stop
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingOpcode
  
  /** An event that represents the activity being suspended pending another activity's completion. */
  @js.native
  sealed trait suspend
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingOpcode
  
  val info: info with java.lang.String = js.native
  val reply: reply with java.lang.String = js.native
  val resume: resume with java.lang.String = js.native
  val send: send with java.lang.String = js.native
  val start: start with java.lang.String = js.native
  val stop: stop with java.lang.String = js.native
  val suspend: suspend with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingOpcode with java.lang.String
  ] = js.native
}


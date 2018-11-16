package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LoggingLevel extends js.Object

/** Specifies the severity level of an event. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingLevel")
@js.native
object LoggingLevel extends js.Object {
  /** Log only critical messages. */
  @js.native
  sealed trait critical
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingLevel
  
  /** Log messages of error level and higher. */
  @js.native
  sealed trait error
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingLevel
  
  /** Log messages of information level and higher. */
  @js.native
  sealed trait information
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingLevel
  
  /** Log all messages. */
  @js.native
  sealed trait verbose
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingLevel
  
  /** Log messages of warning level and higher. */
  @js.native
  sealed trait warning
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingLevel
  
  val critical: critical with java.lang.String = js.native
  val error: error with java.lang.String = js.native
  val information: information with java.lang.String = js.native
  val verbose: verbose with java.lang.String = js.native
  val warning: warning with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.LoggingLevel with java.lang.String
  ] = js.native
}


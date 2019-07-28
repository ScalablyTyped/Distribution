package typings.winrtDashUwp.WindowsNs.FoundationNs.DiagnosticsNs

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
  sealed trait critical extends LoggingLevel
  
  /** Log messages of error level and higher. */
  @js.native
  sealed trait error extends LoggingLevel
  
  /** Log messages of information level and higher. */
  @js.native
  sealed trait information extends LoggingLevel
  
  /** Log all messages. */
  @js.native
  sealed trait verbose extends LoggingLevel
  
  /** Log messages of warning level and higher. */
  @js.native
  sealed trait warning extends LoggingLevel
  
  /* 4 */ val critical: typings.winrtDashUwp.WindowsNs.FoundationNs.DiagnosticsNs.LoggingLevel.critical with Double = js.native
  /* 3 */ val error: typings.winrtDashUwp.WindowsNs.FoundationNs.DiagnosticsNs.LoggingLevel.error with Double = js.native
  /* 1 */ val information: typings.winrtDashUwp.WindowsNs.FoundationNs.DiagnosticsNs.LoggingLevel.information with Double = js.native
  /* 0 */ val verbose: typings.winrtDashUwp.WindowsNs.FoundationNs.DiagnosticsNs.LoggingLevel.verbose with Double = js.native
  /* 2 */ val warning: typings.winrtDashUwp.WindowsNs.FoundationNs.DiagnosticsNs.LoggingLevel.warning with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LoggingLevel with Double] = js.native
}


package typings.winrtDashUwp.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorOptions extends js.Object

/** Specifies the type of diagnostic error reporting for a thread. */
@JSGlobal("Windows.Foundation.Diagnostics.ErrorOptions")
@js.native
object ErrorOptions extends js.Object {
  /** Exceptions are reported. */
  @js.native
  sealed trait forceExceptions extends ErrorOptions
  
  /** No error reporting occurs for the thread. */
  @js.native
  sealed trait none extends ErrorOptions
  
  /** Exceptions are suppressed and not reported. */
  @js.native
  sealed trait suppressExceptions extends ErrorOptions
  
  /** Error information for SetErrorInfo is suppressed and not reported. */
  @js.native
  sealed trait suppressSetErrorInfo extends ErrorOptions
  
  /** Error information for SetErrorInfo is used. */
  @js.native
  sealed trait useSetErrorInfo extends ErrorOptions
  
  /* 2 */ val forceExceptions: typings.winrtDashUwp.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions.forceExceptions with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions.none with Double = js.native
  /* 1 */ val suppressExceptions: typings.winrtDashUwp.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions.suppressExceptions with Double = js.native
  /* 4 */ val suppressSetErrorInfo: typings.winrtDashUwp.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions.suppressSetErrorInfo with Double = js.native
  /* 3 */ val useSetErrorInfo: typings.winrtDashUwp.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions.useSetErrorInfo with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorOptions with Double] = js.native
}


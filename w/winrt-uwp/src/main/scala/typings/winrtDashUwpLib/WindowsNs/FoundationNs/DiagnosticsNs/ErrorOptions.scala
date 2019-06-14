package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

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
  sealed trait forceExceptions
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions
  
  /** No error reporting occurs for the thread. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions
  
  /** Exceptions are suppressed and not reported. */
  @js.native
  sealed trait suppressExceptions
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions
  
  /** Error information for SetErrorInfo is suppressed and not reported. */
  @js.native
  sealed trait suppressSetErrorInfo
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions
  
  /** Error information for SetErrorInfo is used. */
  @js.native
  sealed trait useSetErrorInfo
    extends winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions
  
  /* 2 */ val forceExceptions: forceExceptions with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val suppressExceptions: suppressExceptions with scala.Double = js.native
  /* 4 */ val suppressSetErrorInfo: suppressSetErrorInfo with scala.Double = js.native
  /* 3 */ val useSetErrorInfo: useSetErrorInfo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions with scala.Double
  ] = js.native
}


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
  
  val forceExceptions: forceExceptions with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val suppressExceptions: suppressExceptions with java.lang.String = js.native
  val suppressSetErrorInfo: suppressSetErrorInfo with java.lang.String = js.native
  val useSetErrorInfo: useSetErrorInfo with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions with java.lang.String
  ] = js.native
}


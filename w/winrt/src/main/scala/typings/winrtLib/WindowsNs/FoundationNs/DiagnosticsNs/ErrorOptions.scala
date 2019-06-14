package typings
package winrtLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorOptions extends js.Object

@JSGlobal("Windows.Foundation.Diagnostics.ErrorOptions")
@js.native
object ErrorOptions extends js.Object {
  @js.native
  sealed trait forceExceptions
    extends winrtLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions
  
  @js.native
  sealed trait suppressExceptions
    extends winrtLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions
  
  @js.native
  sealed trait suppressSetErrorInfo
    extends winrtLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions
  
  @js.native
  sealed trait useSetErrorInfo
    extends winrtLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions
  
  /* 2 */ val forceExceptions: forceExceptions with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val suppressExceptions: suppressExceptions with scala.Double = js.native
  /* 4 */ val suppressSetErrorInfo: suppressSetErrorInfo with scala.Double = js.native
  /* 3 */ val useSetErrorInfo: useSetErrorInfo with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions with scala.Double] = js.native
}


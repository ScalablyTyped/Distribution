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
  
  val forceExceptions: forceExceptions with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val suppressExceptions: suppressExceptions with java.lang.String = js.native
  val suppressSetErrorInfo: suppressSetErrorInfo with java.lang.String = js.native
  val useSetErrorInfo: useSetErrorInfo with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.FoundationNs.DiagnosticsNs.ErrorOptions with java.lang.String] = js.native
}


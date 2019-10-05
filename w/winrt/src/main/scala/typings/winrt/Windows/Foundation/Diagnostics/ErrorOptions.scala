package typings.winrt.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorOptions extends js.Object

@JSGlobal("Windows.Foundation.Diagnostics.ErrorOptions")
@js.native
object ErrorOptions extends js.Object {
  @js.native
  sealed trait forceExceptions extends ErrorOptions
  
  @js.native
  sealed trait none extends ErrorOptions
  
  @js.native
  sealed trait suppressExceptions extends ErrorOptions
  
  @js.native
  sealed trait suppressSetErrorInfo extends ErrorOptions
  
  @js.native
  sealed trait useSetErrorInfo extends ErrorOptions
  
  /* 2 */ val forceExceptions: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.forceExceptions with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.none with Double = js.native
  /* 1 */ val suppressExceptions: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.suppressExceptions with Double = js.native
  /* 4 */ val suppressSetErrorInfo: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.suppressSetErrorInfo with Double = js.native
  /* 3 */ val useSetErrorInfo: typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.useSetErrorInfo with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorOptions with Double] = js.native
}


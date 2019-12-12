package typings.winrt.Windows.Foundation.Diagnostics

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.forceExceptions
import typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.none
import typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.suppressExceptions
import typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.suppressSetErrorInfo
import typings.winrt.Windows.Foundation.Diagnostics.ErrorOptions.useSetErrorInfo
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorOptions with Double] = js.native
  /* 2 */ @js.native
  object forceExceptions extends TopLevel[forceExceptions with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object suppressExceptions extends TopLevel[suppressExceptions with Double]
  
  /* 4 */ @js.native
  object suppressSetErrorInfo extends TopLevel[suppressSetErrorInfo with Double]
  
  /* 3 */ @js.native
  object useSetErrorInfo extends TopLevel[useSetErrorInfo with Double]
  
}


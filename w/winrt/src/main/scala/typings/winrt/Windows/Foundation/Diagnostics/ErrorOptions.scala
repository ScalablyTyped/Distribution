package typings.winrt.Windows.Foundation.Diagnostics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

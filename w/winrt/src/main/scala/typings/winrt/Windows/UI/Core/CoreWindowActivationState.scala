package typings.winrt.Windows.UI.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoreWindowActivationState extends js.Object

@JSGlobal("Windows.UI.Core.CoreWindowActivationState")
@js.native
object CoreWindowActivationState extends js.Object {
  @js.native
  sealed trait codeActivated extends CoreWindowActivationState
  
  @js.native
  sealed trait deactivated extends CoreWindowActivationState
  
  @js.native
  sealed trait pointerActivated extends CoreWindowActivationState
  
}


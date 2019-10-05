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
  
  /* 0 */ val codeActivated: typings.winrt.Windows.UI.Core.CoreWindowActivationState.codeActivated with Double = js.native
  /* 1 */ val deactivated: typings.winrt.Windows.UI.Core.CoreWindowActivationState.deactivated with Double = js.native
  /* 2 */ val pointerActivated: typings.winrt.Windows.UI.Core.CoreWindowActivationState.pointerActivated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreWindowActivationState with Double] = js.native
}


package typings.winrt.Windows.UI.Core

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.UI.Core.CoreWindowActivationState.codeActivated
import typings.winrt.Windows.UI.Core.CoreWindowActivationState.deactivated
import typings.winrt.Windows.UI.Core.CoreWindowActivationState.pointerActivated
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoreWindowActivationState with Double] = js.native
  /* 0 */ @js.native
  object codeActivated extends TopLevel[codeActivated with Double]
  
  /* 1 */ @js.native
  object deactivated extends TopLevel[deactivated with Double]
  
  /* 2 */ @js.native
  object pointerActivated extends TopLevel[pointerActivated with Double]
  
}


package typings.uirouterCore.transitionInterfaceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TransitionHookScope extends js.Object
@JSImport("@uirouter/core/lib/transition/interface", "TransitionHookScope")
@js.native
object TransitionHookScope extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransitionHookScope with Double] = js.native
  
  @js.native
  sealed trait STATE extends TransitionHookScope
  /* 1 */ @js.native
  object STATE extends TopLevel[STATE with Double]
  
  @js.native
  sealed trait TRANSITION extends TransitionHookScope
  /* 0 */ @js.native
  object TRANSITION extends TopLevel[TRANSITION with Double]
}

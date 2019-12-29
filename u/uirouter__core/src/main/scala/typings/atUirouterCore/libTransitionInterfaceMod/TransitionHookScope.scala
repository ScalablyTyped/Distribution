package typings.atUirouterCore.libTransitionInterfaceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransitionHookScope extends js.Object

@JSImport("@uirouter/core/lib/transition/interface", "TransitionHookScope")
@js.native
object TransitionHookScope extends js.Object {
  @js.native
  sealed trait STATE extends TransitionHookScope
  
  @js.native
  sealed trait TRANSITION extends TransitionHookScope
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransitionHookScope with Double] = js.native
  /* 1 */ @js.native
  object STATE extends TopLevel[STATE with Double]
  
  /* 0 */ @js.native
  object TRANSITION extends TopLevel[TRANSITION with Double]
  
}


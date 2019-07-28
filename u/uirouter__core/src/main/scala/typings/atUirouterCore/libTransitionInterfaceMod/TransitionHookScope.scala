package typings.atUirouterCore.libTransitionInterfaceMod

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
  
  /* 1 */ val STATE: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookScope.STATE with Double = js.native
  /* 0 */ val TRANSITION: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookScope.TRANSITION with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TransitionHookScope with Double] = js.native
}


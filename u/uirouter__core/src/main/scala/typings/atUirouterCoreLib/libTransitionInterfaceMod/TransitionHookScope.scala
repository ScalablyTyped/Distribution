package typings
package atUirouterCoreLib.libTransitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransitionHookScope extends js.Object

@JSImport("@uirouter/core/lib/transition/interface", "TransitionHookScope")
@js.native
object TransitionHookScope extends js.Object {
  @js.native
  sealed trait STATE
    extends atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookScope
  
  @js.native
  sealed trait TRANSITION
    extends atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookScope
  
  /* 1 */ val STATE: STATE with scala.Double = js.native
  /* 0 */ val TRANSITION: TRANSITION with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookScope with scala.Double
  ] = js.native
}


package typings
package atUirouterCoreLib.libTransitionInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TransitionHookPhase extends js.Object

@JSImport("@uirouter/core/lib/transition/interface", "TransitionHookPhase")
@js.native
object TransitionHookPhase extends js.Object {
  @js.native
  sealed trait BEFORE
    extends atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase
  
  @js.native
  sealed trait CREATE
    extends atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase
  
  @js.native
  sealed trait ERROR
    extends atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase
  
  @js.native
  sealed trait RUN
    extends atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase
  
  @js.native
  sealed trait SUCCESS
    extends atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase
  
  /* 1 */ val BEFORE: BEFORE with scala.Double = js.native
  /* 0 */ val CREATE: CREATE with scala.Double = js.native
  /* 4 */ val ERROR: ERROR with scala.Double = js.native
  /* 2 */ val RUN: RUN with scala.Double = js.native
  /* 3 */ val SUCCESS: SUCCESS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookPhase with scala.Double
  ] = js.native
}


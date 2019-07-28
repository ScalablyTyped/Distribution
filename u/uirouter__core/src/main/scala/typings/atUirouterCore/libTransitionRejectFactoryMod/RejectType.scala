package typings.atUirouterCore.libTransitionRejectFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RejectType extends js.Object

@JSImport("@uirouter/core/lib/transition/rejectFactory", "RejectType")
@js.native
object RejectType extends js.Object {
  /**
    * The transition was aborted
    *
    * The transition was aborted by a hook which returned `false`
    */
  @js.native
  sealed trait ABORTED extends RejectType
  
  /**
    * The transition errored.
    *
    * This generally means a hook threw an error or returned a rejected promise
    */
  @js.native
  sealed trait ERROR extends RejectType
  
  /**
    * The transition was ignored
    *
    * The transition was ignored because it would have no effect.
    *
    * Either:
    *
    * - The transition is targeting the current state and parameter values
    * - The transition is targeting the same state and parameter values as the currently running transition.
    */
  @js.native
  sealed trait IGNORED extends RejectType
  
  /**
    * The transition was invalid
    *
    * The transition was never started because it was invalid
    */
  @js.native
  sealed trait INVALID extends RejectType
  
  /**
    * A new transition superseded this one.
    *
    * While this transition was running, a new transition started.
    * This transition is cancelled because it was superseded by new transition.
    */
  @js.native
  sealed trait SUPERSEDED extends RejectType
  
  /* 3 */ val ABORTED: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.ABORTED with Double = js.native
  /* 6 */ val ERROR: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.ERROR with Double = js.native
  /* 5 */ val IGNORED: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.IGNORED with Double = js.native
  /* 4 */ val INVALID: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.INVALID with Double = js.native
  /* 2 */ val SUPERSEDED: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.SUPERSEDED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RejectType with Double] = js.native
}


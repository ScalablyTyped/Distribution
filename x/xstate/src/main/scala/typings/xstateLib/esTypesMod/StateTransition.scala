package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateTransition[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.Array[ActionObject[TContext, TEvent]]
  var reentryStates: js.UndefOr[
    stdLib.Set[xstateLib.esStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]]
  ]
  /**
    * The source state that preceded the transition.
    */
  var source: js.UndefOr[xstateLib.esStateMod.State[TContext, EventObject]]
  var tree: js.UndefOr[xstateLib.esStateTreeMod.StateTree]
}

object StateTransition {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    reentryStates: stdLib.Set[xstateLib.esStateNodeMod.StateNode[TContext, _, OmniEventObject[EventObject]]] = null,
    source: xstateLib.esStateMod.State[TContext, EventObject] = null,
    tree: xstateLib.esStateTreeMod.StateTree = null
  ): StateTransition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions)
    if (reentryStates != null) __obj.updateDynamic("reentryStates")(reentryStates)
    if (source != null) __obj.updateDynamic("source")(source)
    if (tree != null) __obj.updateDynamic("tree")(tree)
    __obj.asInstanceOf[StateTransition[TContext, TEvent]]
  }
}


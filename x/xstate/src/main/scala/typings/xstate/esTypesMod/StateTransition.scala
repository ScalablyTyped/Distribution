package typings.xstate.esTypesMod

import typings.xstate.esStateMod.State
import typings.xstate.esStateNodeMod.StateNode
import typings.xstate.esStateTreeMod.StateTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateTransition[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.Array[ActionObject[TContext, TEvent]]
  var configuration: js.Array[StateNode[TContext, _, TEvent]]
  var context: js.UndefOr[TContext] = js.undefined
  /**
    * The source state that preceded the transition.
    */
  var source: js.UndefOr[State[TContext, EventObject]] = js.undefined
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]]
  var tree: js.UndefOr[StateTree] = js.undefined
}

object StateTransition {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    configuration: js.Array[StateNode[TContext, _, TEvent]],
    transitions: js.Array[TransitionDefinition[TContext, TEvent]],
    context: TContext = null,
    source: State[TContext, EventObject] = null,
    tree: StateTree = null
  ): StateTransition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (tree != null) __obj.updateDynamic("tree")(tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateTransition[TContext, TEvent]]
  }
}


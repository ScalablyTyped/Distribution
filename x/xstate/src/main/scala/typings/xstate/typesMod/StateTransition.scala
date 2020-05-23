package typings.xstate.typesMod

import typings.xstate.anon.Context
import typings.xstate.stateMod.State
import typings.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateTransition[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.Array[ActionObject[TContext, TEvent]]
  var configuration: js.Array[StateNode[TContext, _, TEvent, _]]
  var entrySet: js.Array[StateNode[TContext, _, TEvent, _]]
  var exitSet: js.Array[StateNode[TContext, _, TEvent, _]]
  /**
    * The source state that preceded the transition.
    */
  var source: js.UndefOr[State[TContext, EventObject, _, Context[TContext]]] = js.undefined
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]]
}

object StateTransition {
  @scala.inline
  def apply[TContext, TEvent](
    actions: js.Array[ActionObject[TContext, TEvent]],
    configuration: js.Array[StateNode[TContext, _, TEvent, _]],
    entrySet: js.Array[StateNode[TContext, _, TEvent, _]],
    exitSet: js.Array[StateNode[TContext, _, TEvent, _]],
    transitions: js.Array[TransitionDefinition[TContext, TEvent]],
    source: State[TContext, EventObject, _, Context[TContext]] = null
  ): StateTransition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], entrySet = entrySet.asInstanceOf[js.Any], exitSet = exitSet.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateTransition[TContext, TEvent]]
  }
}


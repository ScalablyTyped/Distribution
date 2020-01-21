package typings.xstate.typesMod

import typings.std.Record
import typings.xstate.actorMod.Actor
import typings.xstate.stateMod.State
import typings.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateConfig[TContext, TEvent /* <: EventObject */] extends js.Object {
  var _event: typings.xstate.typesMod.SCXML.Event[TEvent]
  var _sessionid: String | Null
  var actions: js.UndefOr[js.Array[ActionObject[TContext, TEvent]]] = js.undefined
  var activities: js.UndefOr[ActivityMap] = js.undefined
  var children: Record[String, Actor[_, AnyEventObject]]
  var configuration: js.Array[StateNode[TContext, _, TEvent, _]]
  var context: TContext
  var done: js.UndefOr[Boolean] = js.undefined
  var events: js.UndefOr[js.Array[TEvent]] = js.undefined
  var history: js.UndefOr[State[TContext, TEvent, _, _]] = js.undefined
  var historyValue: js.UndefOr[HistoryValue] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]]
  var value: StateValue
}

object StateConfig {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    _event: typings.xstate.typesMod.SCXML.Event[TEvent],
    children: Record[String, Actor[_, AnyEventObject]],
    configuration: js.Array[StateNode[TContext, _, TEvent, _]],
    context: TContext,
    transitions: js.Array[TransitionDefinition[TContext, TEvent]],
    value: StateValue,
    _sessionid: String = null,
    actions: js.Array[ActionObject[TContext, TEvent]] = null,
    activities: ActivityMap = null,
    done: js.UndefOr[Boolean] = js.undefined,
    events: js.Array[TEvent] = null,
    history: State[TContext, TEvent, _, _] = null,
    historyValue: HistoryValue = null,
    meta: js.Any = null
  ): StateConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (_sessionid != null) __obj.updateDynamic("_sessionid")(_sessionid.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (!js.isUndefined(done)) __obj.updateDynamic("done")(done.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (history != null) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (historyValue != null) __obj.updateDynamic("historyValue")(historyValue.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateConfig[TContext, TEvent]]
  }
}


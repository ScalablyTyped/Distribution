package typings.xstate.typesMod

import typings.std.Record
import typings.xstate.actorMod.Actor
import typings.xstate.anon.Context
import typings.xstate.stateMod.State
import typings.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateConfig[TContext, TEvent /* <: EventObject */] extends js.Object {
  var _event: typings.xstate.typesMod.SCXML.Event[TEvent] = js.native
  var _sessionid: String | Null = js.native
  var actions: js.UndefOr[js.Array[ActionObject[TContext, TEvent]]] = js.native
  var activities: js.UndefOr[ActivityMap] = js.native
  var children: Record[String, Actor[_, AnyEventObject]] = js.native
  var configuration: js.Array[StateNode[TContext, _, TEvent, _]] = js.native
  var context: TContext = js.native
  var done: js.UndefOr[Boolean] = js.native
  var events: js.UndefOr[js.Array[TEvent]] = js.native
  var history: js.UndefOr[State[TContext, TEvent, _, Context[TContext]]] = js.native
  var historyValue: js.UndefOr[HistoryValue] = js.native
  var meta: js.UndefOr[js.Any] = js.native
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]] = js.native
  var value: StateValue = js.native
}

object StateConfig {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](
    _event: typings.xstate.typesMod.SCXML.Event[TEvent],
    children: Record[String, Actor[_, AnyEventObject]],
    configuration: js.Array[StateNode[TContext, _, TEvent, _]],
    context: TContext,
    transitions: js.Array[TransitionDefinition[TContext, TEvent]],
    value: StateValue
  ): StateConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateConfig[TContext, TEvent]]
  }
  @scala.inline
  implicit class StateConfigOps[Self <: StateConfig[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (StateConfig[TContext, TEvent])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set_event(value: typings.xstate.typesMod.SCXML.Event[TEvent]): Self = this.set("_event", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: Record[String, Actor[_, AnyEventObject]]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationVarargs(value: (StateNode[TContext, js.Any, TEvent, js.Any])*): Self = this.set("configuration", js.Array(value :_*))
    @scala.inline
    def setConfiguration(value: js.Array[StateNode[TContext, _, TEvent, _]]): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransitionsVarargs(value: (TransitionDefinition[TContext, TEvent])*): Self = this.set("transitions", js.Array(value :_*))
    @scala.inline
    def setTransitions(value: js.Array[TransitionDefinition[TContext, TEvent]]): Self = this.set("transitions", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: StateValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def set_sessionid(value: String): Self = this.set("_sessionid", value.asInstanceOf[js.Any])
    @scala.inline
    def set_sessionidNull: Self = this.set("_sessionid", null)
    @scala.inline
    def setActionsVarargs(value: (ActionObject[TContext, TEvent])*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[ActionObject[TContext, TEvent]]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    @scala.inline
    def setActivities(value: ActivityMap): Self = this.set("activities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivities: Self = this.set("activities", js.undefined)
    @scala.inline
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setEventsVarargs(value: TEvent*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[TEvent]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setHistory(value: State[TContext, TEvent, _, Context[TContext]]): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setHistoryValue(value: HistoryValue): Self = this.set("historyValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistoryValue: Self = this.set("historyValue", js.undefined)
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
  }
  
}


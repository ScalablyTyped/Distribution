package typings.xstate.typesMod

import typings.std.Record
import typings.xstate.actorMod.Actor
import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import typings.xstate.stateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateConfig[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var _event: typings.xstate.typesMod.SCXML.Event[TEvent] = js.native
  
  var _sessionid: String | Null = js.native
  
  var actions: js.UndefOr[js.Array[ActionObject[TContext, TEvent]]] = js.native
  
  var activities: js.UndefOr[ActivityMap] = js.native
  
  var children: Record[String, Actor[_, AnyEventObject]] = js.native
  
  var configuration: js.Array[StateNode[TContext, _, TEvent, ContextTContext[TContext]]] = js.native
  
  var context: TContext = js.native
  
  var done: js.UndefOr[Boolean] = js.native
  
  var events: js.UndefOr[js.Array[TEvent]] = js.native
  
  var history: js.UndefOr[State[TContext, TEvent, _, ContextTContext[TContext]]] = js.native
  
  var historyValue: js.UndefOr[HistoryValue] = js.native
  
  var meta: js.UndefOr[js.Any] = js.native
  
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]] = js.native
  
  var value: StateValue = js.native
}
object StateConfig {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    _event: typings.xstate.typesMod.SCXML.Event[TEvent],
    children: Record[String, Actor[_, AnyEventObject]],
    configuration: js.Array[StateNode[TContext, _, TEvent, ContextTContext[TContext]]],
    context: TContext,
    transitions: js.Array[TransitionDefinition[TContext, TEvent]],
    value: StateValue
  ): StateConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateConfig[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class StateConfigMutableBuilder[Self <: StateConfig[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (StateConfig[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setActivities(value: ActivityMap): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    @scala.inline
    def setChildren(value: Record[String, Actor[_, AnyEventObject]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: js.Array[StateNode[TContext, _, TEvent, ContextTContext[TContext]]]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationVarargs(value: (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]])*): Self = StObject.set(x, "configuration", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setEvents(value: js.Array[TEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: TEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setHistory(value: State[TContext, TEvent, _, ContextTContext[TContext]]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setHistoryValue(value: HistoryValue): Self = StObject.set(x, "historyValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryValueUndefined: Self = StObject.set(x, "historyValue", js.undefined)
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setTransitions(value: js.Array[TransitionDefinition[TContext, TEvent]]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsVarargs(value: (TransitionDefinition[TContext, TEvent])*): Self = StObject.set(x, "transitions", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: StateValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_event(value: typings.xstate.typesMod.SCXML.Event[TEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sessionid(value: String): Self = StObject.set(x, "_sessionid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sessionidNull: Self = StObject.set(x, "_sessionid", null)
  }
}

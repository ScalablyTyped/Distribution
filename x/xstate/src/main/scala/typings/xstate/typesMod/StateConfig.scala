package typings.xstate.typesMod

import typings.std.Record
import typings.xstate.actorMod.Actor
import typings.xstate.anon.ContextTContext
import typings.xstate.stateMod.State
import typings.xstate.stateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateConfig[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var _event: typings.xstate.typesMod.SCXML.Event[TEvent]
  
  var _sessionid: String | Null
  
  var actions: js.UndefOr[js.Array[ActionObject[TContext, TEvent]]] = js.undefined
  
  var activities: js.UndefOr[ActivityMap] = js.undefined
  
  var children: Record[String, Actor[js.Any, AnyEventObject]]
  
  var configuration: js.Array[StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]]]
  
  var context: TContext
  
  var done: js.UndefOr[Boolean] = js.undefined
  
  var events: js.UndefOr[js.Array[TEvent]] = js.undefined
  
  var history: js.UndefOr[State[TContext, TEvent, js.Any, ContextTContext[TContext]]] = js.undefined
  
  var historyValue: js.UndefOr[HistoryValue] = js.undefined
  
  var meta: js.UndefOr[js.Any] = js.undefined
  
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]]
  
  var value: StateValue
}
object StateConfig {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    _event: typings.xstate.typesMod.SCXML.Event[TEvent],
    children: Record[String, Actor[js.Any, AnyEventObject]],
    configuration: js.Array[StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]]],
    context: TContext,
    transitions: js.Array[TransitionDefinition[TContext, TEvent]],
    value: StateValue
  ): StateConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], _sessionid = null)
    __obj.asInstanceOf[StateConfig[TContext, TEvent]]
  }
  
  extension [Self <: StateConfig[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (StateConfig[TContext, TEvent])) {
    
    inline def setActions(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    inline def setActivities(value: ActivityMap): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setChildren(value: Record[String, Actor[js.Any, AnyEventObject]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: js.Array[StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]]]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVarargs(value: (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]])*): Self = StObject.set(x, "configuration", js.Array(value :_*))
    
    inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setEvents(value: js.Array[TEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: TEvent*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setHistory(value: State[TContext, TEvent, js.Any, ContextTContext[TContext]]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryValue(value: HistoryValue): Self = StObject.set(x, "historyValue", value.asInstanceOf[js.Any])
    
    inline def setHistoryValueUndefined: Self = StObject.set(x, "historyValue", js.undefined)
    
    inline def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setTransitions(value: js.Array[TransitionDefinition[TContext, TEvent]]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsVarargs(value: (TransitionDefinition[TContext, TEvent])*): Self = StObject.set(x, "transitions", js.Array(value :_*))
    
    inline def setValue(value: StateValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_event(value: typings.xstate.typesMod.SCXML.Event[TEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
    
    inline def set_sessionid(value: String): Self = StObject.set(x, "_sessionid", value.asInstanceOf[js.Any])
    
    inline def set_sessionidNull: Self = StObject.set(x, "_sessionid", null)
  }
}

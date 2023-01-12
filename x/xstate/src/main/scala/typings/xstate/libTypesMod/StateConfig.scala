package typings.xstate.libTypesMod

import typings.std.Record
import typings.std.Set
import typings.xstate.anon.Context
import typings.xstate.libStateMod.State
import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateConfig[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var _event: typings.xstate.libTypesMod.SCXML.Event[TEvent]
  
  var _sessionid: String | Null
  
  var actions: js.UndefOr[js.Array[ActionObject[TContext, TEvent]]] = js.undefined
  
  /**
    * @deprecated
    */
  var activities: js.UndefOr[ActivityMap] = js.undefined
  
  var children: Record[String, ActorRef[Any, Any]]
  
  var configuration: js.Array[StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]]
  
  var context: TContext
  
  var done: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated
    */
  var events: js.UndefOr[js.Array[TEvent]] = js.undefined
  
  var history: js.UndefOr[State[TContext, TEvent, Any, Any, Any]] = js.undefined
  
  var historyValue: js.UndefOr[HistoryValue] = js.undefined
  
  var machine: js.UndefOr[StateMachine[TContext, Any, TEvent, Any, Any, Any, Any]] = js.undefined
  
  var meta: js.UndefOr[Any] = js.undefined
  
  var tags: js.UndefOr[Set[String]] = js.undefined
  
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]]
  
  var value: StateValue
}
object StateConfig {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    _event: typings.xstate.libTypesMod.SCXML.Event[TEvent],
    children: Record[String, ActorRef[Any, Any]],
    configuration: js.Array[StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]],
    context: TContext,
    transitions: js.Array[TransitionDefinition[TContext, TEvent]],
    value: StateValue
  ): StateConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], _sessionid = null)
    __obj.asInstanceOf[StateConfig[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StateConfig[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (StateConfig[TContext, TEvent])) extends AnyVal {
    
    inline def setActions(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setActivities(value: ActivityMap): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "activities", js.undefined)
    
    inline def setChildren(value: Record[String, ActorRef[Any, Any]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setConfiguration(value: js.Array[StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVarargs(value: (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled])*): Self = StObject.set(x, "configuration", js.Array(value*))
    
    inline def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setEvents(value: js.Array[TEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: TEvent*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setHistory(value: State[TContext, TEvent, Any, Any, Any]): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    inline def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    inline def setHistoryValue(value: HistoryValue): Self = StObject.set(x, "historyValue", value.asInstanceOf[js.Any])
    
    inline def setHistoryValueUndefined: Self = StObject.set(x, "historyValue", js.undefined)
    
    inline def setMachine(value: StateMachine[TContext, Any, TEvent, Any, Any, Any, Any]): Self = StObject.set(x, "machine", value.asInstanceOf[js.Any])
    
    inline def setMachineUndefined: Self = StObject.set(x, "machine", js.undefined)
    
    inline def setMeta(value: Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setTags(value: Set[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTransitions(value: js.Array[TransitionDefinition[TContext, TEvent]]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsVarargs(value: (TransitionDefinition[TContext, TEvent])*): Self = StObject.set(x, "transitions", js.Array(value*))
    
    inline def setValue(value: StateValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def set_event(value: typings.xstate.libTypesMod.SCXML.Event[TEvent]): Self = StObject.set(x, "_event", value.asInstanceOf[js.Any])
    
    inline def set_sessionid(value: String): Self = StObject.set(x, "_sessionid", value.asInstanceOf[js.Any])
    
    inline def set_sessionidNull: Self = StObject.set(x, "_sessionid", null)
  }
}

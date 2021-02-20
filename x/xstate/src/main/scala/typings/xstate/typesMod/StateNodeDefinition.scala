package typings.xstate.typesMod

import typings.xstate.xstateStrings.`final`
import typings.xstate.xstateStrings.atomic
import typings.xstate.xstateStrings.compound
import typings.xstate.xstateStrings.deep
import typings.xstate.xstateStrings.history
import typings.xstate.xstateStrings.parallel
import typings.xstate.xstateStrings.shallow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateNodeDefinition[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] extends StObject {
  
  var activities: js.Array[ActivityDefinition[TContext, TEvent]] = js.native
  
  var context: TContext = js.native
  
  var data: js.UndefOr[(Mapper[TContext, TEvent, _]) | (PropertyMapper[TContext, TEvent, _])] = js.native
  
  var entry: js.Array[ActionObject[TContext, TEvent]] = js.native
  
  var exit: js.Array[ActionObject[TContext, TEvent]] = js.native
  
  var history: js.UndefOr[Boolean | shallow | deep] = js.native
  
  var id: String = js.native
  
  var initial: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
  ] = js.native
  
  var invoke: js.Array[InvokeDefinition[TContext, TEvent]] = js.native
  
  var key: String = js.native
  
  var meta: js.Any = js.native
  
  var on: TransitionDefinitionMap[TContext, TEvent] = js.native
  
  var order: Double = js.native
  
  var states: StatesDefinition[TContext, TStateSchema, TEvent] = js.native
  
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]] = js.native
  
  var `type`: atomic | compound | parallel | `final` | history = js.native
  
  var version: js.UndefOr[String] = js.native
}
object StateNodeDefinition {
  
  @scala.inline
  def apply[TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */](
    activities: js.Array[ActivityDefinition[TContext, TEvent]],
    context: TContext,
    entry: js.Array[ActionObject[TContext, TEvent]],
    exit: js.Array[ActionObject[TContext, TEvent]],
    id: String,
    invoke: js.Array[InvokeDefinition[TContext, TEvent]],
    key: String,
    meta: js.Any,
    on: TransitionDefinitionMap[TContext, TEvent],
    order: Double,
    states: StatesDefinition[TContext, TStateSchema, TEvent],
    transitions: js.Array[TransitionDefinition[TContext, TEvent]],
    `type`: atomic | compound | parallel | `final` | history
  ): StateNodeDefinition[TContext, TStateSchema, TEvent] = {
    val __obj = js.Dynamic.literal(activities = activities.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], entry = entry.asInstanceOf[js.Any], exit = exit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invoke = invoke.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateNodeDefinition[TContext, TStateSchema, TEvent]]
  }
  
  @scala.inline
  implicit class StateNodeDefinitionMutableBuilder[Self <: StateNodeDefinition[_, _, _], TContext, TStateSchema /* <: StateSchema[_] */, TEvent /* <: EventObject */] (val x: Self with (StateNodeDefinition[TContext, TStateSchema, TEvent])) extends AnyVal {
    
    @scala.inline
    def setActivities(value: js.Array[ActivityDefinition[TContext, TEvent]]): Self = StObject.set(x, "activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesVarargs(value: (ActivityDefinition[TContext, TEvent])*): Self = StObject.set(x, "activities", js.Array(value :_*))
    
    @scala.inline
    def setContext(value: TContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: (Mapper[TContext, TEvent, _]) | (PropertyMapper[TContext, TEvent, _])): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFunction2(value: (TContext, TEvent) => _): Self = StObject.set(x, "data", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEntry(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "entry", js.Array(value :_*))
    
    @scala.inline
    def setExit(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "exit", js.Array(value :_*))
    
    @scala.inline
    def setHistory(value: Boolean | shallow | deep): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryUndefined: Self = StObject.set(x, "history", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitial(
      value: /* import warning: importer.ImportType#apply Failed type conversion: keyof TStateSchema['states'] */ js.Any
    ): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialUndefined: Self = StObject.set(x, "initial", js.undefined)
    
    @scala.inline
    def setInvoke(value: js.Array[InvokeDefinition[TContext, TEvent]]): Self = StObject.set(x, "invoke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokeVarargs(value: (InvokeDefinition[TContext, TEvent])*): Self = StObject.set(x, "invoke", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn(value: TransitionDefinitionMap[TContext, TEvent]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStates(value: StatesDefinition[TContext, TStateSchema, TEvent]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitions(value: js.Array[TransitionDefinition[TContext, TEvent]]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionsVarargs(value: (TransitionDefinition[TContext, TEvent])*): Self = StObject.set(x, "transitions", js.Array(value :_*))
    
    @scala.inline
    def setType(value: atomic | compound | parallel | `final` | history): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}

package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateNodeMod.StateNode
import typings.xstate.xstateStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionDefinition[TContext, TEvent /* <: EventObject */]
  extends StObject
     with TransitionConfig[TContext, TEvent] {
  
  @JSName("actions")
  var actions_TransitionDefinition: js.Array[ActionObject[TContext, TEvent]]
  
  @JSName("cond")
  var cond_TransitionDefinition: js.UndefOr[Guard[TContext, TEvent]] = js.undefined
  
  var eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typings.xstate.typesMod.ActionTypes.NullEvent | Asterisk
  
  var source: StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]]
  
  @JSName("target")
  var target_TransitionDefinition: js.UndefOr[js.Array[StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]]]] = js.undefined
  
  def toJSON(): typings.xstate.anon.Actions[TContext, TEvent]
}
object TransitionDefinition {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typings.xstate.typesMod.ActionTypes.NullEvent | Asterisk,
    source: StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]],
    toJSON: () => typings.xstate.anon.Actions[TContext, TEvent]
  ): TransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[TransitionDefinition[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class TransitionDefinitionMutableBuilder[Self <: TransitionDefinition[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (TransitionDefinition[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setCond(value: Guard[TContext, TEvent]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCondUndefined: Self = StObject.set(x, "cond", js.undefined)
    
    @scala.inline
    def setEventType(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typings.xstate.typesMod.ActionTypes.NullEvent | Asterisk
    ): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: js.Array[StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]]]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTargetVarargs(value: (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]])*): Self = StObject.set(x, "target", js.Array(value :_*))
    
    @scala.inline
    def setToJSON(value: () => typings.xstate.anon.Actions[TContext, TEvent]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}

package typings.xstate.libTypesMod

import typings.xstate.libStateMod.State
import typings.xstate.libStateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateTransition[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var actions: js.Array[ActionObject[TContext, TEvent]]
  
  var configuration: js.Array[StateNode[TContext, Any, TEvent, Any, Any, Any]]
  
  var entrySet: js.Array[StateNode[TContext, Any, TEvent, Any, Any, Any]]
  
  var exitSet: js.Array[StateNode[TContext, Any, TEvent, Any, Any, Any]]
  
  /**
    * The source state that preceded the transition.
    */
  var source: js.UndefOr[State[TContext, Any, Any, Any, Any]] = js.undefined
  
  var transitions: js.Array[TransitionDefinition[TContext, TEvent]]
}
object StateTransition {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    configuration: js.Array[StateNode[TContext, Any, TEvent, Any, Any, Any]],
    entrySet: js.Array[StateNode[TContext, Any, TEvent, Any, Any, Any]],
    exitSet: js.Array[StateNode[TContext, Any, TEvent, Any, Any, Any]],
    transitions: js.Array[TransitionDefinition[TContext, TEvent]]
  ): StateTransition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], entrySet = entrySet.asInstanceOf[js.Any], exitSet = exitSet.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateTransition[TContext, TEvent]]
  }
  
  extension [Self <: StateTransition[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (StateTransition[TContext, TEvent])) {
    
    inline def setActions(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setConfiguration(value: js.Array[StateNode[TContext, Any, TEvent, Any, Any, Any]]): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationVarargs(value: (StateNode[TContext, Any, TEvent, Any, Any, Any])*): Self = StObject.set(x, "configuration", js.Array(value*))
    
    inline def setEntrySet(value: js.Array[StateNode[TContext, Any, TEvent, Any, Any, Any]]): Self = StObject.set(x, "entrySet", value.asInstanceOf[js.Any])
    
    inline def setEntrySetVarargs(value: (StateNode[TContext, Any, TEvent, Any, Any, Any])*): Self = StObject.set(x, "entrySet", js.Array(value*))
    
    inline def setExitSet(value: js.Array[StateNode[TContext, Any, TEvent, Any, Any, Any]]): Self = StObject.set(x, "exitSet", value.asInstanceOf[js.Any])
    
    inline def setExitSetVarargs(value: (StateNode[TContext, Any, TEvent, Any, Any, Any])*): Self = StObject.set(x, "exitSet", js.Array(value*))
    
    inline def setSource(value: State[TContext, Any, Any, Any, Any]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setTransitions(value: js.Array[TransitionDefinition[TContext, TEvent]]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
    
    inline def setTransitionsVarargs(value: (TransitionDefinition[TContext, TEvent])*): Self = StObject.set(x, "transitions", js.Array(value*))
  }
}

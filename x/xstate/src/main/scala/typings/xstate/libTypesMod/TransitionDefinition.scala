package typings.xstate.libTypesMod

import typings.xstate.anon.Cond
import typings.xstate.anon.Context
import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.libTypegenTypesMod.TypegenDisabled
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
  
  var eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typings.xstate.libTypesMod.ActionTypes.NullEvent | Asterisk
  
  var source: StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]
  
  @JSName("target")
  var target_TransitionDefinition: js.UndefOr[
    js.Array[StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]]
  ] = js.undefined
  
  def toJSON(): Cond[TContext, TEvent]
}
object TransitionDefinition {
  
  inline def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typings.xstate.libTypesMod.ActionTypes.NullEvent | Asterisk,
    source: StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled],
    toJSON: () => Cond[TContext, TEvent]
  ): TransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[TransitionDefinition[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionDefinition[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (TransitionDefinition[TContext, TEvent])) extends AnyVal {
    
    inline def setActions(value: js.Array[ActionObject[TContext, TEvent]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: (ActionObject[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCond(value: Guard[TContext, TEvent]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    inline def setCondUndefined: Self = StObject.set(x, "cond", js.undefined)
    
    inline def setEventType(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typings.xstate.libTypesMod.ActionTypes.NullEvent | Asterisk
    ): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setSource(value: StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Array[StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(value: (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled])*): Self = StObject.set(x, "target", js.Array(value*))
    
    inline def setToJSON(value: () => Cond[TContext, TEvent]): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}

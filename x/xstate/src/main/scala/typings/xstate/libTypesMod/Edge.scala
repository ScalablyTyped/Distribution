package typings.xstate.libTypesMod

import typings.xstate.anon.Context
import typings.xstate.anon.`3`
import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Edge[TContext, TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */] extends StObject {
  
  var actions: js.Array[Action[TContext, TEvent]]
  
  var cond: js.UndefOr[Condition[TContext, TEvent & (`3`[TEventType, TEvent])]] = js.undefined
  
  var event: TEventType
  
  var meta: js.UndefOr[MetaObject] = js.undefined
  
  var source: StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]
  
  var target: StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]
  
  var transition: TransitionDefinition[TContext, TEvent]
}
object Edge {
  
  inline def apply[TContext, TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */](
    actions: js.Array[Action[TContext, TEvent]],
    event: TEventType,
    source: StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled],
    target: StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled],
    transition: TransitionDefinition[TContext, TEvent]
  ): Edge[TContext, TEvent, TEventType] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge[TContext, TEvent, TEventType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Edge[?, ?, ?], TContext, TEvent /* <: EventObject */, TEventType /* <: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any */] (val x: Self & (Edge[TContext, TEvent, TEventType])) extends AnyVal {
    
    inline def setActions(value: js.Array[Action[TContext, TEvent]]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCond(value: Condition[TContext, TEvent & (`3`[TEventType, TEvent])]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    inline def setCondFunction3(
      value: (TContext, TEvent & (`3`[TEventType, TEvent]), /* meta */ GuardMeta[TContext, TEvent & (`3`[TEventType, TEvent])]) => Boolean
    ): Self = StObject.set(x, "cond", js.Any.fromFunction3(value))
    
    inline def setCondUndefined: Self = StObject.set(x, "cond", js.undefined)
    
    inline def setEvent(value: TEventType): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: MetaObject): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setSource(value: StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: TransitionDefinition[TContext, TEvent]): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
  }
}

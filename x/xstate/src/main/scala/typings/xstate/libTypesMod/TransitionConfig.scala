package typings.xstate.libTypesMod

import typings.std.Record
import typings.xstate.anon.Context
import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionConfig[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */] extends StObject {
  
  var actions: js.UndefOr[BaseActions[TContext, TExpressionEvent, TEvent, BaseActionObject]] = js.undefined
  
  var cond: js.UndefOr[Condition[TContext, TExpressionEvent]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var in: js.UndefOr[StateValue] = js.undefined
  
  var internal: js.UndefOr[Boolean] = js.undefined
  
  var meta: js.UndefOr[Record[String, Any]] = js.undefined
  
  var target: js.UndefOr[TransitionTarget[TContext, TEvent]] = js.undefined
}
object TransitionConfig {
  
  inline def apply[TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */](): TransitionConfig[TContext, TExpressionEvent, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionConfig[TContext, TExpressionEvent, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitionConfig[?, ?, ?], TContext, TExpressionEvent /* <: EventObject */, TEvent /* <: EventObject */] (val x: Self & (TransitionConfig[TContext, TExpressionEvent, TEvent])) extends AnyVal {
    
    inline def setActions(value: BaseActions[TContext, TExpressionEvent, TEvent, BaseActionObject]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsFunction3(
      value: (TContext, TExpressionEvent, /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => Unit
    ): Self = StObject.set(x, "actions", js.Any.fromFunction3(value))
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: (BaseAction[TContext, TExpressionEvent, BaseActionObject, TEvent])*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCond(value: Condition[TContext, TExpressionEvent]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    inline def setCondFunction3(value: (TContext, TExpressionEvent, /* meta */ GuardMeta[TContext, TExpressionEvent]) => Boolean): Self = StObject.set(x, "cond", js.Any.fromFunction3(value))
    
    inline def setCondUndefined: Self = StObject.set(x, "cond", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIn(value: StateValue): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
    
    inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
    
    inline def setMeta(value: Record[String, Any]): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    inline def setTarget(value: TransitionTarget[TContext, TEvent]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTargetVarargs(
      value: (String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]))*
    ): Self = StObject.set(x, "target", js.Array(value*))
  }
}

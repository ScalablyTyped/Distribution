package typings.xstate.typesMod

import typings.std.Record
import typings.xstate.anon.Context
import typings.xstate.stateNodeMod.StateNode
import typings.xstate.typegenTypesMod.TypegenDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitionConfig[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var actions: js.UndefOr[Actions[TContext, TEvent]] = js.undefined
  
  var cond: js.UndefOr[Condition[TContext, TEvent]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var in: js.UndefOr[StateValue] = js.undefined
  
  var internal: js.UndefOr[Boolean] = js.undefined
  
  var meta: js.UndefOr[Record[String, Any]] = js.undefined
  
  var target: js.UndefOr[TransitionTarget[TContext, TEvent]] = js.undefined
}
object TransitionConfig {
  
  inline def apply[TContext, TEvent /* <: EventObject */](): TransitionConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitionConfig[TContext, TEvent]]
  }
  
  extension [Self <: TransitionConfig[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (TransitionConfig[TContext, TEvent])) {
    
    inline def setActions(value: Actions[TContext, TEvent]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsFunction3(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent, BaseActionObject]) => Unit): Self = StObject.set(x, "actions", js.Any.fromFunction3(value))
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: (Action[TContext, TEvent])*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setCond(value: Condition[TContext, TEvent]): Self = StObject.set(x, "cond", value.asInstanceOf[js.Any])
    
    inline def setCondFunction3(value: (TContext, TEvent, /* meta */ GuardMeta[TContext, TEvent]) => Boolean): Self = StObject.set(x, "cond", js.Any.fromFunction3(value))
    
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

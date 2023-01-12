package typings.xstate.libTypesMod

import typings.xstate.anon.Context
import typings.xstate.libStateNodeMod.StateNode
import typings.xstate.libTypegenTypesMod.TypegenDisabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetTransitionConfig[TContext, TEvent /* <: EventObject */]
  extends StObject
     with TransitionConfig[TContext, TEvent] {
  
  @JSName("target")
  var target_TargetTransitionConfig: TransitionTarget[TContext, TEvent]
}
object TargetTransitionConfig {
  
  inline def apply[TContext, TEvent /* <: EventObject */](target: TransitionTarget[TContext, TEvent]): TargetTransitionConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTransitionConfig[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetTransitionConfig[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (TargetTransitionConfig[TContext, TEvent])) extends AnyVal {
    
    inline def setTarget(value: TransitionTarget[TContext, TEvent]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetVarargs(
      value: (String | (StateNode[TContext, Any, TEvent, Context[TContext], ServiceMap, TypegenDisabled]))*
    ): Self = StObject.set(x, "target", js.Array(value*))
  }
}

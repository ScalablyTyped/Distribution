package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateNodeMod.StateNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetTransitionConfig[TContext, TEvent /* <: EventObject */] extends TransitionConfig[TContext, TEvent] {
  
  @JSName("target")
  var target_TargetTransitionConfig: TransitionTarget[TContext, TEvent] = js.native
}
object TargetTransitionConfig {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](target: TransitionTarget[TContext, TEvent]): TargetTransitionConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTransitionConfig[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class TargetTransitionConfigMutableBuilder[Self <: TargetTransitionConfig[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (TargetTransitionConfig[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setTarget(value: TransitionTarget[TContext, TEvent]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVarargs(value: (String | (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]]))*): Self = StObject.set(x, "target", js.Array(value :_*))
  }
}

package typings.xstate.typesMod

import typings.xstate.anon.ContextTContext
import typings.xstate.stateNodeMod.StateNode
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
  implicit class TargetTransitionConfigOps[Self <: TargetTransitionConfig[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (TargetTransitionConfig[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTargetVarargs(value: (String | (StateNode[TContext, js.Any, TEvent, ContextTContext[TContext]]))*): Self = this.set("target", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: TransitionTarget[TContext, TEvent]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}

package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delay[TContext, TEvent /* <: EventObject */] extends js.Object {
  
  var delay: Double | String | (Expr[TContext, TEvent, Double]) = js.native
}
object Delay {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](delay: Double | String | (Expr[TContext, TEvent, Double])): Delay[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class DelayOps[Self <: Delay[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (Delay[TContext, TEvent])) extends AnyVal {
    
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
    def setDelayFunction2(value: (TContext, TEvent) => Double): Self = this.set("delay", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDelay(value: Double | String | (Expr[TContext, TEvent, Double])): Self = this.set("delay", value.asInstanceOf[js.Any])
  }
}

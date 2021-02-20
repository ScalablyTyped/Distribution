package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.Expr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delay[TContext, TEvent /* <: EventObject */] extends StObject {
  
  var delay: Double | String | (Expr[TContext, TEvent, Double]) = js.native
}
object Delay {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](delay: Double | String | (Expr[TContext, TEvent, Double])): Delay[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class DelayMutableBuilder[Self <: Delay[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (Delay[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double | String | (Expr[TContext, TEvent, Double])): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayFunction2(value: (TContext, TEvent) => Double): Self = StObject.set(x, "delay", js.Any.fromFunction2(value))
  }
}

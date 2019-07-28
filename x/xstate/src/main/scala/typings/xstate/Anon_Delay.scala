package typings.xstate

import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Delay[TContext, TEvent /* <: EventObject */] extends js.Object {
  var delay: Double | String | (Expr[TContext, TEvent, Double])
}

object Anon_Delay {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](delay: Double | String | (Expr[TContext, TEvent, Double])): Anon_Delay[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Delay[TContext, TEvent]]
  }
}


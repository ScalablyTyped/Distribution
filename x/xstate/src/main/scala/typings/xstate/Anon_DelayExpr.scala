package typings.xstate

import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DelayExpr[TContext, TEvent /* <: EventObject */] extends js.Object {
  var delay: Double | String | (Expr[TContext, TEvent, Double])
}

object Anon_DelayExpr {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](delay: Double | String | (Expr[TContext, TEvent, Double])): Anon_DelayExpr[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DelayExpr[TContext, TEvent]]
  }
}


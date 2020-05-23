package typings.xstate.anon

import typings.xstate.typesMod.EventObject
import typings.xstate.typesMod.Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delay[TContext, TEvent /* <: EventObject */] extends js.Object {
  var delay: Double | String | (Expr[TContext, TEvent, Double])
}

object Delay {
  @scala.inline
  def apply[TContext, TEvent](delay: Double | String | (Expr[TContext, TEvent, Double])): Delay[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay[TContext, TEvent]]
  }
}


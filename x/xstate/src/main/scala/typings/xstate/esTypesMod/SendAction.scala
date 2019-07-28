package typings.xstate.esTypesMod

import typings.xstate.esActorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var delay: js.UndefOr[Double | String | (Expr[TContext, TEvent, Double])] = js.undefined
  var event: TEvent | (SendExpr[TContext, TEvent])
  var id: String | Double
  var to: js.UndefOr[
    String | Double | (Actor[_, EventObject]) | (Expr[TContext, TEvent, String | Double | (Actor[_, EventObject])])
  ] = js.undefined
}

object SendAction {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    event: TEvent | (SendExpr[TContext, TEvent]),
    id: String | Double,
    `type`: String,
    delay: Double | String | (Expr[TContext, TEvent, Double]) = null,
    exec: ActionFunction[TContext, TEvent] = null,
    to: String | Double | (Actor[_, EventObject]) | (Expr[TContext, TEvent, String | Double | (Actor[_, EventObject])]) = null
  ): SendAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec)
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAction[TContext, TEvent]]
  }
}


package typings.xstate.typesMod

import typings.xstate.actorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendActionOptions[TContext, TEvent /* <: EventObject */] extends js.Object {
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TEvent])] = js.undefined
  var id: js.UndefOr[String | Double] = js.undefined
  var to: js.UndefOr[
    String | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])
  ] = js.undefined
}

object SendActionOptions {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](
    delay: Double | String | (DelayExpr[TContext, TEvent]) = null,
    id: String | Double = null,
    to: String | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])]) = null
  ): SendActionOptions[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendActionOptions[TContext, TEvent]]
  }
}


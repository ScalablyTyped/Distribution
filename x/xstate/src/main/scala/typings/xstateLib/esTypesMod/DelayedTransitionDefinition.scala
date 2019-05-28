package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelayedTransitionDefinition[TContext, TEvent /* <: EventObject */] extends TransitionDefinition[TContext, TEvent] {
  var delay: scala.Double | java.lang.String | (Expr[TContext, TEvent, scala.Double])
}

object DelayedTransitionDefinition {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    delay: scala.Double | java.lang.String | (Expr[TContext, TEvent, scala.Double]),
    event: java.lang.String,
    cond: Guard[TContext, TEvent] = null,
    in: StateValue = null,
    internal: js.UndefOr[scala.Boolean] = js.undefined,
    meta: stdLib.Record[java.lang.String, _] = null,
    target: js.Array[java.lang.String] = null
  ): DelayedTransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions, delay = delay.asInstanceOf[js.Any], event = event)
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DelayedTransitionDefinition[TContext, TEvent]]
  }
}


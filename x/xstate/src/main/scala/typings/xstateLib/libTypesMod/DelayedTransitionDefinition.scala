package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelayedTransitionDefinition[TContext, TEvent /* <: EventObject */] extends TransitionDefinition[TContext, TEvent] {
  @JSName("delay")
  var delay_DelayedTransitionDefinition: scala.Double
}

object DelayedTransitionDefinition {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    delay: scala.Double,
    event: java.lang.String,
    cond: Condition[TContext, TEvent] = null,
    in: StateValue = null,
    internal: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String | js.Array[java.lang.String] = null
  ): DelayedTransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions, delay = delay, event = event)
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayedTransitionDefinition[TContext, TEvent]]
  }
}


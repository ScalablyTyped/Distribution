package typings.xstate.esTypesMod

import typings.std.Record
import typings.xstate.esStateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelayedTransitionDefinition[TContext, TEvent /* <: EventObject */] extends TransitionDefinition[TContext, TEvent] {
  var delay: Double | String | (Expr[TContext, TEvent, Double])
}

object DelayedTransitionDefinition {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    delay: Double | String | (Expr[TContext, TEvent, Double]),
    event: String,
    source: StateNode[TContext, _, TEvent],
    cond: Guard[TContext, TEvent] = null,
    in: StateValue = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    meta: Record[String, _] = null,
    target: TransitionTargets[TContext] = null
  ): DelayedTransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions, delay = delay.asInstanceOf[js.Any], event = event, source = source)
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DelayedTransitionDefinition[TContext, TEvent]]
  }
}


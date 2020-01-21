package typings.xstate.typesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTransitionConfig[TContext, TEvent /* <: EventObject */] extends TransitionConfig[TContext, TEvent] {
  @JSName("target")
  var target_TargetTransitionConfig: TransitionTarget[TContext, TEvent]
}

object TargetTransitionConfig {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    target: TransitionTarget[TContext, TEvent],
    actions: Actions[TContext, TEvent] = null,
    cond: Condition[TContext, TEvent] = null,
    in: StateValue = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    meta: Record[String, _] = null
  ): TargetTransitionConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTransitionConfig[TContext, TEvent]]
  }
}


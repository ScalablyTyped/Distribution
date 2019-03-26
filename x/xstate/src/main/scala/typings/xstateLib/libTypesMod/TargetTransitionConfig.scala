package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTransitionConfig[TContext, TEvent /* <: EventObject */] extends TransitionConfig[TContext, TEvent]

object TargetTransitionConfig {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: SingleOrArray[Action[TContext, TEvent]] = null,
    cond: Condition[TContext, TEvent] = null,
    delay: scala.Int | scala.Double = null,
    in: StateValue = null,
    internal: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String | js.Array[java.lang.String] = null
  ): TargetTransitionConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTransitionConfig[TContext, TEvent]]
  }
}


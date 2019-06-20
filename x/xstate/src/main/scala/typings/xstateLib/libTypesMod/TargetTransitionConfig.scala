package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetTransitionConfig[TContext, TEvent /* <: EventObject */] extends TransitionConfig[TContext, TEvent] {
  @JSName("target")
  var target_TargetTransitionConfig: TransitionTarget[TContext]
}

object TargetTransitionConfig {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    target: TransitionTarget[TContext],
    actions: SingleOrArray[Action[TContext, TEvent]] = null,
    cond: Condition[TContext, TEvent] = null,
    in: StateValue = null,
    internal: js.UndefOr[scala.Boolean] = js.undefined,
    meta: stdLib.Record[java.lang.String, _] = null
  ): TargetTransitionConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[TargetTransitionConfig[TContext, TEvent]]
  }
}


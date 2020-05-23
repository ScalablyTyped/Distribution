package typings.xstate.typesMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionConfig[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.UndefOr[Actions[TContext, TEvent]] = js.undefined
  var cond: js.UndefOr[Condition[TContext, TEvent]] = js.undefined
  var in: js.UndefOr[StateValue] = js.undefined
  var internal: js.UndefOr[Boolean] = js.undefined
  var meta: js.UndefOr[Record[String, _]] = js.undefined
  var target: js.UndefOr[TransitionTarget[TContext, TEvent]] = js.undefined
}

object TransitionConfig {
  @scala.inline
  def apply[TContext, TEvent](
    actions: Actions[TContext, TEvent] = null,
    cond: Condition[TContext, TEvent] = null,
    in: StateValue = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    meta: Record[String, _] = null,
    target: TransitionTarget[TContext, TEvent] = null
  ): TransitionConfig[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.get.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionConfig[TContext, TEvent]]
  }
}


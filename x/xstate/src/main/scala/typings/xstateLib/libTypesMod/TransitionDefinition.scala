package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionDefinition[TContext, TEvent /* <: EventObject */] extends TransitionConfig[TContext, TEvent] {
  @JSName("actions")
  var actions_TransitionDefinition: js.Array[ActionObject[TContext, TEvent]]
  var event: java.lang.String
}

object TransitionDefinition {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    event: java.lang.String,
    cond: Condition[TContext, TEvent] = null,
    delay: scala.Int | scala.Double = null,
    in: StateValue = null,
    internal: js.UndefOr[scala.Boolean] = js.undefined,
    target: java.lang.String | js.Array[java.lang.String] = null
  ): TransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions, event = event)
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionDefinition[TContext, TEvent]]
  }
}


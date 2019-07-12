package typings
package xstateLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionDefinition[TContext, TEvent /* <: EventObject */] extends TransitionConfig[TContext, TEvent] {
  @JSName("actions")
  var actions_TransitionDefinition: js.Array[ActionObject[TContext, TEvent]]
  @JSName("cond")
  var cond_TransitionDefinition: js.UndefOr[Guard[TContext, TEvent]] = js.undefined
  var event: java.lang.String
  var source: xstateLib.libStateNodeMod.StateNode[TContext, _, TEvent]
  @JSName("target")
  var target_TransitionDefinition: js.UndefOr[TransitionTargets[TContext]] = js.undefined
}

object TransitionDefinition {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    event: java.lang.String,
    source: xstateLib.libStateNodeMod.StateNode[TContext, _, TEvent],
    cond: Guard[TContext, TEvent] = null,
    in: StateValue = null,
    internal: js.UndefOr[scala.Boolean] = js.undefined,
    meta: stdLib.Record[java.lang.String, _] = null,
    target: TransitionTargets[TContext] = null
  ): TransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions, event = event, source = source)
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[TransitionDefinition[TContext, TEvent]]
  }
}


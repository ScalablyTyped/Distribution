package typings.xstate.jsonMod

import typings.xstate.typesMod.ActionObject
import typings.xstate.typesMod.Guard
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionConfig extends js.Object {
  var actions: js.Array[ActionObject[_, _]]
  var cond: js.UndefOr[Guard[_, _]] = js.undefined
  var eventType: String
  var source: String
  var target: js.Array[String]
}

object TransitionConfig {
  @scala.inline
  def apply(
    actions: js.Array[ActionObject[_, _]],
    eventType: String,
    source: String,
    target: js.Array[String],
    cond: Guard[_, _] = null
  ): TransitionConfig = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionConfig]
  }
}


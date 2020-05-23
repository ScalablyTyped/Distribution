package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionData[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: ActionMap[TContext, TEvent]
  var activities: js.UndefOr[ActivityMap] = js.undefined
  var value: js.UndefOr[StateValue] = js.undefined
}

object TransitionData {
  @scala.inline
  def apply[TContext, TEvent](actions: ActionMap[TContext, TEvent], activities: ActivityMap = null, value: StateValue = null): TransitionData[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    if (activities != null) __obj.updateDynamic("activities")(activities.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionData[TContext, TEvent]]
  }
}


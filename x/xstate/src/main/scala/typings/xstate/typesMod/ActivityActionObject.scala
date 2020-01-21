package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Start
import typings.xstate.typesMod.ActionTypes.Stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityActionObject[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var activity: ActivityDefinition[TContext, TEvent]
  @JSName("exec")
  var exec_ActivityActionObject: js.UndefOr[ActionFunction[TContext, TEvent]] = js.undefined
  @JSName("type")
  var type_ActivityActionObject: Start | Stop
}

object ActivityActionObject {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    activity: ActivityDefinition[TContext, TEvent],
    `type`: Start | Stop,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null
  ): ActivityActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    __obj.asInstanceOf[ActivityActionObject[TContext, TEvent]]
  }
}


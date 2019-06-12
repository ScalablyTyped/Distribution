package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityActionObject[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var activity: ActivityDefinition[TContext, TEvent]
  @JSName("exec")
  var exec_ActivityActionObject: js.UndefOr[ActionFunction[TContext, TEvent]] = js.undefined
  @JSName("type")
  var type_ActivityActionObject: xstateLib.esTypesMod.ActionTypes.Start | xstateLib.esTypesMod.ActionTypes.Stop
}

object ActivityActionObject {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    activity: ActivityDefinition[TContext, TEvent],
    `type`: xstateLib.esTypesMod.ActionTypes.Start | xstateLib.esTypesMod.ActionTypes.Stop,
    exec: ActionFunction[TContext, TEvent] = null
  ): ActivityActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec)
    __obj.asInstanceOf[ActivityActionObject[TContext, TEvent]]
  }
}


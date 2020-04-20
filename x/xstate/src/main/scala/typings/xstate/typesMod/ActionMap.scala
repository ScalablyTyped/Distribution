package typings.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMap[TContext, TEvent /* <: EventObject */] extends js.Object {
  var actions: js.Array[Action[TContext, TEvent]]
  var onEntry: js.Array[Action[TContext, TEvent]]
  var onExit: js.Array[Action[TContext, TEvent]]
}

object ActionMap {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[Action[TContext, TEvent]],
    onEntry: js.Array[Action[TContext, TEvent]],
    onExit: js.Array[Action[TContext, TEvent]]
  ): ActionMap[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onEntry = onEntry.asInstanceOf[js.Any], onExit = onExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMap[TContext, TEvent]]
  }
}


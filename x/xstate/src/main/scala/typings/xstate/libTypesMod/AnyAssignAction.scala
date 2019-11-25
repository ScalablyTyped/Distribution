package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Assign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyAssignAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var assignment: js.Any
  @JSName("type")
  var type_AnyAssignAction: Assign
}

object AnyAssignAction {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    assignment: js.Any,
    `type`: Assign,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null
  ): AnyAssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    __obj.asInstanceOf[AnyAssignAction[TContext, TEvent]]
  }
}


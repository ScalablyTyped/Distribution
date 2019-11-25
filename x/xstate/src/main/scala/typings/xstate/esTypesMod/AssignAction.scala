package typings.xstate.esTypesMod

import typings.xstate.esTypesMod.ActionTypes.Assign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var assignment: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent])
  @JSName("type")
  var type_AssignAction: Assign
}

object AssignAction {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    assignment: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]),
    `type`: Assign,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => js.Any | Unit = null
  ): AssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3(exec))
    __obj.asInstanceOf[AssignAction[TContext, TEvent]]
  }
}


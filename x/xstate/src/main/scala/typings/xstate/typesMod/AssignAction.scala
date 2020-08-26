package typings.xstate.typesMod

import typings.std.Partial
import typings.xstate.typesMod.ActionTypes.Assign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var assignment: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]) = js.native
  @JSName("type")
  var type_AssignAction: Assign = js.native
}

object AssignAction {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](assignment: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]), `type`: Assign): AssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignAction[TContext, TEvent]]
  }
  @scala.inline
  implicit class AssignActionOps[Self <: AssignAction[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (AssignAction[TContext, TEvent])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssignmentFunction3(value: (TContext, TEvent, /* meta */ AssignMeta[TContext, TEvent]) => Partial[TContext]): Self = this.set("assignment", js.Any.fromFunction3(value))
    @scala.inline
    def setAssignment(value: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent])): Self = this.set("assignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Assign): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


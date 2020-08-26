package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Assign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyAssignAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var assignment: js.Any = js.native
  @JSName("type")
  var type_AnyAssignAction: Assign = js.native
}

object AnyAssignAction {
  @scala.inline
  def apply[TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent](assignment: js.Any, `type`: Assign): AnyAssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyAssignAction[TContext, TEvent]]
  }
  @scala.inline
  implicit class AnyAssignActionOps[Self <: AnyAssignAction[_, _], TContext, /* <: typings.xstate.typesMod.EventObject */ TEvent] (val x: Self with (AnyAssignAction[TContext, TEvent])) extends AnyVal {
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
    def setAssignment(value: js.Any): Self = this.set("assignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Assign): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}


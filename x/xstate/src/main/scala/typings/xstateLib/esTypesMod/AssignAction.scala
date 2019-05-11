package typings
package xstateLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var assignment: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent])
}

object AssignAction {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    assignment: (Assigner[TContext, TEvent]) | (PropertyAssigner[TContext, TEvent]),
    `type`: java.lang.String,
    exec: ActionFunction[TContext, TEvent] = null
  ): AssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (exec != null) __obj.updateDynamic("exec")(exec)
    __obj.asInstanceOf[AssignAction[TContext, TEvent]]
  }
}


package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemStateTransition extends js.Object {
  /**
    * Gets a list of actions needed to transition to that state.
    */
  var actions: js.Array[String] = js.native
  /**
    * Name of the next state.
    */
  var to: String = js.native
}

object WorkItemStateTransition {
  @scala.inline
  def apply(actions: js.Array[String], to: String): WorkItemStateTransition = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemStateTransition]
  }
  @scala.inline
  implicit class WorkItemStateTransitionOps[Self <: WorkItemStateTransition] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: String*): Self = this.set("actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: js.Array[String]): Self = this.set("actions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
  }
  
}


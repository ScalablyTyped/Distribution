package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowConfigurationOptions extends js.Object {
  var taskRouting: js.UndefOr[TaskRoutingConfigurationOptions] = js.native
  var task_routing: js.UndefOr[TaskRoutingConfigurationOptions] = js.native
}

object WorkflowConfigurationOptions {
  @scala.inline
  def apply(): WorkflowConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowConfigurationOptions]
  }
  @scala.inline
  implicit class WorkflowConfigurationOptionsOps[Self <: WorkflowConfigurationOptions] (val x: Self) extends AnyVal {
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
    def setTaskRouting(value: TaskRoutingConfigurationOptions): Self = this.set("taskRouting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskRouting: Self = this.set("taskRouting", js.undefined)
    @scala.inline
    def setTask_routing(value: TaskRoutingConfigurationOptions): Self = this.set("task_routing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTask_routing: Self = this.set("task_routing", js.undefined)
  }
  
}


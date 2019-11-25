package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowConfigurationOptions extends js.Object {
  var taskRouting: js.UndefOr[TaskRoutingConfigurationOptions] = js.undefined
  var task_routing: js.UndefOr[TaskRoutingConfigurationOptions] = js.undefined
}

object WorkflowConfigurationOptions {
  @scala.inline
  def apply(
    taskRouting: TaskRoutingConfigurationOptions = null,
    task_routing: TaskRoutingConfigurationOptions = null
  ): WorkflowConfigurationOptions = {
    val __obj = js.Dynamic.literal()
    if (taskRouting != null) __obj.updateDynamic("taskRouting")(taskRouting.asInstanceOf[js.Any])
    if (task_routing != null) __obj.updateDynamic("task_routing")(task_routing.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowConfigurationOptions]
  }
}


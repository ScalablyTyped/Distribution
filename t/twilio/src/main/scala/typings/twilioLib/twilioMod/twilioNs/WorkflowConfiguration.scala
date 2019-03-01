package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowConfiguration extends js.Object {
  var taskRouting: TaskRoutingConfiguration
  var task_routing: TaskRoutingConfiguration
  def toJSON(): java.lang.String
}

object WorkflowConfiguration {
  @scala.inline
  def apply(
    taskRouting: TaskRoutingConfiguration,
    task_routing: TaskRoutingConfiguration,
    toJSON: js.Function0[java.lang.String]
  ): WorkflowConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("taskRouting")(taskRouting)
    __obj.updateDynamic("task_routing")(task_routing)
    __obj.updateDynamic("toJSON")(toJSON)
    __obj.asInstanceOf[WorkflowConfiguration]
  }
}


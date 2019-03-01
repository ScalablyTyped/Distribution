package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskRoutingConfiguration extends js.Object {
  var defaultFilter: WorkflowRuleOptions
  var default_filter: WorkflowRuleOptions
  var filters: js.Array[WorkflowRule]
}

object TaskRoutingConfiguration {
  @scala.inline
  def apply(
    defaultFilter: WorkflowRuleOptions,
    default_filter: WorkflowRuleOptions,
    filters: js.Array[WorkflowRule]
  ): TaskRoutingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultFilter")(defaultFilter)
    __obj.updateDynamic("default_filter")(default_filter)
    __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[TaskRoutingConfiguration]
  }
}


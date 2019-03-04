package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskRoutingConfigurationOptions extends js.Object {
  var defaultFilter: js.UndefOr[WorkflowRuleOptions] = js.undefined
  var default_filter: js.UndefOr[WorkflowRuleOptions] = js.undefined
  var filters: js.Array[WorkflowRuleOptions]
}

object TaskRoutingConfigurationOptions {
  @scala.inline
  def apply(
    filters: js.Array[WorkflowRuleOptions],
    defaultFilter: WorkflowRuleOptions = null,
    default_filter: WorkflowRuleOptions = null
  ): TaskRoutingConfigurationOptions = {
    val __obj = js.Dynamic.literal(filters = filters)
    if (defaultFilter != null) __obj.updateDynamic("defaultFilter")(defaultFilter)
    if (default_filter != null) __obj.updateDynamic("default_filter")(default_filter)
    __obj.asInstanceOf[TaskRoutingConfigurationOptions]
  }
}


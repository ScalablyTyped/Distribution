package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRoutingConfigurationOptions extends js.Object {
  var defaultFilter: js.UndefOr[WorkflowRuleOptions] = js.native
  var default_filter: js.UndefOr[WorkflowRuleOptions] = js.native
  var filters: js.Array[WorkflowRuleOptions] = js.native
}

object TaskRoutingConfigurationOptions {
  @scala.inline
  def apply(filters: js.Array[WorkflowRuleOptions]): TaskRoutingConfigurationOptions = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskRoutingConfigurationOptions]
  }
  @scala.inline
  implicit class TaskRoutingConfigurationOptionsOps[Self <: TaskRoutingConfigurationOptions] (val x: Self) extends AnyVal {
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
    def setFiltersVarargs(value: WorkflowRuleOptions*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[WorkflowRuleOptions]): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultFilter(value: WorkflowRuleOptions): Self = this.set("defaultFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultFilter: Self = this.set("defaultFilter", js.undefined)
    @scala.inline
    def setDefault_filter(value: WorkflowRuleOptions): Self = this.set("default_filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_filter: Self = this.set("default_filter", js.undefined)
  }
  
}


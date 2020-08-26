package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowRuleOptions extends js.Object {
  var expression: String = js.native
  var filter_friendly_name: js.UndefOr[String] = js.native
  var friendlyName: js.UndefOr[String] = js.native
  // Don't ask me why, but all of these are supported options.
  var friendly_name: js.UndefOr[String] = js.native
  var targets: js.Array[WorkflowRuleTargetOptions] = js.native
}

object WorkflowRuleOptions {
  @scala.inline
  def apply(expression: String, targets: js.Array[WorkflowRuleTargetOptions]): WorkflowRuleOptions = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowRuleOptions]
  }
  @scala.inline
  implicit class WorkflowRuleOptionsOps[Self <: WorkflowRuleOptions] (val x: Self) extends AnyVal {
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
    def setExpression(value: String): Self = this.set("expression", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetsVarargs(value: WorkflowRuleTargetOptions*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: js.Array[WorkflowRuleTargetOptions]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter_friendly_name(value: String): Self = this.set("filter_friendly_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter_friendly_name: Self = this.set("filter_friendly_name", js.undefined)
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    @scala.inline
    def setFriendly_name(value: String): Self = this.set("friendly_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFriendly_name: Self = this.set("friendly_name", js.undefined)
  }
  
}


package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowRuleOptions extends js.Object {
  var expression: String
  var filter_friendly_name: js.UndefOr[String] = js.undefined
  var friendlyName: js.UndefOr[String] = js.undefined
  // Don't ask me why, but all of these are supported options.
  var friendly_name: js.UndefOr[String] = js.undefined
  var targets: js.Array[WorkflowRuleTargetOptions]
}

object WorkflowRuleOptions {
  @scala.inline
  def apply(
    expression: String,
    targets: js.Array[WorkflowRuleTargetOptions],
    filter_friendly_name: String = null,
    friendlyName: String = null,
    friendly_name: String = null
  ): WorkflowRuleOptions = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any])
    if (filter_friendly_name != null) __obj.updateDynamic("filter_friendly_name")(filter_friendly_name.asInstanceOf[js.Any])
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (friendly_name != null) __obj.updateDynamic("friendly_name")(friendly_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowRuleOptions]
  }
}


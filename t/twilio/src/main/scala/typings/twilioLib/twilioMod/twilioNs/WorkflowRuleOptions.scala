package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowRuleOptions extends js.Object {
  var expression: java.lang.String
  var filter_friendly_name: js.UndefOr[java.lang.String] = js.undefined
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  // Don't ask me why, but all of these are supported options.
  var friendly_name: js.UndefOr[java.lang.String] = js.undefined
  var targets: js.Array[WorkflowRuleTargetOptions]
}

object WorkflowRuleOptions {
  @scala.inline
  def apply(
    expression: java.lang.String,
    targets: js.Array[WorkflowRuleTargetOptions],
    filter_friendly_name: java.lang.String = null,
    friendlyName: java.lang.String = null,
    friendly_name: java.lang.String = null
  ): WorkflowRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expression")(expression)
    __obj.updateDynamic("targets")(targets)
    if (filter_friendly_name != null) __obj.updateDynamic("filter_friendly_name")(filter_friendly_name)
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (friendly_name != null) __obj.updateDynamic("friendly_name")(friendly_name)
    __obj.asInstanceOf[WorkflowRuleOptions]
  }
}


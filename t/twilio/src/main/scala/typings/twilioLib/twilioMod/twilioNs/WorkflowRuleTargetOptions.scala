package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowRuleTargetOptions extends js.Object {
  var expression: js.UndefOr[java.lang.String] = js.undefined
  var priority: js.UndefOr[scala.Double] = js.undefined
  var queue: java.lang.String
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object WorkflowRuleTargetOptions {
  @scala.inline
  def apply(
    queue: java.lang.String,
    expression: java.lang.String = null,
    priority: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): WorkflowRuleTargetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("queue")(queue)
    if (expression != null) __obj.updateDynamic("expression")(expression)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowRuleTargetOptions]
  }
}


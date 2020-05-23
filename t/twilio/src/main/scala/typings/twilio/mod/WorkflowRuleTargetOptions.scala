package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowRuleTargetOptions extends js.Object {
  var expression: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var queue: String
  var timeout: js.UndefOr[Double] = js.undefined
}

object WorkflowRuleTargetOptions {
  @scala.inline
  def apply(
    queue: String,
    expression: String = null,
    priority: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): WorkflowRuleTargetOptions = {
    val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowRuleTargetOptions]
  }
}


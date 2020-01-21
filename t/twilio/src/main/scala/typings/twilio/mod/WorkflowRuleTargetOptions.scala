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
    priority: Int | Double = null,
    timeout: Int | Double = null
  ): WorkflowRuleTargetOptions = {
    val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
    if (expression != null) __obj.updateDynamic("expression")(expression.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowRuleTargetOptions]
  }
}


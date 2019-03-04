package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowRuleTarget extends js.Object {
  var expression: java.lang.String
  var priority: scala.Double
  var queue: java.lang.String
  var timeout: scala.Double
}

object WorkflowRuleTarget {
  @scala.inline
  def apply(
    expression: java.lang.String,
    priority: scala.Double,
    queue: java.lang.String,
    timeout: scala.Double
  ): WorkflowRuleTarget = {
    val __obj = js.Dynamic.literal(expression = expression, priority = priority, queue = queue, timeout = timeout)
  
    __obj.asInstanceOf[WorkflowRuleTarget]
  }
}


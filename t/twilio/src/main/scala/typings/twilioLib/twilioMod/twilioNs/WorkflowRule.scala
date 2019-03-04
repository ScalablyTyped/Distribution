package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkflowRule extends js.Object {
  var expression: java.lang.String
  var friendlyName: java.lang.String
  var friendly_name: java.lang.String
  var targets: js.Array[WorkflowRuleTarget]
}

object WorkflowRule {
  @scala.inline
  def apply(
    expression: java.lang.String,
    friendlyName: java.lang.String,
    friendly_name: java.lang.String,
    targets: js.Array[WorkflowRuleTarget]
  ): WorkflowRule = {
    val __obj = js.Dynamic.literal(expression = expression, friendlyName = friendlyName, friendly_name = friendly_name, targets = targets)
  
    __obj.asInstanceOf[WorkflowRule]
  }
}


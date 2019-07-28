package typings.twilio.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "WorkflowRuleTarget")
@js.native
class WorkflowRuleTarget () extends js.Object {
  def this(options: WorkflowRuleTargetOptions) = this()
  var expression: String = js.native
  var priority: Double = js.native
  var queue: String = js.native
  var timeout: Double = js.native
}


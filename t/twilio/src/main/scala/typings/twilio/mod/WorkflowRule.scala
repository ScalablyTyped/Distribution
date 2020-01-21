package typings.twilio.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "WorkflowRule")
@js.native
 // Defined property mapped to friendly_name.
class WorkflowRule () extends js.Object {
  def this(options: WorkflowRuleOptions) = this()
  var expression: String = js.native
  var friendlyName: String = js.native
  var friendly_name: String = js.native
  var targets: js.Array[WorkflowRuleTarget] = js.native
}


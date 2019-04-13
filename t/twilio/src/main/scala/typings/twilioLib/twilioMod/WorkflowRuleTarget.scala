package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "WorkflowRuleTarget")
@js.native
class WorkflowRuleTarget () extends js.Object {
  def this(options: WorkflowRuleTargetOptions) = this()
  var expression: java.lang.String = js.native
  var priority: scala.Double = js.native
  var queue: java.lang.String = js.native
  var timeout: scala.Double = js.native
}


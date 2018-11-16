package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "WorkflowRuleTarget")
@js.native
class WorkflowRuleTarget ()
  extends twilioLib.twilioMod.twilioNs.WorkflowRuleTarget {
  def this(options: twilioLib.twilioMod.twilioNs.WorkflowRuleTargetOptions) = this()
  /* CompleteClass */
  override var expression: java.lang.String = js.native
  /* CompleteClass */
  override var priority: scala.Double = js.native
  /* CompleteClass */
  override var queue: java.lang.String = js.native
  /* CompleteClass */
  override var timeout: scala.Double = js.native
}


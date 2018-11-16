package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "WorkflowRule")
@js.native
class WorkflowRule ()
  extends twilioLib.twilioMod.twilioNs.WorkflowRule {
   // Defined property mapped to friendly_name.
  def this(options: twilioLib.twilioMod.twilioNs.WorkflowRuleOptions) = this()
  /* CompleteClass */
  override var expression: java.lang.String = js.native
  /* CompleteClass */
  override var friendlyName: java.lang.String = js.native
  /* CompleteClass */
  override var friendly_name: java.lang.String = js.native
  /* CompleteClass */
  override var targets: js.Array[twilioLib.twilioMod.twilioNs.WorkflowRuleTarget] = js.native
}


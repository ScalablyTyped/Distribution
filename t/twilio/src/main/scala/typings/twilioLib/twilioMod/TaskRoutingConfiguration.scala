package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "TaskRoutingConfiguration")
@js.native
 // Defined property mapped to default_filter.
class TaskRoutingConfiguration ()
  extends twilioLib.twilioMod.twilioNs.TaskRoutingConfiguration {
  def this(options: twilioLib.twilioMod.twilioNs.TaskRoutingConfigurationOptions) = this()
  /* CompleteClass */
  override var defaultFilter: twilioLib.twilioMod.twilioNs.WorkflowRuleOptions = js.native
  /* CompleteClass */
  override var default_filter: twilioLib.twilioMod.twilioNs.WorkflowRuleOptions = js.native
  /* CompleteClass */
  override var filters: js.Array[twilioLib.twilioMod.twilioNs.WorkflowRule] = js.native
}


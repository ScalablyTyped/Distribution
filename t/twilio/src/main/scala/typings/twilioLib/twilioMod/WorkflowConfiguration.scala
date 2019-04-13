package typings
package twilioLib.twilioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio", "WorkflowConfiguration")
@js.native
 // Defined property mapped to task_routing.
class WorkflowConfiguration () extends js.Object {
  def this(options: WorkflowConfigurationOptions) = this()
  var taskRouting: TaskRoutingConfiguration = js.native
  var task_routing: TaskRoutingConfiguration = js.native
  def toJSON(): java.lang.String = js.native
}

/* static members */
@JSImport("twilio", "WorkflowConfiguration")
@js.native
object WorkflowConfiguration extends js.Object {
  def fromJSON(json: java.lang.String): twilioLib.twilioMod.WorkflowConfiguration = js.native
}


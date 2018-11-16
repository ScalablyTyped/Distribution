package typings
package twilioLib.twilioMod.twilioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceInstance extends InstanceResource {
  var activities: WorkspaceActivityResource = js.native
  var events: WorkspaceEventResource = js.native
  var statistics: WorkspaceInstanceStatisticResource = js.native
  var taskQueues: WorkspaceTaskQueueResource = js.native
  var tasks: WorkspaceTaskResource = js.native
  var workers: WorkspaceWorkerResource = js.native
  var workflows: WorkspaceWorkflowResource = js.native
}


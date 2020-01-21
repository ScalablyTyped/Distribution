package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseTasksUpdatedEvent extends RealtimeReleaseEvent {
  var environmentId: Double
  var job: ReleaseTask
  var releaseDeployPhaseId: Double
  var releaseStepId: Double
  var tasks: js.Array[ReleaseTask]
}

object ReleaseTasksUpdatedEvent {
  @scala.inline
  def apply(
    environmentId: Double,
    job: ReleaseTask,
    projectId: String,
    releaseDeployPhaseId: Double,
    releaseId: Double,
    releaseStepId: Double,
    tasks: js.Array[ReleaseTask]
  ): ReleaseTasksUpdatedEvent = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any], job = job.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], releaseDeployPhaseId = releaseDeployPhaseId.asInstanceOf[js.Any], releaseId = releaseId.asInstanceOf[js.Any], releaseStepId = releaseStepId.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseTasksUpdatedEvent]
  }
}


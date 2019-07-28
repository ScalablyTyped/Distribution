package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

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
    val __obj = js.Dynamic.literal(environmentId = environmentId, job = job, projectId = projectId, releaseDeployPhaseId = releaseDeployPhaseId, releaseId = releaseId, releaseStepId = releaseStepId, tasks = tasks)
  
    __obj.asInstanceOf[ReleaseTasksUpdatedEvent]
  }
}


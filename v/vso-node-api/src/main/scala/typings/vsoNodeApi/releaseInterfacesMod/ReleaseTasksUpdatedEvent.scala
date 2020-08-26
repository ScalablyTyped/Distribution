package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseTasksUpdatedEvent extends RealtimeReleaseEvent {
  var environmentId: Double = js.native
  var job: ReleaseTask = js.native
  var releaseDeployPhaseId: Double = js.native
  var releaseStepId: Double = js.native
  var tasks: js.Array[ReleaseTask] = js.native
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
  @scala.inline
  implicit class ReleaseTasksUpdatedEventOps[Self <: ReleaseTasksUpdatedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnvironmentId(value: Double): Self = this.set("environmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setJob(value: ReleaseTask): Self = this.set("job", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseDeployPhaseId(value: Double): Self = this.set("releaseDeployPhaseId", value.asInstanceOf[js.Any])
    @scala.inline
    def setReleaseStepId(value: Double): Self = this.set("releaseStepId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTasksVarargs(value: ReleaseTask*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: js.Array[ReleaseTask]): Self = this.set("tasks", value.asInstanceOf[js.Any])
  }
  
}


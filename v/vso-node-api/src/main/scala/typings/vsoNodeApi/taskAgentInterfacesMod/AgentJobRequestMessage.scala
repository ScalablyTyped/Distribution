package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentJobRequestMessage extends JobRequestMessage {
  var lockToken: String = js.native
  var lockedUntil: Date = js.native
  var requestId: Double = js.native
  var tasks: js.Array[TaskInstance] = js.native
}

object AgentJobRequestMessage {
  @scala.inline
  def apply(
    environment: JobEnvironment,
    jobId: String,
    jobName: String,
    lockToken: String,
    lockedUntil: Date,
    messageType: String,
    plan: TaskOrchestrationPlanReference,
    requestId: Double,
    tasks: js.Array[TaskInstance],
    timeline: TimelineReference
  ): AgentJobRequestMessage = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], lockToken = lockToken.asInstanceOf[js.Any], lockedUntil = lockedUntil.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentJobRequestMessage]
  }
  @scala.inline
  implicit class AgentJobRequestMessageOps[Self <: AgentJobRequestMessage] (val x: Self) extends AnyVal {
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
    def setLockToken(value: String): Self = this.set("lockToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setLockedUntil(value: Date): Self = this.set("lockedUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: Double): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTasksVarargs(value: TaskInstance*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: js.Array[TaskInstance]): Self = this.set("tasks", value.asInstanceOf[js.Any])
  }
  
}


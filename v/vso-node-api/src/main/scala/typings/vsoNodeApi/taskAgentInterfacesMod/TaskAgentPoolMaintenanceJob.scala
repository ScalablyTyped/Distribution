package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskAgentPoolMaintenanceJob extends js.Object {
  /**
    * The maintenance definition for the maintenance job
    */
  var definitionId: Double = js.native
  /**
    * The total error counts during the maintenance job
    */
  var errorCount: Double = js.native
  /**
    * Time that the maintenance job was completed
    */
  var finishTime: Date = js.native
  /**
    * Id of the maintenance job
    */
  var jobId: Double = js.native
  /**
    * The log download url for the maintenance job
    */
  var logsDownloadUrl: String = js.native
  /**
    * Orchestration/Plan Id for the maintenance job
    */
  var orchestrationId: String = js.native
  /**
    * Pool reference for the maintenance job
    */
  var pool: TaskAgentPoolReference = js.native
  /**
    * Time that the maintenance job was queued
    */
  var queueTime: Date = js.native
  /**
    * The identity that queued the maintenance job
    */
  var requestedBy: IdentityRef = js.native
  /**
    * The maintenance job result
    */
  var result: TaskAgentPoolMaintenanceJobResult = js.native
  /**
    * Time that the maintenance job was started
    */
  var startTime: Date = js.native
  /**
    * Status of the maintenance job
    */
  var status: TaskAgentPoolMaintenanceJobStatus = js.native
  var targetAgents: js.Array[TaskAgentReference] = js.native
  /**
    * The total warning counts during the maintenance job
    */
  var warningCount: Double = js.native
}

object TaskAgentPoolMaintenanceJob {
  @scala.inline
  def apply(
    definitionId: Double,
    errorCount: Double,
    finishTime: Date,
    jobId: Double,
    logsDownloadUrl: String,
    orchestrationId: String,
    pool: TaskAgentPoolReference,
    queueTime: Date,
    requestedBy: IdentityRef,
    result: TaskAgentPoolMaintenanceJobResult,
    startTime: Date,
    status: TaskAgentPoolMaintenanceJobStatus,
    targetAgents: js.Array[TaskAgentReference],
    warningCount: Double
  ): TaskAgentPoolMaintenanceJob = {
    val __obj = js.Dynamic.literal(definitionId = definitionId.asInstanceOf[js.Any], errorCount = errorCount.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], logsDownloadUrl = logsDownloadUrl.asInstanceOf[js.Any], orchestrationId = orchestrationId.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], targetAgents = targetAgents.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolMaintenanceJob]
  }
  @scala.inline
  implicit class TaskAgentPoolMaintenanceJobOps[Self <: TaskAgentPoolMaintenanceJob] (val x: Self) extends AnyVal {
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
    def setDefinitionId(value: Double): Self = this.set("definitionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCount(value: Double): Self = this.set("errorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFinishTime(value: Date): Self = this.set("finishTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobId(value: Double): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogsDownloadUrl(value: String): Self = this.set("logsDownloadUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrchestrationId(value: String): Self = this.set("orchestrationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPool(value: TaskAgentPoolReference): Self = this.set("pool", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueueTime(value: Date): Self = this.set("queueTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestedBy(value: IdentityRef): Self = this.set("requestedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: TaskAgentPoolMaintenanceJobResult): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Date): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: TaskAgentPoolMaintenanceJobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetAgentsVarargs(value: TaskAgentReference*): Self = this.set("targetAgents", js.Array(value :_*))
    @scala.inline
    def setTargetAgents(value: js.Array[TaskAgentReference]): Self = this.set("targetAgents", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningCount(value: Double): Self = this.set("warningCount", value.asInstanceOf[js.Any])
  }
  
}


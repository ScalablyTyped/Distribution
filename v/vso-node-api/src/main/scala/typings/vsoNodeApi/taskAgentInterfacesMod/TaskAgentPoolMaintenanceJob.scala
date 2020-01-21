package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPoolMaintenanceJob extends js.Object {
  /**
    * The maintenance definition for the maintenance job
    */
  var definitionId: Double
  /**
    * The total error counts during the maintenance job
    */
  var errorCount: Double
  /**
    * Time that the maintenance job was completed
    */
  var finishTime: Date
  /**
    * Id of the maintenance job
    */
  var jobId: Double
  /**
    * The log download url for the maintenance job
    */
  var logsDownloadUrl: String
  /**
    * Orchestration/Plan Id for the maintenance job
    */
  var orchestrationId: String
  /**
    * Pool reference for the maintenance job
    */
  var pool: TaskAgentPoolReference
  /**
    * Time that the maintenance job was queued
    */
  var queueTime: Date
  /**
    * The identity that queued the maintenance job
    */
  var requestedBy: IdentityRef
  /**
    * The maintenance job result
    */
  var result: TaskAgentPoolMaintenanceJobResult
  /**
    * Time that the maintenance job was started
    */
  var startTime: Date
  /**
    * Status of the maintenance job
    */
  var status: TaskAgentPoolMaintenanceJobStatus
  var targetAgents: js.Array[TaskAgentReference]
  /**
    * The total warning counts during the maintenance job
    */
  var warningCount: Double
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
}


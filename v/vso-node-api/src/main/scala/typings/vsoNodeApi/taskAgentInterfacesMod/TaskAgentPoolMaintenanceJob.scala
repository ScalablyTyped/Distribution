package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentPoolMaintenanceJob extends StObject {
  
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
  implicit class TaskAgentPoolMaintenanceJobMutableBuilder[Self <: TaskAgentPoolMaintenanceJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTime(value: Date): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogsDownloadUrl(value: String): Self = StObject.set(x, "logsDownloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrchestrationId(value: String): Self = StObject.set(x, "orchestrationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPool(value: TaskAgentPoolReference): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTime(value: Date): Self = StObject.set(x, "queueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedBy(value: IdentityRef): Self = StObject.set(x, "requestedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: TaskAgentPoolMaintenanceJobResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TaskAgentPoolMaintenanceJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAgents(value: js.Array[TaskAgentReference]): Self = StObject.set(x, "targetAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetAgentsVarargs(value: TaskAgentReference*): Self = StObject.set(x, "targetAgents", js.Array(value :_*))
    
    @scala.inline
    def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
  }
}

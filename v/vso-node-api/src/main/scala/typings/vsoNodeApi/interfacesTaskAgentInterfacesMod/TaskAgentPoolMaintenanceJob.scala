package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentPoolMaintenanceJob extends StObject {
  
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
  var finishTime: js.Date
  
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
  var queueTime: js.Date
  
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
  var startTime: js.Date
  
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
  
  inline def apply(
    definitionId: Double,
    errorCount: Double,
    finishTime: js.Date,
    jobId: Double,
    logsDownloadUrl: String,
    orchestrationId: String,
    pool: TaskAgentPoolReference,
    queueTime: js.Date,
    requestedBy: IdentityRef,
    result: TaskAgentPoolMaintenanceJobResult,
    startTime: js.Date,
    status: TaskAgentPoolMaintenanceJobStatus,
    targetAgents: js.Array[TaskAgentReference],
    warningCount: Double
  ): TaskAgentPoolMaintenanceJob = {
    val __obj = js.Dynamic.literal(definitionId = definitionId.asInstanceOf[js.Any], errorCount = errorCount.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], logsDownloadUrl = logsDownloadUrl.asInstanceOf[js.Any], orchestrationId = orchestrationId.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], requestedBy = requestedBy.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], targetAgents = targetAgents.asInstanceOf[js.Any], warningCount = warningCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPoolMaintenanceJob]
  }
  
  extension [Self <: TaskAgentPoolMaintenanceJob](x: Self) {
    
    inline def setDefinitionId(value: Double): Self = StObject.set(x, "definitionId", value.asInstanceOf[js.Any])
    
    inline def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
    
    inline def setFinishTime(value: js.Date): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: Double): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setLogsDownloadUrl(value: String): Self = StObject.set(x, "logsDownloadUrl", value.asInstanceOf[js.Any])
    
    inline def setOrchestrationId(value: String): Self = StObject.set(x, "orchestrationId", value.asInstanceOf[js.Any])
    
    inline def setPool(value: TaskAgentPoolReference): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setQueueTime(value: js.Date): Self = StObject.set(x, "queueTime", value.asInstanceOf[js.Any])
    
    inline def setRequestedBy(value: IdentityRef): Self = StObject.set(x, "requestedBy", value.asInstanceOf[js.Any])
    
    inline def setResult(value: TaskAgentPoolMaintenanceJobResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TaskAgentPoolMaintenanceJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTargetAgents(value: js.Array[TaskAgentReference]): Self = StObject.set(x, "targetAgents", value.asInstanceOf[js.Any])
    
    inline def setTargetAgentsVarargs(value: TaskAgentReference*): Self = StObject.set(x, "targetAgents", js.Array(value*))
    
    inline def setWarningCount(value: Double): Self = StObject.set(x, "warningCount", value.asInstanceOf[js.Any])
  }
}

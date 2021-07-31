package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentJobRequest extends StObject {
  
  var assignTime: Date
  
  var data: StringDictionary[String]
  
  var definition: TaskOrchestrationOwner
  
  var demands: js.Array[js.Any]
  
  var finishTime: Date
  
  var hostId: String
  
  var jobId: String
  
  var jobName: String
  
  var lockedUntil: Date
  
  var matchedAgents: js.Array[TaskAgentReference]
  
  var owner: TaskOrchestrationOwner
  
  var planId: String
  
  var planType: String
  
  var queueTime: Date
  
  var receiveTime: Date
  
  var requestId: Double
  
  var reservedAgent: TaskAgentReference
  
  var result: TaskResult
  
  var scopeId: String
  
  var serviceOwner: String
}
object TaskAgentJobRequest {
  
  @scala.inline
  def apply(
    assignTime: Date,
    data: StringDictionary[String],
    definition: TaskOrchestrationOwner,
    demands: js.Array[js.Any],
    finishTime: Date,
    hostId: String,
    jobId: String,
    jobName: String,
    lockedUntil: Date,
    matchedAgents: js.Array[TaskAgentReference],
    owner: TaskOrchestrationOwner,
    planId: String,
    planType: String,
    queueTime: Date,
    receiveTime: Date,
    requestId: Double,
    reservedAgent: TaskAgentReference,
    result: TaskResult,
    scopeId: String,
    serviceOwner: String
  ): TaskAgentJobRequest = {
    val __obj = js.Dynamic.literal(assignTime = assignTime.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], finishTime = finishTime.asInstanceOf[js.Any], hostId = hostId.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], lockedUntil = lockedUntil.asInstanceOf[js.Any], matchedAgents = matchedAgents.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], planId = planId.asInstanceOf[js.Any], planType = planType.asInstanceOf[js.Any], queueTime = queueTime.asInstanceOf[js.Any], receiveTime = receiveTime.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], reservedAgent = reservedAgent.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], scopeId = scopeId.asInstanceOf[js.Any], serviceOwner = serviceOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentJobRequest]
  }
  
  @scala.inline
  implicit class TaskAgentJobRequestMutableBuilder[Self <: TaskAgentJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignTime(value: Date): Self = StObject.set(x, "assignTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: TaskOrchestrationOwner): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemands(value: js.Array[js.Any]): Self = StObject.set(x, "demands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemandsVarargs(value: js.Any*): Self = StObject.set(x, "demands", js.Array(value :_*))
    
    @scala.inline
    def setFinishTime(value: Date): Self = StObject.set(x, "finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostId(value: String): Self = StObject.set(x, "hostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: String): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUntil(value: Date): Self = StObject.set(x, "lockedUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedAgents(value: js.Array[TaskAgentReference]): Self = StObject.set(x, "matchedAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedAgentsVarargs(value: TaskAgentReference*): Self = StObject.set(x, "matchedAgents", js.Array(value :_*))
    
    @scala.inline
    def setOwner(value: TaskOrchestrationOwner): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanId(value: String): Self = StObject.set(x, "planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanType(value: String): Self = StObject.set(x, "planType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTime(value: Date): Self = StObject.set(x, "queueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveTime(value: Date): Self = StObject.set(x, "receiveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedAgent(value: TaskAgentReference): Self = StObject.set(x, "reservedAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: TaskResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeId(value: String): Self = StObject.set(x, "scopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceOwner(value: String): Self = StObject.set(x, "serviceOwner", value.asInstanceOf[js.Any])
  }
}

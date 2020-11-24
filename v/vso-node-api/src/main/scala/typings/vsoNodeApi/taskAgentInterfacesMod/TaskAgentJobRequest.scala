package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentJobRequest extends js.Object {
  
  var assignTime: Date = js.native
  
  var data: StringDictionary[String] = js.native
  
  var definition: TaskOrchestrationOwner = js.native
  
  var demands: js.Array[_] = js.native
  
  var finishTime: Date = js.native
  
  var hostId: String = js.native
  
  var jobId: String = js.native
  
  var jobName: String = js.native
  
  var lockedUntil: Date = js.native
  
  var matchedAgents: js.Array[TaskAgentReference] = js.native
  
  var owner: TaskOrchestrationOwner = js.native
  
  var planId: String = js.native
  
  var planType: String = js.native
  
  var queueTime: Date = js.native
  
  var receiveTime: Date = js.native
  
  var requestId: Double = js.native
  
  var reservedAgent: TaskAgentReference = js.native
  
  var result: TaskResult = js.native
  
  var scopeId: String = js.native
  
  var serviceOwner: String = js.native
}
object TaskAgentJobRequest {
  
  @scala.inline
  def apply(
    assignTime: Date,
    data: StringDictionary[String],
    definition: TaskOrchestrationOwner,
    demands: js.Array[_],
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
  implicit class TaskAgentJobRequestOps[Self <: TaskAgentJobRequest] (val x: Self) extends AnyVal {
    
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
    def setAssignTime(value: Date): Self = this.set("assignTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: StringDictionary[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: TaskOrchestrationOwner): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDemandsVarargs(value: js.Any*): Self = this.set("demands", js.Array(value :_*))
    
    @scala.inline
    def setDemands(value: js.Array[_]): Self = this.set("demands", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishTime(value: Date): Self = this.set("finishTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostId(value: String): Self = this.set("hostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobId(value: String): Self = this.set("jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobName(value: String): Self = this.set("jobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedUntil(value: Date): Self = this.set("lockedUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedAgentsVarargs(value: TaskAgentReference*): Self = this.set("matchedAgents", js.Array(value :_*))
    
    @scala.inline
    def setMatchedAgents(value: js.Array[TaskAgentReference]): Self = this.set("matchedAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: TaskOrchestrationOwner): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanId(value: String): Self = this.set("planId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanType(value: String): Self = this.set("planType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueueTime(value: Date): Self = this.set("queueTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveTime(value: Date): Self = this.set("receiveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: Double): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedAgent(value: TaskAgentReference): Self = this.set("reservedAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: TaskResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopeId(value: String): Self = this.set("scopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceOwner(value: String): Self = this.set("serviceOwner", value.asInstanceOf[js.Any])
  }
}

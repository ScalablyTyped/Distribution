package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentJobRequest extends js.Object {
  var assignTime: Date
  var data: StringDictionary[String]
  var definition: TaskOrchestrationOwner
  var demands: js.Array[_]
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
    val __obj = js.Dynamic.literal(assignTime = assignTime, data = data, definition = definition, demands = demands, finishTime = finishTime, hostId = hostId, jobId = jobId, jobName = jobName, lockedUntil = lockedUntil, matchedAgents = matchedAgents, owner = owner, planId = planId, planType = planType, queueTime = queueTime, receiveTime = receiveTime, requestId = requestId, reservedAgent = reservedAgent, result = result, scopeId = scopeId, serviceOwner = serviceOwner)
  
    __obj.asInstanceOf[TaskAgentJobRequest]
  }
}


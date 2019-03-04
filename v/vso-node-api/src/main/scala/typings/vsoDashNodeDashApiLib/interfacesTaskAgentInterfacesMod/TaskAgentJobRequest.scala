package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentJobRequest extends js.Object {
  var assignTime: stdLib.Date
  var data: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var definition: TaskOrchestrationOwner
  var demands: js.Array[_]
  var finishTime: stdLib.Date
  var hostId: java.lang.String
  var jobId: java.lang.String
  var jobName: java.lang.String
  var lockedUntil: stdLib.Date
  var matchedAgents: js.Array[TaskAgentReference]
  var owner: TaskOrchestrationOwner
  var planId: java.lang.String
  var planType: java.lang.String
  var queueTime: stdLib.Date
  var receiveTime: stdLib.Date
  var requestId: scala.Double
  var reservedAgent: TaskAgentReference
  var result: TaskResult
  var scopeId: java.lang.String
  var serviceOwner: java.lang.String
}

object TaskAgentJobRequest {
  @scala.inline
  def apply(
    assignTime: stdLib.Date,
    data: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    definition: TaskOrchestrationOwner,
    demands: js.Array[_],
    finishTime: stdLib.Date,
    hostId: java.lang.String,
    jobId: java.lang.String,
    jobName: java.lang.String,
    lockedUntil: stdLib.Date,
    matchedAgents: js.Array[TaskAgentReference],
    owner: TaskOrchestrationOwner,
    planId: java.lang.String,
    planType: java.lang.String,
    queueTime: stdLib.Date,
    receiveTime: stdLib.Date,
    requestId: scala.Double,
    reservedAgent: TaskAgentReference,
    result: TaskResult,
    scopeId: java.lang.String,
    serviceOwner: java.lang.String
  ): TaskAgentJobRequest = {
    val __obj = js.Dynamic.literal(assignTime = assignTime, data = data, definition = definition, demands = demands, finishTime = finishTime, hostId = hostId, jobId = jobId, jobName = jobName, lockedUntil = lockedUntil, matchedAgents = matchedAgents, owner = owner, planId = planId, planType = planType, queueTime = queueTime, receiveTime = receiveTime, requestId = requestId, reservedAgent = reservedAgent, result = result, scopeId = scopeId, serviceOwner = serviceOwner)
  
    __obj.asInstanceOf[TaskAgentJobRequest]
  }
}


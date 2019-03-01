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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assignTime")(assignTime)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("definition")(definition)
    __obj.updateDynamic("demands")(demands)
    __obj.updateDynamic("finishTime")(finishTime)
    __obj.updateDynamic("hostId")(hostId)
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("jobName")(jobName)
    __obj.updateDynamic("lockedUntil")(lockedUntil)
    __obj.updateDynamic("matchedAgents")(matchedAgents)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("planId")(planId)
    __obj.updateDynamic("planType")(planType)
    __obj.updateDynamic("queueTime")(queueTime)
    __obj.updateDynamic("receiveTime")(receiveTime)
    __obj.updateDynamic("requestId")(requestId)
    __obj.updateDynamic("reservedAgent")(reservedAgent)
    __obj.updateDynamic("result")(result)
    __obj.updateDynamic("scopeId")(scopeId)
    __obj.updateDynamic("serviceOwner")(serviceOwner)
    __obj.asInstanceOf[TaskAgentJobRequest]
  }
}


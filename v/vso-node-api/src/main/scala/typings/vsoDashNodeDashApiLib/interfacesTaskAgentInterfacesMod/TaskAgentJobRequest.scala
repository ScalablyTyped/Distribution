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


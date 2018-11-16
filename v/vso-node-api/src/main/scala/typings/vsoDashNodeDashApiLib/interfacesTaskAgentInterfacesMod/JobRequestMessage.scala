package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JobRequestMessage extends js.Object {
  var environment: JobEnvironment
  var jobId: java.lang.String
  var jobName: java.lang.String
  var messageType: java.lang.String
  var plan: TaskOrchestrationPlanReference
  var timeline: TimelineReference
}


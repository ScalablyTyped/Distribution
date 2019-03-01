package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCompletedEvent extends JobEvent {
  var outputVariables: org.scalablytyped.runtime.StringDictionary[VariableValue]
  var requestId: scala.Double
  var result: TaskResult
}

object JobCompletedEvent {
  @scala.inline
  def apply(
    jobId: java.lang.String,
    name: java.lang.String,
    outputVariables: org.scalablytyped.runtime.StringDictionary[VariableValue],
    requestId: scala.Double,
    result: TaskResult
  ): JobCompletedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("outputVariables")(outputVariables)
    __obj.updateDynamic("requestId")(requestId)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[JobCompletedEvent]
  }
}


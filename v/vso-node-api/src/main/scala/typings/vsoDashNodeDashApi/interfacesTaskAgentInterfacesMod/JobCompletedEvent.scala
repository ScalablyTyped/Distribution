package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobCompletedEvent extends JobEvent {
  var outputVariables: StringDictionary[VariableValue]
  var requestId: Double
  var result: TaskResult
}

object JobCompletedEvent {
  @scala.inline
  def apply(
    jobId: String,
    name: String,
    outputVariables: StringDictionary[VariableValue],
    requestId: Double,
    result: TaskResult
  ): JobCompletedEvent = {
    val __obj = js.Dynamic.literal(jobId = jobId, name = name, outputVariables = outputVariables, requestId = requestId, result = result)
  
    __obj.asInstanceOf[JobCompletedEvent]
  }
}


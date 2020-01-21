package typings.vsoNodeApi.taskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputVariables = outputVariables.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobCompletedEvent]
  }
}


package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerDeploymentInput extends BaseDeploymentInput {
  var parallelExecution: ExecutionInput
}

object ServerDeploymentInput {
  @scala.inline
  def apply(
    condition: String,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    parallelExecution: ExecutionInput,
    timeoutInMinutes: Double
  ): ServerDeploymentInput = {
    val __obj = js.Dynamic.literal(condition = condition, jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes, overrideInputs = overrideInputs, parallelExecution = parallelExecution, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[ServerDeploymentInput]
  }
}


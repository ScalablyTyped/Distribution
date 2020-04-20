package typings.vsoNodeApi.releaseInterfacesMod

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
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], parallelExecution = parallelExecution.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerDeploymentInput]
  }
}


package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerDeploymentInput extends BaseDeploymentInput {
  var parallelExecution: ExecutionInput
}

object ServerDeploymentInput {
  @scala.inline
  def apply(
    condition: java.lang.String,
    jobCancelTimeoutInMinutes: scala.Double,
    overrideInputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    parallelExecution: ExecutionInput,
    timeoutInMinutes: scala.Double
  ): ServerDeploymentInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("condition")(condition)
    __obj.updateDynamic("jobCancelTimeoutInMinutes")(jobCancelTimeoutInMinutes)
    __obj.updateDynamic("overrideInputs")(overrideInputs)
    __obj.updateDynamic("parallelExecution")(parallelExecution)
    __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes)
    __obj.asInstanceOf[ServerDeploymentInput]
  }
}


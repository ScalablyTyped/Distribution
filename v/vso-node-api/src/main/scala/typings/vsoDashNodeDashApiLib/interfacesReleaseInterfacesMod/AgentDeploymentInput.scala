package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentDeploymentInput extends DeploymentInput {
  var imageId: scala.Double
  var parallelExecution: ExecutionInput
}

object AgentDeploymentInput {
  @scala.inline
  def apply(
    artifactsDownloadInput: ArtifactsDownloadInput,
    condition: java.lang.String,
    demands: js.Array[_],
    enableAccessToken: scala.Boolean,
    imageId: scala.Double,
    jobCancelTimeoutInMinutes: scala.Double,
    overrideInputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    parallelExecution: ExecutionInput,
    queueId: scala.Double,
    skipArtifactsDownload: scala.Boolean,
    timeoutInMinutes: scala.Double
  ): AgentDeploymentInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifactsDownloadInput")(artifactsDownloadInput)
    __obj.updateDynamic("condition")(condition)
    __obj.updateDynamic("demands")(demands)
    __obj.updateDynamic("enableAccessToken")(enableAccessToken)
    __obj.updateDynamic("imageId")(imageId)
    __obj.updateDynamic("jobCancelTimeoutInMinutes")(jobCancelTimeoutInMinutes)
    __obj.updateDynamic("overrideInputs")(overrideInputs)
    __obj.updateDynamic("parallelExecution")(parallelExecution)
    __obj.updateDynamic("queueId")(queueId)
    __obj.updateDynamic("skipArtifactsDownload")(skipArtifactsDownload)
    __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes)
    __obj.asInstanceOf[AgentDeploymentInput]
  }
}


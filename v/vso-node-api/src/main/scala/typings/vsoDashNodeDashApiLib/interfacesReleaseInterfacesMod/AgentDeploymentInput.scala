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
    val __obj = js.Dynamic.literal(artifactsDownloadInput = artifactsDownloadInput, condition = condition, demands = demands, enableAccessToken = enableAccessToken, imageId = imageId, jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes, overrideInputs = overrideInputs, parallelExecution = parallelExecution, queueId = queueId, skipArtifactsDownload = skipArtifactsDownload, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[AgentDeploymentInput]
  }
}


package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AgentDeploymentInput extends DeploymentInput {
  var imageId: Double
  var parallelExecution: ExecutionInput
}

object AgentDeploymentInput {
  @scala.inline
  def apply(
    artifactsDownloadInput: ArtifactsDownloadInput,
    condition: String,
    demands: js.Array[_],
    enableAccessToken: Boolean,
    imageId: Double,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    parallelExecution: ExecutionInput,
    queueId: Double,
    skipArtifactsDownload: Boolean,
    timeoutInMinutes: Double
  ): AgentDeploymentInput = {
    val __obj = js.Dynamic.literal(artifactsDownloadInput = artifactsDownloadInput, condition = condition, demands = demands, enableAccessToken = enableAccessToken, imageId = imageId, jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes, overrideInputs = overrideInputs, parallelExecution = parallelExecution, queueId = queueId, skipArtifactsDownload = skipArtifactsDownload, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[AgentDeploymentInput]
  }
}


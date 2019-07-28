package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentInput extends BaseDeploymentInput {
  var artifactsDownloadInput: ArtifactsDownloadInput
  var demands: js.Array[_]
  var enableAccessToken: Boolean
  var queueId: Double
  var skipArtifactsDownload: Boolean
}

object DeploymentInput {
  @scala.inline
  def apply(
    artifactsDownloadInput: ArtifactsDownloadInput,
    condition: String,
    demands: js.Array[_],
    enableAccessToken: Boolean,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    queueId: Double,
    skipArtifactsDownload: Boolean,
    timeoutInMinutes: Double
  ): DeploymentInput = {
    val __obj = js.Dynamic.literal(artifactsDownloadInput = artifactsDownloadInput, condition = condition, demands = demands, enableAccessToken = enableAccessToken, jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes, overrideInputs = overrideInputs, queueId = queueId, skipArtifactsDownload = skipArtifactsDownload, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[DeploymentInput]
  }
}


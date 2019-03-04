package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentInput extends BaseDeploymentInput {
  var artifactsDownloadInput: ArtifactsDownloadInput
  var demands: js.Array[_]
  var enableAccessToken: scala.Boolean
  var queueId: scala.Double
  var skipArtifactsDownload: scala.Boolean
}

object DeploymentInput {
  @scala.inline
  def apply(
    artifactsDownloadInput: ArtifactsDownloadInput,
    condition: java.lang.String,
    demands: js.Array[_],
    enableAccessToken: scala.Boolean,
    jobCancelTimeoutInMinutes: scala.Double,
    overrideInputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    queueId: scala.Double,
    skipArtifactsDownload: scala.Boolean,
    timeoutInMinutes: scala.Double
  ): DeploymentInput = {
    val __obj = js.Dynamic.literal(artifactsDownloadInput = artifactsDownloadInput, condition = condition, demands = demands, enableAccessToken = enableAccessToken, jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes, overrideInputs = overrideInputs, queueId = queueId, skipArtifactsDownload = skipArtifactsDownload, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[DeploymentInput]
  }
}


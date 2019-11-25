package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MachineGroupDeploymentInput extends DeploymentInput {
  var deploymentHealthOption: String
  var healthPercent: Double
  var tags: js.Array[String]
}

object MachineGroupDeploymentInput {
  @scala.inline
  def apply(
    artifactsDownloadInput: ArtifactsDownloadInput,
    condition: String,
    demands: js.Array[_],
    deploymentHealthOption: String,
    enableAccessToken: Boolean,
    healthPercent: Double,
    jobCancelTimeoutInMinutes: Double,
    overrideInputs: StringDictionary[String],
    queueId: Double,
    skipArtifactsDownload: Boolean,
    tags: js.Array[String],
    timeoutInMinutes: Double
  ): MachineGroupDeploymentInput = {
    val __obj = js.Dynamic.literal(artifactsDownloadInput = artifactsDownloadInput.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], demands = demands.asInstanceOf[js.Any], deploymentHealthOption = deploymentHealthOption.asInstanceOf[js.Any], enableAccessToken = enableAccessToken.asInstanceOf[js.Any], healthPercent = healthPercent.asInstanceOf[js.Any], jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes.asInstanceOf[js.Any], overrideInputs = overrideInputs.asInstanceOf[js.Any], queueId = queueId.asInstanceOf[js.Any], skipArtifactsDownload = skipArtifactsDownload.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MachineGroupDeploymentInput]
  }
}


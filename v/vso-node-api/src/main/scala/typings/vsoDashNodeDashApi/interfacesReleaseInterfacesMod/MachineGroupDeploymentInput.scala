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
    val __obj = js.Dynamic.literal(artifactsDownloadInput = artifactsDownloadInput, condition = condition, demands = demands, deploymentHealthOption = deploymentHealthOption, enableAccessToken = enableAccessToken, healthPercent = healthPercent, jobCancelTimeoutInMinutes = jobCancelTimeoutInMinutes, overrideInputs = overrideInputs, queueId = queueId, skipArtifactsDownload = skipArtifactsDownload, tags = tags, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[MachineGroupDeploymentInput]
  }
}


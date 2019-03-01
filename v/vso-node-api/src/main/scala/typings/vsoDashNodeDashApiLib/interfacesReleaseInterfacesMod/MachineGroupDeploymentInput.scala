package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MachineGroupDeploymentInput extends DeploymentInput {
  var deploymentHealthOption: java.lang.String
  var healthPercent: scala.Double
  var tags: js.Array[java.lang.String]
}

object MachineGroupDeploymentInput {
  @scala.inline
  def apply(
    artifactsDownloadInput: ArtifactsDownloadInput,
    condition: java.lang.String,
    demands: js.Array[_],
    deploymentHealthOption: java.lang.String,
    enableAccessToken: scala.Boolean,
    healthPercent: scala.Double,
    jobCancelTimeoutInMinutes: scala.Double,
    overrideInputs: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    queueId: scala.Double,
    skipArtifactsDownload: scala.Boolean,
    tags: js.Array[java.lang.String],
    timeoutInMinutes: scala.Double
  ): MachineGroupDeploymentInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifactsDownloadInput")(artifactsDownloadInput)
    __obj.updateDynamic("condition")(condition)
    __obj.updateDynamic("demands")(demands)
    __obj.updateDynamic("deploymentHealthOption")(deploymentHealthOption)
    __obj.updateDynamic("enableAccessToken")(enableAccessToken)
    __obj.updateDynamic("healthPercent")(healthPercent)
    __obj.updateDynamic("jobCancelTimeoutInMinutes")(jobCancelTimeoutInMinutes)
    __obj.updateDynamic("overrideInputs")(overrideInputs)
    __obj.updateDynamic("queueId")(queueId)
    __obj.updateDynamic("skipArtifactsDownload")(skipArtifactsDownload)
    __obj.updateDynamic("tags")(tags)
    __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes)
    __obj.asInstanceOf[MachineGroupDeploymentInput]
  }
}


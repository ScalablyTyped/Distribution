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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("artifactsDownloadInput")(artifactsDownloadInput)
    __obj.updateDynamic("condition")(condition)
    __obj.updateDynamic("demands")(demands)
    __obj.updateDynamic("enableAccessToken")(enableAccessToken)
    __obj.updateDynamic("jobCancelTimeoutInMinutes")(jobCancelTimeoutInMinutes)
    __obj.updateDynamic("overrideInputs")(overrideInputs)
    __obj.updateDynamic("queueId")(queueId)
    __obj.updateDynamic("skipArtifactsDownload")(skipArtifactsDownload)
    __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes)
    __obj.asInstanceOf[DeploymentInput]
  }
}


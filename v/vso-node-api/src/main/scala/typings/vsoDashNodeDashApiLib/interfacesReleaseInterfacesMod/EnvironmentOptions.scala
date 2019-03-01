package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentOptions extends js.Object {
  var autoLinkWorkItems: scala.Boolean
  var badgeEnabled: scala.Boolean
  var emailNotificationType: java.lang.String
  var emailRecipients: java.lang.String
  var enableAccessToken: scala.Boolean
  var publishDeploymentStatus: scala.Boolean
  var skipArtifactsDownload: scala.Boolean
  var timeoutInMinutes: scala.Double
}

object EnvironmentOptions {
  @scala.inline
  def apply(
    autoLinkWorkItems: scala.Boolean,
    badgeEnabled: scala.Boolean,
    emailNotificationType: java.lang.String,
    emailRecipients: java.lang.String,
    enableAccessToken: scala.Boolean,
    publishDeploymentStatus: scala.Boolean,
    skipArtifactsDownload: scala.Boolean,
    timeoutInMinutes: scala.Double
  ): EnvironmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoLinkWorkItems")(autoLinkWorkItems)
    __obj.updateDynamic("badgeEnabled")(badgeEnabled)
    __obj.updateDynamic("emailNotificationType")(emailNotificationType)
    __obj.updateDynamic("emailRecipients")(emailRecipients)
    __obj.updateDynamic("enableAccessToken")(enableAccessToken)
    __obj.updateDynamic("publishDeploymentStatus")(publishDeploymentStatus)
    __obj.updateDynamic("skipArtifactsDownload")(skipArtifactsDownload)
    __obj.updateDynamic("timeoutInMinutes")(timeoutInMinutes)
    __obj.asInstanceOf[EnvironmentOptions]
  }
}


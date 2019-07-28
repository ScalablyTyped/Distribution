package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentOptions extends js.Object {
  var autoLinkWorkItems: Boolean
  var badgeEnabled: Boolean
  var emailNotificationType: String
  var emailRecipients: String
  var enableAccessToken: Boolean
  var publishDeploymentStatus: Boolean
  var skipArtifactsDownload: Boolean
  var timeoutInMinutes: Double
}

object EnvironmentOptions {
  @scala.inline
  def apply(
    autoLinkWorkItems: Boolean,
    badgeEnabled: Boolean,
    emailNotificationType: String,
    emailRecipients: String,
    enableAccessToken: Boolean,
    publishDeploymentStatus: Boolean,
    skipArtifactsDownload: Boolean,
    timeoutInMinutes: Double
  ): EnvironmentOptions = {
    val __obj = js.Dynamic.literal(autoLinkWorkItems = autoLinkWorkItems, badgeEnabled = badgeEnabled, emailNotificationType = emailNotificationType, emailRecipients = emailRecipients, enableAccessToken = enableAccessToken, publishDeploymentStatus = publishDeploymentStatus, skipArtifactsDownload = skipArtifactsDownload, timeoutInMinutes = timeoutInMinutes)
  
    __obj.asInstanceOf[EnvironmentOptions]
  }
}


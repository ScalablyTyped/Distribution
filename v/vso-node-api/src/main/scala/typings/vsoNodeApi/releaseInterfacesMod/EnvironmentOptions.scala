package typings.vsoNodeApi.releaseInterfacesMod

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
    val __obj = js.Dynamic.literal(autoLinkWorkItems = autoLinkWorkItems.asInstanceOf[js.Any], badgeEnabled = badgeEnabled.asInstanceOf[js.Any], emailNotificationType = emailNotificationType.asInstanceOf[js.Any], emailRecipients = emailRecipients.asInstanceOf[js.Any], enableAccessToken = enableAccessToken.asInstanceOf[js.Any], publishDeploymentStatus = publishDeploymentStatus.asInstanceOf[js.Any], skipArtifactsDownload = skipArtifactsDownload.asInstanceOf[js.Any], timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EnvironmentOptions]
  }
}


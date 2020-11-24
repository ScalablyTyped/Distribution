package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentOptions extends js.Object {
  
  var autoLinkWorkItems: Boolean = js.native
  
  var badgeEnabled: Boolean = js.native
  
  var emailNotificationType: String = js.native
  
  var emailRecipients: String = js.native
  
  var enableAccessToken: Boolean = js.native
  
  var publishDeploymentStatus: Boolean = js.native
  
  var skipArtifactsDownload: Boolean = js.native
  
  var timeoutInMinutes: Double = js.native
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
  
  @scala.inline
  implicit class EnvironmentOptionsOps[Self <: EnvironmentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoLinkWorkItems(value: Boolean): Self = this.set("autoLinkWorkItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeEnabled(value: Boolean): Self = this.set("badgeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNotificationType(value: String): Self = this.set("emailNotificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailRecipients(value: String): Self = this.set("emailRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAccessToken(value: Boolean): Self = this.set("enableAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishDeploymentStatus(value: Boolean): Self = this.set("publishDeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipArtifactsDownload(value: Boolean): Self = this.set("skipArtifactsDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutes(value: Double): Self = this.set("timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}

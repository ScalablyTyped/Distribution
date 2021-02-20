package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentOptions extends StObject {
  
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
  implicit class EnvironmentOptionsMutableBuilder[Self <: EnvironmentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoLinkWorkItems(value: Boolean): Self = StObject.set(x, "autoLinkWorkItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgeEnabled(value: Boolean): Self = StObject.set(x, "badgeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNotificationType(value: String): Self = StObject.set(x, "emailNotificationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailRecipients(value: String): Self = StObject.set(x, "emailRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableAccessToken(value: Boolean): Self = StObject.set(x, "enableAccessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishDeploymentStatus(value: Boolean): Self = StObject.set(x, "publishDeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipArtifactsDownload(value: Boolean): Self = StObject.set(x, "skipArtifactsDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinutes(value: Double): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}

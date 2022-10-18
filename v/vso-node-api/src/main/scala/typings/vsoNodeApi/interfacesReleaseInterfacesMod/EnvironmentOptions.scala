package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentOptions extends StObject {
  
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
  
  inline def apply(
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
  
  extension [Self <: EnvironmentOptions](x: Self) {
    
    inline def setAutoLinkWorkItems(value: Boolean): Self = StObject.set(x, "autoLinkWorkItems", value.asInstanceOf[js.Any])
    
    inline def setBadgeEnabled(value: Boolean): Self = StObject.set(x, "badgeEnabled", value.asInstanceOf[js.Any])
    
    inline def setEmailNotificationType(value: String): Self = StObject.set(x, "emailNotificationType", value.asInstanceOf[js.Any])
    
    inline def setEmailRecipients(value: String): Self = StObject.set(x, "emailRecipients", value.asInstanceOf[js.Any])
    
    inline def setEnableAccessToken(value: Boolean): Self = StObject.set(x, "enableAccessToken", value.asInstanceOf[js.Any])
    
    inline def setPublishDeploymentStatus(value: Boolean): Self = StObject.set(x, "publishDeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setSkipArtifactsDownload(value: Boolean): Self = StObject.set(x, "skipArtifactsDownload", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInMinutes(value: Double): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}

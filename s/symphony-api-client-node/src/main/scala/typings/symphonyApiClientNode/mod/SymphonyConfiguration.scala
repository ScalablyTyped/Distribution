package typings.symphonyApiClientNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymphonyConfiguration extends js.Object {
  
  var agentContextPath: js.UndefOr[String] = js.native
  
  var agentHost: js.UndefOr[String] = js.native
  
  var agentPort: js.UndefOr[Double] = js.native
  
  var appCertName: js.UndefOr[String] = js.native
  
  var appCertPassword: js.UndefOr[String] = js.native
  
  var appCertPath: js.UndefOr[String] = js.native
  
  var appId: js.UndefOr[String] = js.native
  
  var appPrivateKeyName: js.UndefOr[String] = js.native
  
  var appPrivateKeyPath: js.UndefOr[String] = js.native
  
  var botCertName: js.UndefOr[String] = js.native
  
  var botCertPassword: js.UndefOr[String] = js.native
  
  var botCertPath: js.UndefOr[String] = js.native
  
  var botEmailAddress: js.UndefOr[String] = js.native
  
  var botPrivateKeyName: js.UndefOr[String] = js.native
  
  var botPrivateKeyPath: js.UndefOr[String] = js.native
  
  var botUsername: js.UndefOr[String] = js.native
  
  var keyAuthContextPath: js.UndefOr[String] = js.native
  
  var keyAuthHost: js.UndefOr[String] = js.native
  
  var keyAuthPort: js.UndefOr[Double] = js.native
  
  var keyManagerProxyPassword: js.UndefOr[String] = js.native
  
  var keyManagerProxyURL: js.UndefOr[String] = js.native
  
  var keyManagerProxyUsername: js.UndefOr[String] = js.native
  
  var maxRetries: js.UndefOr[Double] = js.native
  
  var maxWaitInterval: js.UndefOr[Double] = js.native
  
  var nodeTlsRejectUnauthorized: js.UndefOr[Double] = js.native
  
  var podContextPath: js.UndefOr[String] = js.native
  
  var podHost: js.UndefOr[String] = js.native
  
  var podPort: js.UndefOr[Double] = js.native
  
  var podProxyPassword: js.UndefOr[String] = js.native
  
  var podProxyURL: js.UndefOr[String] = js.native
  
  var podProxyUsername: js.UndefOr[String] = js.native
  
  var proxyPassword: js.UndefOr[String] = js.native
  
  var proxyURL: js.UndefOr[String] = js.native
  
  var proxyUsername: js.UndefOr[String] = js.native
  
  var sessionAuthContextPath: js.UndefOr[String] = js.native
  
  var sessionAuthHost: js.UndefOr[String] = js.native
  
  var sessionAuthPort: js.UndefOr[Double] = js.native
}
object SymphonyConfiguration {
  
  @scala.inline
  def apply(): SymphonyConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymphonyConfiguration]
  }
  
  @scala.inline
  implicit class SymphonyConfigurationOps[Self <: SymphonyConfiguration] (val x: Self) extends AnyVal {
    
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
    def setAgentContextPath(value: String): Self = this.set("agentContextPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentContextPath: Self = this.set("agentContextPath", js.undefined)
    
    @scala.inline
    def setAgentHost(value: String): Self = this.set("agentHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentHost: Self = this.set("agentHost", js.undefined)
    
    @scala.inline
    def setAgentPort(value: Double): Self = this.set("agentPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentPort: Self = this.set("agentPort", js.undefined)
    
    @scala.inline
    def setAppCertName(value: String): Self = this.set("appCertName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppCertName: Self = this.set("appCertName", js.undefined)
    
    @scala.inline
    def setAppCertPassword(value: String): Self = this.set("appCertPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppCertPassword: Self = this.set("appCertPassword", js.undefined)
    
    @scala.inline
    def setAppCertPath(value: String): Self = this.set("appCertPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppCertPath: Self = this.set("appCertPath", js.undefined)
    
    @scala.inline
    def setAppId(value: String): Self = this.set("appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppId: Self = this.set("appId", js.undefined)
    
    @scala.inline
    def setAppPrivateKeyName(value: String): Self = this.set("appPrivateKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppPrivateKeyName: Self = this.set("appPrivateKeyName", js.undefined)
    
    @scala.inline
    def setAppPrivateKeyPath(value: String): Self = this.set("appPrivateKeyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppPrivateKeyPath: Self = this.set("appPrivateKeyPath", js.undefined)
    
    @scala.inline
    def setBotCertName(value: String): Self = this.set("botCertName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotCertName: Self = this.set("botCertName", js.undefined)
    
    @scala.inline
    def setBotCertPassword(value: String): Self = this.set("botCertPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotCertPassword: Self = this.set("botCertPassword", js.undefined)
    
    @scala.inline
    def setBotCertPath(value: String): Self = this.set("botCertPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotCertPath: Self = this.set("botCertPath", js.undefined)
    
    @scala.inline
    def setBotEmailAddress(value: String): Self = this.set("botEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotEmailAddress: Self = this.set("botEmailAddress", js.undefined)
    
    @scala.inline
    def setBotPrivateKeyName(value: String): Self = this.set("botPrivateKeyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotPrivateKeyName: Self = this.set("botPrivateKeyName", js.undefined)
    
    @scala.inline
    def setBotPrivateKeyPath(value: String): Self = this.set("botPrivateKeyPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotPrivateKeyPath: Self = this.set("botPrivateKeyPath", js.undefined)
    
    @scala.inline
    def setBotUsername(value: String): Self = this.set("botUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBotUsername: Self = this.set("botUsername", js.undefined)
    
    @scala.inline
    def setKeyAuthContextPath(value: String): Self = this.set("keyAuthContextPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAuthContextPath: Self = this.set("keyAuthContextPath", js.undefined)
    
    @scala.inline
    def setKeyAuthHost(value: String): Self = this.set("keyAuthHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAuthHost: Self = this.set("keyAuthHost", js.undefined)
    
    @scala.inline
    def setKeyAuthPort(value: Double): Self = this.set("keyAuthPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAuthPort: Self = this.set("keyAuthPort", js.undefined)
    
    @scala.inline
    def setKeyManagerProxyPassword(value: String): Self = this.set("keyManagerProxyPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyManagerProxyPassword: Self = this.set("keyManagerProxyPassword", js.undefined)
    
    @scala.inline
    def setKeyManagerProxyURL(value: String): Self = this.set("keyManagerProxyURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyManagerProxyURL: Self = this.set("keyManagerProxyURL", js.undefined)
    
    @scala.inline
    def setKeyManagerProxyUsername(value: String): Self = this.set("keyManagerProxyUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyManagerProxyUsername: Self = this.set("keyManagerProxyUsername", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
    
    @scala.inline
    def setMaxWaitInterval(value: Double): Self = this.set("maxWaitInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWaitInterval: Self = this.set("maxWaitInterval", js.undefined)
    
    @scala.inline
    def setNodeTlsRejectUnauthorized(value: Double): Self = this.set("nodeTlsRejectUnauthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeTlsRejectUnauthorized: Self = this.set("nodeTlsRejectUnauthorized", js.undefined)
    
    @scala.inline
    def setPodContextPath(value: String): Self = this.set("podContextPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodContextPath: Self = this.set("podContextPath", js.undefined)
    
    @scala.inline
    def setPodHost(value: String): Self = this.set("podHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodHost: Self = this.set("podHost", js.undefined)
    
    @scala.inline
    def setPodPort(value: Double): Self = this.set("podPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodPort: Self = this.set("podPort", js.undefined)
    
    @scala.inline
    def setPodProxyPassword(value: String): Self = this.set("podProxyPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodProxyPassword: Self = this.set("podProxyPassword", js.undefined)
    
    @scala.inline
    def setPodProxyURL(value: String): Self = this.set("podProxyURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodProxyURL: Self = this.set("podProxyURL", js.undefined)
    
    @scala.inline
    def setPodProxyUsername(value: String): Self = this.set("podProxyUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePodProxyUsername: Self = this.set("podProxyUsername", js.undefined)
    
    @scala.inline
    def setProxyPassword(value: String): Self = this.set("proxyPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyPassword: Self = this.set("proxyPassword", js.undefined)
    
    @scala.inline
    def setProxyURL(value: String): Self = this.set("proxyURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyURL: Self = this.set("proxyURL", js.undefined)
    
    @scala.inline
    def setProxyUsername(value: String): Self = this.set("proxyUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyUsername: Self = this.set("proxyUsername", js.undefined)
    
    @scala.inline
    def setSessionAuthContextPath(value: String): Self = this.set("sessionAuthContextPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionAuthContextPath: Self = this.set("sessionAuthContextPath", js.undefined)
    
    @scala.inline
    def setSessionAuthHost(value: String): Self = this.set("sessionAuthHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionAuthHost: Self = this.set("sessionAuthHost", js.undefined)
    
    @scala.inline
    def setSessionAuthPort(value: Double): Self = this.set("sessionAuthPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionAuthPort: Self = this.set("sessionAuthPort", js.undefined)
  }
}

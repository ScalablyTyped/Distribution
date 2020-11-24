package typings.vaultAuthAws.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var apiVersion: js.UndefOr[String] = js.native
  
  var certFilePath: js.UndefOr[String] = js.native
  
  var followAllRedirects: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var ssl: js.UndefOr[Boolean] = js.native
  
  var sslRejectUnAuthorized: js.UndefOr[Boolean] = js.native
  
  var vaultAppName: js.UndefOr[String] = js.native
  
  var vaultLoginUrl: js.UndefOr[String] = js.native
}
object Config {
  
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setCertFilePath(value: String): Self = this.set("certFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertFilePath: Self = this.set("certFilePath", js.undefined)
    
    @scala.inline
    def setFollowAllRedirects(value: Boolean): Self = this.set("followAllRedirects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowAllRedirects: Self = this.set("followAllRedirects", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setSslRejectUnAuthorized(value: Boolean): Self = this.set("sslRejectUnAuthorized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSslRejectUnAuthorized: Self = this.set("sslRejectUnAuthorized", js.undefined)
    
    @scala.inline
    def setVaultAppName(value: String): Self = this.set("vaultAppName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVaultAppName: Self = this.set("vaultAppName", js.undefined)
    
    @scala.inline
    def setVaultLoginUrl(value: String): Self = this.set("vaultLoginUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVaultLoginUrl: Self = this.set("vaultLoginUrl", js.undefined)
  }
}

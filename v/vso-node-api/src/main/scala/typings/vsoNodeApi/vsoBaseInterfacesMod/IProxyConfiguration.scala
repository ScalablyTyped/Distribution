package typings.vsoNodeApi.vsoBaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProxyConfiguration extends js.Object {
  
  var proxyBypassHosts: js.UndefOr[js.Array[String]] = js.native
  
  var proxyPassword: js.UndefOr[String] = js.native
  
  var proxyUrl: String = js.native
  
  var proxyUsername: js.UndefOr[String] = js.native
}
object IProxyConfiguration {
  
  @scala.inline
  def apply(proxyUrl: String): IProxyConfiguration = {
    val __obj = js.Dynamic.literal(proxyUrl = proxyUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProxyConfiguration]
  }
  
  @scala.inline
  implicit class IProxyConfigurationOps[Self <: IProxyConfiguration] (val x: Self) extends AnyVal {
    
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
    def setProxyUrl(value: String): Self = this.set("proxyUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyBypassHostsVarargs(value: String*): Self = this.set("proxyBypassHosts", js.Array(value :_*))
    
    @scala.inline
    def setProxyBypassHosts(value: js.Array[String]): Self = this.set("proxyBypassHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyBypassHosts: Self = this.set("proxyBypassHosts", js.undefined)
    
    @scala.inline
    def setProxyPassword(value: String): Self = this.set("proxyPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyPassword: Self = this.set("proxyPassword", js.undefined)
    
    @scala.inline
    def setProxyUsername(value: String): Self = this.set("proxyUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyUsername: Self = this.set("proxyUsername", js.undefined)
  }
}

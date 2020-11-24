package typings.whoisParsed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpProxy extends js.Object {
  
  var authentication: js.UndefOr[BasicAuthCredentials] = js.native
  
  var ipaddress: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[Double] = js.native
}
object HttpProxy {
  
  @scala.inline
  def apply(): HttpProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpProxy]
  }
  
  @scala.inline
  implicit class HttpProxyOps[Self <: HttpProxy] (val x: Self) extends AnyVal {
    
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
    def setAuthentication(value: BasicAuthCredentials): Self = this.set("authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthentication: Self = this.set("authentication", js.undefined)
    
    @scala.inline
    def setIpaddress(value: String): Self = this.set("ipaddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpaddress: Self = this.set("ipaddress", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}

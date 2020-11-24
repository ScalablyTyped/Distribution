package typings.tizenTvWebapis.ssoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SsoData extends js.Object {
  
  var authToken: String = js.native
  
  var bLogin: Boolean = js.native
  
  var guid: String = js.native
  
  var id: String = js.native
  
  var uid: String = js.native
}
object SsoData {
  
  @scala.inline
  def apply(authToken: String, bLogin: Boolean, guid: String, id: String, uid: String): SsoData = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], bLogin = bLogin.asInstanceOf[js.Any], guid = guid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsoData]
  }
  
  @scala.inline
  implicit class SsoDataOps[Self <: SsoData] (val x: Self) extends AnyVal {
    
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
    def setAuthToken(value: String): Self = this.set("authToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBLogin(value: Boolean): Self = this.set("bLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
}

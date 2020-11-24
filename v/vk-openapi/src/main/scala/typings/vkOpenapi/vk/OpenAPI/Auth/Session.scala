package typings.vkOpenapi.vk.OpenAPI.Auth

import typings.vkOpenapi.anon.Domain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends js.Object {
  
  var expire: Double = js.native
  
  var mid: Double = js.native
  
  var secret: String = js.native
  
  var sid: String = js.native
  
  var sig: String = js.native
  
  var user: Domain = js.native
}
object Session {
  
  @scala.inline
  def apply(expire: Double, mid: Double, secret: String, sid: String, sig: String, user: Domain): Session = {
    val __obj = js.Dynamic.literal(expire = expire.asInstanceOf[js.Any], mid = mid.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], sig = sig.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    
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
    def setExpire(value: Double): Self = this.set("expire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMid(value: Double): Self = this.set("mid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSig(value: String): Self = this.set("sig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: Domain): Self = this.set("user", value.asInstanceOf[js.Any])
  }
}

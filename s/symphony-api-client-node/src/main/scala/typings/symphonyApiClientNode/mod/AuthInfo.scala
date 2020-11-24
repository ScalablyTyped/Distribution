package typings.symphonyApiClientNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthInfo extends js.Object {
  
  var kmAuthToken: String = js.native
  
  var sessionAuthToken: String = js.native
}
object AuthInfo {
  
  @scala.inline
  def apply(kmAuthToken: String, sessionAuthToken: String): AuthInfo = {
    val __obj = js.Dynamic.literal(kmAuthToken = kmAuthToken.asInstanceOf[js.Any], sessionAuthToken = sessionAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthInfo]
  }
  
  @scala.inline
  implicit class AuthInfoOps[Self <: AuthInfo] (val x: Self) extends AnyVal {
    
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
    def setKmAuthToken(value: String): Self = this.set("kmAuthToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionAuthToken(value: String): Self = this.set("sessionAuthToken", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestingUser extends js.Object {
  
  var requestingUser: scala.Double = js.native
  
  var serviceAccount: scala.Double = js.native
}
object RequestingUser {
  
  @scala.inline
  def apply(requestingUser: scala.Double, serviceAccount: scala.Double): RequestingUser = {
    val __obj = js.Dynamic.literal(requestingUser = requestingUser.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestingUser]
  }
  
  @scala.inline
  implicit class RequestingUserOps[Self <: RequestingUser] (val x: Self) extends AnyVal {
    
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
    def setRequestingUser(value: scala.Double): Self = this.set("requestingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccount(value: scala.Double): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
  }
}

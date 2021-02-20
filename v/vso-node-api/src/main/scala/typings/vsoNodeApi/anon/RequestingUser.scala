package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestingUser extends StObject {
  
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
  implicit class RequestingUserMutableBuilder[Self <: RequestingUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequestingUser(value: scala.Double): Self = StObject.set(x, "requestingUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccount(value: scala.Double): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
  }
}

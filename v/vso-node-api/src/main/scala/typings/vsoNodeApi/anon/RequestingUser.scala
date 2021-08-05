package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestingUser extends StObject {
  
  var requestingUser: scala.Double
  
  var serviceAccount: scala.Double
}
object RequestingUser {
  
  inline def apply(requestingUser: scala.Double, serviceAccount: scala.Double): RequestingUser = {
    val __obj = js.Dynamic.literal(requestingUser = requestingUser.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestingUser]
  }
  
  extension [Self <: RequestingUser](x: Self) {
    
    inline def setRequestingUser(value: scala.Double): Self = StObject.set(x, "requestingUser", value.asInstanceOf[js.Any])
    
    inline def setServiceAccount(value: scala.Double): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
  }
}

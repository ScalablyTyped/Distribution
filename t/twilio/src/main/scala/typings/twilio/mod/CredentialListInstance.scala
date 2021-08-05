package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialListInstance
  extends StObject
     with InstanceResource {
  
  var credentials: CredentialResource
}
object CredentialListInstance {
  
  inline def apply(
    credentials: CredentialResource,
    delete: RestMethod,
    get: RestMethod,
    post: RestMethod,
    update: RestMethod
  ): CredentialListInstance = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialListInstance]
  }
  
  extension [Self <: CredentialListInstance](x: Self) {
    
    inline def setCredentials(value: CredentialResource): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
  }
}

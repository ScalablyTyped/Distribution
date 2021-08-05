package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPAccessControlListInstance
  extends StObject
     with InstanceResource {
  
  var ipAddresses: IPAddressResource
}
object IPAccessControlListInstance {
  
  inline def apply(
    delete: RestMethod,
    get: RestMethod,
    ipAddresses: IPAddressResource,
    post: RestMethod,
    update: RestMethod
  ): IPAccessControlListInstance = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], ipAddresses = ipAddresses.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPAccessControlListInstance]
  }
  
  extension [Self <: IPAccessControlListInstance](x: Self) {
    
    inline def setIpAddresses(value: IPAddressResource): Self = StObject.set(x, "ipAddresses", value.asInstanceOf[js.Any])
  }
}

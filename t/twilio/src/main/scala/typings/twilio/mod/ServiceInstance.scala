package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceInstance
  extends StObject
     with InstanceResource {
  
  var channels: ServiceChannelResource
  
  var roles: ServiceRoleResource
  
  var users: ServiceUserResource
}
object ServiceInstance {
  
  inline def apply(
    channels: ServiceChannelResource,
    delete: RestMethod,
    get: RestMethod,
    post: RestMethod,
    roles: ServiceRoleResource,
    update: RestMethod,
    users: ServiceUserResource
  ): ServiceInstance = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceInstance]
  }
  
  extension [Self <: ServiceInstance](x: Self) {
    
    inline def setChannels(value: ServiceChannelResource): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setRoles(value: ServiceRoleResource): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: ServiceUserResource): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
  }
}

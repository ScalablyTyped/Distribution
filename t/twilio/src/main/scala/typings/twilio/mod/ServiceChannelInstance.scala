package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceChannelInstance
  extends StObject
     with InstanceResource {
  
  var members: ServiceChannelMemberResource
  
  var messages: ServiceChannelMessageResource
}
object ServiceChannelInstance {
  
  @scala.inline
  def apply(
    delete: RestMethod,
    get: RestMethod,
    members: ServiceChannelMemberResource,
    messages: ServiceChannelMessageResource,
    post: RestMethod,
    update: RestMethod
  ): ServiceChannelInstance = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceChannelInstance]
  }
  
  @scala.inline
  implicit class ServiceChannelInstanceMutableBuilder[Self <: ServiceChannelInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: ServiceChannelMemberResource): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: ServiceChannelMessageResource): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
  }
}

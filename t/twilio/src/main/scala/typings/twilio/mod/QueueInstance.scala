package typings.twilio.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueInstance
  extends StObject
     with InstanceResource {
  
  var members: QueueMemberResource
}
object QueueInstance {
  
  @scala.inline
  def apply(
    delete: RestMethod,
    get: RestMethod,
    members: QueueMemberResource,
    post: RestMethod,
    update: RestMethod
  ): QueueInstance = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueInstance]
  }
  
  @scala.inline
  implicit class QueueInstanceMutableBuilder[Self <: QueueInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMembers(value: QueueMemberResource): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
  }
}

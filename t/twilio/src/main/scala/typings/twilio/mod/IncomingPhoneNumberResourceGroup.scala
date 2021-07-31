package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingPhoneNumberResourceGroup
  extends StObject
     with PostableResource {
  
  def create(args: js.Any): Promise[js.Any]
  def create(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def create(callback: RequestCallback): Promise[js.Any]
  @JSName("create")
  var create_Original: RestMethod
}
object IncomingPhoneNumberResourceGroup {
  
  @scala.inline
  def apply(create: RestMethod, get: RestMethod, post: RestMethod): IncomingPhoneNumberResourceGroup = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingPhoneNumberResourceGroup]
  }
  
  @scala.inline
  implicit class IncomingPhoneNumberResourceGroupMutableBuilder[Self <: IncomingPhoneNumberResourceGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: RestMethod): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
  }
}

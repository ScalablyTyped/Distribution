package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.twilio.mod.Resource because Already inherited
- typings.twilio.mod.DeletableResource because var conflicts: get_Original. Inlined delete, delete, delete, delete_Original */ trait CallFeedbackResource
  extends StObject
     with PostableResource {
  
  def create(args: js.Any): Promise[js.Any]
  def create(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def create(callback: RequestCallback): Promise[js.Any]
  @JSName("create")
  var create_Original: RestMethod
  
  def delete(args: js.Any): Promise[js.Any]
  def delete(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def delete(callback: RequestCallback): Promise[js.Any]
  @JSName("delete")
  var delete_Original: RestMethod
}
object CallFeedbackResource {
  
  inline def apply(create: RestMethod, delete: RestMethod, get: RestMethod, post: RestMethod): CallFeedbackResource = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFeedbackResource]
  }
  
  extension [Self <: CallFeedbackResource](x: Self) {
    
    inline def setCreate(value: RestMethod): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: RestMethod): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}

package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.twilio.mod.Resource because Already inherited
- typings.twilio.mod.DeletableResource because var conflicts: get_Original. Inlined delete, delete, delete, delete_Original */ trait InstanceResource
  extends StObject
     with PostableResource {
  
  def delete(args: js.Any): Promise[js.Any]
  def delete(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def delete(callback: RequestCallback): Promise[js.Any]
  @JSName("delete")
  var delete_Original: RestMethod
  
  def update(args: js.Any): Promise[js.Any]
  def update(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def update(callback: RequestCallback): Promise[js.Any]
  @JSName("update")
  var update_Original: RestMethod
}
object InstanceResource {
  
  @scala.inline
  def apply(delete: RestMethod, get: RestMethod, post: RestMethod, update: RestMethod): InstanceResource = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceResource]
  }
  
  @scala.inline
  implicit class InstanceResourceMutableBuilder[Self <: InstanceResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: RestMethod): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: RestMethod): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}

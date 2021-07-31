package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletableResource
  extends StObject
     with Resource {
  
  def delete(args: js.Any): Promise[js.Any]
  def delete(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def delete(callback: RequestCallback): Promise[js.Any]
  @JSName("delete")
  var delete_Original: RestMethod
}
object DeletableResource {
  
  @scala.inline
  def apply(delete: RestMethod, get: RestMethod): DeletableResource = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletableResource]
  }
  
  @scala.inline
  implicit class DeletableResourceMutableBuilder[Self <: DeletableResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelete(value: RestMethod): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
  }
}

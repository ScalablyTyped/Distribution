package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListableResource
  extends StObject
     with Resource {
  
  def list(args: js.Any): Promise[js.Any]
  def list(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def list(callback: RequestCallback): Promise[js.Any]
  @JSName("list")
  var list_Original: RestMethod
}
object ListableResource {
  
  @scala.inline
  def apply(get: RestMethod, list: RestMethod): ListableResource = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListableResource]
  }
  
  @scala.inline
  implicit class ListableResourceMutableBuilder[Self <: ListableResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setList(value: RestMethod): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
  }
}

package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueMemberInstance
  extends StObject
     with PostableResource {
  
  def update(args: js.Any): Promise[js.Any]
  def update(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def update(callback: RequestCallback): Promise[js.Any]
  @JSName("update")
  var update_Original: RestMethod
}
object QueueMemberInstance {
  
  inline def apply(get: RestMethod, post: RestMethod, update: RestMethod): QueueMemberInstance = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueMemberInstance]
  }
  
  extension [Self <: QueueMemberInstance](x: Self) {
    
    inline def setUpdate(value: RestMethod): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
  }
}

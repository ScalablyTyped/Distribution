package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IncomingPhoneNumberInstance
  extends StObject
     with InstanceResource {
  
  def put(args: js.Any): Promise[js.Any]
  def put(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def put(callback: RequestCallback): Promise[js.Any]
  @JSName("put")
  var put_Original: RestMethod
}
object IncomingPhoneNumberInstance {
  
  @scala.inline
  def apply(delete: RestMethod, get: RestMethod, post: RestMethod, put: RestMethod, update: RestMethod): IncomingPhoneNumberInstance = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingPhoneNumberInstance]
  }
  
  @scala.inline
  implicit class IncomingPhoneNumberInstanceMutableBuilder[Self <: IncomingPhoneNumberInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPut(value: RestMethod): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
  }
}

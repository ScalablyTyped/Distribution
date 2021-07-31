package typings.twilio.mod

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostableResource
  extends StObject
     with Resource {
  
  def post(args: js.Any): Promise[js.Any]
  def post(args: js.Any, callback: RequestCallback): Promise[js.Any]
  def post(callback: RequestCallback): Promise[js.Any]
  @JSName("post")
  var post_Original: RestMethod
}
object PostableResource {
  
  @scala.inline
  def apply(get: RestMethod, post: RestMethod): PostableResource = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostableResource]
  }
  
  @scala.inline
  implicit class PostableResourceMutableBuilder[Self <: PostableResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPost(value: RestMethod): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
  }
}

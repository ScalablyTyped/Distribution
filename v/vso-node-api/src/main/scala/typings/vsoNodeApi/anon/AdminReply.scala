package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminReply extends StObject {
  
  var adminReply: scala.Double = js.native
  
  var publisherReply: scala.Double = js.native
  
  var review: scala.Double = js.native
}
object AdminReply {
  
  @scala.inline
  def apply(adminReply: scala.Double, publisherReply: scala.Double, review: scala.Double): AdminReply = {
    val __obj = js.Dynamic.literal(adminReply = adminReply.asInstanceOf[js.Any], publisherReply = publisherReply.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminReply]
  }
  
  @scala.inline
  implicit class AdminReplyMutableBuilder[Self <: AdminReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminReply(value: scala.Double): Self = StObject.set(x, "adminReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherReply(value: scala.Double): Self = StObject.set(x, "publisherReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview(value: scala.Double): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
  }
}

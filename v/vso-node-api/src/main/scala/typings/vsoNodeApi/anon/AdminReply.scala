package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminReply extends StObject {
  
  var adminReply: scala.Double
  
  var publisherReply: scala.Double
  
  var review: scala.Double
}
object AdminReply {
  
  inline def apply(adminReply: scala.Double, publisherReply: scala.Double, review: scala.Double): AdminReply = {
    val __obj = js.Dynamic.literal(adminReply = adminReply.asInstanceOf[js.Any], publisherReply = publisherReply.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminReply]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminReply] (val x: Self) extends AnyVal {
    
    inline def setAdminReply(value: scala.Double): Self = StObject.set(x, "adminReply", value.asInstanceOf[js.Any])
    
    inline def setPublisherReply(value: scala.Double): Self = StObject.set(x, "publisherReply", value.asInstanceOf[js.Any])
    
    inline def setReview(value: scala.Double): Self = StObject.set(x, "review", value.asInstanceOf[js.Any])
  }
}

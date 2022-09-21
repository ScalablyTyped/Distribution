package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewReply extends StObject {
  
  /**
    * Id of the reply
    */
  var id: Double
  
  /**
    * Flag for soft deletion
    */
  var isDeleted: Boolean
  
  /**
    * Version of the product when the reply was submitted or updated
    */
  var productVersion: String
  
  /**
    * Content of the reply
    */
  var replyText: String
  
  /**
    * Id of the review, to which this reply belongs
    */
  var reviewId: Double
  
  /**
    * Title of the reply
    */
  var title: String
  
  /**
    * Date the reply was submitted or updated
    */
  var updatedDate: js.Date
  
  /**
    * Id of the user who left the reply
    */
  var userId: String
}
object ReviewReply {
  
  inline def apply(
    id: Double,
    isDeleted: Boolean,
    productVersion: String,
    replyText: String,
    reviewId: Double,
    title: String,
    updatedDate: js.Date,
    userId: String
  ): ReviewReply = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], productVersion = productVersion.asInstanceOf[js.Any], replyText = replyText.asInstanceOf[js.Any], reviewId = reviewId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewReply]
  }
  
  extension [Self <: ReviewReply](x: Self) {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    inline def setProductVersion(value: String): Self = StObject.set(x, "productVersion", value.asInstanceOf[js.Any])
    
    inline def setReplyText(value: String): Self = StObject.set(x, "replyText", value.asInstanceOf[js.Any])
    
    inline def setReviewId(value: Double): Self = StObject.set(x, "reviewId", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDate(value: js.Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}

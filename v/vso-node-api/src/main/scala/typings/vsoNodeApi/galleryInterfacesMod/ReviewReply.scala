package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
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
  var updatedDate: Date
  
  /**
    * Id of the user who left the reply
    */
  var userId: String
}
object ReviewReply {
  
  @scala.inline
  def apply(
    id: Double,
    isDeleted: Boolean,
    productVersion: String,
    replyText: String,
    reviewId: Double,
    title: String,
    updatedDate: Date,
    userId: String
  ): ReviewReply = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], productVersion = productVersion.asInstanceOf[js.Any], replyText = replyText.asInstanceOf[js.Any], reviewId = reviewId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewReply]
  }
  
  @scala.inline
  implicit class ReviewReplyMutableBuilder[Self <: ReviewReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductVersion(value: String): Self = StObject.set(x, "productVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyText(value: String): Self = StObject.set(x, "replyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewId(value: Double): Self = StObject.set(x, "reviewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}

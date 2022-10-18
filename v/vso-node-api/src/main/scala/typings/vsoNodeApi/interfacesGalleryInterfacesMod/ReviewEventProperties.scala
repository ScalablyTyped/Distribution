package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewEventProperties extends StObject {
  
  /**
    * Operation performed on Event - Create\Update
    */
  var eventOperation: ReviewEventOperation
  
  /**
    * Flag to see if reply is admin reply
    */
  var isAdminReply: Boolean
  
  /**
    * Flag to record if the reviwe is ignored
    */
  var isIgnored: Boolean
  
  /**
    * Rating at the time of event
    */
  var rating: Double
  
  /**
    * Reply update date
    */
  var replyDate: js.Date
  
  /**
    * Publisher reply text or admin reply text
    */
  var replyText: String
  
  /**
    * User who responded to the review
    */
  var replyUserId: String
  
  /**
    * Review Event Type - Review
    */
  var resourceType: ReviewResourceType
  
  /**
    * Review update date
    */
  var reviewDate: js.Date
  
  /**
    * ReviewId of the review  on which the operation is performed
    */
  var reviewId: Double
  
  /**
    * Text in Review Text
    */
  var reviewText: String
  
  /**
    * User display name at the time of review
    */
  var userDisplayName: String
  
  /**
    * User who gave review
    */
  var userId: String
}
object ReviewEventProperties {
  
  inline def apply(
    eventOperation: ReviewEventOperation,
    isAdminReply: Boolean,
    isIgnored: Boolean,
    rating: Double,
    replyDate: js.Date,
    replyText: String,
    replyUserId: String,
    resourceType: ReviewResourceType,
    reviewDate: js.Date,
    reviewId: Double,
    reviewText: String,
    userDisplayName: String,
    userId: String
  ): ReviewEventProperties = {
    val __obj = js.Dynamic.literal(eventOperation = eventOperation.asInstanceOf[js.Any], isAdminReply = isAdminReply.asInstanceOf[js.Any], isIgnored = isIgnored.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], replyDate = replyDate.asInstanceOf[js.Any], replyText = replyText.asInstanceOf[js.Any], replyUserId = replyUserId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], reviewDate = reviewDate.asInstanceOf[js.Any], reviewId = reviewId.asInstanceOf[js.Any], reviewText = reviewText.asInstanceOf[js.Any], userDisplayName = userDisplayName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewEventProperties]
  }
  
  extension [Self <: ReviewEventProperties](x: Self) {
    
    inline def setEventOperation(value: ReviewEventOperation): Self = StObject.set(x, "eventOperation", value.asInstanceOf[js.Any])
    
    inline def setIsAdminReply(value: Boolean): Self = StObject.set(x, "isAdminReply", value.asInstanceOf[js.Any])
    
    inline def setIsIgnored(value: Boolean): Self = StObject.set(x, "isIgnored", value.asInstanceOf[js.Any])
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setReplyDate(value: js.Date): Self = StObject.set(x, "replyDate", value.asInstanceOf[js.Any])
    
    inline def setReplyText(value: String): Self = StObject.set(x, "replyText", value.asInstanceOf[js.Any])
    
    inline def setReplyUserId(value: String): Self = StObject.set(x, "replyUserId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ReviewResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setReviewDate(value: js.Date): Self = StObject.set(x, "reviewDate", value.asInstanceOf[js.Any])
    
    inline def setReviewId(value: Double): Self = StObject.set(x, "reviewId", value.asInstanceOf[js.Any])
    
    inline def setReviewText(value: String): Self = StObject.set(x, "reviewText", value.asInstanceOf[js.Any])
    
    inline def setUserDisplayName(value: String): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}

package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewEventProperties extends StObject {
  
  /**
    * Operation performed on Event - Create\Update
    */
  var eventOperation: ReviewEventOperation = js.native
  
  /**
    * Flag to see if reply is admin reply
    */
  var isAdminReply: Boolean = js.native
  
  /**
    * Flag to record if the reviwe is ignored
    */
  var isIgnored: Boolean = js.native
  
  /**
    * Rating at the time of event
    */
  var rating: Double = js.native
  
  /**
    * Reply update date
    */
  var replyDate: Date = js.native
  
  /**
    * Publisher reply text or admin reply text
    */
  var replyText: String = js.native
  
  /**
    * User who responded to the review
    */
  var replyUserId: String = js.native
  
  /**
    * Review Event Type - Review
    */
  var resourceType: ReviewResourceType = js.native
  
  /**
    * Review update date
    */
  var reviewDate: Date = js.native
  
  /**
    * ReviewId of the review  on which the operation is performed
    */
  var reviewId: Double = js.native
  
  /**
    * Text in Review Text
    */
  var reviewText: String = js.native
  
  /**
    * User display name at the time of review
    */
  var userDisplayName: String = js.native
  
  /**
    * User who gave review
    */
  var userId: String = js.native
}
object ReviewEventProperties {
  
  @scala.inline
  def apply(
    eventOperation: ReviewEventOperation,
    isAdminReply: Boolean,
    isIgnored: Boolean,
    rating: Double,
    replyDate: Date,
    replyText: String,
    replyUserId: String,
    resourceType: ReviewResourceType,
    reviewDate: Date,
    reviewId: Double,
    reviewText: String,
    userDisplayName: String,
    userId: String
  ): ReviewEventProperties = {
    val __obj = js.Dynamic.literal(eventOperation = eventOperation.asInstanceOf[js.Any], isAdminReply = isAdminReply.asInstanceOf[js.Any], isIgnored = isIgnored.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], replyDate = replyDate.asInstanceOf[js.Any], replyText = replyText.asInstanceOf[js.Any], replyUserId = replyUserId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], reviewDate = reviewDate.asInstanceOf[js.Any], reviewId = reviewId.asInstanceOf[js.Any], reviewText = reviewText.asInstanceOf[js.Any], userDisplayName = userDisplayName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewEventProperties]
  }
  
  @scala.inline
  implicit class ReviewEventPropertiesMutableBuilder[Self <: ReviewEventProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventOperation(value: ReviewEventOperation): Self = StObject.set(x, "eventOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAdminReply(value: Boolean): Self = StObject.set(x, "isAdminReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIgnored(value: Boolean): Self = StObject.set(x, "isIgnored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyDate(value: Date): Self = StObject.set(x, "replyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyText(value: String): Self = StObject.set(x, "replyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyUserId(value: String): Self = StObject.set(x, "replyUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ReviewResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewDate(value: Date): Self = StObject.set(x, "reviewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewId(value: Double): Self = StObject.set(x, "reviewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewText(value: String): Self = StObject.set(x, "reviewText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDisplayName(value: String): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}

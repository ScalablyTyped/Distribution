package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReviewEventProperties extends js.Object {
  
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
  implicit class ReviewEventPropertiesOps[Self <: ReviewEventProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventOperation(value: ReviewEventOperation): Self = this.set("eventOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAdminReply(value: Boolean): Self = this.set("isAdminReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIgnored(value: Boolean): Self = this.set("isIgnored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRating(value: Double): Self = this.set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyDate(value: Date): Self = this.set("replyDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyText(value: String): Self = this.set("replyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyUserId(value: String): Self = this.set("replyUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ReviewResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewDate(value: Date): Self = this.set("reviewDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewId(value: Double): Self = this.set("reviewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewText(value: String): Self = this.set("reviewText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDisplayName(value: String): Self = this.set("userDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}

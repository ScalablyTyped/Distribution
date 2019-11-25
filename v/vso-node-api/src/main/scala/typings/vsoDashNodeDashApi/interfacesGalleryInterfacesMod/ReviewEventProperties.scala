package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewEventProperties extends js.Object {
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
  var replyDate: Date
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
  var reviewDate: Date
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
}


package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
  var isAdminReply: scala.Boolean
  /**
    * Flag to record if the reviwe is ignored
    */
  var isIgnored: scala.Boolean
  /**
    * Rating at the time of event
    */
  var rating: scala.Double
  /**
    * Reply update date
    */
  var replyDate: stdLib.Date
  /**
    * Publisher reply text or admin reply text
    */
  var replyText: java.lang.String
  /**
    * User who responded to the review
    */
  var replyUserId: java.lang.String
  /**
    * Review Event Type - Review
    */
  var resourceType: ReviewResourceType
  /**
    * Review update date
    */
  var reviewDate: stdLib.Date
  /**
    * ReviewId of the review  on which the operation is performed
    */
  var reviewId: scala.Double
  /**
    * Text in Review Text
    */
  var reviewText: java.lang.String
  /**
    * User display name at the time of review
    */
  var userDisplayName: java.lang.String
  /**
    * User who gave review
    */
  var userId: java.lang.String
}

object ReviewEventProperties {
  @scala.inline
  def apply(
    eventOperation: ReviewEventOperation,
    isAdminReply: scala.Boolean,
    isIgnored: scala.Boolean,
    rating: scala.Double,
    replyDate: stdLib.Date,
    replyText: java.lang.String,
    replyUserId: java.lang.String,
    resourceType: ReviewResourceType,
    reviewDate: stdLib.Date,
    reviewId: scala.Double,
    reviewText: java.lang.String,
    userDisplayName: java.lang.String,
    userId: java.lang.String
  ): ReviewEventProperties = {
    val __obj = js.Dynamic.literal(eventOperation = eventOperation, isAdminReply = isAdminReply, isIgnored = isIgnored, rating = rating, replyDate = replyDate, replyText = replyText, replyUserId = replyUserId, resourceType = resourceType, reviewDate = reviewDate, reviewId = reviewId, reviewText = reviewText, userDisplayName = userDisplayName, userId = userId)
  
    __obj.asInstanceOf[ReviewEventProperties]
  }
}


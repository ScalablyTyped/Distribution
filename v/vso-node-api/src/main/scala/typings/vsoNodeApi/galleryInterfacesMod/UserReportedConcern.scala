package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserReportedConcern extends js.Object {
  /**
    * Category of the concern
    */
  var category: ConcernCategory
  /**
    * User comment associated with the report
    */
  var concernText: String
  /**
    * Id of the review which was reported
    */
  var reviewId: Double
  /**
    * Date the report was submitted
    */
  var submittedDate: Date
  /**
    * Id of the user who reported a review
    */
  var userId: String
}

object UserReportedConcern {
  @scala.inline
  def apply(
    category: ConcernCategory,
    concernText: String,
    reviewId: Double,
    submittedDate: Date,
    userId: String
  ): UserReportedConcern = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], concernText = concernText.asInstanceOf[js.Any], reviewId = reviewId.asInstanceOf[js.Any], submittedDate = submittedDate.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserReportedConcern]
  }
}


package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

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
  var concernText: java.lang.String
  /**
    * Id of the review which was reported
    */
  var reviewId: scala.Double
  /**
    * Date the report was submitted
    */
  var submittedDate: stdLib.Date
  /**
    * Id of the user who reported a review
    */
  var userId: java.lang.String
}

object UserReportedConcern {
  @scala.inline
  def apply(
    category: ConcernCategory,
    concernText: java.lang.String,
    reviewId: scala.Double,
    submittedDate: stdLib.Date,
    userId: java.lang.String
  ): UserReportedConcern = {
    val __obj = js.Dynamic.literal(category = category, concernText = concernText, reviewId = reviewId, submittedDate = submittedDate, userId = userId)
  
    __obj.asInstanceOf[UserReportedConcern]
  }
}


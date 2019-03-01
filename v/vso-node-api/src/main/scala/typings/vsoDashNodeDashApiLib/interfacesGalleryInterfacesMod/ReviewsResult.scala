package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewsResult extends js.Object {
  /**
    * Flag indicating if there are more reviews to be shown (for paging)
    */
  var hasMoreReviews: scala.Boolean
  /**
    * List of reviews
    */
  var reviews: js.Array[Review]
  /**
    * Count of total review items
    */
  var totalReviewCount: scala.Double
}

object ReviewsResult {
  @scala.inline
  def apply(hasMoreReviews: scala.Boolean, reviews: js.Array[Review], totalReviewCount: scala.Double): ReviewsResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hasMoreReviews")(hasMoreReviews)
    __obj.updateDynamic("reviews")(reviews)
    __obj.updateDynamic("totalReviewCount")(totalReviewCount)
    __obj.asInstanceOf[ReviewsResult]
  }
}


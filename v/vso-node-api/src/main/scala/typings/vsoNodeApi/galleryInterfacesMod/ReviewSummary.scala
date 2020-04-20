package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewSummary extends js.Object {
  /**
    * Average Rating
    */
  var averageRating: Double
  /**
    * Count of total ratings
    */
  var ratingCount: Double
  /**
    * Split of count accross rating
    */
  var ratingSplit: js.Array[RatingCountPerRating]
}

object ReviewSummary {
  @scala.inline
  def apply(averageRating: Double, ratingCount: Double, ratingSplit: js.Array[RatingCountPerRating]): ReviewSummary = {
    val __obj = js.Dynamic.literal(averageRating = averageRating.asInstanceOf[js.Any], ratingCount = ratingCount.asInstanceOf[js.Any], ratingSplit = ratingSplit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewSummary]
  }
}


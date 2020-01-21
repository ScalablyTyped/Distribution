package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingCountPerRating extends js.Object {
  /**
    * Rating value
    */
  var rating: Double
  /**
    * Count of total ratings
    */
  var ratingCount: Double
}

object RatingCountPerRating {
  @scala.inline
  def apply(rating: Double, ratingCount: Double): RatingCountPerRating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], ratingCount = ratingCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RatingCountPerRating]
  }
}


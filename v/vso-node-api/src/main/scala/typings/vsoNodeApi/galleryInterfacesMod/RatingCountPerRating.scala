package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RatingCountPerRating extends js.Object {
  /**
    * Rating value
    */
  var rating: Double = js.native
  /**
    * Count of total ratings
    */
  var ratingCount: Double = js.native
}

object RatingCountPerRating {
  @scala.inline
  def apply(rating: Double, ratingCount: Double): RatingCountPerRating = {
    val __obj = js.Dynamic.literal(rating = rating.asInstanceOf[js.Any], ratingCount = ratingCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatingCountPerRating]
  }
  @scala.inline
  implicit class RatingCountPerRatingOps[Self <: RatingCountPerRating] (val x: Self) extends AnyVal {
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
    def setRating(value: Double): Self = this.set("rating", value.asInstanceOf[js.Any])
    @scala.inline
    def setRatingCount(value: Double): Self = this.set("ratingCount", value.asInstanceOf[js.Any])
  }
  
}


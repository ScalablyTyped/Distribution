package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatingCountPerRating extends js.Object {
  /**
    * Rating value
    */
  var rating: scala.Double
  /**
    * Count of total ratings
    */
  var ratingCount: scala.Double
}

object RatingCountPerRating {
  @scala.inline
  def apply(rating: scala.Double, ratingCount: scala.Double): RatingCountPerRating = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("rating")(rating)
    __obj.updateDynamic("ratingCount")(ratingCount)
    __obj.asInstanceOf[RatingCountPerRating]
  }
}


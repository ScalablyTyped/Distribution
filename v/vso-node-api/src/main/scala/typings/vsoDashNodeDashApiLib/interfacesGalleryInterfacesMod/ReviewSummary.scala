package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewSummary extends js.Object {
  /**
    * Average Rating
    */
  var averageRating: scala.Double
  /**
    * Count of total ratings
    */
  var ratingCount: scala.Double
  /**
    * Split of count accross rating
    */
  var ratingSplit: js.Array[RatingCountPerRating]
}

object ReviewSummary {
  @scala.inline
  def apply(
    averageRating: scala.Double,
    ratingCount: scala.Double,
    ratingSplit: js.Array[RatingCountPerRating]
  ): ReviewSummary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("averageRating")(averageRating)
    __obj.updateDynamic("ratingCount")(ratingCount)
    __obj.updateDynamic("ratingSplit")(ratingSplit)
    __obj.asInstanceOf[ReviewSummary]
  }
}


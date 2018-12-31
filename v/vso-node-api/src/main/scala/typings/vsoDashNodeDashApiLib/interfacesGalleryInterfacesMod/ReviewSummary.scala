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


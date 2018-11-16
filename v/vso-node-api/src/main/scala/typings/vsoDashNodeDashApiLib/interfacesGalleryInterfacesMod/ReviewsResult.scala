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


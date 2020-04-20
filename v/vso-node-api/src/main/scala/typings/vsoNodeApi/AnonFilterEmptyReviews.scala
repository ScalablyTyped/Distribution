package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterEmptyReviews extends js.Object {
  var filterEmptyReviews: Double
  var filterEmptyUserNames: Double
  var none: Double
}

object AnonFilterEmptyReviews {
  @scala.inline
  def apply(filterEmptyReviews: Double, filterEmptyUserNames: Double, none: Double): AnonFilterEmptyReviews = {
    val __obj = js.Dynamic.literal(filterEmptyReviews = filterEmptyReviews.asInstanceOf[js.Any], filterEmptyUserNames = filterEmptyUserNames.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterEmptyReviews]
  }
}


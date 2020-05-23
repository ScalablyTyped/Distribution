package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterEmptyReviews extends js.Object {
  var filterEmptyReviews: scala.Double
  var filterEmptyUserNames: scala.Double
  var none: scala.Double
}

object FilterEmptyReviews {
  @scala.inline
  def apply(filterEmptyReviews: scala.Double, filterEmptyUserNames: scala.Double, none: scala.Double): FilterEmptyReviews = {
    val __obj = js.Dynamic.literal(filterEmptyReviews = filterEmptyReviews.asInstanceOf[js.Any], filterEmptyUserNames = filterEmptyUserNames.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterEmptyReviews]
  }
}


package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilterEmptyReviews extends js.Object {
  var filterEmptyReviews: scala.Double
  var filterEmptyUserNames: scala.Double
  var none: scala.Double
}

object Anon_FilterEmptyReviews {
  @scala.inline
  def apply(filterEmptyReviews: scala.Double, filterEmptyUserNames: scala.Double, none: scala.Double): Anon_FilterEmptyReviews = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filterEmptyReviews")(filterEmptyReviews)
    __obj.updateDynamic("filterEmptyUserNames")(filterEmptyUserNames)
    __obj.updateDynamic("none")(none)
    __obj.asInstanceOf[Anon_FilterEmptyReviews]
  }
}


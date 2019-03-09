package typings
package tabulatorDashTablesLib.TabulatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarRatingParams extends _FormatterParams {
  // Star Rating
  var stars: js.UndefOr[scala.Double] = js.undefined
}

object StarRatingParams {
  @scala.inline
  def apply(stars: scala.Int | scala.Double = null): StarRatingParams = {
    val __obj = js.Dynamic.literal()
    if (stars != null) __obj.updateDynamic("stars")(stars.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarRatingParams]
  }
}


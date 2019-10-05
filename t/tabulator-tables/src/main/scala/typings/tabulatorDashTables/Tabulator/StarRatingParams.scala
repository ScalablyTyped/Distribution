package typings.tabulatorDashTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarRatingParams extends _FormatterParams {
  // Star Rating
  var stars: js.UndefOr[Double] = js.undefined
}

object StarRatingParams {
  @scala.inline
  def apply(stars: Int | Double = null): StarRatingParams = {
    val __obj = js.Dynamic.literal()
    if (stars != null) __obj.updateDynamic("stars")(stars.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarRatingParams]
  }
}


package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarRatingParams extends _FormatterParams {
  // Star Rating
  var stars: js.UndefOr[Double] = js.undefined
}

object StarRatingParams {
  @scala.inline
  def apply(stars: js.UndefOr[Double] = js.undefined): StarRatingParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stars)) __obj.updateDynamic("stars")(stars.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StarRatingParams]
  }
}


package typings.tablesorter.pagerInitialRowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagerInitialRows extends js.Object {
  /**
    * The filtered number of rows.
    */
  var filtered: js.UndefOr[Double] = js.undefined
  /**
    * The total number of rows.
    */
  var total: js.UndefOr[Double] = js.undefined
}

object PagerInitialRows {
  @scala.inline
  def apply(filtered: js.UndefOr[Double] = js.undefined, total: js.UndefOr[Double] = js.undefined): PagerInitialRows = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filtered)) __obj.updateDynamic("filtered")(filtered.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerInitialRows]
  }
}


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
  def apply(filtered: Int | Double = null, total: Int | Double = null): PagerInitialRows = {
    val __obj = js.Dynamic.literal()
    if (filtered != null) __obj.updateDynamic("filtered")(filtered.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagerInitialRows]
  }
}


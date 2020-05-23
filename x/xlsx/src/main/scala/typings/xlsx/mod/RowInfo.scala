package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowInfo extends js.Object {
  /* --- visibility --- */
  /** if true, the column is hidden */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** height in points */
  var hpt: js.UndefOr[Double] = js.undefined
  /* --- row height --- */
  /** height in screen pixels */
  var hpx: js.UndefOr[Double] = js.undefined
  /** outline / group level */
  var level: js.UndefOr[Double] = js.undefined
}

object RowInfo {
  @scala.inline
  def apply(
    hidden: js.UndefOr[Boolean] = js.undefined,
    hpt: js.UndefOr[Double] = js.undefined,
    hpx: js.UndefOr[Double] = js.undefined,
    level: js.UndefOr[Double] = js.undefined
  ): RowInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hpt)) __obj.updateDynamic("hpt")(hpt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hpx)) __obj.updateDynamic("hpx")(hpx.get.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowInfo]
  }
}


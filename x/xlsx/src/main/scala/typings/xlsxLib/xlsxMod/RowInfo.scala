package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowInfo extends js.Object {
  /* --- visibility --- */
  /** if true, the column is hidden */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** height in points */
  var hpt: js.UndefOr[scala.Double] = js.undefined
  /* --- row height --- */
  /** height in screen pixels */
  var hpx: js.UndefOr[scala.Double] = js.undefined
  /** outline / group level */
  var level: js.UndefOr[scala.Double] = js.undefined
}

object RowInfo {
  @scala.inline
  def apply(
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    hpt: scala.Int | scala.Double = null,
    hpx: scala.Int | scala.Double = null,
    level: scala.Int | scala.Double = null
  ): RowInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (hpt != null) __obj.updateDynamic("hpt")(hpt.asInstanceOf[js.Any])
    if (hpx != null) __obj.updateDynamic("hpx")(hpx.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowInfo]
  }
}


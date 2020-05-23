package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColInfo extends js.Object {
  /** Excel's "Max Digit Width" unit, always integral */
  var MDW: js.UndefOr[Double] = js.undefined
  /* --- visibility --- */
  /** if true, the column is hidden */
  var hidden: js.UndefOr[Boolean] = js.undefined
  /** width in "characters" */
  var wch: js.UndefOr[Double] = js.undefined
  /* --- column width --- */
  /** width in Excel's "Max Digit Width", width*256 is integral */
  var width: js.UndefOr[Double] = js.undefined
  /** width in screen pixels */
  var wpx: js.UndefOr[Double] = js.undefined
}

object ColInfo {
  @scala.inline
  def apply(
    MDW: js.UndefOr[Double] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    wch: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    wpx: js.UndefOr[Double] = js.undefined
  ): ColInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MDW)) __obj.updateDynamic("MDW")(MDW.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wch)) __obj.updateDynamic("wch")(wch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wpx)) __obj.updateDynamic("wpx")(wpx.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColInfo]
  }
}


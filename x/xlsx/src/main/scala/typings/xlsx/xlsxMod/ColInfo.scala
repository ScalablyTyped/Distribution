package typings.xlsx.xlsxMod

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
    MDW: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    wch: Int | Double = null,
    width: Int | Double = null,
    wpx: Int | Double = null
  ): ColInfo = {
    val __obj = js.Dynamic.literal()
    if (MDW != null) __obj.updateDynamic("MDW")(MDW.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (wch != null) __obj.updateDynamic("wch")(wch.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wpx != null) __obj.updateDynamic("wpx")(wpx.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColInfo]
  }
}


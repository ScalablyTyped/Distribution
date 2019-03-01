package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSON2SheetOpts
  extends CommonOptions
     with DateNFOption {
  /** Use specified column order */
  var header: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Skip header row in generated sheet */
  var skipHeader: js.UndefOr[scala.Boolean] = js.undefined
}

object JSON2SheetOpts {
  @scala.inline
  def apply(
    WTF: js.UndefOr[scala.Boolean] = js.undefined,
    bookVBA: js.UndefOr[scala.Boolean] = js.undefined,
    cellDates: js.UndefOr[scala.Boolean] = js.undefined,
    cellStyles: js.UndefOr[scala.Boolean] = js.undefined,
    dateNF: NumberFormat = null,
    header: js.Array[java.lang.String] = null,
    skipHeader: js.UndefOr[scala.Boolean] = js.undefined
  ): JSON2SheetOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF)
    if (!js.isUndefined(bookVBA)) __obj.updateDynamic("bookVBA")(bookVBA)
    if (!js.isUndefined(cellDates)) __obj.updateDynamic("cellDates")(cellDates)
    if (!js.isUndefined(cellStyles)) __obj.updateDynamic("cellStyles")(cellStyles)
    if (dateNF != null) __obj.updateDynamic("dateNF")(dateNF.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (!js.isUndefined(skipHeader)) __obj.updateDynamic("skipHeader")(skipHeader)
    __obj.asInstanceOf[JSON2SheetOpts]
  }
}


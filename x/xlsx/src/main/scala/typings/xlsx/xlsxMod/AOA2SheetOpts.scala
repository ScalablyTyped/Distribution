package typings.xlsx.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AOA2SheetOpts
  extends CommonOptions
     with DateNFOption {
  /**
    * Create cell objects for stub cells
    * @default false
    */
  var sheetStubs: js.UndefOr[Boolean] = js.undefined
}

object AOA2SheetOpts {
  @scala.inline
  def apply(
    WTF: js.UndefOr[Boolean] = js.undefined,
    bookVBA: js.UndefOr[Boolean] = js.undefined,
    cellDates: js.UndefOr[Boolean] = js.undefined,
    cellStyles: js.UndefOr[Boolean] = js.undefined,
    dateNF: NumberFormat = null,
    sheetStubs: js.UndefOr[Boolean] = js.undefined
  ): AOA2SheetOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF)
    if (!js.isUndefined(bookVBA)) __obj.updateDynamic("bookVBA")(bookVBA)
    if (!js.isUndefined(cellDates)) __obj.updateDynamic("cellDates")(cellDates)
    if (!js.isUndefined(cellStyles)) __obj.updateDynamic("cellStyles")(cellStyles)
    if (dateNF != null) __obj.updateDynamic("dateNF")(dateNF.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetStubs)) __obj.updateDynamic("sheetStubs")(sheetStubs)
    __obj.asInstanceOf[AOA2SheetOpts]
  }
}


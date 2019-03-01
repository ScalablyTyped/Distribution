package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetAOAOpts
  extends AOA2SheetOpts
     with OriginOption

object SheetAOAOpts {
  @scala.inline
  def apply(
    WTF: js.UndefOr[scala.Boolean] = js.undefined,
    bookVBA: js.UndefOr[scala.Boolean] = js.undefined,
    cellDates: js.UndefOr[scala.Boolean] = js.undefined,
    cellStyles: js.UndefOr[scala.Boolean] = js.undefined,
    dateNF: NumberFormat = null,
    origin: scala.Double | java.lang.String | CellAddress = null,
    sheetStubs: js.UndefOr[scala.Boolean] = js.undefined
  ): SheetAOAOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF)
    if (!js.isUndefined(bookVBA)) __obj.updateDynamic("bookVBA")(bookVBA)
    if (!js.isUndefined(cellDates)) __obj.updateDynamic("cellDates")(cellDates)
    if (!js.isUndefined(cellStyles)) __obj.updateDynamic("cellStyles")(cellStyles)
    if (dateNF != null) __obj.updateDynamic("dateNF")(dateNF.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetStubs)) __obj.updateDynamic("sheetStubs")(sheetStubs)
    __obj.asInstanceOf[SheetAOAOpts]
  }
}


package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetAOAOpts
  extends AOA2SheetOpts
     with OriginOption

object SheetAOAOpts {
  @scala.inline
  def apply(
    WTF: js.UndefOr[Boolean] = js.undefined,
    bookVBA: js.UndefOr[Boolean] = js.undefined,
    cellDates: js.UndefOr[Boolean] = js.undefined,
    cellStyles: js.UndefOr[Boolean] = js.undefined,
    dateNF: NumberFormat = null,
    origin: Double | String | CellAddress = null,
    password: String = null,
    sheetStubs: js.UndefOr[Boolean] = js.undefined
  ): SheetAOAOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF.asInstanceOf[js.Any])
    if (!js.isUndefined(bookVBA)) __obj.updateDynamic("bookVBA")(bookVBA.asInstanceOf[js.Any])
    if (!js.isUndefined(cellDates)) __obj.updateDynamic("cellDates")(cellDates.asInstanceOf[js.Any])
    if (!js.isUndefined(cellStyles)) __obj.updateDynamic("cellStyles")(cellStyles.asInstanceOf[js.Any])
    if (dateNF != null) __obj.updateDynamic("dateNF")(dateNF.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetStubs)) __obj.updateDynamic("sheetStubs")(sheetStubs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetAOAOpts]
  }
}


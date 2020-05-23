package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetJSONOpts
  extends JSON2SheetOpts
     with OriginOption

object SheetJSONOpts {
  @scala.inline
  def apply(
    WTF: js.UndefOr[Boolean] = js.undefined,
    bookVBA: js.UndefOr[Boolean] = js.undefined,
    cellDates: js.UndefOr[Boolean] = js.undefined,
    cellStyles: js.UndefOr[Boolean] = js.undefined,
    dateNF: NumberFormat = null,
    header: js.Array[String] = null,
    origin: Double | String | CellAddress = null,
    password: String = null,
    sheetStubs: js.UndefOr[Boolean] = js.undefined,
    skipHeader: js.UndefOr[Boolean] = js.undefined
  ): SheetJSONOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF.get.asInstanceOf[js.Any])
    if (!js.isUndefined(bookVBA)) __obj.updateDynamic("bookVBA")(bookVBA.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellDates)) __obj.updateDynamic("cellDates")(cellDates.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellStyles)) __obj.updateDynamic("cellStyles")(cellStyles.get.asInstanceOf[js.Any])
    if (dateNF != null) __obj.updateDynamic("dateNF")(dateNF.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetStubs)) __obj.updateDynamic("sheetStubs")(sheetStubs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skipHeader)) __obj.updateDynamic("skipHeader")(skipHeader.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetJSONOpts]
  }
}


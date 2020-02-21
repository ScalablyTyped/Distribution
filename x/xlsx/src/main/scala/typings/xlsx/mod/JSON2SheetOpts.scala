package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSON2SheetOpts
  extends CommonOptions
     with DateNFOption {
  /** Use specified column order */
  var header: js.UndefOr[js.Array[String]] = js.undefined
  /** Skip header row in generated sheet */
  var skipHeader: js.UndefOr[Boolean] = js.undefined
}

object JSON2SheetOpts {
  @scala.inline
  def apply(
    WTF: js.UndefOr[Boolean] = js.undefined,
    bookVBA: js.UndefOr[Boolean] = js.undefined,
    cellDates: js.UndefOr[Boolean] = js.undefined,
    cellStyles: js.UndefOr[Boolean] = js.undefined,
    dateNF: NumberFormat = null,
    header: js.Array[String] = null,
    password: String = null,
    sheetStubs: js.UndefOr[Boolean] = js.undefined,
    skipHeader: js.UndefOr[Boolean] = js.undefined
  ): JSON2SheetOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF.asInstanceOf[js.Any])
    if (!js.isUndefined(bookVBA)) __obj.updateDynamic("bookVBA")(bookVBA.asInstanceOf[js.Any])
    if (!js.isUndefined(cellDates)) __obj.updateDynamic("cellDates")(cellDates.asInstanceOf[js.Any])
    if (!js.isUndefined(cellStyles)) __obj.updateDynamic("cellStyles")(cellStyles.asInstanceOf[js.Any])
    if (dateNF != null) __obj.updateDynamic("dateNF")(dateNF.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetStubs)) __obj.updateDynamic("sheetStubs")(sheetStubs.asInstanceOf[js.Any])
    if (!js.isUndefined(skipHeader)) __obj.updateDynamic("skipHeader")(skipHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSON2SheetOpts]
  }
}


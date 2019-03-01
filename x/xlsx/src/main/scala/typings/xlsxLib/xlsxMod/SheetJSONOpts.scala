package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetJSONOpts
  extends JSON2SheetOpts
     with OriginOption

object SheetJSONOpts {
  @scala.inline
  def apply(
    WTF: js.UndefOr[scala.Boolean] = js.undefined,
    bookVBA: js.UndefOr[scala.Boolean] = js.undefined,
    cellDates: js.UndefOr[scala.Boolean] = js.undefined,
    cellStyles: js.UndefOr[scala.Boolean] = js.undefined,
    dateNF: NumberFormat = null,
    header: js.Array[java.lang.String] = null,
    origin: scala.Double | java.lang.String | CellAddress = null,
    skipHeader: js.UndefOr[scala.Boolean] = js.undefined
  ): SheetJSONOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF)
    if (!js.isUndefined(bookVBA)) __obj.updateDynamic("bookVBA")(bookVBA)
    if (!js.isUndefined(cellDates)) __obj.updateDynamic("cellDates")(cellDates)
    if (!js.isUndefined(cellStyles)) __obj.updateDynamic("cellStyles")(cellStyles)
    if (dateNF != null) __obj.updateDynamic("dateNF")(dateNF.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header)
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (!js.isUndefined(skipHeader)) __obj.updateDynamic("skipHeader")(skipHeader)
    __obj.asInstanceOf[SheetJSONOpts]
  }
}


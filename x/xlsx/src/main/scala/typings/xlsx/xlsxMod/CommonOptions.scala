package typings.xlsx.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonOptions extends js.Object {
  /**
    * If true, throw errors when features are not understood
    * @default false
    */
  var WTF: js.UndefOr[Boolean] = js.undefined
  /**
    * When reading a file with VBA macros, expose CFB blob to `vbaraw` field
    * When writing BIFF8/XLSB/XLSM, reseat `vbaraw` and export to file
    * @default false
    */
  var bookVBA: js.UndefOr[Boolean] = js.undefined
  /**
    * When reading a file, store dates as type d (default is n)
    * When writing XLSX/XLSM file, use native date (default uses date codes)
    * @default false
    */
  var cellDates: js.UndefOr[Boolean] = js.undefined
  /**
    * When reading a file, save style/theme info to the .s field
    * When writing a file, export style/theme info
    * @default false
    */
  var cellStyles: js.UndefOr[Boolean] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    WTF: js.UndefOr[Boolean] = js.undefined,
    bookVBA: js.UndefOr[Boolean] = js.undefined,
    cellDates: js.UndefOr[Boolean] = js.undefined,
    cellStyles: js.UndefOr[Boolean] = js.undefined
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF)
    if (!js.isUndefined(bookVBA)) __obj.updateDynamic("bookVBA")(bookVBA)
    if (!js.isUndefined(cellDates)) __obj.updateDynamic("cellDates")(cellDates)
    if (!js.isUndefined(cellStyles)) __obj.updateDynamic("cellStyles")(cellStyles)
    __obj.asInstanceOf[CommonOptions]
  }
}


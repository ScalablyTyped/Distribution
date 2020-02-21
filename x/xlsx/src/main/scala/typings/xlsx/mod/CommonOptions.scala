package typings.xlsx.mod

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
  /**
    * If defined and file is encrypted, use password
    * @default ''
    */
  var password: js.UndefOr[String] = js.undefined
  /**
    * Create cell objects for stub cells
    * @default false
    */
  var sheetStubs: js.UndefOr[Boolean] = js.undefined
}

object CommonOptions {
  @scala.inline
  def apply(
    WTF: js.UndefOr[Boolean] = js.undefined,
    bookVBA: js.UndefOr[Boolean] = js.undefined,
    cellDates: js.UndefOr[Boolean] = js.undefined,
    cellStyles: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    sheetStubs: js.UndefOr[Boolean] = js.undefined
  ): CommonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(WTF)) __obj.updateDynamic("WTF")(WTF.asInstanceOf[js.Any])
    if (!js.isUndefined(bookVBA)) __obj.updateDynamic("bookVBA")(bookVBA.asInstanceOf[js.Any])
    if (!js.isUndefined(cellDates)) __obj.updateDynamic("cellDates")(cellDates.asInstanceOf[js.Any])
    if (!js.isUndefined(cellStyles)) __obj.updateDynamic("cellStyles")(cellStyles.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetStubs)) __obj.updateDynamic("sheetStubs")(sheetStubs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonOptions]
  }
}


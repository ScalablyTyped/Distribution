package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WBProps extends js.Object {
  /** Defined Names */
  var Names: js.UndefOr[js.Array[DefinedName]] = js.undefined
  /** Sheet Properties */
  var Sheets: js.UndefOr[js.Array[SheetProps]] = js.undefined
  /** Workbook Views */
  var Views: js.UndefOr[js.Array[WBView]] = js.undefined
  /** Other Workbook Properties */
  var WBProps: js.UndefOr[WorkbookProperties] = js.undefined
}

object WBProps {
  @scala.inline
  def apply(
    Names: js.Array[DefinedName] = null,
    Sheets: js.Array[SheetProps] = null,
    Views: js.Array[WBView] = null,
    WBProps: WorkbookProperties = null
  ): WBProps = {
    val __obj = js.Dynamic.literal()
    if (Names != null) __obj.updateDynamic("Names")(Names)
    if (Sheets != null) __obj.updateDynamic("Sheets")(Sheets)
    if (Views != null) __obj.updateDynamic("Views")(Views)
    if (WBProps != null) __obj.updateDynamic("WBProps")(WBProps)
    __obj.asInstanceOf[WBProps]
  }
}


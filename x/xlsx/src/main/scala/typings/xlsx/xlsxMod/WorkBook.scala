package typings.xlsx.xlsxMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkBook extends js.Object {
  /** Custom workbook Properties */
  var Custprops: js.UndefOr[js.Object] = js.undefined
  /** Standard workbook Properties */
  var Props: js.UndefOr[FullProperties] = js.undefined
  /** Ordered list of the sheet names in the workbook */
  var SheetNames: js.Array[String]
  /**
    * A dictionary of the worksheets in the workbook.
    * Use SheetNames to reference these.
    */
  var Sheets: StringDictionary[WorkSheet]
  var Workbook: js.UndefOr[WBProps] = js.undefined
  var vbaraw: js.UndefOr[js.Any] = js.undefined
}

object WorkBook {
  @scala.inline
  def apply(
    SheetNames: js.Array[String],
    Sheets: StringDictionary[WorkSheet],
    Custprops: js.Object = null,
    Props: FullProperties = null,
    Workbook: WBProps = null,
    vbaraw: js.Any = null
  ): WorkBook = {
    val __obj = js.Dynamic.literal(SheetNames = SheetNames.asInstanceOf[js.Any], Sheets = Sheets.asInstanceOf[js.Any])
    if (Custprops != null) __obj.updateDynamic("Custprops")(Custprops.asInstanceOf[js.Any])
    if (Props != null) __obj.updateDynamic("Props")(Props.asInstanceOf[js.Any])
    if (Workbook != null) __obj.updateDynamic("Workbook")(Workbook.asInstanceOf[js.Any])
    if (vbaraw != null) __obj.updateDynamic("vbaraw")(vbaraw.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkBook]
  }
}


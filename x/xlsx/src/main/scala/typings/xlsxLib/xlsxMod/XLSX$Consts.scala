package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XLSX$Consts extends js.Object {
  /** Visibility: Hidden */
  var SHEET_HIDDEN: xlsxLib.xlsxLibNumbers.`1`
  /** Visibility: Very Hidden */
  var SHEET_VERYHIDDEN: xlsxLib.xlsxLibNumbers.`2`
  /* --- Sheet Visibility --- */
  /** Visibility: Visible */
  var SHEET_VISIBLE: xlsxLib.xlsxLibNumbers.`0`
}

object XLSX$Consts {
  @scala.inline
  def apply(
    SHEET_HIDDEN: xlsxLib.xlsxLibNumbers.`1`,
    SHEET_VERYHIDDEN: xlsxLib.xlsxLibNumbers.`2`,
    SHEET_VISIBLE: xlsxLib.xlsxLibNumbers.`0`
  ): XLSX$Consts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("SHEET_HIDDEN")(SHEET_HIDDEN)
    __obj.updateDynamic("SHEET_VERYHIDDEN")(SHEET_VERYHIDDEN)
    __obj.updateDynamic("SHEET_VISIBLE")(SHEET_VISIBLE)
    __obj.asInstanceOf[XLSX$Consts]
  }
}


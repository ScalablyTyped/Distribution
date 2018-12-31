package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColInfo extends js.Object {
  /** Excel's "Max Digit Width" unit, always integral */
  var MDW: js.UndefOr[scala.Double] = js.undefined
  /* --- visibility --- */
  /** if true, the column is hidden */
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  /** width in "characters" */
  var wch: js.UndefOr[scala.Double] = js.undefined
  /* --- column width --- */
  /** width in Excel's "Max Digit Width", width*256 is integral */
  var width: js.UndefOr[scala.Double] = js.undefined
  /** width in screen pixels */
  var wpx: js.UndefOr[scala.Double] = js.undefined
}


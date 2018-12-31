package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookProperties extends js.Object {
  /** Name of Document Module in associated VBA Project */
  var CodeName: js.UndefOr[java.lang.String] = js.undefined
  /** Worksheet Epoch (1904 if true, 1900 if false) */
  var date1904: js.UndefOr[scala.Boolean] = js.undefined
  /** Warn or strip personally identifying info on save */
  var filterPrivacy: js.UndefOr[scala.Boolean] = js.undefined
}


package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Sheet2CSVOpts extends DateNFOption {
  /** Field Separator ("delimiter") */
  var FS: js.UndefOr[java.lang.String] = js.undefined
  /** Record Separator ("row separator") */
  var RS: js.UndefOr[java.lang.String] = js.undefined
  /** Include blank lines in the CSV output */
  var blankrows: js.UndefOr[scala.Boolean] = js.undefined
  /** Skip hidden rows and columns in the CSV output */
  var skipHidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Remove trailing field separators in each record */
  var strip: js.UndefOr[scala.Boolean] = js.undefined
}


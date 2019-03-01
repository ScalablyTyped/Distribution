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

object Sheet2CSVOpts {
  @scala.inline
  def apply(
    FS: java.lang.String = null,
    RS: java.lang.String = null,
    blankrows: js.UndefOr[scala.Boolean] = js.undefined,
    dateNF: NumberFormat = null,
    skipHidden: js.UndefOr[scala.Boolean] = js.undefined,
    strip: js.UndefOr[scala.Boolean] = js.undefined
  ): Sheet2CSVOpts = {
    val __obj = js.Dynamic.literal()
    if (FS != null) __obj.updateDynamic("FS")(FS)
    if (RS != null) __obj.updateDynamic("RS")(RS)
    if (!js.isUndefined(blankrows)) __obj.updateDynamic("blankrows")(blankrows)
    if (dateNF != null) __obj.updateDynamic("dateNF")(dateNF.asInstanceOf[js.Any])
    if (!js.isUndefined(skipHidden)) __obj.updateDynamic("skipHidden")(skipHidden)
    if (!js.isUndefined(strip)) __obj.updateDynamic("strip")(strip)
    __obj.asInstanceOf[Sheet2CSVOpts]
  }
}


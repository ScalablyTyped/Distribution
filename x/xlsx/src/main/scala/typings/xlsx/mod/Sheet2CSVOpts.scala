package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet2CSVOpts extends DateNFOption {
  /** Field Separator ("delimiter") */
  var FS: js.UndefOr[String] = js.undefined
  /** Record Separator ("row separator") */
  var RS: js.UndefOr[String] = js.undefined
  /** Include blank lines in the CSV output */
  var blankrows: js.UndefOr[Boolean] = js.undefined
  /** Skip hidden rows and columns in the CSV output */
  var skipHidden: js.UndefOr[Boolean] = js.undefined
  /** Remove trailing field separators in each record */
  var strip: js.UndefOr[Boolean] = js.undefined
}

object Sheet2CSVOpts {
  @scala.inline
  def apply(
    FS: String = null,
    RS: String = null,
    blankrows: js.UndefOr[Boolean] = js.undefined,
    dateNF: NumberFormat = null,
    skipHidden: js.UndefOr[Boolean] = js.undefined,
    strip: js.UndefOr[Boolean] = js.undefined
  ): Sheet2CSVOpts = {
    val __obj = js.Dynamic.literal()
    if (FS != null) __obj.updateDynamic("FS")(FS.asInstanceOf[js.Any])
    if (RS != null) __obj.updateDynamic("RS")(RS.asInstanceOf[js.Any])
    if (!js.isUndefined(blankrows)) __obj.updateDynamic("blankrows")(blankrows.get.asInstanceOf[js.Any])
    if (dateNF != null) __obj.updateDynamic("dateNF")(dateNF.asInstanceOf[js.Any])
    if (!js.isUndefined(skipHidden)) __obj.updateDynamic("skipHidden")(skipHidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strip)) __obj.updateDynamic("strip")(strip.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sheet2CSVOpts]
  }
}


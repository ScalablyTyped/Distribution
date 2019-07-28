package typings.xlsx.xlsxMod

import typings.xlsx.xlsxStrings.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet2JSONOpts extends DateNFOption {
  /** Include or omit blank lines in the output */
  var blankrows: js.UndefOr[Boolean] = js.undefined
  /** Default value for null/undefined values */
  var defval: js.UndefOr[js.Any] = js.undefined
  /** Output format */
  var header: js.UndefOr[A | Double | js.Array[String]] = js.undefined
  /** Override worksheet range */
  var range: js.UndefOr[js.Any] = js.undefined
  /** if true, return raw data; if false, return formatted text */
  var raw: js.UndefOr[Boolean] = js.undefined
}

object Sheet2JSONOpts {
  @scala.inline
  def apply(
    blankrows: js.UndefOr[Boolean] = js.undefined,
    dateNF: NumberFormat = null,
    defval: js.Any = null,
    header: A | Double | js.Array[String] = null,
    range: js.Any = null,
    raw: js.UndefOr[Boolean] = js.undefined
  ): Sheet2JSONOpts = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(blankrows)) __obj.updateDynamic("blankrows")(blankrows)
    if (dateNF != null) __obj.updateDynamic("dateNF")(dateNF.asInstanceOf[js.Any])
    if (defval != null) __obj.updateDynamic("defval")(defval)
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[Sheet2JSONOpts]
  }
}


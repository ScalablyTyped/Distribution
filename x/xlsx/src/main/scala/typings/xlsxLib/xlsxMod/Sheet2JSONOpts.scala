package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Sheet2JSONOpts extends DateNFOption {
  /** Include or omit blank lines in the output */
  var blankrows: js.UndefOr[scala.Boolean] = js.undefined
  /** Default value for null/undefined values */
  var defval: js.UndefOr[js.Any] = js.undefined
  /** Output format */
  var header: js.UndefOr[xlsxLib.xlsxLibStrings.A | scala.Double | js.Array[java.lang.String]] = js.undefined
  /** Override worksheet range */
  var range: js.UndefOr[js.Any] = js.undefined
  /** if true, return raw data; if false, return formatted text */
  var raw: js.UndefOr[scala.Boolean] = js.undefined
}


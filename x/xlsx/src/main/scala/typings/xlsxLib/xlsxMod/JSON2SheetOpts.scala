package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JSON2SheetOpts
  extends CommonOptions
     with DateNFOption {
  /** Use specified column order */
  var header: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Skip header row in generated sheet */
  var skipHeader: js.UndefOr[scala.Boolean] = js.undefined
}


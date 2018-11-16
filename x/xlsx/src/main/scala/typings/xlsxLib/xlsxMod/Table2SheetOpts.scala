package typings
package xlsxLib.xlsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Table2SheetOpts
  extends CommonOptions
     with DateNFOption {
  /** If true, hidden rows and cells will not be parsed */
  var display: js.UndefOr[scala.Boolean] = js.undefined
  /* If true, plaintext parsing will not parse values */
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * If >0, read the first sheetRows rows
       * @default 0
       */
  var sheetRows: js.UndefOr[scala.Double] = js.undefined
}


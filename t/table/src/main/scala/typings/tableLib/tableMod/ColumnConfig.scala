package typings
package tableLib.tableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ColumnConfig extends js.Object {
  var alignment: js.UndefOr[
    tableLib.tableLibStrings.left | tableLib.tableLibStrings.center | tableLib.tableLibStrings.right
  ] = js.undefined
  var paddingLeft: js.UndefOr[scala.Double] = js.undefined
  var paddingRight: js.UndefOr[scala.Double] = js.undefined
  var truncate: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}


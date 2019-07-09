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
  var wrapWord: js.UndefOr[scala.Boolean] = js.undefined
}

object ColumnConfig {
  @scala.inline
  def apply(
    alignment: tableLib.tableLibStrings.left | tableLib.tableLibStrings.center | tableLib.tableLibStrings.right = null,
    paddingLeft: scala.Int | scala.Double = null,
    paddingRight: scala.Int | scala.Double = null,
    truncate: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null,
    wrapWord: js.UndefOr[scala.Boolean] = js.undefined
  ): ColumnConfig = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (paddingLeft != null) __obj.updateDynamic("paddingLeft")(paddingLeft.asInstanceOf[js.Any])
    if (paddingRight != null) __obj.updateDynamic("paddingRight")(paddingRight.asInstanceOf[js.Any])
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapWord)) __obj.updateDynamic("wrapWord")(wrapWord)
    __obj.asInstanceOf[ColumnConfig]
  }
}


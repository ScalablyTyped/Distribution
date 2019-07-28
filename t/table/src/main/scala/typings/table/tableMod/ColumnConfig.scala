package typings.table.tableMod

import typings.table.tableStrings.center
import typings.table.tableStrings.left
import typings.table.tableStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnConfig extends js.Object {
  var alignment: js.UndefOr[left | center | right] = js.undefined
  var paddingLeft: js.UndefOr[Double] = js.undefined
  var paddingRight: js.UndefOr[Double] = js.undefined
  var truncate: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var wrapWord: js.UndefOr[Boolean] = js.undefined
}

object ColumnConfig {
  @scala.inline
  def apply(
    alignment: left | center | right = null,
    paddingLeft: Int | Double = null,
    paddingRight: Int | Double = null,
    truncate: Int | Double = null,
    width: Int | Double = null,
    wrapWord: js.UndefOr[Boolean] = js.undefined
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


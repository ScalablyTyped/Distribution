package typings.table.mod

import typings.table.tableStrings.center
import typings.table.tableStrings.left
import typings.table.tableStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableColumns extends js.Object {
  var alignment: js.UndefOr[left | center | right] = js.undefined
  var paddingLeft: js.UndefOr[Double] = js.undefined
  var paddingRight: js.UndefOr[Double] = js.undefined
  var truncate: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var wrapWord: js.UndefOr[Boolean] = js.undefined
}

object TableColumns {
  @scala.inline
  def apply(
    alignment: left | center | right = null,
    paddingLeft: js.UndefOr[Double] = js.undefined,
    paddingRight: js.UndefOr[Double] = js.undefined,
    truncate: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    wrapWord: js.UndefOr[Boolean] = js.undefined
  ): TableColumns = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeft)) __obj.updateDynamic("paddingLeft")(paddingLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingRight)) __obj.updateDynamic("paddingRight")(paddingRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapWord)) __obj.updateDynamic("wrapWord")(wrapWord.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableColumns]
  }
}


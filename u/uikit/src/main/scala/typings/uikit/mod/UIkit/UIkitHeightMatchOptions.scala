package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitHeightMatchOptions extends js.Object {
  var row: js.UndefOr[Boolean] = js.undefined
  var target: js.UndefOr[String] = js.undefined
}

object UIkitHeightMatchOptions {
  @scala.inline
  def apply(row: js.UndefOr[Boolean] = js.undefined, target: String = null): UIkitHeightMatchOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitHeightMatchOptions]
  }
}


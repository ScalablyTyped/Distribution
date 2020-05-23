package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expand extends js.Object {
  var expand: js.UndefOr[Boolean | Double] = js.undefined
  var focus: js.UndefOr[Boolean] = js.undefined
  var select: js.UndefOr[Boolean] = js.undefined
}

object Expand {
  @scala.inline
  def apply(
    expand: Boolean | Double = null,
    focus: js.UndefOr[Boolean] = js.undefined,
    select: js.UndefOr[Boolean] = js.undefined
  ): Expand = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expand]
  }
}


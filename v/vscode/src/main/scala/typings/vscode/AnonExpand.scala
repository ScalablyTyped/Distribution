package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpand extends js.Object {
  var expand: js.UndefOr[Boolean | Double] = js.undefined
  var focus: js.UndefOr[Boolean] = js.undefined
  var select: js.UndefOr[Boolean] = js.undefined
}

object AnonExpand {
  @scala.inline
  def apply(
    expand: Boolean | Double = null,
    focus: js.UndefOr[Boolean] = js.undefined,
    select: js.UndefOr[Boolean] = js.undefined
  ): AnonExpand = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (!js.isUndefined(select)) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpand]
  }
}


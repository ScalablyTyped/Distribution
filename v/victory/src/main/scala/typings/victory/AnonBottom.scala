package typings.victory

import typings.victory.mod.NumberOrCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottom extends js.Object {
  var bottom: js.UndefOr[NumberOrCallback] = js.undefined
  var bottomLeft: js.UndefOr[NumberOrCallback] = js.undefined
  var bottomRight: js.UndefOr[NumberOrCallback] = js.undefined
  var top: js.UndefOr[NumberOrCallback] = js.undefined
  var topLeft: js.UndefOr[NumberOrCallback] = js.undefined
  var topRight: js.UndefOr[NumberOrCallback] = js.undefined
}

object AnonBottom {
  @scala.inline
  def apply(
    bottom: NumberOrCallback = null,
    bottomLeft: NumberOrCallback = null,
    bottomRight: NumberOrCallback = null,
    top: NumberOrCallback = null,
    topLeft: NumberOrCallback = null,
    topRight: NumberOrCallback = null
  ): AnonBottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (bottomLeft != null) __obj.updateDynamic("bottomLeft")(bottomLeft.asInstanceOf[js.Any])
    if (bottomRight != null) __obj.updateDynamic("bottomRight")(bottomRight.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (topLeft != null) __obj.updateDynamic("topLeft")(topLeft.asInstanceOf[js.Any])
    if (topRight != null) __obj.updateDynamic("topRight")(topRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottom]
  }
}


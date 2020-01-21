package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderWidth extends js.Object {
  var borderWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[AnonData] = js.undefined
}

object AnonBorderWidth {
  @scala.inline
  def apply(borderWidth: Int | Double = null, style: AnonData = null): AnonBorderWidth = {
    val __obj = js.Dynamic.literal()
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderWidth]
  }
}


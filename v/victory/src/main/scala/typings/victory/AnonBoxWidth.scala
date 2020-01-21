package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoxWidth extends js.Object {
  var boxWidth: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[AnonMax] = js.undefined
}

object AnonBoxWidth {
  @scala.inline
  def apply(boxWidth: Int | Double = null, style: AnonMax = null): AnonBoxWidth = {
    val __obj = js.Dynamic.literal()
    if (boxWidth != null) __obj.updateDynamic("boxWidth")(boxWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoxWidth]
  }
}


package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyle extends js.Object {
  var style: js.UndefOr[AnonData] = js.undefined
}

object AnonStyle {
  @scala.inline
  def apply(style: AnonData = null): AnonStyle = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyle]
  }
}


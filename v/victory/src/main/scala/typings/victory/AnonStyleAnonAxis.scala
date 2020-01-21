package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyleAnonAxis extends js.Object {
  var style: js.UndefOr[AnonAxis] = js.undefined
}

object AnonStyleAnonAxis {
  @scala.inline
  def apply(style: AnonAxis = null): AnonStyleAnonAxis = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyleAnonAxis]
  }
}


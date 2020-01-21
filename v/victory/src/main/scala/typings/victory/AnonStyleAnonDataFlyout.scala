package typings.victory

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyleAnonDataFlyout extends js.Object {
  var style: js.UndefOr[AnonDataFlyout] = js.undefined
}

object AnonStyleAnonDataFlyout {
  @scala.inline
  def apply(style: AnonDataFlyout = null): AnonStyleAnonDataFlyout = {
    val __obj = js.Dynamic.literal()
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyleAnonDataFlyout]
  }
}


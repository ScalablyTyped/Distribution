package typings.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShrinkAnonHeightWidth extends js.Object {
  var shrink: js.UndefOr[AnonHeightWidth] = js.undefined
}

object AnonShrinkAnonHeightWidth {
  @scala.inline
  def apply(shrink: AnonHeightWidth = null): AnonShrinkAnonHeightWidth = {
    val __obj = js.Dynamic.literal()
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShrinkAnonHeightWidth]
  }
}


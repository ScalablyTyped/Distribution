package typings.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShrinkAnonWidth extends js.Object {
  var shrink: js.UndefOr[AnonWidth] = js.undefined
}

object AnonShrinkAnonWidth {
  @scala.inline
  def apply(shrink: AnonWidth = null): AnonShrinkAnonWidth = {
    val __obj = js.Dynamic.literal()
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShrinkAnonWidth]
  }
}


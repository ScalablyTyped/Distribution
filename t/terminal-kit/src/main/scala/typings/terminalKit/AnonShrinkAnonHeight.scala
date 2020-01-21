package typings.terminalKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShrinkAnonHeight extends js.Object {
  var shrink: js.UndefOr[AnonHeight] = js.undefined
}

object AnonShrinkAnonHeight {
  @scala.inline
  def apply(shrink: AnonHeight = null): AnonShrinkAnonHeight = {
    val __obj = js.Dynamic.literal()
    if (shrink != null) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShrinkAnonHeight]
  }
}


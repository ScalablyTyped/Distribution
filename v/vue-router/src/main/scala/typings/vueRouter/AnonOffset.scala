package typings.vueRouter

import typings.vueRouter.routerMod.Position
import typings.vueRouter.routerMod._PositionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOffset extends _PositionResult {
  var offset: js.UndefOr[Position] = js.undefined
  var selector: String
}

object AnonOffset {
  @scala.inline
  def apply(selector: String, offset: Position = null): AnonOffset = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffset]
  }
}


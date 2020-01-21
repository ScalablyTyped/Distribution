package typings.vanillaSwipe.calculateMovingPositionMod

import typings.vanillaSwipe.AnonClientX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait E extends js.Object {
  var changedTouches: js.UndefOr[js.Array[AnonClientX]] = js.undefined
  var clientX: Double
  var clientY: Double
  var preventDefault: js.UndefOr[js.Function] = js.undefined
}

object E {
  @scala.inline
  def apply(
    clientX: Double,
    clientY: Double,
    changedTouches: js.Array[AnonClientX] = null,
    preventDefault: js.Function = null
  ): E = {
    val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any])
    if (changedTouches != null) __obj.updateDynamic("changedTouches")(changedTouches.asInstanceOf[js.Any])
    if (preventDefault != null) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[E]
  }
}


package typings.wonderDotJs.distEs2015EventInterfaceIEventDataMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchEventData extends IEventData {
  var changedTouches: js.Array[ITouchData]
  var currentTarget: HTMLElement | Null
  var target: HTMLElement
  var targetTouches: js.Array[ITouchData]
  var touches: js.Array[ITouchData]
}

object ITouchEventData {
  @scala.inline
  def apply(
    changedTouches: js.Array[ITouchData],
    preventDefault: () => Unit,
    returnValue: Boolean,
    target: HTMLElement,
    targetTouches: js.Array[ITouchData],
    touches: js.Array[ITouchData],
    currentTarget: HTMLElement = null
  ): ITouchEventData = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches, preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue, target = target, targetTouches = targetTouches, touches = touches)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.asInstanceOf[ITouchEventData]
  }
}


package typings.wonderJs.ieventdataMod

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
    val __obj = js.Dynamic.literal(changedTouches = changedTouches.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetTouches = targetTouches.asInstanceOf[js.Any], touches = touches.asInstanceOf[js.Any])
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITouchEventData]
  }
}


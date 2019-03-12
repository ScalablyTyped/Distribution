package typings
package wonderDotJsLib.distEs2015EventInterfaceIEventDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITouchEventData extends IEventData {
  var changedTouches: js.Array[ITouchData]
  var currentTarget: stdLib.HTMLElement | scala.Null
  var target: stdLib.HTMLElement
  var targetTouches: js.Array[ITouchData]
  var touches: js.Array[ITouchData]
}

object ITouchEventData {
  @scala.inline
  def apply(
    changedTouches: js.Array[ITouchData],
    preventDefault: () => scala.Unit,
    returnValue: scala.Boolean,
    target: stdLib.HTMLElement,
    targetTouches: js.Array[ITouchData],
    touches: js.Array[ITouchData],
    currentTarget: stdLib.HTMLElement = null
  ): ITouchEventData = {
    val __obj = js.Dynamic.literal(changedTouches = changedTouches, preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue, target = target, targetTouches = targetTouches, touches = touches)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.asInstanceOf[ITouchEventData]
  }
}


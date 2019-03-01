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
    preventDefault: js.Function0[scala.Unit],
    returnValue: scala.Boolean,
    target: stdLib.HTMLElement,
    targetTouches: js.Array[ITouchData],
    touches: js.Array[ITouchData],
    currentTarget: stdLib.HTMLElement = null
  ): ITouchEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changedTouches")(changedTouches)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("returnValue")(returnValue)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("targetTouches")(targetTouches)
    __obj.updateDynamic("touches")(touches)
    if (currentTarget != null) __obj.updateDynamic("currentTarget")(currentTarget)
    __obj.asInstanceOf[ITouchEventData]
  }
}


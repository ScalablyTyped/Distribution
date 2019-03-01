package typings
package tinymceLib.tinymceMod.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeChangeEvent extends Event {
  var element: stdLib.Node
  var parents: js.Array[stdLib.Node]
  var selectionChange: scala.Boolean
}

object NodeChangeEvent {
  @scala.inline
  def apply(
    element: stdLib.Node,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    parents: js.Array[stdLib.Node],
    preventDefault: js.Function0[scala.Unit],
    selectionChange: scala.Boolean,
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: java.lang.String,
    `type`: java.lang.String
  ): NodeChangeEvent = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("parents")(parents)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("selectionChange")(selectionChange)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[NodeChangeEvent]
  }
}


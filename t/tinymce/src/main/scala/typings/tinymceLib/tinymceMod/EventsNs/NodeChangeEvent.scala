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
    val __obj = js.Dynamic.literal(element = element, isDefaultPrevented = isDefaultPrevented, isImmediatePropagationStopped = isImmediatePropagationStopped, isPropagationStopped = isPropagationStopped, parents = parents, preventDefault = preventDefault, selectionChange = selectionChange, stopImmediatePropagation = stopImmediatePropagation, stopPropagation = stopPropagation, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodeChangeEvent]
  }
}


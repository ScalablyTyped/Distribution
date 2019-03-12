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
    isDefaultPrevented: () => scala.Boolean,
    isImmediatePropagationStopped: () => scala.Boolean,
    isPropagationStopped: () => scala.Boolean,
    parents: js.Array[stdLib.Node],
    preventDefault: () => scala.Unit,
    selectionChange: scala.Boolean,
    stopImmediatePropagation: () => scala.Unit,
    stopPropagation: () => scala.Unit,
    target: java.lang.String,
    `type`: java.lang.String
  ): NodeChangeEvent = {
    val __obj = js.Dynamic.literal(element = element, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), parents = parents, preventDefault = js.Any.fromFunction0(preventDefault), selectionChange = selectionChange, stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodeChangeEvent]
  }
}


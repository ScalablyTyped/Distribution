package typings.tinymce.tinymceMod.Events

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeChangeEvent extends Event {
  var element: Node
  var parents: js.Array[Node]
  var selectionChange: Boolean
}

object NodeChangeEvent {
  @scala.inline
  def apply(
    element: Node,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    parents: js.Array[Node],
    preventDefault: () => Unit,
    selectionChange: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: String,
    `type`: String
  ): NodeChangeEvent = {
    val __obj = js.Dynamic.literal(element = element, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), parents = parents, preventDefault = js.Any.fromFunction0(preventDefault), selectionChange = selectionChange, stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[NodeChangeEvent]
  }
}


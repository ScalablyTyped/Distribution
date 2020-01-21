package typings.tinymce.mod.Events

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
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), parents = parents.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), selectionChange = selectionChange.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeChangeEvent]
  }
}


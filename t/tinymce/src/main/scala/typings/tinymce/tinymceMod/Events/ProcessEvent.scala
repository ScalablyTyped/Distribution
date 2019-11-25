package typings.tinymce.tinymceMod.Events

import typings.std.Node
import typings.tinymce.tinymceNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessEvent extends Event {
  var content: String
  var forced_root_block: String
  var format: String
  var get: Boolean
  var get_inner: Boolean
  var node: Node
  var selection: `true`
}

object ProcessEvent {
  @scala.inline
  def apply(
    content: String,
    forced_root_block: String,
    format: String,
    get: Boolean,
    get_inner: Boolean,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    node: Node,
    preventDefault: () => Unit,
    selection: `true`,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: String,
    `type`: String
  ): ProcessEvent = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], forced_root_block = forced_root_block.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], get_inner = get_inner.asInstanceOf[js.Any], isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), node = node.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), selection = selection.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessEvent]
  }
}


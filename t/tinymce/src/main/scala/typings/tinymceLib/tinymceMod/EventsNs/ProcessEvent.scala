package typings
package tinymceLib.tinymceMod.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessEvent extends Event {
  var content: java.lang.String
  var forced_root_block: java.lang.String
  var format: java.lang.String
  var get: scala.Boolean
  var get_inner: scala.Boolean
  var node: stdLib.Node
  var selection: tinymceLib.tinymceLibNumbers.`true`
}

object ProcessEvent {
  @scala.inline
  def apply(
    content: java.lang.String,
    forced_root_block: java.lang.String,
    format: java.lang.String,
    get: scala.Boolean,
    get_inner: scala.Boolean,
    isDefaultPrevented: () => scala.Boolean,
    isImmediatePropagationStopped: () => scala.Boolean,
    isPropagationStopped: () => scala.Boolean,
    node: stdLib.Node,
    preventDefault: () => scala.Unit,
    selection: tinymceLib.tinymceLibNumbers.`true`,
    stopImmediatePropagation: () => scala.Unit,
    stopPropagation: () => scala.Unit,
    target: java.lang.String,
    `type`: java.lang.String
  ): ProcessEvent = {
    val __obj = js.Dynamic.literal(content = content, forced_root_block = forced_root_block, format = format, get = get, get_inner = get_inner, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), node = node, preventDefault = js.Any.fromFunction0(preventDefault), selection = selection, stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProcessEvent]
  }
}


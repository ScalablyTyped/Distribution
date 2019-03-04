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
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    node: stdLib.Node,
    preventDefault: js.Function0[scala.Unit],
    selection: tinymceLib.tinymceLibNumbers.`true`,
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: java.lang.String,
    `type`: java.lang.String
  ): ProcessEvent = {
    val __obj = js.Dynamic.literal(content = content, forced_root_block = forced_root_block, format = format, get = get, get_inner = get_inner, isDefaultPrevented = isDefaultPrevented, isImmediatePropagationStopped = isImmediatePropagationStopped, isPropagationStopped = isPropagationStopped, node = node, preventDefault = preventDefault, selection = selection, stopImmediatePropagation = stopImmediatePropagation, stopPropagation = stopPropagation, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProcessEvent]
  }
}


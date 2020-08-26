package typings.tinymce.mod.Events

import typings.std.Node
import typings.tinymce.tinymceBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessEvent extends Event {
  var content: String = js.native
  var forced_root_block: String = js.native
  var format: String = js.native
  var get: Boolean = js.native
  var get_inner: Boolean = js.native
  var node: Node = js.native
  var selection: `true` = js.native
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
  @scala.inline
  implicit class ProcessEventOps[Self <: ProcessEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setForced_root_block(value: String): Self = this.set("forced_root_block", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: Boolean): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet_inner(value: Boolean): Self = this.set("get_inner", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: Node): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelection(value: `true`): Self = this.set("selection", value.asInstanceOf[js.Any])
  }
  
}


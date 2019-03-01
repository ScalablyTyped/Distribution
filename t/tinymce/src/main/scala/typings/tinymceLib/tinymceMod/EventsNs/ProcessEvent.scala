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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("forced_root_block")(forced_root_block)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("get_inner")(get_inner)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("node")(node)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("selection")(selection)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ProcessEvent]
  }
}


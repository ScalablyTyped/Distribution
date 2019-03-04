package typings
package tinymceLib.tinymceMod.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandEvent extends Event {
  var command: java.lang.String
  var ui: scala.Boolean
  var value: java.lang.String
}

object CommandEvent {
  @scala.inline
  def apply(
    command: java.lang.String,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    preventDefault: js.Function0[scala.Unit],
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: java.lang.String,
    `type`: java.lang.String,
    ui: scala.Boolean,
    value: java.lang.String
  ): CommandEvent = {
    val __obj = js.Dynamic.literal(command = command, isDefaultPrevented = isDefaultPrevented, isImmediatePropagationStopped = isImmediatePropagationStopped, isPropagationStopped = isPropagationStopped, preventDefault = preventDefault, stopImmediatePropagation = stopImmediatePropagation, stopPropagation = stopPropagation, target = target, ui = ui, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CommandEvent]
  }
}


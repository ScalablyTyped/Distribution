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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("command")(command)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.updateDynamic("ui")(ui)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CommandEvent]
  }
}


package typings
package tinymceLib.tinymceMod.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentEvent extends Event {
  var content: java.lang.String
  var format: java.lang.String
  var set: scala.Boolean
}

object ContentEvent {
  @scala.inline
  def apply(
    content: java.lang.String,
    format: java.lang.String,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    preventDefault: js.Function0[scala.Unit],
    set: scala.Boolean,
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: java.lang.String,
    `type`: java.lang.String
  ): ContentEvent = {
    val __obj = js.Dynamic.literal(content = content, format = format, isDefaultPrevented = isDefaultPrevented, isImmediatePropagationStopped = isImmediatePropagationStopped, isPropagationStopped = isPropagationStopped, preventDefault = preventDefault, set = set, stopImmediatePropagation = stopImmediatePropagation, stopPropagation = stopPropagation, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContentEvent]
  }
}


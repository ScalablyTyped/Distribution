package typings.tinymce.tinymceMod.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentEvent extends Event {
  var content: String
  var format: String
  var set: Boolean
}

object ContentEvent {
  @scala.inline
  def apply(
    content: String,
    format: String,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    set: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: String,
    `type`: String
  ): ContentEvent = {
    val __obj = js.Dynamic.literal(content = content, format = format, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), set = set, stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ContentEvent]
  }
}


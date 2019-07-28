package typings.tinymce.tinymceMod.EventsNs

import typings.tinymce.tinymceMod.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusBlurEvent extends Event {
  var blurredEditor: Editor
}

object FocusBlurEvent {
  @scala.inline
  def apply(
    blurredEditor: Editor,
    isDefaultPrevented: () => Boolean,
    isImmediatePropagationStopped: () => Boolean,
    isPropagationStopped: () => Boolean,
    preventDefault: () => Unit,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: String,
    `type`: String
  ): FocusBlurEvent = {
    val __obj = js.Dynamic.literal(blurredEditor = blurredEditor, isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), isImmediatePropagationStopped = js.Any.fromFunction0(isImmediatePropagationStopped), isPropagationStopped = js.Any.fromFunction0(isPropagationStopped), preventDefault = js.Any.fromFunction0(preventDefault), stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FocusBlurEvent]
  }
}


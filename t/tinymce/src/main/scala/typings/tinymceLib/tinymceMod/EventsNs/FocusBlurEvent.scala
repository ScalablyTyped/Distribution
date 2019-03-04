package typings
package tinymceLib.tinymceMod.EventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusBlurEvent extends Event {
  var blurredEditor: tinymceLib.tinymceMod.Editor
}

object FocusBlurEvent {
  @scala.inline
  def apply(
    blurredEditor: tinymceLib.tinymceMod.Editor,
    isDefaultPrevented: js.Function0[scala.Boolean],
    isImmediatePropagationStopped: js.Function0[scala.Boolean],
    isPropagationStopped: js.Function0[scala.Boolean],
    preventDefault: js.Function0[scala.Unit],
    stopImmediatePropagation: js.Function0[scala.Unit],
    stopPropagation: js.Function0[scala.Unit],
    target: java.lang.String,
    `type`: java.lang.String
  ): FocusBlurEvent = {
    val __obj = js.Dynamic.literal(blurredEditor = blurredEditor, isDefaultPrevented = isDefaultPrevented, isImmediatePropagationStopped = isImmediatePropagationStopped, isPropagationStopped = isPropagationStopped, preventDefault = preventDefault, stopImmediatePropagation = stopImmediatePropagation, stopPropagation = stopPropagation, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[FocusBlurEvent]
  }
}


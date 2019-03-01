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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("blurredEditor")(blurredEditor)
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("isImmediatePropagationStopped")(isImmediatePropagationStopped)
    __obj.updateDynamic("isPropagationStopped")(isPropagationStopped)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("stopImmediatePropagation")(stopImmediatePropagation)
    __obj.updateDynamic("stopPropagation")(stopPropagation)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[FocusBlurEvent]
  }
}


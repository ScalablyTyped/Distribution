package typings.wordpressEditor.postPublishButtonMod.PostPublishButton

import typings.wordpressEditor.wordpressEditorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToggleProps
  extends BaseProps
     with Props {
  var isToggle: `true`
  def onToggle(): Unit
}

object ToggleProps {
  @scala.inline
  def apply(
    isToggle: `true`,
    onToggle: () => Unit,
    focusOnMount: js.UndefOr[Boolean] = js.undefined,
    forceIsDirty: js.UndefOr[Boolean] = js.undefined,
    forceIsSaving: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined
  ): ToggleProps = {
    val __obj = js.Dynamic.literal(isToggle = isToggle.asInstanceOf[js.Any], onToggle = js.Any.fromFunction0(onToggle))
    if (!js.isUndefined(focusOnMount)) __obj.updateDynamic("focusOnMount")(focusOnMount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsDirty)) __obj.updateDynamic("forceIsDirty")(forceIsDirty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsSaving)) __obj.updateDynamic("forceIsSaving")(forceIsSaving.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleProps]
  }
}


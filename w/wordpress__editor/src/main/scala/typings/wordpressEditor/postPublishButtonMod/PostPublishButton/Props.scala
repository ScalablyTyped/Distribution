package typings.wordpressEditor.postPublishButtonMod.PostPublishButton

import typings.wordpressEditor.wordpressEditorBooleans.`false`
import typings.wordpressEditor.wordpressEditorBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressEditor.postPublishButtonMod.PostPublishButton.SubmitProps
  - typings.wordpressEditor.postPublishButtonMod.PostPublishButton.ToggleProps
*/
trait Props extends js.Object

object Props {
  @scala.inline
  def SubmitProps(
    focusOnMount: js.UndefOr[Boolean] = js.undefined,
    forceIsDirty: js.UndefOr[Boolean] = js.undefined,
    forceIsSaving: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    isToggle: `false` = null,
    onSubmit: () => Unit = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focusOnMount)) __obj.updateDynamic("focusOnMount")(focusOnMount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsDirty)) __obj.updateDynamic("forceIsDirty")(forceIsDirty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsSaving)) __obj.updateDynamic("forceIsSaving")(forceIsSaving.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    if (isToggle != null) __obj.updateDynamic("isToggle")(isToggle.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction0(onSubmit))
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  def ToggleProps(
    isToggle: `true`,
    onToggle: () => Unit,
    focusOnMount: js.UndefOr[Boolean] = js.undefined,
    forceIsDirty: js.UndefOr[Boolean] = js.undefined,
    forceIsSaving: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(isToggle = isToggle.asInstanceOf[js.Any], onToggle = js.Any.fromFunction0(onToggle))
    if (!js.isUndefined(focusOnMount)) __obj.updateDynamic("focusOnMount")(focusOnMount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsDirty)) __obj.updateDynamic("forceIsDirty")(forceIsDirty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsSaving)) __obj.updateDynamic("forceIsSaving")(forceIsSaving.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}


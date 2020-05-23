package typings.wordpressEditor.postPublishButtonMod.PostPublishButton

import typings.wordpressEditor.wordpressEditorBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubmitProps
  extends BaseProps
     with Props {
  var isToggle: js.UndefOr[`false`] = js.undefined
  var onSubmit: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SubmitProps {
  @scala.inline
  def apply(
    focusOnMount: js.UndefOr[Boolean] = js.undefined,
    forceIsDirty: js.UndefOr[Boolean] = js.undefined,
    forceIsSaving: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined,
    isToggle: `false` = null,
    onSubmit: () => Unit = null
  ): SubmitProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focusOnMount)) __obj.updateDynamic("focusOnMount")(focusOnMount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsDirty)) __obj.updateDynamic("forceIsDirty")(forceIsDirty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsSaving)) __obj.updateDynamic("forceIsSaving")(forceIsSaving.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    if (isToggle != null) __obj.updateDynamic("isToggle")(isToggle.asInstanceOf[js.Any])
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction0(onSubmit))
    __obj.asInstanceOf[SubmitProps]
  }
}


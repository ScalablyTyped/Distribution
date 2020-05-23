package typings.wordpressEditor.postPublishButtonMod.PostPublishButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseProps extends js.Object {
  var focusOnMount: js.UndefOr[Boolean] = js.undefined
  var forceIsDirty: js.UndefOr[Boolean] = js.undefined
  var forceIsSaving: js.UndefOr[Boolean] = js.undefined
  var isOpen: js.UndefOr[Boolean] = js.undefined
}

object BaseProps {
  @scala.inline
  def apply(
    focusOnMount: js.UndefOr[Boolean] = js.undefined,
    forceIsDirty: js.UndefOr[Boolean] = js.undefined,
    forceIsSaving: js.UndefOr[Boolean] = js.undefined,
    isOpen: js.UndefOr[Boolean] = js.undefined
  ): BaseProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(focusOnMount)) __obj.updateDynamic("focusOnMount")(focusOnMount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsDirty)) __obj.updateDynamic("forceIsDirty")(forceIsDirty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsSaving)) __obj.updateDynamic("forceIsSaving")(forceIsSaving.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOpen)) __obj.updateDynamic("isOpen")(isOpen.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseProps]
  }
}


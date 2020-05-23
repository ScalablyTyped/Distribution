package typings.wordpressEditor.postSavedStateMod.PostSavedState

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var forceIsDirty: js.UndefOr[Boolean] = js.undefined
  var forceIsSaving: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    forceIsDirty: js.UndefOr[Boolean] = js.undefined,
    forceIsSaving: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceIsDirty)) __obj.updateDynamic("forceIsDirty")(forceIsDirty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsSaving)) __obj.updateDynamic("forceIsSaving")(forceIsSaving.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}


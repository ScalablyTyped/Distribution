package typings.wordpressEditor.labelMod.PostPublishButtonLabel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var forceIsSaving: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(forceIsSaving: js.UndefOr[Boolean] = js.undefined): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceIsSaving)) __obj.updateDynamic("forceIsSaving")(forceIsSaving.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}


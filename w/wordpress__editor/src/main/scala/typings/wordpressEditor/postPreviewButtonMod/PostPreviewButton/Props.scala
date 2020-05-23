package typings.wordpressEditor.postPreviewButtonMod.PostPreviewButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var forceIsAutosaveable: js.UndefOr[Boolean] = js.undefined
  var forcePreviewLink: js.UndefOr[String] = js.undefined
}

object Props {
  @scala.inline
  def apply(forceIsAutosaveable: js.UndefOr[Boolean] = js.undefined, forcePreviewLink: String = null): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(forceIsAutosaveable)) __obj.updateDynamic("forceIsAutosaveable")(forceIsAutosaveable.get.asInstanceOf[js.Any])
    if (forcePreviewLink != null) __obj.updateDynamic("forcePreviewLink")(forcePreviewLink.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}


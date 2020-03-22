package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitVideoOptions extends js.Object {
  var automute: js.UndefOr[Boolean] = js.undefined
  var autoplay: js.UndefOr[Boolean | String] = js.undefined
}

object UIkitVideoOptions {
  @scala.inline
  def apply(automute: js.UndefOr[Boolean] = js.undefined, autoplay: Boolean | String = null): UIkitVideoOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automute)) __obj.updateDynamic("automute")(automute.asInstanceOf[js.Any])
    if (autoplay != null) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitVideoOptions]
  }
}


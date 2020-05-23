package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitIconOptions extends js.Object {
  var icon: js.UndefOr[String] = js.undefined
  var ratio: js.UndefOr[Double] = js.undefined
}

object UIkitIconOptions {
  @scala.inline
  def apply(icon: String = null, ratio: js.UndefOr[Double] = js.undefined): UIkitIconOptions = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(ratio)) __obj.updateDynamic("ratio")(ratio.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitIconOptions]
  }
}


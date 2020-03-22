package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitCoverOptions extends js.Object {
  var automute: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object UIkitCoverOptions {
  @scala.inline
  def apply(
    automute: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    width: Int | Double = null
  ): UIkitCoverOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automute)) __obj.updateDynamic("automute")(automute.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitCoverOptions]
  }
}


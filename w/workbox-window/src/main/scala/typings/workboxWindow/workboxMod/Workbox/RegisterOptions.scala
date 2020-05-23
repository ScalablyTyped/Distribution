package typings.workboxWindow.workboxMod.Workbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterOptions extends js.Object {
  var immediate: js.UndefOr[Boolean] = js.undefined
}

object RegisterOptions {
  @scala.inline
  def apply(immediate: js.UndefOr[Boolean] = js.undefined): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(immediate)) __obj.updateDynamic("immediate")(immediate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterOptions]
  }
}


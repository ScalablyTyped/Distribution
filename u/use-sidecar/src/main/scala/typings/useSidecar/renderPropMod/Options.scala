package typings.useSidecar.renderPropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var pure: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(pure: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pure)) __obj.updateDynamic("pure")(pure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


package typings.useSidecar.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideCarMediumOptions extends js.Object {
  var async: js.UndefOr[Boolean] = js.undefined
  var ssr: js.UndefOr[Boolean] = js.undefined
}

object SideCarMediumOptions {
  @scala.inline
  def apply(async: js.UndefOr[Boolean] = js.undefined, ssr: js.UndefOr[Boolean] = js.undefined): SideCarMediumOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async.asInstanceOf[js.Any])
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideCarMediumOptions]
  }
}


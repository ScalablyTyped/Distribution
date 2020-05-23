package typings.styledComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuppressMultiMountWarning extends js.Object {
  var suppressMultiMountWarning: js.UndefOr[Boolean] = js.undefined
}

object SuppressMultiMountWarning {
  @scala.inline
  def apply(suppressMultiMountWarning: js.UndefOr[Boolean] = js.undefined): SuppressMultiMountWarning = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(suppressMultiMountWarning)) __obj.updateDynamic("suppressMultiMountWarning")(suppressMultiMountWarning.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuppressMultiMountWarning]
  }
}


package typings.styledComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSuppressMultiMountWarning extends js.Object {
  var suppressMultiMountWarning: js.UndefOr[Boolean] = js.undefined
}

object AnonSuppressMultiMountWarning {
  @scala.inline
  def apply(suppressMultiMountWarning: js.UndefOr[Boolean] = js.undefined): AnonSuppressMultiMountWarning = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(suppressMultiMountWarning)) __obj.updateDynamic("suppressMultiMountWarning")(suppressMultiMountWarning.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSuppressMultiMountWarning]
  }
}


package typings.wrench

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreserve extends js.Object {
  var preserve: js.UndefOr[Boolean] = js.undefined
}

object AnonPreserve {
  @scala.inline
  def apply(preserve: js.UndefOr[Boolean] = js.undefined): AnonPreserve = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreserve]
  }
}


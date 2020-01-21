package typings.vanillaSwipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPassiveUndefined extends js.Object {
  var passive: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonPassiveUndefined {
  @scala.inline
  def apply(passive: js.UndefOr[scala.Nothing] = js.undefined): AnonPassiveUndefined = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPassiveUndefined]
  }
}


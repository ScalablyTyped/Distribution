package typings.vanillaDashSwipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PassiveUndefined extends js.Object {
  var passive: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_PassiveUndefined {
  @scala.inline
  def apply(passive: js.UndefOr[scala.Nothing] = js.undefined): Anon_PassiveUndefined = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PassiveUndefined]
  }
}


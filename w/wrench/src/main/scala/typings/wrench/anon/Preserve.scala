package typings.wrench.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Preserve extends js.Object {
  var preserve: js.UndefOr[Boolean] = js.undefined
}

object Preserve {
  @scala.inline
  def apply(preserve: js.UndefOr[Boolean] = js.undefined): Preserve = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preserve]
  }
}


package typings.wrench

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Preserve extends js.Object {
  var preserve: js.UndefOr[Boolean] = js.undefined
}

object Anon_Preserve {
  @scala.inline
  def apply(preserve: js.UndefOr[Boolean] = js.undefined): Anon_Preserve = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Preserve]
  }
}


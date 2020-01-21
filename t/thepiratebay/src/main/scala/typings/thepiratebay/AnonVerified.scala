package typings.thepiratebay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVerified extends js.Object {
  var verified: js.UndefOr[Boolean] = js.undefined
}

object AnonVerified {
  @scala.inline
  def apply(verified: js.UndefOr[Boolean] = js.undefined): AnonVerified = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVerified]
  }
}


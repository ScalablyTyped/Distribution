package typings.thepiratebay.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Verified extends js.Object {
  var verified: js.UndefOr[Boolean] = js.undefined
}

object Verified {
  @scala.inline
  def apply(verified: js.UndefOr[Boolean] = js.undefined): Verified = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verified]
  }
}


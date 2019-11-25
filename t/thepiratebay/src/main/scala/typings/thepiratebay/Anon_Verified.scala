package typings.thepiratebay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Verified extends js.Object {
  var verified: js.UndefOr[Boolean] = js.undefined
}

object Anon_Verified {
  @scala.inline
  def apply(verified: js.UndefOr[Boolean] = js.undefined): Anon_Verified = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(verified)) __obj.updateDynamic("verified")(verified.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Verified]
  }
}


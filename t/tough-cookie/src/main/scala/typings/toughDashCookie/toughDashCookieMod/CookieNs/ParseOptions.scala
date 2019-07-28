package typings.toughDashCookie.toughDashCookieMod.CookieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var loose: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(loose: js.UndefOr[Boolean] = js.undefined): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loose)) __obj.updateDynamic("loose")(loose)
    __obj.asInstanceOf[ParseOptions]
  }
}


package typings
package toughDashCookieLib.toughDashCookieMod.CookieJarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetCookieOptions extends js.Object {
  var http: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreError: js.UndefOr[scala.Boolean] = js.undefined
  var now: js.UndefOr[stdLib.Date] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object SetCookieOptions {
  @scala.inline
  def apply(
    http: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreError: js.UndefOr[scala.Boolean] = js.undefined,
    now: stdLib.Date = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): SetCookieOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(http)) __obj.updateDynamic("http")(http)
    if (!js.isUndefined(ignoreError)) __obj.updateDynamic("ignoreError")(ignoreError)
    if (now != null) __obj.updateDynamic("now")(now)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[SetCookieOptions]
  }
}


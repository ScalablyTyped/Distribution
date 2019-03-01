package typings
package toughDashCookieLib.toughDashCookieMod.CookieJarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCookiesOptions extends js.Object {
  var allPoints: js.UndefOr[scala.Boolean] = js.undefined
  var date: js.UndefOr[stdLib.Date] = js.undefined
  var expire: js.UndefOr[scala.Boolean] = js.undefined
  var http: js.UndefOr[scala.Boolean] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object GetCookiesOptions {
  @scala.inline
  def apply(
    allPoints: js.UndefOr[scala.Boolean] = js.undefined,
    date: stdLib.Date = null,
    expire: js.UndefOr[scala.Boolean] = js.undefined,
    http: js.UndefOr[scala.Boolean] = js.undefined,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): GetCookiesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allPoints)) __obj.updateDynamic("allPoints")(allPoints)
    if (date != null) __obj.updateDynamic("date")(date)
    if (!js.isUndefined(expire)) __obj.updateDynamic("expire")(expire)
    if (!js.isUndefined(http)) __obj.updateDynamic("http")(http)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[GetCookiesOptions]
  }
}


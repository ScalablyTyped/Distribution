package typings.toughDashCookie.toughDashCookieMod.CookieJar

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCookiesOptions extends js.Object {
  var allPoints: js.UndefOr[Boolean] = js.undefined
  var date: js.UndefOr[Date] = js.undefined
  var expire: js.UndefOr[Boolean] = js.undefined
  var http: js.UndefOr[Boolean] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
}

object GetCookiesOptions {
  @scala.inline
  def apply(
    allPoints: js.UndefOr[Boolean] = js.undefined,
    date: Date = null,
    expire: js.UndefOr[Boolean] = js.undefined,
    http: js.UndefOr[Boolean] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined
  ): GetCookiesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allPoints)) __obj.updateDynamic("allPoints")(allPoints.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(expire)) __obj.updateDynamic("expire")(expire.asInstanceOf[js.Any])
    if (!js.isUndefined(http)) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCookiesOptions]
  }
}


package typings.toughCookie.mod.CookieJar

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCookiesOptions extends js.Object {
  var allPaths: js.UndefOr[Boolean] = js.undefined
  var expire: js.UndefOr[Boolean] = js.undefined
  var http: js.UndefOr[Boolean] = js.undefined
  var now: js.UndefOr[Date] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
}

object GetCookiesOptions {
  @scala.inline
  def apply(
    allPaths: js.UndefOr[Boolean] = js.undefined,
    expire: js.UndefOr[Boolean] = js.undefined,
    http: js.UndefOr[Boolean] = js.undefined,
    now: Date = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): GetCookiesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allPaths)) __obj.updateDynamic("allPaths")(allPaths.asInstanceOf[js.Any])
    if (!js.isUndefined(expire)) __obj.updateDynamic("expire")(expire.asInstanceOf[js.Any])
    if (!js.isUndefined(http)) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (now != null) __obj.updateDynamic("now")(now.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCookiesOptions]
  }
}


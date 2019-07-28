package typings.websocket.websocketMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICookie extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[Date] = js.undefined
  var httponly: js.UndefOr[Boolean] = js.undefined
  var maxage: js.UndefOr[Double] = js.undefined
  var name: String
  var path: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var value: String
}

object ICookie {
  @scala.inline
  def apply(
    name: String,
    value: String,
    domain: String = null,
    expires: Date = null,
    httponly: js.UndefOr[Boolean] = js.undefined,
    maxage: Int | Double = null,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): ICookie = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (!js.isUndefined(httponly)) __obj.updateDynamic("httponly")(httponly)
    if (maxage != null) __obj.updateDynamic("maxage")(maxage.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[ICookie]
  }
}


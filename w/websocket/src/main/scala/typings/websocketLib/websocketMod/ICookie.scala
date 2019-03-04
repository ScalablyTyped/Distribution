package typings
package websocketLib.websocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICookie extends js.Object {
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var expires: js.UndefOr[stdLib.Date] = js.undefined
  var httponly: js.UndefOr[scala.Boolean] = js.undefined
  var maxage: js.UndefOr[scala.Double] = js.undefined
  var name: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var value: java.lang.String
}

object ICookie {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: java.lang.String,
    domain: java.lang.String = null,
    expires: stdLib.Date = null,
    httponly: js.UndefOr[scala.Boolean] = js.undefined,
    maxage: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
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


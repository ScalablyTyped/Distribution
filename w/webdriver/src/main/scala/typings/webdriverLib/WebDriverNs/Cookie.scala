package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var expiry: js.UndefOr[scala.Double] = js.undefined
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  var value: java.lang.String
}

object Cookie {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: java.lang.String,
    expiry: scala.Int | scala.Double = null,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): Cookie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[Cookie]
  }
}


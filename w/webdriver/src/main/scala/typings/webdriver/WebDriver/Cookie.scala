package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var expiry: js.UndefOr[Double] = js.undefined
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var name: String
  var path: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var value: String
}

object Cookie {
  @scala.inline
  def apply(
    name: String,
    value: String,
    expiry: Int | Double = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): Cookie = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[Cookie]
  }
}


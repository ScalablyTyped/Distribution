package typings.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expiry: js.UndefOr[Double] = js.undefined
  var isHttpOnly: js.UndefOr[Boolean] = js.undefined
  var isSecure: js.UndefOr[Boolean] = js.undefined
  var name: String
  var path: js.UndefOr[String] = js.undefined
  var value: String
}

object Cookie {
  @scala.inline
  def apply(
    name: String,
    value: String,
    domain: String = null,
    expiry: js.UndefOr[Double] = js.undefined,
    isHttpOnly: js.UndefOr[Boolean] = js.undefined,
    isSecure: js.UndefOr[Boolean] = js.undefined,
    path: String = null
  ): Cookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (!js.isUndefined(expiry)) __obj.updateDynamic("expiry")(expiry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isHttpOnly)) __obj.updateDynamic("isHttpOnly")(isHttpOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure.get.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
}


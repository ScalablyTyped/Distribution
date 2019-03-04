package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var expiry: js.UndefOr[scala.Double] = js.undefined
  var isHttpOnly: js.UndefOr[scala.Boolean] = js.undefined
  var isSecure: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
}

object Cookie {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: java.lang.String,
    domain: java.lang.String = null,
    expiry: scala.Int | scala.Double = null,
    isHttpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    isSecure: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null
  ): Cookie = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (!js.isUndefined(isHttpOnly)) __obj.updateDynamic("isHttpOnly")(isHttpOnly)
    if (!js.isUndefined(isSecure)) __obj.updateDynamic("isSecure")(isSecure)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Cookie]
  }
}


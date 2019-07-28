package typings.swaggerDashExpressDashMiddleware.swaggerDashExpressDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieParserOptionItem extends js.Object {
  /**
    *  an object that is passed to cookie.parse as the second option
    */
  var options: js.UndefOr[js.Any] = js.undefined
  /**
    * A string or array used for signing cookies.
    * This is optional and if not specified, will not parse signed cookies.
    * If a string is provided, this is used as the secret.
    * If an array is provided, an attempt will be made to unsign the cookie with each secret in order.
    */
  var secret: js.UndefOr[String | js.Array[String]] = js.undefined
}

object CookieParserOptionItem {
  @scala.inline
  def apply(options: js.Any = null, secret: String | js.Array[String] = null): CookieParserOptionItem = {
    val __obj = js.Dynamic.literal()
    if (options != null) __obj.updateDynamic("options")(options)
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieParserOptionItem]
  }
}


package typings.xmlrpc.mod

import org.scalablytyped.runtime.StringDictionary
import typings.xmlrpc.AnonPass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var basic_auth: js.UndefOr[AnonPass] = js.undefined
  var cookies: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    basic_auth: AnonPass = null,
    cookies: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String] = null,
    host: String = null,
    method: String = null,
    path: String = null,
    port: Int | Double = null,
    url: String = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (basic_auth != null) __obj.updateDynamic("basic_auth")(basic_auth.asInstanceOf[js.Any])
    if (!js.isUndefined(cookies)) __obj.updateDynamic("cookies")(cookies.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}


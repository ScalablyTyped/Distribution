package typings.xmlrpc.xmlrpcMod

import org.scalablytyped.runtime.StringDictionary
import typings.xmlrpc.Anon_Pass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var basic_auth: js.UndefOr[Anon_Pass] = js.undefined
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
    basic_auth: Anon_Pass = null,
    cookies: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String] = null,
    host: String = null,
    method: String = null,
    path: String = null,
    port: Int | Double = null,
    url: String = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (basic_auth != null) __obj.updateDynamic("basic_auth")(basic_auth)
    if (!js.isUndefined(cookies)) __obj.updateDynamic("cookies")(cookies)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (method != null) __obj.updateDynamic("method")(method)
    if (path != null) __obj.updateDynamic("path")(path)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ClientOptions]
  }
}


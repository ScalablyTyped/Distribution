package typings
package xmlrpcLib.xmlrpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var basic_auth: js.UndefOr[xmlrpcLib.Anon_Pass] = js.undefined
  var cookies: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    basic_auth: xmlrpcLib.Anon_Pass = null,
    cookies: js.UndefOr[scala.Boolean] = js.undefined,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    host: java.lang.String = null,
    method: java.lang.String = null,
    path: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    url: java.lang.String = null
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


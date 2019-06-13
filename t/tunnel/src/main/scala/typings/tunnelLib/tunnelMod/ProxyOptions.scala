package typings
package tunnelLib.tunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var host: java.lang.String
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var port: scala.Double
  var proxyAuth: js.UndefOr[java.lang.String] = js.undefined
}

object ProxyOptions {
  @scala.inline
  def apply(
    host: java.lang.String,
    port: scala.Double,
    headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    localAddress: java.lang.String = null,
    proxyAuth: java.lang.String = null
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal(host = host, port = port)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (proxyAuth != null) __obj.updateDynamic("proxyAuth")(proxyAuth)
    __obj.asInstanceOf[ProxyOptions]
  }
}


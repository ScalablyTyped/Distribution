package typings
package tunnelLib.tunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  var headers: org.scalablytyped.runtime.StringDictionary[js.Any]
  var host: js.UndefOr[java.lang.String] = js.undefined
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var proxyAuth: js.UndefOr[java.lang.String] = js.undefined
}

object ProxyOptions {
  @scala.inline
  def apply(
    headers: org.scalablytyped.runtime.StringDictionary[js.Any],
    host: java.lang.String = null,
    localAddress: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    proxyAuth: java.lang.String = null
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal(headers = headers)
    if (host != null) __obj.updateDynamic("host")(host)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (proxyAuth != null) __obj.updateDynamic("proxyAuth")(proxyAuth)
    __obj.asInstanceOf[ProxyOptions]
  }
}


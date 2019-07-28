package typings.tunnel.tunnelMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var host: String
  var localAddress: js.UndefOr[String] = js.undefined
  var port: Double
  var proxyAuth: js.UndefOr[String] = js.undefined
}

object ProxyOptions {
  @scala.inline
  def apply(
    host: String,
    port: Double,
    headers: StringDictionary[js.Any] = null,
    localAddress: String = null,
    proxyAuth: String = null
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal(host = host, port = port)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (proxyAuth != null) __obj.updateDynamic("proxyAuth")(proxyAuth)
    __obj.asInstanceOf[ProxyOptions]
  }
}


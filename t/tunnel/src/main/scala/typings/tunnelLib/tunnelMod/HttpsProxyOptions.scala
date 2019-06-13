package typings
package tunnelLib.tunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsProxyOptions extends ProxyOptions {
  var ca: js.UndefOr[js.Array[nodeLib.Buffer]] = js.undefined
  var cert: js.UndefOr[nodeLib.Buffer] = js.undefined
  var key: js.UndefOr[nodeLib.Buffer] = js.undefined
  var servername: js.UndefOr[java.lang.String] = js.undefined
}

object HttpsProxyOptions {
  @scala.inline
  def apply(
    host: java.lang.String,
    port: scala.Double,
    ca: js.Array[nodeLib.Buffer] = null,
    cert: nodeLib.Buffer = null,
    headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    key: nodeLib.Buffer = null,
    localAddress: java.lang.String = null,
    proxyAuth: java.lang.String = null,
    servername: java.lang.String = null
  ): HttpsProxyOptions = {
    val __obj = js.Dynamic.literal(host = host, port = port)
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (key != null) __obj.updateDynamic("key")(key)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (proxyAuth != null) __obj.updateDynamic("proxyAuth")(proxyAuth)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    __obj.asInstanceOf[HttpsProxyOptions]
  }
}


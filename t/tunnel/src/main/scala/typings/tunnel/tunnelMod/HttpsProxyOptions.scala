package typings.tunnel.tunnelMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsProxyOptions extends ProxyOptions {
  var ca: js.UndefOr[js.Array[Buffer]] = js.undefined
  var cert: js.UndefOr[Buffer] = js.undefined
  var key: js.UndefOr[Buffer] = js.undefined
  var servername: js.UndefOr[String] = js.undefined
}

object HttpsProxyOptions {
  @scala.inline
  def apply(
    host: String,
    port: Double,
    ca: js.Array[Buffer] = null,
    cert: Buffer = null,
    headers: StringDictionary[js.Any] = null,
    key: Buffer = null,
    localAddress: String = null,
    proxyAuth: String = null,
    servername: String = null
  ): HttpsProxyOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (proxyAuth != null) __obj.updateDynamic("proxyAuth")(proxyAuth.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpsProxyOptions]
  }
}


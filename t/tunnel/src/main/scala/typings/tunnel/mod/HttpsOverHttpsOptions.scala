package typings.tunnel.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsOverHttpsOptions extends HttpsOverHttpOptions {
  @JSName("proxy")
  var proxy_HttpsOverHttpsOptions: js.UndefOr[HttpsProxyOptions] = js.undefined
}

object HttpsOverHttpsOptions {
  @scala.inline
  def apply(
    ca: js.Array[Buffer] = null,
    cert: Buffer = null,
    key: Buffer = null,
    maxSockets: Int | Double = null,
    proxy: HttpsProxyOptions = null
  ): HttpsOverHttpsOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpsOverHttpsOptions]
  }
}


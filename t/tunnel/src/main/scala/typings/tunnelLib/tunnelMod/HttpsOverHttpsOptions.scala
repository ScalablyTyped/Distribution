package typings
package tunnelLib.tunnelMod

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
    ca: js.Array[nodeLib.Buffer] = null,
    cert: nodeLib.Buffer = null,
    key: nodeLib.Buffer = null,
    maxSockets: scala.Int | scala.Double = null,
    proxy: HttpsProxyOptions = null
  ): HttpsOverHttpsOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[HttpsOverHttpsOptions]
  }
}


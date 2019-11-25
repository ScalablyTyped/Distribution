package typings.tunnel.tunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOverHttpsOptions extends HttpOptions {
  @JSName("proxy")
  var proxy_HttpOverHttpsOptions: js.UndefOr[HttpsProxyOptions] = js.undefined
}

object HttpOverHttpsOptions {
  @scala.inline
  def apply(maxSockets: Int | Double = null, proxy: HttpsProxyOptions = null): HttpOverHttpsOptions = {
    val __obj = js.Dynamic.literal()
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOverHttpsOptions]
  }
}


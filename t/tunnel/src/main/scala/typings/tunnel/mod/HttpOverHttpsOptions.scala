package typings.tunnel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOverHttpsOptions extends HttpOptions {
  @JSName("proxy")
  var proxy_HttpOverHttpsOptions: js.UndefOr[HttpsProxyOptions] = js.undefined
}

object HttpOverHttpsOptions {
  @scala.inline
  def apply(maxSockets: js.UndefOr[Double] = js.undefined, proxy: HttpsProxyOptions = null): HttpOverHttpsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxSockets)) __obj.updateDynamic("maxSockets")(maxSockets.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOverHttpsOptions]
  }
}


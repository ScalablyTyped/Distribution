package typings.tunnel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOptions extends js.Object {
  var maxSockets: js.UndefOr[Double] = js.undefined
  var proxy: js.UndefOr[ProxyOptions] = js.undefined
}

object HttpOptions {
  @scala.inline
  def apply(maxSockets: js.UndefOr[Double] = js.undefined, proxy: ProxyOptions = null): HttpOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxSockets)) __obj.updateDynamic("maxSockets")(maxSockets.get.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpOptions]
  }
}


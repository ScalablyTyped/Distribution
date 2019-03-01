package typings
package tunnelLib.tunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpOptions extends js.Object {
  var maxSockets: js.UndefOr[scala.Double] = js.undefined
  var proxy: js.UndefOr[ProxyOptions] = js.undefined
}

object HttpOptions {
  @scala.inline
  def apply(maxSockets: scala.Int | scala.Double = null, proxy: ProxyOptions = null): HttpOptions = {
    val __obj = js.Dynamic.literal()
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[HttpOptions]
  }
}


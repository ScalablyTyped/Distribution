package typings
package tunnelLib.tunnelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsOverHttpOptions extends HttpOptions {
  var ca: js.UndefOr[js.Array[nodeLib.Buffer]] = js.undefined
  var cert: js.UndefOr[nodeLib.Buffer] = js.undefined
  var key: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object HttpsOverHttpOptions {
  @scala.inline
  def apply(
    ca: js.Array[nodeLib.Buffer] = null,
    cert: nodeLib.Buffer = null,
    key: nodeLib.Buffer = null,
    maxSockets: scala.Int | scala.Double = null,
    proxy: ProxyOptions = null
  ): HttpsOverHttpOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca)
    if (cert != null) __obj.updateDynamic("cert")(cert)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxSockets != null) __obj.updateDynamic("maxSockets")(maxSockets.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    __obj.asInstanceOf[HttpsOverHttpOptions]
  }
}


package typings.tunnel.tunnelMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpsOverHttpOptions extends HttpOptions {
  var ca: js.UndefOr[js.Array[Buffer]] = js.undefined
  var cert: js.UndefOr[Buffer] = js.undefined
  var key: js.UndefOr[Buffer] = js.undefined
}

object HttpsOverHttpOptions {
  @scala.inline
  def apply(
    ca: js.Array[Buffer] = null,
    cert: Buffer = null,
    key: Buffer = null,
    maxSockets: Int | Double = null,
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


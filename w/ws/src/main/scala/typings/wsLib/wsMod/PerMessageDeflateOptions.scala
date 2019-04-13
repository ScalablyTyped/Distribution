package typings
package wsLib.wsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerMessageDeflateOptions extends js.Object {
  var clientMaxWindowBits: js.UndefOr[scala.Double] = js.undefined
  var clientNoContextTakeover: js.UndefOr[scala.Boolean] = js.undefined
  var concurrencyLimit: js.UndefOr[scala.Double] = js.undefined
  var serverMaxWindowBits: js.UndefOr[scala.Double] = js.undefined
  var serverNoContextTakeover: js.UndefOr[scala.Boolean] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
  var zlibDeflateOptions: js.UndefOr[wsLib.Anon_ChunkSize] = js.undefined
}

object PerMessageDeflateOptions {
  @scala.inline
  def apply(
    clientMaxWindowBits: scala.Int | scala.Double = null,
    clientNoContextTakeover: js.UndefOr[scala.Boolean] = js.undefined,
    concurrencyLimit: scala.Int | scala.Double = null,
    serverMaxWindowBits: scala.Int | scala.Double = null,
    serverNoContextTakeover: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null,
    zlibDeflateOptions: wsLib.Anon_ChunkSize = null
  ): PerMessageDeflateOptions = {
    val __obj = js.Dynamic.literal()
    if (clientMaxWindowBits != null) __obj.updateDynamic("clientMaxWindowBits")(clientMaxWindowBits.asInstanceOf[js.Any])
    if (!js.isUndefined(clientNoContextTakeover)) __obj.updateDynamic("clientNoContextTakeover")(clientNoContextTakeover)
    if (concurrencyLimit != null) __obj.updateDynamic("concurrencyLimit")(concurrencyLimit.asInstanceOf[js.Any])
    if (serverMaxWindowBits != null) __obj.updateDynamic("serverMaxWindowBits")(serverMaxWindowBits.asInstanceOf[js.Any])
    if (!js.isUndefined(serverNoContextTakeover)) __obj.updateDynamic("serverNoContextTakeover")(serverNoContextTakeover)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (zlibDeflateOptions != null) __obj.updateDynamic("zlibDeflateOptions")(zlibDeflateOptions)
    __obj.asInstanceOf[PerMessageDeflateOptions]
  }
}


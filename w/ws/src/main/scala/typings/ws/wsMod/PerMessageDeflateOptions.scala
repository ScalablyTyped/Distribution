package typings.ws.wsMod

import typings.node.zlibMod.ZlibOptions
import typings.ws.Anon_ChunkSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerMessageDeflateOptions extends js.Object {
  var clientMaxWindowBits: js.UndefOr[Double] = js.undefined
  var clientNoContextTakeover: js.UndefOr[Boolean] = js.undefined
  var concurrencyLimit: js.UndefOr[Double] = js.undefined
  var serverMaxWindowBits: js.UndefOr[Double] = js.undefined
  var serverNoContextTakeover: js.UndefOr[Boolean] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var zlibDeflateOptions: js.UndefOr[Anon_ChunkSize] = js.undefined
  var zlibInflateOptions: js.UndefOr[ZlibOptions] = js.undefined
}

object PerMessageDeflateOptions {
  @scala.inline
  def apply(
    clientMaxWindowBits: Int | Double = null,
    clientNoContextTakeover: js.UndefOr[Boolean] = js.undefined,
    concurrencyLimit: Int | Double = null,
    serverMaxWindowBits: Int | Double = null,
    serverNoContextTakeover: js.UndefOr[Boolean] = js.undefined,
    threshold: Int | Double = null,
    zlibDeflateOptions: Anon_ChunkSize = null,
    zlibInflateOptions: ZlibOptions = null
  ): PerMessageDeflateOptions = {
    val __obj = js.Dynamic.literal()
    if (clientMaxWindowBits != null) __obj.updateDynamic("clientMaxWindowBits")(clientMaxWindowBits.asInstanceOf[js.Any])
    if (!js.isUndefined(clientNoContextTakeover)) __obj.updateDynamic("clientNoContextTakeover")(clientNoContextTakeover.asInstanceOf[js.Any])
    if (concurrencyLimit != null) __obj.updateDynamic("concurrencyLimit")(concurrencyLimit.asInstanceOf[js.Any])
    if (serverMaxWindowBits != null) __obj.updateDynamic("serverMaxWindowBits")(serverMaxWindowBits.asInstanceOf[js.Any])
    if (!js.isUndefined(serverNoContextTakeover)) __obj.updateDynamic("serverNoContextTakeover")(serverNoContextTakeover.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (zlibDeflateOptions != null) __obj.updateDynamic("zlibDeflateOptions")(zlibDeflateOptions.asInstanceOf[js.Any])
    if (zlibInflateOptions != null) __obj.updateDynamic("zlibInflateOptions")(zlibInflateOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerMessageDeflateOptions]
  }
}


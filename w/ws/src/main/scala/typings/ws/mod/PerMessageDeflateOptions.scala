package typings.ws.mod

import typings.node.zlibMod.ZlibOptions
import typings.ws.anon.ChunkSize
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
  var zlibDeflateOptions: js.UndefOr[ChunkSize] = js.undefined
  var zlibInflateOptions: js.UndefOr[ZlibOptions] = js.undefined
}

object PerMessageDeflateOptions {
  @scala.inline
  def apply(
    clientMaxWindowBits: js.UndefOr[Double] = js.undefined,
    clientNoContextTakeover: js.UndefOr[Boolean] = js.undefined,
    concurrencyLimit: js.UndefOr[Double] = js.undefined,
    serverMaxWindowBits: js.UndefOr[Double] = js.undefined,
    serverNoContextTakeover: js.UndefOr[Boolean] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined,
    zlibDeflateOptions: ChunkSize = null,
    zlibInflateOptions: ZlibOptions = null
  ): PerMessageDeflateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clientMaxWindowBits)) __obj.updateDynamic("clientMaxWindowBits")(clientMaxWindowBits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientNoContextTakeover)) __obj.updateDynamic("clientNoContextTakeover")(clientNoContextTakeover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(concurrencyLimit)) __obj.updateDynamic("concurrencyLimit")(concurrencyLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverMaxWindowBits)) __obj.updateDynamic("serverMaxWindowBits")(serverMaxWindowBits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverNoContextTakeover)) __obj.updateDynamic("serverNoContextTakeover")(serverNoContextTakeover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (zlibDeflateOptions != null) __obj.updateDynamic("zlibDeflateOptions")(zlibDeflateOptions.asInstanceOf[js.Any])
    if (zlibInflateOptions != null) __obj.updateDynamic("zlibInflateOptions")(zlibInflateOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerMessageDeflateOptions]
  }
}


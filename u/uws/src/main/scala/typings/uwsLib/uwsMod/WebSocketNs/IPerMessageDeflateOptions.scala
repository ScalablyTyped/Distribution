package typings
package uwsLib.uwsMod.WebSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPerMessageDeflateOptions extends js.Object {
  var clientMaxWindowBits: js.UndefOr[scala.Double] = js.undefined
  var clientNoContextTakeover: js.UndefOr[scala.Boolean] = js.undefined
  var memLevel: js.UndefOr[scala.Double] = js.undefined
  var serverMaxWindowBits: js.UndefOr[scala.Double] = js.undefined
  var serverNoContextTakeover: js.UndefOr[scala.Boolean] = js.undefined
}

object IPerMessageDeflateOptions {
  @scala.inline
  def apply(
    clientMaxWindowBits: scala.Int | scala.Double = null,
    clientNoContextTakeover: js.UndefOr[scala.Boolean] = js.undefined,
    memLevel: scala.Int | scala.Double = null,
    serverMaxWindowBits: scala.Int | scala.Double = null,
    serverNoContextTakeover: js.UndefOr[scala.Boolean] = js.undefined
  ): IPerMessageDeflateOptions = {
    val __obj = js.Dynamic.literal()
    if (clientMaxWindowBits != null) __obj.updateDynamic("clientMaxWindowBits")(clientMaxWindowBits.asInstanceOf[js.Any])
    if (!js.isUndefined(clientNoContextTakeover)) __obj.updateDynamic("clientNoContextTakeover")(clientNoContextTakeover)
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (serverMaxWindowBits != null) __obj.updateDynamic("serverMaxWindowBits")(serverMaxWindowBits.asInstanceOf[js.Any])
    if (!js.isUndefined(serverNoContextTakeover)) __obj.updateDynamic("serverNoContextTakeover")(serverNoContextTakeover)
    __obj.asInstanceOf[IPerMessageDeflateOptions]
  }
}


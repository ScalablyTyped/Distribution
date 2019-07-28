package typings.uws.uwsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPerMessageDeflateOptions extends js.Object {
  var clientMaxWindowBits: js.UndefOr[Double] = js.undefined
  var clientNoContextTakeover: js.UndefOr[Boolean] = js.undefined
  var memLevel: js.UndefOr[Double] = js.undefined
  var serverMaxWindowBits: js.UndefOr[Double] = js.undefined
  var serverNoContextTakeover: js.UndefOr[Boolean] = js.undefined
}

object IPerMessageDeflateOptions {
  @scala.inline
  def apply(
    clientMaxWindowBits: Int | Double = null,
    clientNoContextTakeover: js.UndefOr[Boolean] = js.undefined,
    memLevel: Int | Double = null,
    serverMaxWindowBits: Int | Double = null,
    serverNoContextTakeover: js.UndefOr[Boolean] = js.undefined
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


package typings.uws.mod

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
    clientMaxWindowBits: js.UndefOr[Double] = js.undefined,
    clientNoContextTakeover: js.UndefOr[Boolean] = js.undefined,
    memLevel: js.UndefOr[Double] = js.undefined,
    serverMaxWindowBits: js.UndefOr[Double] = js.undefined,
    serverNoContextTakeover: js.UndefOr[Boolean] = js.undefined
  ): IPerMessageDeflateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clientMaxWindowBits)) __obj.updateDynamic("clientMaxWindowBits")(clientMaxWindowBits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clientNoContextTakeover)) __obj.updateDynamic("clientNoContextTakeover")(clientNoContextTakeover.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memLevel)) __obj.updateDynamic("memLevel")(memLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverMaxWindowBits)) __obj.updateDynamic("serverMaxWindowBits")(serverMaxWindowBits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverNoContextTakeover)) __obj.updateDynamic("serverNoContextTakeover")(serverNoContextTakeover.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPerMessageDeflateOptions]
  }
}


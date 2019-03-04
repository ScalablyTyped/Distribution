package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignMessageParams extends CommonParams {
  var coin: js.UndefOr[java.lang.String] = js.undefined
  var message: java.lang.String
  var path: java.lang.String | js.Array[scala.Double]
}

object SignMessageParams {
  @scala.inline
  def apply(
    message: java.lang.String,
    path: java.lang.String | js.Array[scala.Double],
    allowSeedlessDevice: js.UndefOr[scala.Boolean] = js.undefined,
    coin: java.lang.String = null,
    device: trezorDashConnectLib.Anon_Instance = null,
    keepSession: js.UndefOr[scala.Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[scala.Boolean] = js.undefined
  ): SignMessageParams = {
    val __obj = js.Dynamic.literal(message = message, path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice)
    if (coin != null) __obj.updateDynamic("coin")(coin)
    if (device != null) __obj.updateDynamic("device")(device)
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession)
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase)
    __obj.asInstanceOf[SignMessageParams]
  }
}


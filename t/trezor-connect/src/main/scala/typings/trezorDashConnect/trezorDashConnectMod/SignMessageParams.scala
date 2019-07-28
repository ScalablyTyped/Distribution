package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.Anon_Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignMessageParams extends CommonParams {
  var coin: js.UndefOr[String] = js.undefined
  var message: String
  var path: String | js.Array[Double]
}

object SignMessageParams {
  @scala.inline
  def apply(
    message: String,
    path: String | js.Array[Double],
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    coin: String = null,
    device: Anon_Instance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
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


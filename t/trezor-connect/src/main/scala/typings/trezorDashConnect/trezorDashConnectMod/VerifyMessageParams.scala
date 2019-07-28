package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.Anon_Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyMessageParams extends CommonParams {
  var address: String
  var coin: String
  var message: String
  var signature: String
}

object VerifyMessageParams {
  @scala.inline
  def apply(
    address: String,
    coin: String,
    message: String,
    signature: String,
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    device: Anon_Instance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  ): VerifyMessageParams = {
    val __obj = js.Dynamic.literal(address = address, coin = coin, message = message, signature = signature)
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice)
    if (device != null) __obj.updateDynamic("device")(device)
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession)
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase)
    __obj.asInstanceOf[VerifyMessageParams]
  }
}


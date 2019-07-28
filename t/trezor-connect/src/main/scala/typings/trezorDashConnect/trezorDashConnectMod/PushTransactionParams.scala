package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.Anon_Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushTransactionParams extends CommonParams {
  var coin: String
  var tx: String
}

object PushTransactionParams {
  @scala.inline
  def apply(
    coin: String,
    tx: String,
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    device: Anon_Instance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  ): PushTransactionParams = {
    val __obj = js.Dynamic.literal(coin = coin, tx = tx)
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice)
    if (device != null) __obj.updateDynamic("device")(device)
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession)
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase)
    __obj.asInstanceOf[PushTransactionParams]
  }
}


package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.Anon_Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComposeTransactionParams extends CommonParams {
  var coin: String
  var outputs: js.Array[Output]
  var push: js.UndefOr[Boolean] = js.undefined
}

object ComposeTransactionParams {
  @scala.inline
  def apply(
    coin: String,
    outputs: js.Array[Output],
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    device: Anon_Instance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    push: js.UndefOr[Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  ): ComposeTransactionParams = {
    val __obj = js.Dynamic.literal(coin = coin, outputs = outputs)
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice)
    if (device != null) __obj.updateDynamic("device")(device)
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase)
    __obj.asInstanceOf[ComposeTransactionParams]
  }
}


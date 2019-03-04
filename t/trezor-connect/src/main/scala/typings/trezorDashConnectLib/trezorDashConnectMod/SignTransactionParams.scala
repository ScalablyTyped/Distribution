package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignTransactionParams extends CommonParams {
  var coin: java.lang.String
  var inputs: js.Array[Input]
  var outputs: js.Array[Output]
  var push: js.UndefOr[scala.Boolean] = js.undefined
}

object SignTransactionParams {
  @scala.inline
  def apply(
    coin: java.lang.String,
    inputs: js.Array[Input],
    outputs: js.Array[Output],
    allowSeedlessDevice: js.UndefOr[scala.Boolean] = js.undefined,
    device: trezorDashConnectLib.Anon_Instance = null,
    keepSession: js.UndefOr[scala.Boolean] = js.undefined,
    push: js.UndefOr[scala.Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[scala.Boolean] = js.undefined
  ): SignTransactionParams = {
    val __obj = js.Dynamic.literal(coin = coin, inputs = inputs, outputs = outputs)
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice)
    if (device != null) __obj.updateDynamic("device")(device)
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession)
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase)
    __obj.asInstanceOf[SignTransactionParams]
  }
}


package typings.trezorConnect.mod

import typings.trezorConnect.AnonInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignTransactionParams extends CommonParams {
  var branchId: js.UndefOr[Double] = js.undefined
  var coin: String
  var expiry: js.UndefOr[Double] = js.undefined
  var inputs: js.Array[Input]
  var locktime: js.UndefOr[Double] = js.undefined
  var outputs: js.Array[Output]
  var push: js.UndefOr[Boolean] = js.undefined
  var refTxs: js.UndefOr[js.Array[RefTransaction]] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object SignTransactionParams {
  @scala.inline
  def apply(
    coin: String,
    inputs: js.Array[Input],
    outputs: js.Array[Output],
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    branchId: Int | Double = null,
    device: AnonInstance = null,
    expiry: Int | Double = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    locktime: Int | Double = null,
    push: js.UndefOr[Boolean] = js.undefined,
    refTxs: js.Array[RefTransaction] = null,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined,
    version: Int | Double = null
  ): SignTransactionParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice.asInstanceOf[js.Any])
    if (branchId != null) __obj.updateDynamic("branchId")(branchId.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession.asInstanceOf[js.Any])
    if (locktime != null) __obj.updateDynamic("locktime")(locktime.asInstanceOf[js.Any])
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    if (refTxs != null) __obj.updateDynamic("refTxs")(refTxs.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignTransactionParams]
  }
}


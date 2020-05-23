package typings.trezorConnect.mod

import typings.trezorConnect.anon.Instance
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
    branchId: js.UndefOr[Double] = js.undefined,
    device: Instance = null,
    expiry: js.UndefOr[Double] = js.undefined,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    locktime: js.UndefOr[Double] = js.undefined,
    push: js.UndefOr[Boolean] = js.undefined,
    refTxs: js.Array[RefTransaction] = null,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined,
    version: js.UndefOr[Double] = js.undefined
  ): SignTransactionParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice.get.asInstanceOf[js.Any])
    if (!js.isUndefined(branchId)) __obj.updateDynamic("branchId")(branchId.get.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(expiry)) __obj.updateDynamic("expiry")(expiry.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession.get.asInstanceOf[js.Any])
    if (!js.isUndefined(locktime)) __obj.updateDynamic("locktime")(locktime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push.get.asInstanceOf[js.Any])
    if (refTxs != null) __obj.updateDynamic("refTxs")(refTxs.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignTransactionParams]
  }
}


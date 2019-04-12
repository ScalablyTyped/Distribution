package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignTransactionParams extends CommonParams {
  var branchId: js.UndefOr[scala.Double] = js.undefined
  var coin: java.lang.String
  var expiry: js.UndefOr[scala.Double] = js.undefined
  var inputs: js.Array[Input]
  var locktime: js.UndefOr[scala.Double] = js.undefined
  var outputs: js.Array[Output]
  var push: js.UndefOr[scala.Boolean] = js.undefined
  var refTxs: js.UndefOr[js.Array[RefTransaction]] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object SignTransactionParams {
  @scala.inline
  def apply(
    coin: java.lang.String,
    inputs: js.Array[Input],
    outputs: js.Array[Output],
    allowSeedlessDevice: js.UndefOr[scala.Boolean] = js.undefined,
    branchId: scala.Int | scala.Double = null,
    device: trezorDashConnectLib.Anon_Instance = null,
    expiry: scala.Int | scala.Double = null,
    keepSession: js.UndefOr[scala.Boolean] = js.undefined,
    locktime: scala.Int | scala.Double = null,
    push: js.UndefOr[scala.Boolean] = js.undefined,
    refTxs: js.Array[RefTransaction] = null,
    useEmptyPassphrase: js.UndefOr[scala.Boolean] = js.undefined,
    version: scala.Int | scala.Double = null
  ): SignTransactionParams = {
    val __obj = js.Dynamic.literal(coin = coin, inputs = inputs, outputs = outputs)
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice)
    if (branchId != null) __obj.updateDynamic("branchId")(branchId.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device)
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession)
    if (locktime != null) __obj.updateDynamic("locktime")(locktime.asInstanceOf[js.Any])
    if (!js.isUndefined(push)) __obj.updateDynamic("push")(push)
    if (refTxs != null) __obj.updateDynamic("refTxs")(refTxs)
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignTransactionParams]
  }
}


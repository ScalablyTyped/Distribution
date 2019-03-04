package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyMessageParams extends CommonParams {
  var address: java.lang.String
  var coin: java.lang.String
  var message: java.lang.String
  var signature: java.lang.String
}

object VerifyMessageParams {
  @scala.inline
  def apply(
    address: java.lang.String,
    coin: java.lang.String,
    message: java.lang.String,
    signature: java.lang.String,
    allowSeedlessDevice: js.UndefOr[scala.Boolean] = js.undefined,
    device: trezorDashConnectLib.Anon_Instance = null,
    keepSession: js.UndefOr[scala.Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[scala.Boolean] = js.undefined
  ): VerifyMessageParams = {
    val __obj = js.Dynamic.literal(address = address, coin = coin, message = message, signature = signature)
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice)
    if (device != null) __obj.updateDynamic("device")(device)
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession)
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase)
    __obj.asInstanceOf[VerifyMessageParams]
  }
}


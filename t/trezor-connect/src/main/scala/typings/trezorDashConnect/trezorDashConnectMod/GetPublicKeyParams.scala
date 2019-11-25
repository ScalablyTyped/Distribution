package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.Anon_Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPublicKeyParams extends CommonParams {
  var coin: js.UndefOr[String] = js.undefined
  var crossChain: js.UndefOr[Boolean] = js.undefined
  var path: String
}

object GetPublicKeyParams {
  @scala.inline
  def apply(
    path: String,
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    coin: String = null,
    crossChain: js.UndefOr[Boolean] = js.undefined,
    device: Anon_Instance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  ): GetPublicKeyParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice.asInstanceOf[js.Any])
    if (coin != null) __obj.updateDynamic("coin")(coin.asInstanceOf[js.Any])
    if (!js.isUndefined(crossChain)) __obj.updateDynamic("crossChain")(crossChain.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicKeyParams]
  }
}


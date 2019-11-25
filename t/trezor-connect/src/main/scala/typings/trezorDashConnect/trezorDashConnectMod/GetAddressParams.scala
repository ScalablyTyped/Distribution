package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.Anon_Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAddressParams extends CommonParams {
  var address: js.UndefOr[String] = js.undefined
  var coin: js.UndefOr[String] = js.undefined
  var crossChain: js.UndefOr[Boolean] = js.undefined
  var path: String | js.Array[Double]
  var showOnTrezor: js.UndefOr[Boolean] = js.undefined
}

object GetAddressParams {
  @scala.inline
  def apply(
    path: String | js.Array[Double],
    address: String = null,
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    coin: String = null,
    crossChain: js.UndefOr[Boolean] = js.undefined,
    device: Anon_Instance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    showOnTrezor: js.UndefOr[Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  ): GetAddressParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice.asInstanceOf[js.Any])
    if (coin != null) __obj.updateDynamic("coin")(coin.asInstanceOf[js.Any])
    if (!js.isUndefined(crossChain)) __obj.updateDynamic("crossChain")(crossChain.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession.asInstanceOf[js.Any])
    if (!js.isUndefined(showOnTrezor)) __obj.updateDynamic("showOnTrezor")(showOnTrezor.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAddressParams]
  }
}


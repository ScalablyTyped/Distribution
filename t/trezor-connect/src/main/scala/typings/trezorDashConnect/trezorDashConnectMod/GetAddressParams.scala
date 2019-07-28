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
    if (address != null) __obj.updateDynamic("address")(address)
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice)
    if (coin != null) __obj.updateDynamic("coin")(coin)
    if (!js.isUndefined(crossChain)) __obj.updateDynamic("crossChain")(crossChain)
    if (device != null) __obj.updateDynamic("device")(device)
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession)
    if (!js.isUndefined(showOnTrezor)) __obj.updateDynamic("showOnTrezor")(showOnTrezor)
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase)
    __obj.asInstanceOf[GetAddressParams]
  }
}


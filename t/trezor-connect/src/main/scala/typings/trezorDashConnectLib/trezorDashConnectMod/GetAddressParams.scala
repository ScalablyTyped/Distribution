package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAddressParams extends CommonParams {
  var coin: js.UndefOr[java.lang.String] = js.undefined
  var crossChain: js.UndefOr[scala.Boolean] = js.undefined
  var path: java.lang.String | js.Array[scala.Double]
  var showOnTrezor: js.UndefOr[scala.Boolean] = js.undefined
}

object GetAddressParams {
  @scala.inline
  def apply(
    path: java.lang.String | js.Array[scala.Double],
    allowSeedlessDevice: js.UndefOr[scala.Boolean] = js.undefined,
    coin: java.lang.String = null,
    crossChain: js.UndefOr[scala.Boolean] = js.undefined,
    device: trezorDashConnectLib.Anon_Instance = null,
    keepSession: js.UndefOr[scala.Boolean] = js.undefined,
    showOnTrezor: js.UndefOr[scala.Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[scala.Boolean] = js.undefined
  ): GetAddressParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
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


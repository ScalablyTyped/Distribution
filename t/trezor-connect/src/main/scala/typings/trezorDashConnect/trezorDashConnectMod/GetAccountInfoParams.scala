package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.Anon_Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountInfoParams extends CommonParams {
      // if both these fields are missing, the user will select an account
  var coin: String
  var path: js.UndefOr[js.Array[Double]] = js.undefined
    // NOTE:
  var xpub: js.UndefOr[String] = js.undefined
}

object GetAccountInfoParams {
  @scala.inline
  def apply(
    coin: String,
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    device: Anon_Instance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    path: js.Array[Double] = null,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined,
    xpub: String = null
  ): GetAccountInfoParams = {
    val __obj = js.Dynamic.literal(coin = coin.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase.asInstanceOf[js.Any])
    if (xpub != null) __obj.updateDynamic("xpub")(xpub.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccountInfoParams]
  }
}


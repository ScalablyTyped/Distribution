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
    val __obj = js.Dynamic.literal(coin = coin)
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice)
    if (device != null) __obj.updateDynamic("device")(device)
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase)
    if (xpub != null) __obj.updateDynamic("xpub")(xpub)
    __obj.asInstanceOf[GetAccountInfoParams]
  }
}


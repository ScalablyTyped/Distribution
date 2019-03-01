package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountInfoParams extends CommonParams {
      // if both these fields are missing, the user will select an account
  var coin: java.lang.String
  var path: js.UndefOr[js.Array[scala.Double]] = js.undefined
    // NOTE:
  var xpub: js.UndefOr[java.lang.String] = js.undefined
}

object GetAccountInfoParams {
  @scala.inline
  def apply(
    coin: java.lang.String,
    allowSeedlessDevice: js.UndefOr[scala.Boolean] = js.undefined,
    device: trezorDashConnectLib.Anon_Instance = null,
    keepSession: js.UndefOr[scala.Boolean] = js.undefined,
    path: js.Array[scala.Double] = null,
    useEmptyPassphrase: js.UndefOr[scala.Boolean] = js.undefined,
    xpub: java.lang.String = null
  ): GetAccountInfoParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("coin")(coin)
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice)
    if (device != null) __obj.updateDynamic("device")(device)
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase)
    if (xpub != null) __obj.updateDynamic("xpub")(xpub)
    __obj.asInstanceOf[GetAccountInfoParams]
  }
}


package typings.trezorConnect.anon

import typings.trezorConnect.mod.LoginChallenge
import typings.trezorConnect.mod.RequestLoginParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined trezor-connect.trezor-connect.CommonParams & {callback (): trezor-connect.trezor-connect.LoginChallenge} */
trait CommonParamscallbackLogin extends RequestLoginParams {
  var allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined
  var device: js.UndefOr[Instance] = js.undefined
  var keepSession: js.UndefOr[Boolean] = js.undefined
  var useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  def callback(): LoginChallenge
}

object CommonParamscallbackLogin {
  @scala.inline
  def apply(
    callback: () => LoginChallenge,
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    device: Instance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  ): CommonParamscallbackLogin = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback))
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice.get.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonParamscallbackLogin]
  }
}


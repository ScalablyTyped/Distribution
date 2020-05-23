package typings.trezorConnect.mod

import typings.trezorConnect.anon.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonParams extends js.Object {
  var allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined
  var device: js.UndefOr[Instance] = js.undefined
  var keepSession: js.UndefOr[Boolean] = js.undefined
  var useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
}

object CommonParams {
  @scala.inline
  def apply(
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    device: Instance = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  ): CommonParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice.get.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonParams]
  }
}


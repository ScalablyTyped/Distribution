package typings.trezorConnect.mod

import typings.trezorConnect.anon.Instance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CipherKeyValueParams extends CommonParams {
  var askOnDecrypt: js.UndefOr[Boolean] = js.undefined
  var askOnEncrypt: js.UndefOr[Boolean] = js.undefined
  var iv: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[String] = js.undefined
  var path: String | js.Array[Double]
  var value: js.UndefOr[String] = js.undefined
}

object CipherKeyValueParams {
  @scala.inline
  def apply(
    path: String | js.Array[Double],
    allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined,
    askOnDecrypt: js.UndefOr[Boolean] = js.undefined,
    askOnEncrypt: js.UndefOr[Boolean] = js.undefined,
    device: Instance = null,
    iv: String = null,
    keepSession: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): CipherKeyValueParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice.get.asInstanceOf[js.Any])
    if (!js.isUndefined(askOnDecrypt)) __obj.updateDynamic("askOnDecrypt")(askOnDecrypt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(askOnEncrypt)) __obj.updateDynamic("askOnEncrypt")(askOnEncrypt.get.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherKeyValueParams]
  }
}


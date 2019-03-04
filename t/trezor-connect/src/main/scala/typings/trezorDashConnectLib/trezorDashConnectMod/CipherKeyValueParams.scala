package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CipherKeyValueParams extends CommonParams {
  var askOnDecrypt: js.UndefOr[trezorDashConnectLib.trezorDashConnectLibNumbers.`true`] = js.undefined
  var askOnEncrypt: js.UndefOr[trezorDashConnectLib.trezorDashConnectLibNumbers.`true`] = js.undefined
  var key: js.UndefOr[java.lang.String] = js.undefined
  var path: java.lang.String | js.Array[scala.Double]
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object CipherKeyValueParams {
  @scala.inline
  def apply(
    path: java.lang.String | js.Array[scala.Double],
    allowSeedlessDevice: js.UndefOr[scala.Boolean] = js.undefined,
    askOnDecrypt: trezorDashConnectLib.trezorDashConnectLibNumbers.`true` = null,
    askOnEncrypt: trezorDashConnectLib.trezorDashConnectLibNumbers.`true` = null,
    device: trezorDashConnectLib.Anon_Instance = null,
    keepSession: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    useEmptyPassphrase: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String = null
  ): CipherKeyValueParams = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice)
    if (askOnDecrypt != null) __obj.updateDynamic("askOnDecrypt")(askOnDecrypt)
    if (askOnEncrypt != null) __obj.updateDynamic("askOnEncrypt")(askOnEncrypt)
    if (device != null) __obj.updateDynamic("device")(device)
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[CipherKeyValueParams]
  }
}


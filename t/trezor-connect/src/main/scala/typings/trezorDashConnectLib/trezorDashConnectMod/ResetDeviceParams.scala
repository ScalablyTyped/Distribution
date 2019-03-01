package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetDeviceParams extends CommonParams {
  var label: js.UndefOr[java.lang.String] = js.undefined
  var noBackup: js.UndefOr[scala.Boolean] = js.undefined
  var passphraseProtection: js.UndefOr[scala.Boolean] = js.undefined
  var pinProtection: js.UndefOr[scala.Boolean] = js.undefined
  var skipBackup: js.UndefOr[scala.Boolean] = js.undefined
  var strength: js.UndefOr[scala.Double] = js.undefined
  var u2fCounter: js.UndefOr[scala.Double] = js.undefined
}

object ResetDeviceParams {
  @scala.inline
  def apply(
    allowSeedlessDevice: js.UndefOr[scala.Boolean] = js.undefined,
    device: trezorDashConnectLib.Anon_Instance = null,
    keepSession: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    noBackup: js.UndefOr[scala.Boolean] = js.undefined,
    passphraseProtection: js.UndefOr[scala.Boolean] = js.undefined,
    pinProtection: js.UndefOr[scala.Boolean] = js.undefined,
    skipBackup: js.UndefOr[scala.Boolean] = js.undefined,
    strength: scala.Int | scala.Double = null,
    u2fCounter: scala.Int | scala.Double = null,
    useEmptyPassphrase: js.UndefOr[scala.Boolean] = js.undefined
  ): ResetDeviceParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSeedlessDevice)) __obj.updateDynamic("allowSeedlessDevice")(allowSeedlessDevice)
    if (device != null) __obj.updateDynamic("device")(device)
    if (!js.isUndefined(keepSession)) __obj.updateDynamic("keepSession")(keepSession)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(noBackup)) __obj.updateDynamic("noBackup")(noBackup)
    if (!js.isUndefined(passphraseProtection)) __obj.updateDynamic("passphraseProtection")(passphraseProtection)
    if (!js.isUndefined(pinProtection)) __obj.updateDynamic("pinProtection")(pinProtection)
    if (!js.isUndefined(skipBackup)) __obj.updateDynamic("skipBackup")(skipBackup)
    if (strength != null) __obj.updateDynamic("strength")(strength.asInstanceOf[js.Any])
    if (u2fCounter != null) __obj.updateDynamic("u2fCounter")(u2fCounter.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyPassphrase)) __obj.updateDynamic("useEmptyPassphrase")(useEmptyPassphrase)
    __obj.asInstanceOf[ResetDeviceParams]
  }
}


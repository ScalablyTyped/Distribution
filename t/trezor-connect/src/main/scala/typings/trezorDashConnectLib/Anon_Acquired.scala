package typings
package trezorDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acquired
  extends trezorDashConnectLib.trezorDashConnectMod.Device {
  var features: trezorDashConnectLib.trezorDashConnectMod.Features
  var firmware: trezorDashConnectLib.trezorDashConnectMod.DeviceFirmwareStatus
  var firmwareRelease: trezorDashConnectLib.trezorDashConnectMod.FirmwareRelease
  var label: java.lang.String
  var mode: trezorDashConnectLib.trezorDashConnectMod.DeviceMode
  var path: java.lang.String
  var state: java.lang.String | scala.Null
  var status: trezorDashConnectLib.trezorDashConnectMod.DeviceStatus
  var `type`: trezorDashConnectLib.trezorDashConnectLibStrings.acquired
}

object Anon_Acquired {
  @scala.inline
  def apply(
    features: trezorDashConnectLib.trezorDashConnectMod.Features,
    firmware: trezorDashConnectLib.trezorDashConnectMod.DeviceFirmwareStatus,
    firmwareRelease: trezorDashConnectLib.trezorDashConnectMod.FirmwareRelease,
    label: java.lang.String,
    mode: trezorDashConnectLib.trezorDashConnectMod.DeviceMode,
    path: java.lang.String,
    status: trezorDashConnectLib.trezorDashConnectMod.DeviceStatus,
    `type`: trezorDashConnectLib.trezorDashConnectLibStrings.acquired,
    state: java.lang.String = null
  ): Anon_Acquired = {
    val __obj = js.Dynamic.literal(features = features, firmware = firmware, firmwareRelease = firmwareRelease, label = label, mode = mode, path = path, status = status)
    __obj.updateDynamic("type")(`type`)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Acquired]
  }
}


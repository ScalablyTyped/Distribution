package typings.trezorDashConnect

import typings.trezorDashConnect.trezorDashConnectMod.Device
import typings.trezorDashConnect.trezorDashConnectMod.DeviceFirmwareStatus
import typings.trezorDashConnect.trezorDashConnectMod.DeviceMode
import typings.trezorDashConnect.trezorDashConnectMod.DeviceStatus
import typings.trezorDashConnect.trezorDashConnectMod.Features
import typings.trezorDashConnect.trezorDashConnectMod.FirmwareRelease
import typings.trezorDashConnect.trezorDashConnectStrings.acquired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acquired extends Device {
  var features: Features
  var firmware: DeviceFirmwareStatus
  var firmwareRelease: FirmwareRelease
  var label: String
  var mode: DeviceMode
  var path: String
  var state: String | Null
  var status: DeviceStatus
  var `type`: acquired
}

object Anon_Acquired {
  @scala.inline
  def apply(
    features: Features,
    firmware: DeviceFirmwareStatus,
    firmwareRelease: FirmwareRelease,
    label: String,
    mode: DeviceMode,
    path: String,
    status: DeviceStatus,
    `type`: acquired,
    state: String = null
  ): Anon_Acquired = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], firmwareRelease = firmwareRelease.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Acquired]
  }
}


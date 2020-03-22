package typings.trezorConnect

import typings.trezorConnect.mod.Device
import typings.trezorConnect.mod.DeviceFirmwareStatus
import typings.trezorConnect.mod.DeviceMode
import typings.trezorConnect.mod.DeviceStatus
import typings.trezorConnect.mod.Features
import typings.trezorConnect.mod.FirmwareRelease
import typings.trezorConnect.trezorConnectStrings.acquired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFeatures extends Device {
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

object AnonFeatures {
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
  ): AnonFeatures = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], firmwareRelease = firmwareRelease.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeatures]
  }
}


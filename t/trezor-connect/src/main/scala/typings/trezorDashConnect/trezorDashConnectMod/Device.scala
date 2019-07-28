package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.trezorDashConnectStrings.acquired
import typings.trezorDashConnect.trezorDashConnectStrings.unacquired
import typings.trezorDashConnect.trezorDashConnectStrings.unreadable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  var features: js.UndefOr[Features] = js.undefined
  var firmware: js.UndefOr[DeviceFirmwareStatus] = js.undefined
  var firmwareRelease: js.UndefOr[FirmwareRelease] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var mode: js.UndefOr[DeviceMode] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String | Null] = js.undefined
  var status: js.UndefOr[DeviceStatus] = js.undefined
  var `type`: js.UndefOr[acquired | unacquired | unreadable] = js.undefined
}

object Device {
  @scala.inline
  def apply(
    features: Features = null,
    firmware: DeviceFirmwareStatus = null,
    firmwareRelease: FirmwareRelease = null,
    label: String = null,
    mode: DeviceMode = null,
    path: String = null,
    state: String = null,
    status: DeviceStatus = null,
    `type`: acquired = null
  ): Device = {
    val __obj = js.Dynamic.literal()
    if (features != null) __obj.updateDynamic("features")(features)
    if (firmware != null) __obj.updateDynamic("firmware")(firmware)
    if (firmwareRelease != null) __obj.updateDynamic("firmwareRelease")(firmwareRelease)
    if (label != null) __obj.updateDynamic("label")(label)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (path != null) __obj.updateDynamic("path")(path)
    if (state != null) __obj.updateDynamic("state")(state)
    if (status != null) __obj.updateDynamic("status")(status)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Device]
  }
}


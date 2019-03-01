package typings
package trezorDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acquired
  extends trezorDashConnectLib.trezorDashConnectMod.Device {
  var features: trezorDashConnectLib.trezorDashConnectMod.Features
  var firmware: trezorDashConnectLib.trezorDashConnectMod.DeviceFirmwareStatus
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
    label: java.lang.String,
    mode: trezorDashConnectLib.trezorDashConnectMod.DeviceMode,
    path: java.lang.String,
    status: trezorDashConnectLib.trezorDashConnectMod.DeviceStatus,
    `type`: trezorDashConnectLib.trezorDashConnectLibStrings.acquired,
    state: java.lang.String = null
  ): Anon_Acquired = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("features")(features)
    __obj.updateDynamic("firmware")(firmware)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("mode")(mode)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("status")(status)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Acquired]
  }
}


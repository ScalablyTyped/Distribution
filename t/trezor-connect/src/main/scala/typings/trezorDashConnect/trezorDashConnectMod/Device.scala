package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.trezorDashConnectStrings.acquired
import typings.trezorDashConnect.trezorDashConnectStrings.unacquired
import typings.trezorDashConnect.trezorDashConnectStrings.unreadable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.trezorDashConnect.Anon_Acquired
  - typings.trezorDashConnect.Anon_Label
  - typings.trezorDashConnect.Anon_LabelPath
*/
trait Device extends js.Object

object Device {
  @scala.inline
  def Anon_Acquired(
    features: Features,
    firmware: DeviceFirmwareStatus,
    firmwareRelease: FirmwareRelease,
    label: String,
    mode: DeviceMode,
    path: String,
    status: DeviceStatus,
    `type`: acquired,
    state: String = null
  ): Device = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], firmwareRelease = firmwareRelease.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  def Anon_Label(label: String, path: String, `type`: unacquired): Device = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  def Anon_LabelPath(label: String, path: String, `type`: unreadable): Device = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
}


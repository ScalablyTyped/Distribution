package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectStrings.acquired
import typings.trezorConnect.trezorConnectStrings.unacquired
import typings.trezorConnect.trezorConnectStrings.unreadable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.trezorConnect.anon.Features
  - typings.trezorConnect.anon.Label
  - typings.trezorConnect.anon.Path
*/
trait Device extends StObject
object Device {
  
  @scala.inline
  def Features(
    features: typings.trezorConnect.mod.Features,
    firmware: DeviceFirmwareStatus,
    firmwareRelease: FirmwareRelease,
    label: String,
    mode: DeviceMode,
    path: String,
    status: DeviceStatus,
    `type`: acquired
  ): typings.trezorConnect.anon.Features = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], firmwareRelease = firmwareRelease.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.Features]
  }
  
  @scala.inline
  def Label(label: String, path: String, `type`: unacquired): typings.trezorConnect.anon.Label = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.Label]
  }
  
  @scala.inline
  def Path(label: String, path: String, `type`: unreadable): typings.trezorConnect.anon.Path = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.trezorConnect.anon.Path]
  }
}

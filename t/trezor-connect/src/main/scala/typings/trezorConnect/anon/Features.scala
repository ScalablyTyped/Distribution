package typings.trezorConnect.anon

import typings.trezorConnect.mod.Device
import typings.trezorConnect.mod.DeviceFirmwareStatus
import typings.trezorConnect.mod.DeviceMode
import typings.trezorConnect.mod.DeviceStatus
import typings.trezorConnect.mod.FirmwareRelease
import typings.trezorConnect.trezorConnectStrings.acquired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Features extends Device {
  
  var features: typings.trezorConnect.mod.Features = js.native
  
  var firmware: DeviceFirmwareStatus = js.native
  
  var firmwareRelease: FirmwareRelease = js.native
  
  var label: String = js.native
  
  var mode: DeviceMode = js.native
  
  var path: String = js.native
  
  var state: String | Null = js.native
  
  var status: DeviceStatus = js.native
  
  var `type`: acquired = js.native
}
object Features {
  
  @scala.inline
  def apply(
    features: typings.trezorConnect.mod.Features,
    firmware: DeviceFirmwareStatus,
    firmwareRelease: FirmwareRelease,
    label: String,
    mode: DeviceMode,
    path: String,
    status: DeviceStatus,
    `type`: acquired
  ): Features = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], firmwareRelease = firmwareRelease.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFeatures(value: typings.trezorConnect.mod.Features): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirmware(value: DeviceFirmwareStatus): Self = this.set("firmware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirmwareRelease(value: FirmwareRelease): Self = this.set("firmwareRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: DeviceMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DeviceStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: acquired): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateNull: Self = this.set("state", null)
  }
}

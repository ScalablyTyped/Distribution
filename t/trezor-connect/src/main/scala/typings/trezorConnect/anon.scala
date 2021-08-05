package typings.trezorConnect

import typings.trezorConnect.mod.Device
import typings.trezorConnect.mod.DeviceFirmwareStatus
import typings.trezorConnect.mod.DeviceMode
import typings.trezorConnect.mod.DeviceStatus
import typings.trezorConnect.mod.FirmwareRelease
import typings.trezorConnect.mod.LoginChallenge
import typings.trezorConnect.mod.RequestLoginParams
import typings.trezorConnect.trezorConnectStrings.acquired
import typings.trezorConnect.trezorConnectStrings.unacquired
import typings.trezorConnect.trezorConnectStrings.unreadable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Address extends StObject {
    
    var address: String
    
    var received: Double
  }
  object Address {
    
    inline def apply(address: String, received: Double): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    extension [Self <: Address](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setReceived(value: Double): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined trezor-connect.trezor-connect.CommonParams & {callback (): trezor-connect.trezor-connect.LoginChallenge} */
  trait CommonParamscallbackLogin
    extends StObject
       with RequestLoginParams {
    
    var allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined
    
    def callback(): LoginChallenge
    
    var device: js.UndefOr[Instance] = js.undefined
    
    var keepSession: js.UndefOr[Boolean] = js.undefined
    
    var useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
  }
  object CommonParamscallbackLogin {
    
    inline def apply(callback: () => LoginChallenge): CommonParamscallbackLogin = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback))
      __obj.asInstanceOf[CommonParamscallbackLogin]
    }
    
    extension [Self <: CommonParamscallbackLogin](x: Self) {
      
      inline def setAllowSeedlessDevice(value: Boolean): Self = StObject.set(x, "allowSeedlessDevice", value.asInstanceOf[js.Any])
      
      inline def setAllowSeedlessDeviceUndefined: Self = StObject.set(x, "allowSeedlessDevice", js.undefined)
      
      inline def setCallback(value: () => LoginChallenge): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setDevice(value: Instance): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setKeepSession(value: Boolean): Self = StObject.set(x, "keepSession", value.asInstanceOf[js.Any])
      
      inline def setKeepSessionUndefined: Self = StObject.set(x, "keepSession", js.undefined)
      
      inline def setUseEmptyPassphrase(value: Boolean): Self = StObject.set(x, "useEmptyPassphrase", value.asInstanceOf[js.Any])
      
      inline def setUseEmptyPassphraseUndefined: Self = StObject.set(x, "useEmptyPassphrase", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var error: String
  }
  object Error {
    
    inline def apply(error: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Features
    extends StObject
       with Device {
    
    var features: typings.trezorConnect.mod.Features
    
    var firmware: DeviceFirmwareStatus
    
    var firmwareRelease: FirmwareRelease
    
    var label: String
    
    var mode: DeviceMode
    
    var path: String
    
    var state: String | Null
    
    var status: DeviceStatus
    
    var `type`: acquired
  }
  object Features {
    
    inline def apply(
      features: typings.trezorConnect.mod.Features,
      firmware: DeviceFirmwareStatus,
      firmwareRelease: FirmwareRelease,
      label: String,
      mode: DeviceMode,
      path: String,
      status: DeviceStatus
    ): Features = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], firmware = firmware.asInstanceOf[js.Any], firmwareRelease = firmwareRelease.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], state = null)
      __obj.updateDynamic("type")("acquired")
      __obj.asInstanceOf[Features]
    }
    
    extension [Self <: Features](x: Self) {
      
      inline def setFeatures(value: typings.trezorConnect.mod.Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFirmware(value: DeviceFirmwareStatus): Self = StObject.set(x, "firmware", value.asInstanceOf[js.Any])
      
      inline def setFirmwareRelease(value: FirmwareRelease): Self = StObject.set(x, "firmwareRelease", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMode(value: DeviceMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateNull: Self = StObject.set(x, "state", null)
      
      inline def setStatus(value: DeviceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: acquired): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Instance extends StObject {
    
    var instance: js.UndefOr[Double] = js.undefined
    
    var path: String
    
    var state: js.UndefOr[String] = js.undefined
  }
  object Instance {
    
    inline def apply(path: String): Instance = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    extension [Self <: Instance](x: Self) {
      
      inline def setInstance(value: Double): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait Label
    extends StObject
       with Device {
    
    var label: String
    
    var path: String
    
    var `type`: unacquired
  }
  object Label {
    
    inline def apply(label: String, path: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unacquired")
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: unacquired): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Path
    extends StObject
       with Device {
    
    var label: String
    
    var path: String
    
    var `type`: unreadable
  }
  object Path {
    
    inline def apply(label: String, path: String): Path = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unreadable")
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setType(value: unreadable): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

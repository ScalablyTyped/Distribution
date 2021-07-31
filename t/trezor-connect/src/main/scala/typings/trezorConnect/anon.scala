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
    
    @scala.inline
    def apply(address: String, received: Double): Address = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any])
      __obj.asInstanceOf[Address]
    }
    
    @scala.inline
    implicit class AddressMutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceived(value: Double): Self = StObject.set(x, "received", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(callback: () => LoginChallenge): CommonParamscallbackLogin = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback))
      __obj.asInstanceOf[CommonParamscallbackLogin]
    }
    
    @scala.inline
    implicit class CommonParamscallbackLoginMutableBuilder[Self <: CommonParamscallbackLogin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowSeedlessDevice(value: Boolean): Self = StObject.set(x, "allowSeedlessDevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowSeedlessDeviceUndefined: Self = StObject.set(x, "allowSeedlessDevice", js.undefined)
      
      @scala.inline
      def setCallback(value: () => LoginChallenge): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDevice(value: Instance): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      @scala.inline
      def setKeepSession(value: Boolean): Self = StObject.set(x, "keepSession", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepSessionUndefined: Self = StObject.set(x, "keepSession", js.undefined)
      
      @scala.inline
      def setUseEmptyPassphrase(value: Boolean): Self = StObject.set(x, "useEmptyPassphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseEmptyPassphraseUndefined: Self = StObject.set(x, "useEmptyPassphrase", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var error: String
  }
  object Error {
    
    @scala.inline
    def apply(error: String): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class FeaturesMutableBuilder[Self <: Features] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeatures(value: typings.trezorConnect.mod.Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirmware(value: DeviceFirmwareStatus): Self = StObject.set(x, "firmware", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirmwareRelease(value: FirmwareRelease): Self = StObject.set(x, "firmwareRelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: DeviceMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateNull: Self = StObject.set(x, "state", null)
      
      @scala.inline
      def setStatus(value: DeviceStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: acquired): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Instance extends StObject {
    
    var instance: js.UndefOr[Double] = js.undefined
    
    var path: String
    
    var state: js.UndefOr[String] = js.undefined
  }
  object Instance {
    
    @scala.inline
    def apply(path: String): Instance = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstance(value: Double): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
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
    
    @scala.inline
    def apply(label: String, path: String): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unacquired")
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: unacquired): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(label: String, path: String): Path = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("unreadable")
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit class PathMutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: unreadable): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

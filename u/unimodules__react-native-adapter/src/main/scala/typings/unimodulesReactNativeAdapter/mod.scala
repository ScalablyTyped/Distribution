package typings.unimodulesReactNativeAdapter

import typings.react.mod.ComponentType
import typings.reactNative.mod.DeviceEventEmitterStatic
import typings.unimodulesReactNativeAdapter.eventEmitterMod.NativeModule
import typings.unimodulesReactNativeAdapter.platformMod.PlatformSelect
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.android
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.ios
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.macos
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.web
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.windows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@unimodules/react-native-adapter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@unimodules/react-native-adapter", "CodedError")
  @js.native
  class CodedError protected ()
    extends typings.unimodulesReactNativeAdapter.codedErrorMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@unimodules/react-native-adapter", "DeviceEventEmitter")
  @js.native
  class DeviceEventEmitter ()
    extends typings.reactNative.mod.DeviceEventEmitter
  @JSImport("@unimodules/react-native-adapter", "DeviceEventEmitter")
  @js.native
  val DeviceEventEmitter: DeviceEventEmitterStatic = js.native
  
  @JSImport("@unimodules/react-native-adapter", "EventEmitter")
  @js.native
  class EventEmitter protected ()
    extends typings.unimodulesReactNativeAdapter.eventEmitterMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  object Platform {
    
    @JSImport("@unimodules/react-native-adapter", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Denotes the currently running platform.
      * Can be one of ios, android, web.
      */
    @JSImport("@unimodules/react-native-adapter", "Platform.OS")
    @js.native
    def OS: ios | android | windows | macos | web = js.native
    @scala.inline
    def OS_=(x: ios | android | windows | macos | web): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
    
    /**
      * Denotes if the DOM API is available in the current environment.
      * The DOM is not available in native React runtimes and Node.js.
      */
    @JSImport("@unimodules/react-native-adapter", "Platform.isDOMAvailable")
    @js.native
    def isDOMAvailable: Boolean = js.native
    @scala.inline
    def isDOMAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDOMAvailable")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the value with the matching platform.
      * Object keys can be any of ios, android, native, web, default.
      *
      * @ios ios, native, default
      * @android android, native, default
      * @web web, default
      */
    @JSImport("@unimodules/react-native-adapter", "Platform.select")
    @js.native
    def select: PlatformSelect = js.native
    @scala.inline
    def select_=(x: PlatformSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@unimodules/react-native-adapter", "RCTDeviceEventEmitter")
  @js.native
  class RCTDeviceEventEmitter ()
    extends StObject
       with DeviceEventEmitterStatic
  @JSImport("@unimodules/react-native-adapter", "RCTDeviceEventEmitter")
  @js.native
  val RCTDeviceEventEmitter: DeviceEventEmitterStatic = js.native
  
  @JSImport("@unimodules/react-native-adapter", "SyntheticPlatformEmitter")
  @js.native
  val SyntheticPlatformEmitter: typings.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  
  @JSImport("@unimodules/react-native-adapter", "UnavailabilityError")
  @js.native
  class UnavailabilityError protected ()
    extends typings.unimodulesReactNativeAdapter.unavailabilityErrorMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  @scala.inline
  def requireNativeViewManager[P](viewName: String): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireNativeViewManager")(viewName.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
}

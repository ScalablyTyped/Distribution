package typings.unimodulesCore

import typings.react.mod.ComponentType
import typings.reactNative.mod.DeviceEventEmitterStatic
import typings.unimodulesCore.unimodulesCoreStrings.android
import typings.unimodulesCore.unimodulesCoreStrings.ios
import typings.unimodulesCore.unimodulesCoreStrings.macos
import typings.unimodulesCore.unimodulesCoreStrings.web
import typings.unimodulesCore.unimodulesCoreStrings.windows
import typings.unimodulesReactNativeAdapter.eventEmitterMod.NativeModule
import typings.unimodulesReactNativeAdapter.platformMod.PlatformSelect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adapterProxyMod {
  
  @JSImport("@unimodules/core/build/AdapterProxy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@unimodules/core/build/AdapterProxy", "CodedError")
  @js.native
  class CodedError protected ()
    extends typings.unimodulesReactNativeAdapter.mod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@unimodules/core/build/AdapterProxy", "DeviceEventEmitter")
  @js.native
  class DeviceEventEmitter ()
    extends typings.unimodulesReactNativeAdapter.mod.DeviceEventEmitter
  @JSImport("@unimodules/core/build/AdapterProxy", "DeviceEventEmitter")
  @js.native
  val DeviceEventEmitter: DeviceEventEmitterStatic = js.native
  
  @JSImport("@unimodules/core/build/AdapterProxy", "EventEmitter")
  @js.native
  class EventEmitter protected ()
    extends typings.unimodulesReactNativeAdapter.mod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  object Platform {
    
    @JSImport("@unimodules/core/build/AdapterProxy", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Denotes the currently running platform.
      * Can be one of ios, android, web.
      */
    @JSImport("@unimodules/core/build/AdapterProxy", "Platform.OS")
    @js.native
    def OS: ios | android | windows | macos | web = js.native
    inline def OS_=(x: ios | android | windows | macos | web): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
    
    /**
      * Denotes if the DOM API is available in the current environment.
      * The DOM is not available in native React runtimes and Node.js.
      */
    @JSImport("@unimodules/core/build/AdapterProxy", "Platform.isDOMAvailable")
    @js.native
    def isDOMAvailable: Boolean = js.native
    inline def isDOMAvailable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDOMAvailable")(x.asInstanceOf[js.Any])
    
    /**
      * Returns the value with the matching platform.
      * Object keys can be any of ios, android, native, web, default.
      *
      * @ios ios, native, default
      * @android android, native, default
      * @web web, default
      */
    @JSImport("@unimodules/core/build/AdapterProxy", "Platform.select")
    @js.native
    def select: PlatformSelect = js.native
    inline def select_=(x: PlatformSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@unimodules/core/build/AdapterProxy", "RCTDeviceEventEmitter")
  @js.native
  class RCTDeviceEventEmitter ()
    extends typings.unimodulesReactNativeAdapter.mod.RCTDeviceEventEmitter
  @JSImport("@unimodules/core/build/AdapterProxy", "RCTDeviceEventEmitter")
  @js.native
  val RCTDeviceEventEmitter: DeviceEventEmitterStatic = js.native
  
  @JSImport("@unimodules/core/build/AdapterProxy", "SyntheticPlatformEmitter")
  @js.native
  val SyntheticPlatformEmitter: typings.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  
  @JSImport("@unimodules/core/build/AdapterProxy", "UnavailabilityError")
  @js.native
  class UnavailabilityError protected ()
    extends typings.unimodulesReactNativeAdapter.mod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  inline def requireNativeViewManager[P](viewName: String): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireNativeViewManager")(viewName.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
}

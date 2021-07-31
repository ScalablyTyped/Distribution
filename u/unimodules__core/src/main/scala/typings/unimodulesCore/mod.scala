package typings.unimodulesCore

import typings.react.mod.ComponentType
import typings.reactNative.mod.DeviceEventEmitterStatic
import typings.unimodulesCore.anon.CurrentVersion
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

object mod {
  
  @JSImport("@unimodules/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@unimodules/core", "CodedError")
  @js.native
  class CodedError protected ()
    extends typings.unimodulesCore.adapterProxyMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@unimodules/core", "DeviceEventEmitter")
  @js.native
  class DeviceEventEmitter ()
    extends typings.unimodulesCore.adapterProxyMod.DeviceEventEmitter
  @JSImport("@unimodules/core", "DeviceEventEmitter")
  @js.native
  val DeviceEventEmitter: DeviceEventEmitterStatic = js.native
  
  @JSImport("@unimodules/core", "EventEmitter")
  @js.native
  class EventEmitter protected ()
    extends typings.unimodulesCore.adapterProxyMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  object Platform {
    
    @JSImport("@unimodules/core", "Platform")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Denotes the currently running platform.
      * Can be one of ios, android, web.
      */
    @JSImport("@unimodules/core", "Platform.OS")
    @js.native
    def OS: ios | android | windows | macos | web = js.native
    @scala.inline
    def OS_=(x: ios | android | windows | macos | web): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
    
    /**
      * Denotes if the DOM API is available in the current environment.
      * The DOM is not available in native React runtimes and Node.js.
      */
    @JSImport("@unimodules/core", "Platform.isDOMAvailable")
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
    @JSImport("@unimodules/core", "Platform.select")
    @js.native
    def select: PlatformSelect = js.native
    @scala.inline
    def select_=(x: PlatformSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@unimodules/core", "RCTDeviceEventEmitter")
  @js.native
  class RCTDeviceEventEmitter ()
    extends typings.unimodulesCore.adapterProxyMod.RCTDeviceEventEmitter
  @JSImport("@unimodules/core", "RCTDeviceEventEmitter")
  @js.native
  val RCTDeviceEventEmitter: DeviceEventEmitterStatic = js.native
  
  @JSImport("@unimodules/core", "SyntheticPlatformEmitter")
  @js.native
  val SyntheticPlatformEmitter: typings.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  
  @JSImport("@unimodules/core", "UnavailabilityError")
  @js.native
  class UnavailabilityError protected ()
    extends typings.unimodulesCore.adapterProxyMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  @scala.inline
  def deprecate(library: String, deprecatedAPI: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(library.asInstanceOf[js.Any], deprecatedAPI.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def deprecate(library: String, deprecatedAPI: String, options: CurrentVersion): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecate")(library.asInstanceOf[js.Any], deprecatedAPI.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def requireNativeViewManager[P](viewName: String): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("requireNativeViewManager")(viewName.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
}

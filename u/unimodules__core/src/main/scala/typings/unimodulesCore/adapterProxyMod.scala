package typings.unimodulesCore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.ComponentType
import typings.reactNative.mod.DeviceEventEmitterStatic
import typings.unimodulesCore.unimodulesCoreStrings.android
import typings.unimodulesCore.unimodulesCoreStrings.ios
import typings.unimodulesCore.unimodulesCoreStrings.macos
import typings.unimodulesCore.unimodulesCoreStrings.web
import typings.unimodulesCore.unimodulesCoreStrings.windows
import typings.unimodulesReactNativeAdapter.eventEmitterMod.NativeModule
import typings.unimodulesReactNativeAdapter.nativeModulesProxyTypesMod.ProxyNativeModule
import typings.unimodulesReactNativeAdapter.platformMod.PlatformSelect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@unimodules/core/build/AdapterProxy", JSImport.Namespace)
@js.native
object adapterProxyMod extends js.Object {
  
  val SyntheticPlatformEmitter: typings.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  
  def requireNativeViewManager[P](viewName: String): ComponentType[P] = js.native
  
  @js.native
  class CodedError protected ()
    extends typings.unimodulesReactNativeAdapter.mod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class DeviceEventEmitter ()
    extends typings.unimodulesReactNativeAdapter.mod.DeviceEventEmitter
  @js.native
  object DeviceEventEmitter extends TopLevel[DeviceEventEmitterStatic]
  
  @js.native
  class EventEmitter protected ()
    extends typings.unimodulesReactNativeAdapter.mod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  object NativeModulesProxy extends /* moduleName */ StringDictionary[ProxyNativeModule]
  
  @js.native
  object Platform extends js.Object {
    
    /**
      * Denotes the currently running platform.
      * Can be one of ios, android, web.
      */
    var OS: ios | android | windows | macos | web = js.native
    
    /**
      * Denotes if the DOM API is available in the current environment.
      * The DOM is not available in native React runtimes and Node.js.
      */
    var isDOMAvailable: Boolean = js.native
    
    /**
      * Returns the value with the matching platform.
      * Object keys can be any of ios, android, native, web, default.
      *
      * @ios ios, native, default
      * @android android, native, default
      * @web web, default
      */
    var select: PlatformSelect = js.native
  }
  
  @js.native
  class RCTDeviceEventEmitter ()
    extends typings.unimodulesReactNativeAdapter.mod.RCTDeviceEventEmitter
  @js.native
  object RCTDeviceEventEmitter extends TopLevel[DeviceEventEmitterStatic]
  
  @js.native
  class UnavailabilityError protected ()
    extends typings.unimodulesReactNativeAdapter.mod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
}

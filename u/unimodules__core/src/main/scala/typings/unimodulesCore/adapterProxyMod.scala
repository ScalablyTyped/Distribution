package typings.unimodulesCore

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.unimodulesCore.unimodulesCoreStrings.android
import typings.unimodulesCore.unimodulesCoreStrings.ios
import typings.unimodulesCore.unimodulesCoreStrings.macos
import typings.unimodulesCore.unimodulesCoreStrings.web
import typings.unimodulesCore.unimodulesCoreStrings.windows
import typings.unimodulesReactNativeAdapter.eventEmitterMod.NativeModule
import typings.unimodulesReactNativeAdapter.nativeModulesProxyMod.ProxyNativeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/core/build/AdapterProxy", JSImport.Namespace)
@js.native
object adapterProxyMod extends js.Object {
  @js.native
  class CodedError protected ()
    extends typings.unimodulesReactNativeAdapter.mod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class EventEmitter protected ()
    extends typings.unimodulesReactNativeAdapter.mod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  class UnavailabilityError protected ()
    extends typings.unimodulesReactNativeAdapter.mod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  val SyntheticPlatformEmitter: typings.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  def requireNativeViewManager[P](viewName: String): ComponentType[P] = js.native
  @js.native
  object NativeModulesProxy extends /* moduleName */ StringDictionary[ProxyNativeModule]
  
  @js.native
  object Platform extends js.Object {
    var OS: ios | android | windows | macos | web = js.native
  }
  
}


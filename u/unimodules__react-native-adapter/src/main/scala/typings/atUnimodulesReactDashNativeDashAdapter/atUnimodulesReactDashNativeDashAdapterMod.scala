package typings.atUnimodulesReactDashNativeDashAdapter

import org.scalablytyped.runtime.StringDictionary
import typings.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.android
import typings.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.ios
import typings.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.macos
import typings.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.web
import typings.atUnimodulesReactDashNativeDashAdapter.atUnimodulesReactDashNativeDashAdapterStrings.windows
import typings.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod.NativeModule
import typings.atUnimodulesReactDashNativeDashAdapter.buildNativeModulesProxyMod.ProxyNativeModule
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/react-native-adapter", JSImport.Namespace)
@js.native
object atUnimodulesReactDashNativeDashAdapterMod extends js.Object {
  @js.native
  class CodedError protected ()
    extends typings.atUnimodulesReactDashNativeDashAdapter.buildErrorsCodedErrorMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class EventEmitter protected ()
    extends typings.atUnimodulesReactDashNativeDashAdapter.buildEventEmitterMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  class UnavailabilityError protected ()
    extends typings.atUnimodulesReactDashNativeDashAdapter.buildErrorsUnavailabilityErrorMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  val SyntheticPlatformEmitter: typings.atUnimodulesReactDashNativeDashAdapter.buildSyntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  def requireNativeViewManager[P](viewName: String): ComponentType[P] = js.native
  @js.native
  object NativeModulesProxy extends /* moduleName */ StringDictionary[ProxyNativeModule]
  
  @js.native
  object Platform extends js.Object {
    var OS: ios | android | windows | macos | web = js.native
  }
  
}


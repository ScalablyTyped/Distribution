package typings.unimodulesReactNativeAdapter

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.unimodulesReactNativeAdapter.eventEmitterMod.NativeModule
import typings.unimodulesReactNativeAdapter.nativeModulesProxyTypesMod.ProxyNativeModule
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.android
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.ios
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.macos
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.web
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@unimodules/react-native-adapter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CodedError protected ()
    extends typings.unimodulesReactNativeAdapter.codedErrorMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class EventEmitter protected ()
    extends typings.unimodulesReactNativeAdapter.eventEmitterMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  class UnavailabilityError protected ()
    extends typings.unimodulesReactNativeAdapter.unavailabilityErrorMod.UnavailabilityError {
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


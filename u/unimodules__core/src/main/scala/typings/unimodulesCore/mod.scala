package typings.unimodulesCore

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.unimodulesCore.anon.CurrentVersion
import typings.unimodulesCore.unimodulesCoreStrings.android
import typings.unimodulesCore.unimodulesCoreStrings.ios
import typings.unimodulesCore.unimodulesCoreStrings.macos
import typings.unimodulesCore.unimodulesCoreStrings.web
import typings.unimodulesCore.unimodulesCoreStrings.windows
import typings.unimodulesReactNativeAdapter.eventEmitterMod.NativeModule
import typings.unimodulesReactNativeAdapter.nativeModulesProxyTypesMod.ProxyNativeModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@unimodules/core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class CodedError protected ()
    extends typings.unimodulesCore.adapterProxyMod.CodedError {
    def this(code: String, message: String) = this()
  }
  
  @js.native
  class EventEmitter protected ()
    extends typings.unimodulesCore.adapterProxyMod.EventEmitter {
    def this(nativeModule: NativeModule) = this()
  }
  
  @js.native
  class UnavailabilityError protected ()
    extends typings.unimodulesCore.adapterProxyMod.UnavailabilityError {
    def this(moduleName: String, propertyName: String) = this()
  }
  
  val SyntheticPlatformEmitter: typings.unimodulesReactNativeAdapter.syntheticPlatformEmitterMod.SyntheticPlatformEmitter = js.native
  def deprecate(library: String, deprecatedAPI: String): Unit = js.native
  def deprecate(library: String, deprecatedAPI: String, options: CurrentVersion): Unit = js.native
  def requireNativeViewManager[P](viewName: String): ComponentType[P] = js.native
  @js.native
  object NativeModulesProxy extends /* moduleName */ StringDictionary[ProxyNativeModule]
  
  @js.native
  object Platform extends js.Object {
    var OS: ios | android | windows | macos | web = js.native
  }
  
}


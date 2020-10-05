package typings.unimodulesReactNativeAdapter

import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.android
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.ios
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.macos
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.web
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@unimodules/react-native-adapter/build/Platform", JSImport.Namespace)
@js.native
object platformMod extends js.Object {
  @js.native
  object default extends js.Object {
    var OS: ios | android | windows | macos | web = js.native
  }
  
}


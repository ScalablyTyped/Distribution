package typings.unimodulesReactNativeAdapter

import org.scalablytyped.runtime.TopLevel
import typings.reactNative.mod.PlatformOSType
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
  
  trait _PlatformSelectOSType extends js.Object
  
  @js.native
  object default extends js.Object {
    
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
  
  type PlatformSelect = js.Function1[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ platform in @unimodules/react-native-adapter.@unimodules/react-native-adapter/build/Platform.PlatformSelectOSType ]:? any}
    */ /* specifics */ typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.PlatformSelect with TopLevel[js.Any], 
    js.Any
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNative.mod.PlatformOSType
    - typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.native
    - typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.electron
    - typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.default
  */
  type PlatformSelectOSType = _PlatformSelectOSType | PlatformOSType
}

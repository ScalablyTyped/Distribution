package typings.unimodulesReactNativeAdapter

import org.scalablytyped.runtime.TopLevel
import typings.reactNative.mod.PlatformOSType
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.android
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.ios
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.macos
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.web
import typings.unimodulesReactNativeAdapter.unimodulesReactNativeAdapterStrings.windows
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformMod {
  
  object default {
    
    @JSImport("@unimodules/react-native-adapter/build/Platform", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Denotes the currently running platform.
      * Can be one of ios, android, web.
      */
    @JSImport("@unimodules/react-native-adapter/build/Platform", "default.OS")
    @js.native
    def OS: ios | android | windows | macos | web = js.native
    @scala.inline
    def OS_=(x: ios | android | windows | macos | web): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OS")(x.asInstanceOf[js.Any])
    
    /**
      * Denotes if the DOM API is available in the current environment.
      * The DOM is not available in native React runtimes and Node.js.
      */
    @JSImport("@unimodules/react-native-adapter/build/Platform", "default.isDOMAvailable")
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
    @JSImport("@unimodules/react-native-adapter/build/Platform", "default.select")
    @js.native
    def select: PlatformSelect = js.native
    @scala.inline
    def select_=(x: PlatformSelect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("select")(x.asInstanceOf[js.Any])
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
  
  trait _PlatformSelectOSType extends StObject
}

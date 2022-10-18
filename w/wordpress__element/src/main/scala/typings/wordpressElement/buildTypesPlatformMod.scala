package typings.wordpressElement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesPlatformMod {
  
  object default {
    
    @JSImport("@wordpress/element/build-types/platform", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/element/build-types/platform", "default.OS")
    @js.native
    val OS: String = js.native
    
    @JSImport("@wordpress/element/build-types/platform", "default.isWeb")
    @js.native
    val isWeb: Boolean = js.native
    
    inline def select(spec: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(spec.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}

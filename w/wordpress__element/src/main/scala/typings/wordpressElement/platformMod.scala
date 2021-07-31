package typings.wordpressElement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object platformMod {
  
  object default {
    
    @JSImport("@wordpress/element/build-types/platform", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@wordpress/element/build-types/platform", "default.OS")
    @js.native
    val OS: String = js.native
    
    @scala.inline
    def select(spec: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("select")(spec.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}

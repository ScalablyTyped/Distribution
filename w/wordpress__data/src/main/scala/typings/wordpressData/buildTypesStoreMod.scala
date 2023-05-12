package typings.wordpressData

import typings.wordpressData.anon.GetActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesStoreMod {
  
  object default {
    
    @JSImport("@wordpress/data/build-types/store", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def instantiate(registry: Any): GetActions = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(registry.asInstanceOf[js.Any]).asInstanceOf[GetActions]
    
    @JSImport("@wordpress/data/build-types/store", "default.name")
    @js.native
    val name: String = js.native
  }
}

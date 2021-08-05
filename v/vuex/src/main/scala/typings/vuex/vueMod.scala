package typings.vuex

import typings.vuex.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueMod {
  
  trait Vue extends StObject {
    
    @JSName("$store")
    var $store: Store[js.Any]
  }
  object Vue {
    
    inline def apply($store: Store[js.Any]): Vue = {
      val __obj = js.Dynamic.literal($store = $store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vue]
    }
    
    extension [Self <: Vue](x: Self) {
      
      inline def set$store(value: Store[js.Any]): Self = StObject.set(x, "$store", value.asInstanceOf[js.Any])
    }
  }
}

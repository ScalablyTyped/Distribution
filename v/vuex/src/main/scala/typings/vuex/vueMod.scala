package typings.vuex

import typings.vuex.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueMod {
  
  @js.native
  trait Vue extends StObject {
    
    @JSName("$store")
    var $store: Store[_] = js.native
  }
  object Vue {
    
    @scala.inline
    def apply($store: Store[_]): Vue = {
      val __obj = js.Dynamic.literal($store = $store.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vue]
    }
    
    @scala.inline
    implicit class VueMutableBuilder[Self <: Vue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$store(value: Store[_]): Self = StObject.set(x, "$store", value.asInstanceOf[js.Any])
    }
  }
}

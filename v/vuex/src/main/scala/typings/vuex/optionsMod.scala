package typings.vuex

import typings.vue.vueMod.Vue
import typings.vuex.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  trait ComponentOptions[V /* <: Vue */] extends StObject {
    
    var store: js.UndefOr[Store[js.Any]] = js.undefined
  }
  object ComponentOptions {
    
    inline def apply[V /* <: Vue */](): ComponentOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[V]]
    }
    
    extension [Self <: ComponentOptions[?], V /* <: Vue */](x: Self & ComponentOptions[V]) {
      
      inline def setStore(value: Store[js.Any]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
}

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
    
    @scala.inline
    def apply[V /* <: Vue */](): ComponentOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[V]]
    }
    
    @scala.inline
    implicit class ComponentOptionsMutableBuilder[Self <: ComponentOptions[?], V /* <: Vue */] (val x: Self & ComponentOptions[V]) extends AnyVal {
      
      @scala.inline
      def setStore(value: Store[js.Any]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
}

package typings.vueI18n.mod

import typings.vue.vueMod.Vue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueTypesOptionsAugmentingMod {
  
  trait ComponentOptions[V /* <: Vue */] extends StObject {
    
    var i18n: js.UndefOr[typings.vueI18n.anon.DateTimeFormats] = js.undefined
  }
  object ComponentOptions {
    
    inline def apply[V /* <: Vue */](): ComponentOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[V]]
    }
    
    extension [Self <: ComponentOptions[?], V /* <: Vue */](x: Self & ComponentOptions[V]) {
      
      inline def setI18n(value: typings.vueI18n.anon.DateTimeFormats): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
    }
  }
}

package typings.vueResource

import typings.vue.vueMod.Vue
import typings.vueResource.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  trait ComponentOptions[V /* <: Vue */] extends StObject {
    
    var http: js.UndefOr[
        Dictkey & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ js.Any)
      ] = js.undefined
  }
  object ComponentOptions {
    
    inline def apply[V /* <: Vue */](): ComponentOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[V]]
    }
    
    extension [Self <: ComponentOptions[?], V /* <: Vue */](x: Self & ComponentOptions[V]) {
      
      inline def setHttp(
        value: Dictkey & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ js.Any)
      ): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    }
  }
}

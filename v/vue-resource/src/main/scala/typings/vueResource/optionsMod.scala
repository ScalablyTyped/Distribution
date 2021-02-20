package typings.vueResource

import typings.vue.vueMod.Vue
import typings.vueResource.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsMod {
  
  @js.native
  trait ComponentOptions[V /* <: Vue */] extends StObject {
    
    var http: js.UndefOr[
        Dictkey with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ js.Any)
      ] = js.native
  }
  object ComponentOptions {
    
    @scala.inline
    def apply[V /* <: Vue */](): ComponentOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[V]]
    }
    
    @scala.inline
    implicit class ComponentOptionsMutableBuilder[Self <: ComponentOptions[_], V /* <: Vue */] (val x: Self with ComponentOptions[V]) extends AnyVal {
      
      @scala.inline
      def setHttp(
        value: Dictkey with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ js.Any)
      ): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    }
  }
}

package typings.vueResource

import typings.vueResource.anon.Dictkey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueTypesOptionsMod {
  
  trait ComponentOptions[V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */] extends StObject {
    
    var http: js.UndefOr[
        Dictkey & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ Any)
      ] = js.undefined
  }
  object ComponentOptions {
    
    inline def apply[V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */](): ComponentOptions[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComponentOptions[?], V /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any */] (val x: Self & ComponentOptions[V]) extends AnyVal {
      
      inline def setHttp(
        value: Dictkey & (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ Any)
      ): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    }
  }
}

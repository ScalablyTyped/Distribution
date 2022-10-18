package typings.vueResource

import typings.std.PromiseLike
import typings.vueResource.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueTypesVueMod {
  
  trait Vue extends StObject {
    
    @JSName("$http")
    def $http(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ Any
    ): PromiseLike[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpResponse */ Any
      ]
    @JSName("$http")
    var $http_Original: Call
    
    @JSName("$resource")
    var $resource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $resource */ Any
  }
  object Vue {
    
    inline def apply(
      $http: Call,
      $resource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $resource */ Any
    ): Vue = {
      val __obj = js.Dynamic.literal($http = $http.asInstanceOf[js.Any], $resource = $resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vue]
    }
    
    extension [Self <: Vue](x: Self) {
      
      inline def set$http(value: Call): Self = StObject.set(x, "$http", value.asInstanceOf[js.Any])
      
      inline def set$resource(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $resource */ Any
      ): Self = StObject.set(x, "$resource", value.asInstanceOf[js.Any])
    }
  }
}

package typings.vueResource

import typings.vueResource.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueMod {
  
  trait Vue extends StObject {
    
    @JSName("$http")
    def $http(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ js.Any
    ): js.Thenable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpResponse */ js.Any
      ]
    @JSName("$http")
    var $http_Original: Call
    
    @JSName("$resource")
    var $resource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $resource */ js.Any
  }
  object Vue {
    
    @scala.inline
    def apply(
      $http: Call,
      $resource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $resource */ js.Any
    ): Vue = {
      val __obj = js.Dynamic.literal($http = $http.asInstanceOf[js.Any], $resource = $resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[Vue]
    }
    
    @scala.inline
    implicit class VueMutableBuilder[Self <: Vue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$http(value: Call): Self = StObject.set(x, "$http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$resource(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $resource */ js.Any
      ): Self = StObject.set(x, "$resource", value.asInstanceOf[js.Any])
    }
  }
}

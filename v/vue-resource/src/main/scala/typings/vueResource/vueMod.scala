package typings.vueResource

import typings.vueResource.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueMod {
  
  @js.native
  trait Vue extends StObject {
    
    @JSName("$http")
    def $http(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ js.Any
    ): js.Thenable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpResponse */ _
      ] = js.native
    @JSName("$http")
    var $http_Original: Call = js.native
    
    @JSName("$resource")
    var $resource: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $resource */ js.Any = js.native
  }
}

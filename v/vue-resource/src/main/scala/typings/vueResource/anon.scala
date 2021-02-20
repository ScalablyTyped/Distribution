package typings.vueResource

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call extends StObject {
    
    def apply(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpOptions */ js.Any
    ): js.Thenable[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpResponse */ _
      ] = js.native
    
    var delete: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $http */ js.Any = js.native
    
    var get: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $http */ js.Any = js.native
    
    var jsonp: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $http */ js.Any = js.native
    
    var patch: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $http */ js.Any = js.native
    
    var post: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $http */ js.Any = js.native
    
    var put: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify $http */ js.Any = js.native
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var headers: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpHeaders */ js.Any
      ] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HttpHeaders */ js.Any
      ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    }
  }
}

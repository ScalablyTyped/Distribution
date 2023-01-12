package typings.tadashiKoaJwtAuthz

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<@tadashi/koa-jwt-authz.@tadashi/koa-jwt-authz.koaJwtAuthz.Options> */
  trait PartialOptions extends StObject {
    
    var checkAllScopes: js.UndefOr[Boolean] = js.undefined
    
    var customScopeKey: js.UndefOr[String] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      inline def setCheckAllScopes(value: Boolean): Self = StObject.set(x, "checkAllScopes", value.asInstanceOf[js.Any])
      
      inline def setCheckAllScopesUndefined: Self = StObject.set(x, "checkAllScopes", js.undefined)
      
      inline def setCustomScopeKey(value: String): Self = StObject.set(x, "customScopeKey", value.asInstanceOf[js.Any])
      
      inline def setCustomScopeKeyUndefined: Self = StObject.set(x, "customScopeKey", js.undefined)
    }
  }
}

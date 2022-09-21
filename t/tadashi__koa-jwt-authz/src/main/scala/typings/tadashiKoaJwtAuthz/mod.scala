package typings.tadashiKoaJwtAuthz

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import typings.tadashiKoaJwtAuthz.anon.PartialOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tadashi/koa-jwt-authz", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(expectedScopes: js.Array[String]): Middleware[DefaultState, DefaultContext, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(expectedScopes.asInstanceOf[js.Any]).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  inline def default(expectedScopes: js.Array[String], options: PartialOptions): Middleware[DefaultState, DefaultContext, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(expectedScopes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Middleware[DefaultState, DefaultContext, Any]]
  
  object koaJwtAuthz {
    
    trait Options extends StObject {
      
      var checkAllScopes: Boolean
      
      var customScopeKey: String
    }
    object Options {
      
      inline def apply(checkAllScopes: Boolean, customScopeKey: String): Options = {
        val __obj = js.Dynamic.literal(checkAllScopes = checkAllScopes.asInstanceOf[js.Any], customScopeKey = customScopeKey.asInstanceOf[js.Any])
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setCheckAllScopes(value: Boolean): Self = StObject.set(x, "checkAllScopes", value.asInstanceOf[js.Any])
        
        inline def setCustomScopeKey(value: String): Self = StObject.set(x, "customScopeKey", value.asInstanceOf[js.Any])
      }
    }
  }
}

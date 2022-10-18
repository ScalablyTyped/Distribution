package typings.undici

import typings.undici.typesDispatcherMod.DispatchInterceptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInterceptorsMod {
  
  @JSImport("undici/types/interceptors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createRedirectInterceptor(opts: RedirectInterceptorOpts): DispatchInterceptor = ^.asInstanceOf[js.Dynamic].applyDynamic("createRedirectInterceptor")(opts.asInstanceOf[js.Any]).asInstanceOf[DispatchInterceptor]
  
  trait RedirectInterceptorOpts extends StObject {
    
    var maxRedirections: js.UndefOr[Double] = js.undefined
  }
  object RedirectInterceptorOpts {
    
    inline def apply(): RedirectInterceptorOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RedirectInterceptorOpts]
    }
    
    extension [Self <: RedirectInterceptorOpts](x: Self) {
      
      inline def setMaxRedirections(value: Double): Self = StObject.set(x, "maxRedirections", value.asInstanceOf[js.Any])
      
      inline def setMaxRedirectionsUndefined: Self = StObject.set(x, "maxRedirections", js.undefined)
    }
  }
}

package typings.validator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isFQDNMod {
  
  @JSImport("validator/lib/isFQDN", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(str: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(str: String, options: IsFQDNOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(str.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait IsFQDNOptions extends StObject {
    
    /**
      * @default false
      */
    var allow_numeric_tld: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var allow_trailing_dot: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var allow_underscores: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `allow_wildcard` is set to true, the validator will allow domain starting with `*.` (e.g. `*.example.com` or `*.shop.example.com`).
      * @default false
      */
    var allow_wildcard: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default true
      */
    var require_tld: js.UndefOr[Boolean] = js.undefined
  }
  object IsFQDNOptions {
    
    inline def apply(): IsFQDNOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsFQDNOptions]
    }
    
    extension [Self <: IsFQDNOptions](x: Self) {
      
      inline def setAllow_numeric_tld(value: Boolean): Self = StObject.set(x, "allow_numeric_tld", value.asInstanceOf[js.Any])
      
      inline def setAllow_numeric_tldUndefined: Self = StObject.set(x, "allow_numeric_tld", js.undefined)
      
      inline def setAllow_trailing_dot(value: Boolean): Self = StObject.set(x, "allow_trailing_dot", value.asInstanceOf[js.Any])
      
      inline def setAllow_trailing_dotUndefined: Self = StObject.set(x, "allow_trailing_dot", js.undefined)
      
      inline def setAllow_underscores(value: Boolean): Self = StObject.set(x, "allow_underscores", value.asInstanceOf[js.Any])
      
      inline def setAllow_underscoresUndefined: Self = StObject.set(x, "allow_underscores", js.undefined)
      
      inline def setAllow_wildcard(value: Boolean): Self = StObject.set(x, "allow_wildcard", value.asInstanceOf[js.Any])
      
      inline def setAllow_wildcardUndefined: Self = StObject.set(x, "allow_wildcard", js.undefined)
      
      inline def setRequire_tld(value: Boolean): Self = StObject.set(x, "require_tld", value.asInstanceOf[js.Any])
      
      inline def setRequire_tldUndefined: Self = StObject.set(x, "require_tld", js.undefined)
    }
  }
}

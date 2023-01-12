package typings.urlRegexSafe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): js.RegExp = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.RegExp]
  inline def apply(options: Options): js.RegExp = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  
  @JSImport("url-regex-safe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Partial<{  exact :boolean,   strict :boolean,   auth :boolean,   localhost :boolean,   parens :boolean,   apostrophes :boolean,   trailingPeriod :boolean,   ipv4 :boolean,   ipv6 :boolean,   tlds :std.Array<string>,   returnString :boolean}> */
  trait Options extends StObject {
    
    var apostrophes: js.UndefOr[Boolean] = js.undefined
    
    var auth: js.UndefOr[Boolean] = js.undefined
    
    var exact: js.UndefOr[Boolean] = js.undefined
    
    var ipv4: js.UndefOr[Boolean] = js.undefined
    
    var ipv6: js.UndefOr[Boolean] = js.undefined
    
    var localhost: js.UndefOr[Boolean] = js.undefined
    
    var parens: js.UndefOr[Boolean] = js.undefined
    
    var returnString: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var tlds: js.UndefOr[js.Array[String]] = js.undefined
    
    var trailingPeriod: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setApostrophes(value: Boolean): Self = StObject.set(x, "apostrophes", value.asInstanceOf[js.Any])
      
      inline def setApostrophesUndefined: Self = StObject.set(x, "apostrophes", js.undefined)
      
      inline def setAuth(value: Boolean): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setExact(value: Boolean): Self = StObject.set(x, "exact", value.asInstanceOf[js.Any])
      
      inline def setExactUndefined: Self = StObject.set(x, "exact", js.undefined)
      
      inline def setIpv4(value: Boolean): Self = StObject.set(x, "ipv4", value.asInstanceOf[js.Any])
      
      inline def setIpv4Undefined: Self = StObject.set(x, "ipv4", js.undefined)
      
      inline def setIpv6(value: Boolean): Self = StObject.set(x, "ipv6", value.asInstanceOf[js.Any])
      
      inline def setIpv6Undefined: Self = StObject.set(x, "ipv6", js.undefined)
      
      inline def setLocalhost(value: Boolean): Self = StObject.set(x, "localhost", value.asInstanceOf[js.Any])
      
      inline def setLocalhostUndefined: Self = StObject.set(x, "localhost", js.undefined)
      
      inline def setParens(value: Boolean): Self = StObject.set(x, "parens", value.asInstanceOf[js.Any])
      
      inline def setParensUndefined: Self = StObject.set(x, "parens", js.undefined)
      
      inline def setReturnString(value: Boolean): Self = StObject.set(x, "returnString", value.asInstanceOf[js.Any])
      
      inline def setReturnStringUndefined: Self = StObject.set(x, "returnString", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setTlds(value: js.Array[String]): Self = StObject.set(x, "tlds", value.asInstanceOf[js.Any])
      
      inline def setTldsUndefined: Self = StObject.set(x, "tlds", js.undefined)
      
      inline def setTldsVarargs(value: String*): Self = StObject.set(x, "tlds", js.Array(value*))
      
      inline def setTrailingPeriod(value: Boolean): Self = StObject.set(x, "trailingPeriod", value.asInstanceOf[js.Any])
      
      inline def setTrailingPeriodUndefined: Self = StObject.set(x, "trailingPeriod", js.undefined)
    }
  }
}

package typings.universalCookie

import typings.universalCookie.universalCookieStrings.lax
import typings.universalCookie.universalCookieStrings.none
import typings.universalCookie.universalCookieStrings.strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsTypesMod {
  
  type Cookie = Any
  
  type CookieChangeListener = js.Function1[/* options */ CookieChangeOptions, Unit]
  
  trait CookieChangeOptions extends StObject {
    
    var name: String
    
    var options: js.UndefOr[CookieSetOptions] = js.undefined
    
    var value: js.UndefOr[Any] = js.undefined
  }
  object CookieChangeOptions {
    
    inline def apply(name: String): CookieChangeOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CookieChangeOptions]
    }
    
    extension [Self <: CookieChangeOptions](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: CookieSetOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CookieGetOptions extends StObject {
    
    var doNotParse: js.UndefOr[Boolean] = js.undefined
  }
  object CookieGetOptions {
    
    inline def apply(): CookieGetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieGetOptions]
    }
    
    extension [Self <: CookieGetOptions](x: Self) {
      
      inline def setDoNotParse(value: Boolean): Self = StObject.set(x, "doNotParse", value.asInstanceOf[js.Any])
      
      inline def setDoNotParseUndefined: Self = StObject.set(x, "doNotParse", js.undefined)
    }
  }
  
  trait CookieParseOptions extends StObject {
    
    def decode(value: String): String
  }
  object CookieParseOptions {
    
    inline def apply(decode: String => String): CookieParseOptions = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode))
      __obj.asInstanceOf[CookieParseOptions]
    }
    
    extension [Self <: CookieParseOptions](x: Self) {
      
      inline def setDecode(value: String => String): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    }
  }
  
  trait CookieSetOptions extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var encode: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    var expires: js.UndefOr[js.Date] = js.undefined
    
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
    
    var sameSite: js.UndefOr[Boolean | none | lax | strict] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object CookieSetOptions {
    
    inline def apply(): CookieSetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieSetOptions]
    }
    
    extension [Self <: CookieSetOptions](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEncode(value: /* value */ String => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSameSite(value: Boolean | none | lax | strict): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
}

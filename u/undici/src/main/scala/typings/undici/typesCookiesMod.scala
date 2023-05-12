package typings.undici

import typings.std.Record
import typings.undici.anon.Domain
import typings.undici.typesFetchMod.Headers
import typings.undici.undiciStrings.Lax
import typings.undici.undiciStrings.None
import typings.undici.undiciStrings.Strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCookiesMod {
  
  @JSImport("undici/types/cookies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteCookie(headers: Headers, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteCookie")(headers.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def deleteCookie(headers: Headers, name: String, attributes: Domain): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteCookie")(headers.asInstanceOf[js.Any], name.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCookies(headers: Headers): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCookies")(headers.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  
  inline def getSetCookies(headers: Headers): js.Array[Cookie] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSetCookies")(headers.asInstanceOf[js.Any]).asInstanceOf[js.Array[Cookie]]
  
  inline def setCookie(headers: Headers, cookie: Cookie): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCookie")(headers.asInstanceOf[js.Any], cookie.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Cookie extends StObject {
    
    var domain: js.UndefOr[String] = js.undefined
    
    var expires: js.UndefOr[js.Date | Double] = js.undefined
    
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var path: js.UndefOr[String] = js.undefined
    
    var sameSite: js.UndefOr[Strict | Lax | None] = js.undefined
    
    var secure: js.UndefOr[Boolean] = js.undefined
    
    var unparsed: js.UndefOr[js.Array[String]] = js.undefined
    
    var value: String
  }
  object Cookie {
    
    inline def apply(name: String, value: String): Cookie = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cookie]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpires(value: js.Date | Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSameSite(value: Strict | Lax | None): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
      
      inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setUnparsed(value: js.Array[String]): Self = StObject.set(x, "unparsed", value.asInstanceOf[js.Any])
      
      inline def setUnparsedUndefined: Self = StObject.set(x, "unparsed", js.undefined)
      
      inline def setUnparsedVarargs(value: String*): Self = StObject.set(x, "unparsed", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}

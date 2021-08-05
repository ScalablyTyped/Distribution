package typings.universalCookie

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("universal-cookie", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with Cookies {
    def this(cookieHeader: String) = this()
    def this(cookieHeader: CookiesByName) = this()
  }
  
  type ChangeListenerCallback = js.Function3[/* name */ String, /* value */ String | js.Object, /* options */ CookieOpts, Unit]
  
  trait CookieOpts extends StObject {
    
    /**
      * domain for the cookie (sub.domain.com or .allsubdomains.com)
      */
    var domain: js.UndefOr[String] = js.undefined
    
    /**
      * absolute expiration date for the cookie
      */
    var expires: js.UndefOr[Date] = js.undefined
    
    /**
      * Is only the server can access the cookie?
      */
    var httpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * relative max age of the cookie from when the client receives it in second
      */
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * cookie path, use / as the path if you want your cookie to be accessible on all pages
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Is only accessible through HTTPS?
      */
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object CookieOpts {
    
    inline def apply(): CookieOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieOpts]
    }
    
    extension [Self <: CookieOpts](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  @js.native
  trait Cookies extends StObject {
    
    /**
      * Add a listener to when a cookie is set or removed.
      *
      * @param callback Call that will be called with the first argument containing name, value and options of the changed cookie.
      */
    def addChangeListener(callback: ChangeListenerCallback): Unit = js.native
    
    /**
      * Get a cookie value
      *
      * @param name cookie name
      * @param options.doNotParse do not convert the cookie into an object no matter what
      */
    def get(name: String): String = js.native
    def get(name: String, options: GetOpts): String = js.native
    
    /**
      * Get all cookies
      *
      * @param options.doNotParse do not convert the cookie into an object no matter what
      */
    def getAll(): CookiesByName = js.native
    def getAll(options: GetOpts): CookiesByName = js.native
    
    /**
      * Set a cookie value
      *
      * @param name cookie name
      * @param options Support all the cookie options from RFC 6265
      */
    def remove(name: String): Unit = js.native
    def remove(name: String, options: CookieOpts): Unit = js.native
    
    /**
      * Remove a listener from the change callback.
      */
    def removeChangeListener(callback: ChangeListenerCallback): Unit = js.native
    
    /**
      * Set a cookie value
      *
      * @param name cookie name
      * @param value save the value and stringify the object if needed
      * @param options Support all the cookie options from RFC 6265
      */
    def set(name: String, value: String): Unit = js.native
    def set(name: String, value: String, options: CookieOpts): Unit = js.native
    def set(name: String, value: js.Object): Unit = js.native
    def set(name: String, value: js.Object, options: CookieOpts): Unit = js.native
  }
  
  type CookiesByName = StringDictionary[String]
  
  trait GetOpts extends StObject {
    
    /**
      * do not convert the cookie into an object no matter what
      */
    var doNotParse: Boolean
  }
  object GetOpts {
    
    inline def apply(doNotParse: Boolean): GetOpts = {
      val __obj = js.Dynamic.literal(doNotParse = doNotParse.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOpts]
    }
    
    extension [Self <: GetOpts](x: Self) {
      
      inline def setDoNotParse(value: Boolean): Self = StObject.set(x, "doNotParse", value.asInstanceOf[js.Any])
    }
  }
}

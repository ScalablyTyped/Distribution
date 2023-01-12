package typings.yar

import typings.hapi.mod.Request
import typings.yar.yarBooleans.`false`
import typings.yar.yarStrings.Lax
import typings.yar.yarStrings.Strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClearInvalid extends StObject {
    
    /**
      * Tells Hapi that if a session cookie is invalid for any reason,
      * to clear it from the browser.
      * This prevents Hapi from having to reprocess the bad cookie on future requests.
      * In general you'll probably want this on,
      * but if you'd prefer that session cookies be dealt with in some
      * other way you may set this to false.
      * Defaults to true
      */
    var clearInvalid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * an optional function to create custom session IDs.
      * Must retun a string and have the signature function (request) where:
      * request - (optional) is the original request received from the client.
      * Defaults to uuidv4
      */
    var customSessionIDGenerator: js.UndefOr[js.Function1[/* req */ Request, String]] = js.undefined
    
    /**
      * Tells Hapi that it should not respond with a HTTP 400 error if the session cookie cannot decrypt.
      * This could happen if the cookie is changed on the client, or more likely, if you change the cookie password in your settings.
      * If you want to make this condition send an error like it did in prior versions, change this to `false`,
      * but be aware that if you change your cookie password you will cause 400 errors to be returned to end users.
      * In that case you should probably change this back to true for a short time to allow session cookies to get reset for the best user experience.
      * Defaults to true.
      */
    var ignoreErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * determines whether or not to set HttpOnly option in cookie.
      * Defaults to false.
      */
    var isHttpOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * enables the same-site cookie parameter.
      * Default to 'Lax'.
      */
    var isSameSite: js.UndefOr[Lax | Strict | `false`] = js.undefined
    
    /**
      * determines whether or not to transfer using TLS/SSL.
      * Defaults to true.
      */
    var isSecure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * (Required) used to encrypt and sign the cookie data.
      * Must be at least 32 chars.
      */
    var password: String
    
    /**
      * determines the cookie path.
      * Defaults to '/'.
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * sets the time for the cookie to live in the browser, in milliseconds.
      * Defaults to null (session time-life - cookies are deleted when the browser is closed).
      */
    var ttl: js.UndefOr[Double] = js.undefined
  }
  object ClearInvalid {
    
    inline def apply(password: String): ClearInvalid = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearInvalid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClearInvalid] (val x: Self) extends AnyVal {
      
      inline def setClearInvalid(value: Boolean): Self = StObject.set(x, "clearInvalid", value.asInstanceOf[js.Any])
      
      inline def setClearInvalidUndefined: Self = StObject.set(x, "clearInvalid", js.undefined)
      
      inline def setCustomSessionIDGenerator(value: /* req */ Request => String): Self = StObject.set(x, "customSessionIDGenerator", js.Any.fromFunction1(value))
      
      inline def setCustomSessionIDGeneratorUndefined: Self = StObject.set(x, "customSessionIDGenerator", js.undefined)
      
      inline def setIgnoreErrors(value: Boolean): Self = StObject.set(x, "ignoreErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreErrorsUndefined: Self = StObject.set(x, "ignoreErrors", js.undefined)
      
      inline def setIsHttpOnly(value: Boolean): Self = StObject.set(x, "isHttpOnly", value.asInstanceOf[js.Any])
      
      inline def setIsHttpOnlyUndefined: Self = StObject.set(x, "isHttpOnly", js.undefined)
      
      inline def setIsSameSite(value: Lax | Strict | `false`): Self = StObject.set(x, "isSameSite", value.asInstanceOf[js.Any])
      
      inline def setIsSameSiteUndefined: Self = StObject.set(x, "isSameSite", js.undefined)
      
      inline def setIsSecure(value: Boolean): Self = StObject.set(x, "isSecure", value.asInstanceOf[js.Any])
      
      inline def setIsSecureUndefined: Self = StObject.set(x, "isSecure", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}

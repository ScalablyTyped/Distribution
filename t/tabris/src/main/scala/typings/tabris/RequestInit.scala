package typings.tabris

import org.scalablytyped.runtime.StringDictionary
import typings.tabris.tabrisStrings.`force-cache`
import typings.tabris.tabrisStrings.`no-cache`
import typings.tabris.tabrisStrings.`no-cors`
import typings.tabris.tabrisStrings.`no-store`
import typings.tabris.tabrisStrings.`only-if-cached`
import typings.tabris.tabrisStrings.`same-origin`
import typings.tabris.tabrisStrings.cors
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.include
import typings.tabris.tabrisStrings.omit
import typings.tabris.tabrisStrings.reload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// RequestInit
trait RequestInit extends StObject {
  
  /**
    * The body of the request. GET or HEAD requests can not have a body.
    */
  var body: js.UndefOr[Blob | FormData | String] = js.undefined
  
  var cache: js.UndefOr[default | `force-cache` | `no-cache` | `no-store` | `only-if-cached` | reload] = js.undefined
  
  var credentials: js.UndefOr[include | omit | `same-origin`] = js.undefined
  
  /**
    * The headers to add to the request.
    */
  var headers: js.UndefOr[Headers | (js.Array[js.Tuple2[String, String]]) | StringDictionary[String]] = js.undefined
  
  /**
    * The request method, e.g., `'GET'`, `'POST'`.
    */
  var method: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[cors | `no-cors` | `same-origin`] = js.undefined
  
  /**
    * The network request timeout in milliseconds
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object RequestInit {
  
  @scala.inline
  def apply(): RequestInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestInit]
  }
  
  @scala.inline
  implicit class RequestInitMutableBuilder[Self <: RequestInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Blob | FormData | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCache(value: default | `force-cache` | `no-cache` | `no-store` | `only-if-cached` | reload): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    @scala.inline
    def setCredentials(value: include | omit | `same-origin`): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    @scala.inline
    def setHeaders(value: Headers | (js.Array[js.Tuple2[String, String]]) | StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setMode(value: cors | `no-cors` | `same-origin`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}

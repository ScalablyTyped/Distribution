package typings.testcafe.mod.global

import typings.std.Record
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptions extends StObject {
  
  /**
    * Request auth.
    */
  var auth: js.UndefOr[AuthOptions] = js.undefined
  
  /**
    * Request body.
    */
  var body: js.UndefOr[Any] = js.undefined
  
  /**
    * Request headers.
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * Request methods.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * Request params.
    */
  var params: js.UndefOr[Params] = js.undefined
  
  /**
    * Request proxy.
    */
  var proxy: js.UndefOr[ProxyOptions] = js.undefined
  
  /**
    * Return raw response.
    */
  var rawResponse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request timeout.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    *  Request url.
    */
  var url: js.UndefOr[String | URL] = js.undefined
  
  /**
    * Request credentials.
    */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object RequestOptions {
  
  inline def apply(): RequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: AuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setProxy(value: ProxyOptions): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setRawResponse(value: Boolean): Self = StObject.set(x, "rawResponse", value.asInstanceOf[js.Any])
    
    inline def setRawResponseUndefined: Self = StObject.set(x, "rawResponse", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String | URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}

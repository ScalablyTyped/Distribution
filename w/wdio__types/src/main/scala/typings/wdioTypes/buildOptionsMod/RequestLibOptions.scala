package typings.wdioTypes.buildOptionsMod

import typings.node.nodeColonurlMod.URL
import typings.std.Record
import typings.std.URLSearchParams
import typings.wdioTypes.anon.Limit
import typings.wdioTypes.anon.Response
import typings.wdioTypes.wdioTypesStrings.DELETE
import typings.wdioTypes.wdioTypesStrings.GET
import typings.wdioTypes.wdioTypesStrings.HEAD
import typings.wdioTypes.wdioTypesStrings.OPTIONS
import typings.wdioTypes.wdioTypesStrings.PATCH
import typings.wdioTypes.wdioTypesStrings.POST
import typings.wdioTypes.wdioTypesStrings.PUT
import typings.wdioTypes.wdioTypesStrings.TRACE
import typings.wdioTypes.wdioTypesStrings.buffer
import typings.wdioTypes.wdioTypesStrings.delete_
import typings.wdioTypes.wdioTypesStrings.get_
import typings.wdioTypes.wdioTypesStrings.head_
import typings.wdioTypes.wdioTypesStrings.json
import typings.wdioTypes.wdioTypesStrings.options_
import typings.wdioTypes.wdioTypesStrings.patch_
import typings.wdioTypes.wdioTypesStrings.post_
import typings.wdioTypes.wdioTypesStrings.put_
import typings.wdioTypes.wdioTypesStrings.text
import typings.wdioTypes.wdioTypesStrings.trace_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestLibOptions extends StObject {
  
  var agent: js.UndefOr[Agents] = js.undefined
  
  var body: js.UndefOr[Any] = js.undefined
  
  var followRedirect: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[Record[String, js.UndefOr[String | js.Array[String]]]] = js.undefined
  
  var https: js.UndefOr[Record[String, Any]] = js.undefined
  
  var json: js.UndefOr[Record[String, Any]] = js.undefined
  
  var method: js.UndefOr[
    GET | POST | PUT | PATCH | HEAD | DELETE | OPTIONS | TRACE | get_ | post_ | put_ | patch_ | head_ | delete_ | options_ | trace_
  ] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var responseType: js.UndefOr[json | buffer | text] = js.undefined
  
  var retry: js.UndefOr[Limit] = js.undefined
  
  var searchParams: js.UndefOr[(Record[String, js.UndefOr[String | Double | Boolean | Null]]) | URLSearchParams] = js.undefined
  
  var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Response] = js.undefined
  
  var url: js.UndefOr[URL] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object RequestLibOptions {
  
  inline def apply(): RequestLibOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLibOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestLibOptions] (val x: Self) extends AnyVal {
    
    inline def setAgent(value: Agents): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
    
    inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
    
    inline def setHeaders(value: Record[String, js.UndefOr[String | js.Array[String]]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHttps(value: Record[String, Any]): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setJson(value: Record[String, Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setMethod(
      value: GET | POST | PUT | PATCH | HEAD | DELETE | OPTIONS | TRACE | get_ | post_ | put_ | patch_ | head_ | delete_ | options_ | trace_
    ): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setResponseType(value: json | buffer | text): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setRetry(value: Limit): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setSearchParams(value: (Record[String, js.UndefOr[String | Double | Boolean | Null]]) | URLSearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
    
    inline def setSearchParamsUndefined: Self = StObject.set(x, "searchParams", js.undefined)
    
    inline def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
    
    inline def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
    
    inline def setTimeout(value: Response): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}

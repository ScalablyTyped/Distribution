package typings.testcafeHammerhead.mod

import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.OutgoingHttpHeaders
import typings.testcafeHammerhead.Credentials
import typings.testcafeHammerhead.ExternalProxySettings
import typings.testcafeHammerhead.RequestTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOptionsParams extends StObject {
  
  var auth: js.UndefOr[String | Unit] = js.undefined
  
  var body: Buffer
  
  var credentials: js.UndefOr[Credentials] = js.undefined
  
  var disableHttp2: js.UndefOr[Boolean] = js.undefined
  
  var externalProxySettings: js.UndefOr[ExternalProxySettings] = js.undefined
  
  var headers: OutgoingHttpHeaders
  
  var host: String
  
  var hostname: String
  
  var isAjax: js.UndefOr[Boolean] = js.undefined
  
  var isWebSocket: js.UndefOr[Boolean] = js.undefined
  
  var method: String
  
  var path: String
  
  var port: js.UndefOr[String | Unit] = js.undefined
  
  var protocol: String
  
  var rawHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var requestId: js.UndefOr[String] = js.undefined
  
  var requestTimeout: js.UndefOr[RequestTimeout] = js.undefined
  
  var url: String
}
object RequestOptionsParams {
  
  inline def apply(
    body: Buffer,
    headers: OutgoingHttpHeaders,
    host: String,
    hostname: String,
    method: String,
    path: String,
    protocol: String,
    url: String
  ): RequestOptionsParams = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptionsParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestOptionsParams] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: String | Unit): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setDisableHttp2(value: Boolean): Self = StObject.set(x, "disableHttp2", value.asInstanceOf[js.Any])
    
    inline def setDisableHttp2Undefined: Self = StObject.set(x, "disableHttp2", js.undefined)
    
    inline def setExternalProxySettings(value: ExternalProxySettings): Self = StObject.set(x, "externalProxySettings", value.asInstanceOf[js.Any])
    
    inline def setExternalProxySettingsUndefined: Self = StObject.set(x, "externalProxySettings", js.undefined)
    
    inline def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setIsAjax(value: Boolean): Self = StObject.set(x, "isAjax", value.asInstanceOf[js.Any])
    
    inline def setIsAjaxUndefined: Self = StObject.set(x, "isAjax", js.undefined)
    
    inline def setIsWebSocket(value: Boolean): Self = StObject.set(x, "isWebSocket", value.asInstanceOf[js.Any])
    
    inline def setIsWebSocketUndefined: Self = StObject.set(x, "isWebSocket", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPort(value: String | Unit): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setRawHeaders(value: js.Array[String]): Self = StObject.set(x, "rawHeaders", value.asInstanceOf[js.Any])
    
    inline def setRawHeadersUndefined: Self = StObject.set(x, "rawHeaders", js.undefined)
    
    inline def setRawHeadersVarargs(value: String*): Self = StObject.set(x, "rawHeaders", js.Array(value*))
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setRequestTimeout(value: RequestTimeout): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

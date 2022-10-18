package typings.testcafe.mod.global

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link https://devexpress.github.io/testcafe/documentation/reference/test-api/requestmock/respond.html#requestoptions See documentation}.
  */
trait RequestMockOptions extends StObject {
  
  /** The request body. */
  var body: Buffer
  
  /**
    * Credentials that were used for authentication in the current session using NTLM or Basic
    * authentication. For HTTP Basic authentication, these are `username` and `password`. NTLM
    * authentication additionally specifies `workstation` and `domain`.
    * See {@link https://devexpress.github.io/testcafe/documentation/guides/advanced-guides/authentication.html#http-authentication HTTP Authentication}.
    */
  var credentials: Record[String, String]
  
  /** The request headers in the property-value form. */
  var headers: Record[String, String]
  
  /** The domain name or IP address of the server to issue the request to. Default: localhost. */
  var host: String
  
  /** The alias for the host. */
  var hostname: String
  
  /**
    * Specifies whether the request is an AJAX request (xhr or fetch).
    */
  var isAjax: Boolean
  
  /** The HTTP request method. Default: 'GET'. */
  var method: String
  
  /**
    * The request path. Should include query string if any. E.G. '/index.html?page=12'. An exception
    * is thrown when the request path contains illegal characters. Currently, only spaces are
    * rejected but that may change in the future. Default: '/'.
    */
  var path: String
  
  /** The port of the remote server. Default: 80. */
  var port: Double
  
  /** The protocol to use. Default: http:. */
  var protocol: String
  
  /**
    * If a proxy is used, the property contains information about its `host`, `hostname`, `port`,
    * `proxyAuth`, `authHeader` and `bypassRules`.
    */
  var proxy: Record[String, Any]
  
  /** The URL of the resource. */
  var url: String
}
object RequestMockOptions {
  
  inline def apply(
    body: Buffer,
    credentials: Record[String, String],
    headers: Record[String, String],
    host: String,
    hostname: String,
    isAjax: Boolean,
    method: String,
    path: String,
    port: Double,
    protocol: String,
    proxy: Record[String, Any],
    url: String
  ): RequestMockOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], isAjax = isAjax.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMockOptions]
  }
  
  extension [Self <: RequestMockOptions](x: Self) {
    
    inline def setBody(value: Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCredentials(value: Record[String, String]): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setIsAjax(value: Boolean): Self = StObject.set(x, "isAjax", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProxy(value: Record[String, Any]): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}

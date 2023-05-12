package typings.webpack.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.node.tlsMod.TlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.node.httpMod.ServerOptions because var conflicts: keepAlive, keepAliveInitialDelay, noDelay. Inlined connectionsCheckingInterval, IncomingMessage, requestTimeout, ServerResponse, keepAliveTimeout, maxHeaderSize, insecureHTTPParser, highWaterMark, joinDuplicateHeaders, uniqueHeaders */ trait ServerOptionsHttps[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
/* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
ServerResponse[IncomingMessage]] */]
  extends StObject
     with TlsOptions {
  
  /**
    * Specifies the `IncomingMessage` class to be used. Useful for extending the original `IncomingMessage`.
    */
  var IncomingMessage: js.UndefOr[Request] = js.undefined
  
  /**
    * Specifies the `ServerResponse` class to be used. Useful for extending the original `ServerResponse`.
    */
  var ServerResponse: js.UndefOr[Response] = js.undefined
  
  /**
    * Sets the interval value in milliseconds to check for request and headers timeout in incomplete requests.
    * @default 30000
    */
  var connectionsCheckingInterval: js.UndefOr[Double] = js.undefined
  
  /**
    * Optionally overrides all `socket`s' `readableHighWaterMark` and `writableHighWaterMark`.
    * This affects `highWaterMark` property of both `IncomingMessage` and `ServerResponse`.
    * Default: @see stream.getDefaultHighWaterMark().
    * @since v20.1.0
    */
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  /**
    * Use an insecure HTTP parser that accepts invalid HTTP headers when `true`.
    * Using the insecure parser should be avoided.
    * See --insecure-http-parser for more information.
    * @default false
    */
  var insecureHTTPParser: js.UndefOr[Boolean] = js.undefined
  
  /**
    * It joins the field line values of multiple headers in a request with `, ` instead of discarding the duplicates.
    * @default false
    * @since v18.14.0
    */
  var joinDuplicateHeaders: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of milliseconds of inactivity a server needs to wait for additional incoming data,
    * after it has finished writing the last response, before a socket will be destroyed.
    * @see Server.keepAliveTimeout for more information.
    * @default 5000
    * @since v18.0.0
    */
  var keepAliveTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * Optionally overrides the value of
    * `--max-http-header-size` for requests received by this server, i.e.
    * the maximum length of request headers in bytes.
    * @default 16384
    * @since v13.3.0
    */
  var maxHeaderSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the timeout value in milliseconds for receiving the entire request from the client.
    * @see Server.requestTimeout for more information.
    * @default 300000
    * @since v18.0.0
    */
  var requestTimeout: js.UndefOr[Double] = js.undefined
  
  /**
    * A list of response headers that should be sent only once.
    * If the header's value is an array, the items will be joined using `; `.
    */
  var uniqueHeaders: js.UndefOr[js.Array[String | js.Array[String]]] = js.undefined
}
object ServerOptionsHttps {
  
  inline def apply[Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
    ServerResponse[IncomingMessage]
  ] */](): ServerOptionsHttps[Request, Response] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerOptionsHttps[Request, Response]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServerOptionsHttps[?, ?], Request /* <: Instantiable1[/* socket */ Socket, IncomingMessage] */, Response /* <: Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
    ServerResponse[IncomingMessage]
  ] */] (val x: Self & (ServerOptionsHttps[Request, Response])) extends AnyVal {
    
    inline def setConnectionsCheckingInterval(value: Double): Self = StObject.set(x, "connectionsCheckingInterval", value.asInstanceOf[js.Any])
    
    inline def setConnectionsCheckingIntervalUndefined: Self = StObject.set(x, "connectionsCheckingInterval", js.undefined)
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    inline def setIncomingMessage(value: Request): Self = StObject.set(x, "IncomingMessage", value.asInstanceOf[js.Any])
    
    inline def setIncomingMessageUndefined: Self = StObject.set(x, "IncomingMessage", js.undefined)
    
    inline def setInsecureHTTPParser(value: Boolean): Self = StObject.set(x, "insecureHTTPParser", value.asInstanceOf[js.Any])
    
    inline def setInsecureHTTPParserUndefined: Self = StObject.set(x, "insecureHTTPParser", js.undefined)
    
    inline def setJoinDuplicateHeaders(value: Boolean): Self = StObject.set(x, "joinDuplicateHeaders", value.asInstanceOf[js.Any])
    
    inline def setJoinDuplicateHeadersUndefined: Self = StObject.set(x, "joinDuplicateHeaders", js.undefined)
    
    inline def setKeepAliveTimeout(value: Double): Self = StObject.set(x, "keepAliveTimeout", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveTimeoutUndefined: Self = StObject.set(x, "keepAliveTimeout", js.undefined)
    
    inline def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
    
    inline def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    inline def setServerResponse(value: Response): Self = StObject.set(x, "ServerResponse", value.asInstanceOf[js.Any])
    
    inline def setServerResponseUndefined: Self = StObject.set(x, "ServerResponse", js.undefined)
    
    inline def setUniqueHeaders(value: js.Array[String | js.Array[String]]): Self = StObject.set(x, "uniqueHeaders", value.asInstanceOf[js.Any])
    
    inline def setUniqueHeadersUndefined: Self = StObject.set(x, "uniqueHeaders", js.undefined)
    
    inline def setUniqueHeadersVarargs(value: (String | js.Array[String])*): Self = StObject.set(x, "uniqueHeaders", js.Array(value*))
  }
}

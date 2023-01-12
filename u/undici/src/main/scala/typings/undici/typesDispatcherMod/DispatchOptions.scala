package typings.undici.typesDispatcherMod

import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.IncomingHttpHeaders
import typings.node.streamMod.Readable
import typings.node.urlMod.URL_
import typings.std.Record
import typings.undici.typesFormdataMod.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DispatchOptions extends StObject {
  
  /** Default: `null` */
  var body: js.UndefOr[String | Buffer | js.typedarray.Uint8Array | Readable | Null | FormData] = js.undefined
  
  /** The timeout after which a request will time out, in milliseconds. Monitors time between receiving body data. Use 0 to disable it entirely. Defaults to 30 seconds. */
  var bodyTimeout: js.UndefOr[Double | Null] = js.undefined
  
  /** Default: `null` */
  var headers: js.UndefOr[IncomingHttpHeaders | js.Array[String] | Null] = js.undefined
  
  /** The amount of time the parser will wait to receive the complete HTTP headers. Defaults to 30 seconds. */
  var headersTimeout: js.UndefOr[Double | Null] = js.undefined
  
  /** Whether the requests can be safely retried or not. If `false` the request won't be sent until all preceding requests in the pipeline have completed. Default: `true` if `method` is `HEAD` or `GET`. */
  var idempotent: js.UndefOr[Boolean] = js.undefined
  
  var method: HttpMethod
  
  var origin: js.UndefOr[String | URL_] = js.undefined
  
  var path: String
  
  /** Query string params to be embedded in the request URL. Default: `null` */
  var query: js.UndefOr[Record[String, Any]] = js.undefined
  
  /** Whether Undici should throw an error upon receiving a 4xx or 5xx response from the server. Defaults to false */
  var throwOnError: js.UndefOr[Boolean] = js.undefined
  
  /** Upgrade the request. Should be used to specify the kind of upgrade i.e. `'Websocket'`. Default: `method === 'CONNECT' || null`. */
  var upgrade: js.UndefOr[Boolean | String | Null] = js.undefined
}
object DispatchOptions {
  
  inline def apply(method: HttpMethod, path: String): DispatchOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DispatchOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DispatchOptions] (val x: Self) extends AnyVal {
    
    inline def setBody(value: String | Buffer | js.typedarray.Uint8Array | Readable | FormData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyNull: Self = StObject.set(x, "body", null)
    
    inline def setBodyTimeout(value: Double): Self = StObject.set(x, "bodyTimeout", value.asInstanceOf[js.Any])
    
    inline def setBodyTimeoutNull: Self = StObject.set(x, "bodyTimeout", null)
    
    inline def setBodyTimeoutUndefined: Self = StObject.set(x, "bodyTimeout", js.undefined)
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeaders(value: IncomingHttpHeaders | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersTimeout(value: Double): Self = StObject.set(x, "headersTimeout", value.asInstanceOf[js.Any])
    
    inline def setHeadersTimeoutNull: Self = StObject.set(x, "headersTimeout", null)
    
    inline def setHeadersTimeoutUndefined: Self = StObject.set(x, "headersTimeout", js.undefined)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setIdempotent(value: Boolean): Self = StObject.set(x, "idempotent", value.asInstanceOf[js.Any])
    
    inline def setIdempotentUndefined: Self = StObject.set(x, "idempotent", js.undefined)
    
    inline def setMethod(value: HttpMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String | URL_): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: Record[String, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setThrowOnError(value: Boolean): Self = StObject.set(x, "throwOnError", value.asInstanceOf[js.Any])
    
    inline def setThrowOnErrorUndefined: Self = StObject.set(x, "throwOnError", js.undefined)
    
    inline def setUpgrade(value: Boolean | String): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
    
    inline def setUpgradeNull: Self = StObject.set(x, "upgrade", null)
    
    inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
  }
}

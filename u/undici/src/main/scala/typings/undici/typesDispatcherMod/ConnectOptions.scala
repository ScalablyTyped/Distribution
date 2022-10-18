package typings.undici.typesDispatcherMod

import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingHttpHeaders
import typings.undici.undiciStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectOptions extends StObject {
  
  /** Default: `null` */
  var headers: js.UndefOr[IncomingHttpHeaders | js.Array[String] | Null] = js.undefined
  
  /** Default: 0 */
  var maxRedirections: js.UndefOr[Double] = js.undefined
  
  /** This argument parameter is passed through to `ConnectData` */
  var opaque: js.UndefOr[Any] = js.undefined
  
  var path: String
  
  /** Default: `null` */
  var responseHeader: js.UndefOr[raw | Null] = js.undefined
  
  /** Default: `null` */
  var signal: js.UndefOr[AbortSignal | EventEmitter | Null] = js.undefined
}
object ConnectOptions {
  
  inline def apply(path: String): ConnectOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
  
  extension [Self <: ConnectOptions](x: Self) {
    
    inline def setHeaders(value: IncomingHttpHeaders | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setMaxRedirections(value: Double): Self = StObject.set(x, "maxRedirections", value.asInstanceOf[js.Any])
    
    inline def setMaxRedirectionsUndefined: Self = StObject.set(x, "maxRedirections", js.undefined)
    
    inline def setOpaque(value: Any): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
    
    inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setResponseHeader(value: raw): Self = StObject.set(x, "responseHeader", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaderNull: Self = StObject.set(x, "responseHeader", null)
    
    inline def setResponseHeaderUndefined: Self = StObject.set(x, "responseHeader", js.undefined)
    
    inline def setSignal(value: AbortSignal | EventEmitter): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalNull: Self = StObject.set(x, "signal", null)
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}

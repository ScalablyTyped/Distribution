package typings.undici.anon

import typings.node.eventsMod.EventEmitter
import typings.undici.typesDispatcherMod.AbortSignal
import typings.undici.typesDispatcherMod.default
import typings.undici.typesHeaderMod.IncomingHttpHeaders
import typings.undici.undiciStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  dispatcher :undici.undici/types/dispatcher.default | undefined} & std.Omit<undici.undici/types/dispatcher.default.UpgradeOptions, 'origin' | 'path'> */
trait dispatcherdefaultundefineHeaders extends StObject {
  
  var dispatcher: js.UndefOr[default] = js.undefined
  
  var headers: js.UndefOr[IncomingHttpHeaders | js.Array[String] | Null] = js.undefined
  
  var maxRedirections: js.UndefOr[Double] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var protocol: js.UndefOr[String] = js.undefined
  
  var responseHeader: js.UndefOr[raw | Null] = js.undefined
  
  var signal: js.UndefOr[AbortSignal | EventEmitter | Null] = js.undefined
}
object dispatcherdefaultundefineHeaders {
  
  inline def apply(): dispatcherdefaultundefineHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dispatcherdefaultundefineHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dispatcherdefaultundefineHeaders] (val x: Self) extends AnyVal {
    
    inline def setDispatcher(value: default): Self = StObject.set(x, "dispatcher", value.asInstanceOf[js.Any])
    
    inline def setDispatcherUndefined: Self = StObject.set(x, "dispatcher", js.undefined)
    
    inline def setHeaders(value: IncomingHttpHeaders | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersNull: Self = StObject.set(x, "headers", null)
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setMaxRedirections(value: Double): Self = StObject.set(x, "maxRedirections", value.asInstanceOf[js.Any])
    
    inline def setMaxRedirectionsUndefined: Self = StObject.set(x, "maxRedirections", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setResponseHeader(value: raw): Self = StObject.set(x, "responseHeader", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaderNull: Self = StObject.set(x, "responseHeader", null)
    
    inline def setResponseHeaderUndefined: Self = StObject.set(x, "responseHeader", js.undefined)
    
    inline def setSignal(value: AbortSignal | EventEmitter): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalNull: Self = StObject.set(x, "signal", null)
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}

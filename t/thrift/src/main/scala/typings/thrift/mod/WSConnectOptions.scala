package typings.thrift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WSConnectOptions extends StObject {
  
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var protocol: js.UndefOr[TProtocolConstructor] = js.undefined
  
  var secure: js.UndefOr[Boolean] = js.undefined
  
  var transport: js.UndefOr[TTransportConstructor] = js.undefined
  
  var wsOptions: js.UndefOr[WSOptions] = js.undefined
}
object WSConnectOptions {
  
  inline def apply(): WSConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WSConnectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WSConnectOptions] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setProtocol(value: TProtocolConstructor): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setTransport(value: TTransportConstructor): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    inline def setWsOptions(value: WSOptions): Self = StObject.set(x, "wsOptions", value.asInstanceOf[js.Any])
    
    inline def setWsOptionsUndefined: Self = StObject.set(x, "wsOptions", js.undefined)
  }
}

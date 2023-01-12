package typings.thrift.mod

import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectOptions extends StObject {
  
  var connect_timeout: js.UndefOr[Double] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  
  var https: js.UndefOr[Boolean] = js.undefined
  
  var max_attempts: js.UndefOr[Double] = js.undefined
  
  var nodeOptions: js.UndefOr[RequestOptions | typings.node.httpsMod.RequestOptions] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var protocol: js.UndefOr[TProtocolConstructor] = js.undefined
  
  var retry_max_delay: js.UndefOr[Double] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var transport: js.UndefOr[TTransportConstructor] = js.undefined
}
object ConnectOptions {
  
  inline def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
    inline def setConnect_timeout(value: Double): Self = StObject.set(x, "connect_timeout", value.asInstanceOf[js.Any])
    
    inline def setConnect_timeoutUndefined: Self = StObject.set(x, "connect_timeout", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    inline def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    inline def setMax_attempts(value: Double): Self = StObject.set(x, "max_attempts", value.asInstanceOf[js.Any])
    
    inline def setMax_attemptsUndefined: Self = StObject.set(x, "max_attempts", js.undefined)
    
    inline def setNodeOptions(value: RequestOptions | typings.node.httpsMod.RequestOptions): Self = StObject.set(x, "nodeOptions", value.asInstanceOf[js.Any])
    
    inline def setNodeOptionsUndefined: Self = StObject.set(x, "nodeOptions", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setProtocol(value: TProtocolConstructor): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setRetry_max_delay(value: Double): Self = StObject.set(x, "retry_max_delay", value.asInstanceOf[js.Any])
    
    inline def setRetry_max_delayUndefined: Self = StObject.set(x, "retry_max_delay", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTransport(value: TTransportConstructor): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}

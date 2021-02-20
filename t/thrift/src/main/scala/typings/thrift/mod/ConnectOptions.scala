package typings.thrift.mod

import typings.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectOptions extends StObject {
  
  var connect_timeout: js.UndefOr[Double] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[HttpHeaders] = js.native
  
  var https: js.UndefOr[Boolean] = js.native
  
  var max_attempts: js.UndefOr[Double] = js.native
  
  var nodeOptions: js.UndefOr[RequestOptions | typings.node.httpsMod.RequestOptions] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[TProtocolConstructor] = js.native
  
  var retry_max_delay: js.UndefOr[Double] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var transport: js.UndefOr[TTransportConstructor] = js.native
}
object ConnectOptions {
  
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit class ConnectOptionsMutableBuilder[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnect_timeout(value: Double): Self = StObject.set(x, "connect_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnect_timeoutUndefined: Self = StObject.set(x, "connect_timeout", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHttps(value: Boolean): Self = StObject.set(x, "https", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpsUndefined: Self = StObject.set(x, "https", js.undefined)
    
    @scala.inline
    def setMax_attempts(value: Double): Self = StObject.set(x, "max_attempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax_attemptsUndefined: Self = StObject.set(x, "max_attempts", js.undefined)
    
    @scala.inline
    def setNodeOptions(value: RequestOptions | typings.node.httpsMod.RequestOptions): Self = StObject.set(x, "nodeOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeOptionsUndefined: Self = StObject.set(x, "nodeOptions", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setProtocol(value: TProtocolConstructor): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setRetry_max_delay(value: Double): Self = StObject.set(x, "retry_max_delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetry_max_delayUndefined: Self = StObject.set(x, "retry_max_delay", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setTransport(value: TTransportConstructor): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
  }
}

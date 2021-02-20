package typings.thrift.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WSConnectOptions extends StObject {
  
  var headers: js.UndefOr[HttpHeaders] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var protocol: js.UndefOr[TProtocolConstructor] = js.native
  
  var secure: js.UndefOr[Boolean] = js.native
  
  var transport: js.UndefOr[TTransportConstructor] = js.native
  
  var wsOptions: js.UndefOr[WSOptions] = js.native
}
object WSConnectOptions {
  
  @scala.inline
  def apply(): WSConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WSConnectOptions]
  }
  
  @scala.inline
  implicit class WSConnectOptionsMutableBuilder[Self <: WSConnectOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setProtocol(value: TProtocolConstructor): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setTransport(value: TTransportConstructor): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    
    @scala.inline
    def setWsOptions(value: WSOptions): Self = StObject.set(x, "wsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsOptionsUndefined: Self = StObject.set(x, "wsOptions", js.undefined)
  }
}

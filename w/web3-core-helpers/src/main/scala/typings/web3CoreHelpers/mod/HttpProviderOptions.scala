package typings.web3CoreHelpers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpProviderOptions extends StObject {
  
  var agent: js.UndefOr[HttpAgent] = js.undefined
  
  var headers: js.UndefOr[js.Array[HttpHeader]] = js.undefined
  
  var keepAlive: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}
object HttpProviderOptions {
  
  inline def apply(): HttpProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpProviderOptions]
  }
  
  extension [Self <: HttpProviderOptions](x: Self) {
    
    inline def setAgent(value: HttpAgent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setHeaders(value: js.Array[HttpHeader]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: HttpHeader*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    inline def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
    
    inline def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}

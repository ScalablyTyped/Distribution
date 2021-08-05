package typings.wampy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterCallbacksHash extends StObject {
  
  var onError: js.UndefOr[ErrorCallback] = js.undefined
  
  var onSuccess: js.UndefOr[Callback] = js.undefined
  
  def rpc(args: DataArgs): RPCResult | Unit
  @JSName("rpc")
  var rpc_Original: RPCCallback
}
object RegisterCallbacksHash {
  
  inline def apply(rpc: /* args */ DataArgs => RPCResult | Unit): RegisterCallbacksHash = {
    val __obj = js.Dynamic.literal(rpc = js.Any.fromFunction1(rpc))
    __obj.asInstanceOf[RegisterCallbacksHash]
  }
  
  extension [Self <: RegisterCallbacksHash](x: Self) {
    
    inline def setOnError(value: /* args */ ErrorArgs => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnSuccess(value: () => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction0(value))
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    
    inline def setRpc(value: /* args */ DataArgs => RPCResult | Unit): Self = StObject.set(x, "rpc", js.Any.fromFunction1(value))
  }
}

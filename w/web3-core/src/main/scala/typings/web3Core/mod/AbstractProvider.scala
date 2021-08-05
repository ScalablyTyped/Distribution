package typings.web3Core.mod

import typings.std.Error
import typings.web3CoreHelpers.mod.JsonRpcPayload
import typings.web3CoreHelpers.mod.JsonRpcResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractProvider
  extends StObject
     with _provider {
  
  var connected: js.UndefOr[Boolean] = js.undefined
  
  var request: js.UndefOr[js.Function1[/* args */ RequestArguments, js.Promise[js.Any]]] = js.undefined
  
  var send: js.UndefOr[
    js.Function2[
      /* payload */ JsonRpcPayload, 
      /* callback */ js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit], 
      Unit
    ]
  ] = js.undefined
  
  def sendAsync(
    payload: JsonRpcPayload,
    callback: js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]
  ): Unit
}
object AbstractProvider {
  
  inline def apply(
    sendAsync: (JsonRpcPayload, js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
  ): AbstractProvider = {
    val __obj = js.Dynamic.literal(sendAsync = js.Any.fromFunction2(sendAsync))
    __obj.asInstanceOf[AbstractProvider]
  }
  
  extension [Self <: AbstractProvider](x: Self) {
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
    
    inline def setRequest(value: /* args */ RequestArguments => js.Promise[js.Any]): Self = StObject.set(x, "request", js.Any.fromFunction1(value))
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setSend(
      value: (/* payload */ JsonRpcPayload, /* callback */ js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
    ): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    
    inline def setSendAsync(
      value: (JsonRpcPayload, js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Unit]) => Unit
    ): Self = StObject.set(x, "sendAsync", js.Any.fromFunction2(value))
    
    inline def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
  }
}

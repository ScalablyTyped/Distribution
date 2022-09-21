package typings.web3Core.mod

import typings.web3CoreHelpers.mod.JsonRpcPayload
import typings.web3CoreHelpers.mod.JsonRpcResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractProvider
  extends StObject
     with _provider {
  
  var connected: js.UndefOr[Boolean] = js.native
  
  var request: js.UndefOr[js.Function1[/* args */ RequestArguments, js.Promise[Any]]] = js.native
  
  var send: js.UndefOr[
    js.Function2[
      /* payload */ JsonRpcPayload, 
      /* callback */ js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[JsonRpcResponse], Any], 
      Unit
    ]
  ] = js.native
  
  def sendAsync(payload: JsonRpcPayload): Unit = js.native
  def sendAsync(
    payload: JsonRpcPayload,
    callback: js.Function2[
      /* error */ js.Error | Null, 
      /* result */ js.UndefOr[JsonRpcResponse], 
      js.Promise[Any] | Unit
    ]
  ): Unit = js.native
}

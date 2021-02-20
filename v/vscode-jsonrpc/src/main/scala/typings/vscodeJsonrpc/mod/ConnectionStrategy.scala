package typings.vscodeJsonrpc.mod

import typings.vscodeJsonrpc.messagesMod.Message
import typings.vscodeJsonrpc.messagesMod.ResponseMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionStrategy extends StObject {
  
  var cancelUndispatched: js.UndefOr[
    js.Function2[
      /* message */ Message, 
      /* next */ js.Function1[/* message */ Message, js.UndefOr[ResponseMessage]], 
      js.UndefOr[ResponseMessage]
    ]
  ] = js.native
}
object ConnectionStrategy {
  
  @scala.inline
  def apply(): ConnectionStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionStrategy]
  }
  
  @JSImport("vscode-jsonrpc", "ConnectionStrategy.is")
  @js.native
  def is(value: js.Any): /* is vscode-jsonrpc.vscode-jsonrpc.ConnectionStrategy */ Boolean = js.native
  
  @scala.inline
  implicit class ConnectionStrategyMutableBuilder[Self <: ConnectionStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelUndispatched(
      value: (/* message */ Message, /* next */ js.Function1[/* message */ Message, js.UndefOr[ResponseMessage]]) => js.UndefOr[ResponseMessage]
    ): Self = StObject.set(x, "cancelUndispatched", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCancelUndispatchedUndefined: Self = StObject.set(x, "cancelUndispatched", js.undefined)
  }
}

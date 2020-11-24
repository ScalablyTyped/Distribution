package typings.vscodeJsonrpc.mod

import typings.vscodeJsonrpc.messagesMod.Message
import typings.vscodeJsonrpc.messagesMod.ResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionStrategy extends js.Object {
  
  var cancelUndispatched: js.UndefOr[
    js.Function2[
      /* message */ Message, 
      /* next */ js.Function1[/* message */ Message, js.UndefOr[ResponseMessage]], 
      js.UndefOr[ResponseMessage]
    ]
  ] = js.native
}
@JSImport("vscode-jsonrpc", "ConnectionStrategy")
@js.native
object ConnectionStrategy extends js.Object {
  
  def is(value: js.Any): /* is vscode-jsonrpc.vscode-jsonrpc.ConnectionStrategy */ Boolean = js.native
}

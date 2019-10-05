package typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod

import typings.vscodeDashJsonrpc.libMessagesMod.Message
import typings.vscodeDashJsonrpc.libMessagesMod.ResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionStrategy extends js.Object {
  var cancelUndispatched: js.UndefOr[
    js.Function2[
      /* message */ Message, 
      /* next */ js.Function1[/* message */ Message, js.UndefOr[ResponseMessage]], 
      js.UndefOr[ResponseMessage]
    ]
  ] = js.undefined
}

@JSImport("vscode-jsonrpc", "ConnectionStrategy")
@js.native
object ConnectionStrategy extends js.Object {
  def is(value: js.Any): /* is vscode-jsonrpc.vscode-jsonrpc.ConnectionStrategy */ Boolean = js.native
}


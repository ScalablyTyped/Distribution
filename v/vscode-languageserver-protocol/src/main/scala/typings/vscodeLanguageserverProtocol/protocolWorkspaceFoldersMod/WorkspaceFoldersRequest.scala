package typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import typings.vscodeJsonrpc.cancellationMod.CancellationToken
import typings.vscodeJsonrpc.mod.HandlerResult
import typings.vscodeJsonrpc.mod.RequestHandler0
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "WorkspaceFoldersRequest")
@js.native
object WorkspaceFoldersRequest extends js.Object {
  
  val `type`: ProtocolRequestType0[js.Array[WorkspaceFolder] | Null, scala.Nothing, Unit, Unit] = js.native
  
  type HandlerSignature = RequestHandler0[js.Array[WorkspaceFolder] | Null, Unit]
  
  type MiddlewareSignature = js.Function2[
    /* token */ CancellationToken, 
    /* next */ HandlerSignature, 
    HandlerResult[js.Array[WorkspaceFolder] | Null, Unit]
  ]
}

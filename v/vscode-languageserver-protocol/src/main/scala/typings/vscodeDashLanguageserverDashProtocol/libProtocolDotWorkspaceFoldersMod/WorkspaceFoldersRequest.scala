package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod

import typings.vscodeDashJsonrpc.libCancellationMod.CancellationToken
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.HandlerResult
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestHandler0
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.RequestType0
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod.WorkspaceFoldersRequest.HandlerSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "WorkspaceFoldersRequest")
@js.native
object WorkspaceFoldersRequest extends js.Object {
  val `type`: RequestType0[js.Array[WorkspaceFolder] | Null, Unit, Unit] = js.native
  type HandlerSignature = RequestHandler0[js.Array[WorkspaceFolder] | Null, Unit]
  type MiddlewareSignature = js.Function2[
    /* token */ CancellationToken, 
    /* next */ HandlerSignature, 
    HandlerResult[js.Array[WorkspaceFolder] | Null, Unit]
  ]
}


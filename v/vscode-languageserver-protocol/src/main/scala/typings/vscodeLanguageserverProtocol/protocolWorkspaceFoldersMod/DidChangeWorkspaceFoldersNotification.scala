package typings.vscodeLanguageserverProtocol.protocolWorkspaceFoldersMod

import typings.vscodeJsonrpc.mod.NotificationHandler
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "DidChangeWorkspaceFoldersNotification")
@js.native
object DidChangeWorkspaceFoldersNotification extends js.Object {
  val `type`: ProtocolNotificationType[DidChangeWorkspaceFoldersParams, Unit] = js.native
  type HandlerSignature = NotificationHandler[DidChangeWorkspaceFoldersParams]
  type MiddlewareSignature = js.Function2[/* params */ DidChangeWorkspaceFoldersParams, /* next */ HandlerSignature, Unit]
}


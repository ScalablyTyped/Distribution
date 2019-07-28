package typings.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod

import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationHandler
import typings.vscodeDashJsonrpc.vscodeDashJsonrpcMod.NotificationType
import typings.vscodeDashLanguageserverDashProtocol.libProtocolDotWorkspaceFoldersMod.DidChangeWorkspaceFoldersNotificationNs.HandlerSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "DidChangeWorkspaceFoldersNotification")
@js.native
object DidChangeWorkspaceFoldersNotificationNs extends js.Object {
  val `type`: NotificationType[DidChangeWorkspaceFoldersParams, Unit] = js.native
  type HandlerSignature = NotificationHandler[DidChangeWorkspaceFoldersParams]
  type MiddlewareSignature = js.Function2[/* params */ DidChangeWorkspaceFoldersParams, /* next */ HandlerSignature, Unit]
}


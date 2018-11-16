package typings
package vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol.workspaceFolders", "DidChangeWorkspaceFoldersNotification")
@js.native
object DidChangeWorkspaceFoldersNotificationNs extends js.Object {
  val `type`: vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationType[
    vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.DidChangeWorkspaceFoldersParams, 
    scala.Unit
  ] = js.native
  type HandlerSignature = vscodeDashJsonrpcLib.vscodeDashJsonrpcMod.NotificationHandler[
    vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.DidChangeWorkspaceFoldersParams
  ]
  type MiddlewareSignature = js.Function2[
    /* params */ vscodeDashLanguageserverDashProtocolLib.libProtocolDotWorkspaceFoldersMod.DidChangeWorkspaceFoldersParams, 
    /* next */ HandlerSignature, 
    scala.Unit
  ]
}


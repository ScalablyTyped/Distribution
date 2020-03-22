package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditParams
import typings.vscodeLanguageserverProtocol.protocolMod.ApplyWorkspaceEditResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "ApplyWorkspaceEditRequest")
@js.native
object ApplyWorkspaceEditRequest extends js.Object {
  val `type`: ProtocolRequestType[ApplyWorkspaceEditParams, ApplyWorkspaceEditResponse, scala.Nothing, Unit, Unit] = js.native
}


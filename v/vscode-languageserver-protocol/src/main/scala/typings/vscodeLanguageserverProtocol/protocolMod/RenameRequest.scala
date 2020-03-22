package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashrename
import typings.vscodeLanguageserverTypes.mod.WorkspaceEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "RenameRequest")
@js.native
object RenameRequest extends js.Object {
  val method: textDocumentSlashrename = js.native
  val `type`: ProtocolRequestType[RenameParams, WorkspaceEdit | Null, scala.Nothing, Unit, RenameRegistrationOptions] = js.native
}


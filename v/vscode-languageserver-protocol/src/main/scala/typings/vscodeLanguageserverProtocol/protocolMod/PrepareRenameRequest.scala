package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.AnonPlaceholder
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareRename
import typings.vscodeLanguageserverTypes.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol/lib/protocol", "PrepareRenameRequest")
@js.native
object PrepareRenameRequest extends js.Object {
  val method: textDocumentSlashprepareRename = js.native
  val `type`: ProtocolRequestType[PrepareRenameParams, Range | AnonPlaceholder | Null, scala.Nothing, Unit, Unit] = js.native
}


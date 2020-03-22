package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.AnonPlaceholder
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.PrepareRenameParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareRename
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver-protocol", "PrepareRenameRequest")
@js.native
object PrepareRenameRequest extends js.Object {
  val method: textDocumentSlashprepareRename = js.native
  val `type`: ProtocolRequestType[
    PrepareRenameParams, 
    typings.vscodeLanguageserverTypes.mod.Range | AnonPlaceholder | Null, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}


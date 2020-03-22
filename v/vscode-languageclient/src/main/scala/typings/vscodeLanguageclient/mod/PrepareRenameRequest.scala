package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashprepareRename
import typings.vscodeLanguageserverProtocol.AnonPlaceholder
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.PrepareRenameParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageclient", "PrepareRenameRequest")
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


package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.textDocumentSlashprepareRename
import typings.vscodeLanguageserverProtocol.anon.Placeholder
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.PrepareRenameParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode-languageserver", "PrepareRenameRequest")
@js.native
object PrepareRenameRequest extends js.Object {
  val method: textDocumentSlashprepareRename = js.native
  val `type`: ProtocolRequestType[
    PrepareRenameParams, 
    typings.vscodeLanguageserverTypes.mod.Range | Placeholder | Null, 
    scala.Nothing, 
    Unit, 
    Unit
  ] = js.native
}


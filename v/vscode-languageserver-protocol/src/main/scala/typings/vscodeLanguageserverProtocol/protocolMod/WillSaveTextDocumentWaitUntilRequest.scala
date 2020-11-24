package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashwillSaveWaitUntil
import typings.vscodeLanguageserverTypes.mod.TextEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol/lib/protocol", "WillSaveTextDocumentWaitUntilRequest")
@js.native
object WillSaveTextDocumentWaitUntilRequest extends js.Object {
  
  val method: textDocumentSlashwillSaveWaitUntil = js.native
  
  val `type`: ProtocolRequestType[
    WillSaveTextDocumentParams, 
    js.Array[TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

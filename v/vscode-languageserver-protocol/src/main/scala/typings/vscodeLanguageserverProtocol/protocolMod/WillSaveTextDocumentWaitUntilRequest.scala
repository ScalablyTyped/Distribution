package typings.vscodeLanguageserverProtocol.protocolMod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashwillSaveWaitUntil
import typings.vscodeLanguageserverTypes.mod.TextEdit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillSaveTextDocumentWaitUntilRequest {
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "WillSaveTextDocumentWaitUntilRequest.method")
  @js.native
  val method: textDocumentSlashwillSaveWaitUntil = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/protocol", "WillSaveTextDocumentWaitUntilRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    WillSaveTextDocumentParams, 
    js.Array[TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    TextDocumentRegistrationOptions
  ] = js.native
}

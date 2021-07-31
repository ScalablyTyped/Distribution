package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashwillSaveWaitUntil
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillSaveTextDocumentWaitUntilRequest {
  
  @JSImport("vscode-languageserver-protocol", "WillSaveTextDocumentWaitUntilRequest.method")
  @js.native
  val method: textDocumentSlashwillSaveWaitUntil = js.native
  
  @JSImport("vscode-languageserver-protocol", "WillSaveTextDocumentWaitUntilRequest.type")
  @js.native
  val `type`: ProtocolRequestType[
    WillSaveTextDocumentParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}

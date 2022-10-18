package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashwillSaveWaitUntil
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WillSaveTextDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillSaveTextDocumentWaitUntilRequest {
  
  @JSImport("vscode-languageclient", "WillSaveTextDocumentWaitUntilRequest.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "WillSaveTextDocumentWaitUntilRequest.method")
  @js.native
  val method: textDocumentSlashwillSaveWaitUntil = js.native
  
  @JSImport("vscode-languageclient", "WillSaveTextDocumentWaitUntilRequest.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType[
    WillSaveTextDocumentParams, 
    js.Array[typings.vscodeLanguageserverTypes.mod.TextEdit] | Null, 
    scala.Nothing, 
    Unit, 
    typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
  ] = js.native
}

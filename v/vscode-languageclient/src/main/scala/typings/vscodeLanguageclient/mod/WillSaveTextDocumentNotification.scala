package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashwillSave
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WillSaveTextDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillSaveTextDocumentNotification {
  
  @JSImport("vscode-languageclient", "WillSaveTextDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "WillSaveTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashwillSave = js.native
  
  @JSImport("vscode-languageclient", "WillSaveTextDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[
    WillSaveTextDocumentParams, 
    typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
  ] = js.native
}

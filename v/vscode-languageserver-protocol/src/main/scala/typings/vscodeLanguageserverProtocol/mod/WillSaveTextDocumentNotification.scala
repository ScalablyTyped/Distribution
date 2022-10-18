package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WillSaveTextDocumentParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashwillSave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillSaveTextDocumentNotification {
  
  @JSImport("vscode-languageserver-protocol", "WillSaveTextDocumentNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "WillSaveTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashwillSave = js.native
  
  @JSImport("vscode-languageserver-protocol", "WillSaveTextDocumentNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[
    WillSaveTextDocumentParams, 
    typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
  ] = js.native
}

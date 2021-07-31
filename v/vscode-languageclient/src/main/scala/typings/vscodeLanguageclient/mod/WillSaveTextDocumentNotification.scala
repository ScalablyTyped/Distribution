package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashwillSave
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.protocolMod.WillSaveTextDocumentParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WillSaveTextDocumentNotification {
  
  @JSImport("vscode-languageclient", "WillSaveTextDocumentNotification.method")
  @js.native
  val method: textDocumentSlashwillSave = js.native
  
  @JSImport("vscode-languageclient", "WillSaveTextDocumentNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[
    WillSaveTextDocumentParams, 
    typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
  ] = js.native
}

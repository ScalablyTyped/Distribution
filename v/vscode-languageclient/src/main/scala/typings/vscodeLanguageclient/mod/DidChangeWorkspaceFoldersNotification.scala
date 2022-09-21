package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashdidChangeWorkspaceFolders
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFolderMod.DidChangeWorkspaceFoldersParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeWorkspaceFoldersNotification {
  
  @JSImport("vscode-languageclient", "DidChangeWorkspaceFoldersNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidChangeWorkspaceFoldersNotification.method")
  @js.native
  val method: workspaceSlashdidChangeWorkspaceFolders = js.native
  
  @JSImport("vscode-languageclient", "DidChangeWorkspaceFoldersNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType[DidChangeWorkspaceFoldersParams, Unit] = js.native
}

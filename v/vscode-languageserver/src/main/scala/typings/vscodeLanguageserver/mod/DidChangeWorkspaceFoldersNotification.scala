package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.workspaceSlashdidChangeWorkspaceFolders
import typings.vscodeLanguageserverProtocol.protocolWorkspaceFolderMod.DidChangeWorkspaceFoldersParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeWorkspaceFoldersNotification {
  
  @JSImport("vscode-languageserver", "DidChangeWorkspaceFoldersNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DidChangeWorkspaceFoldersNotification.method")
  @js.native
  val method: workspaceSlashdidChangeWorkspaceFolders = js.native
  
  @JSImport("vscode-languageserver", "DidChangeWorkspaceFoldersNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType[DidChangeWorkspaceFoldersParams, Unit] = js.native
}

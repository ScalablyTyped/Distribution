package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.libCommonProtocolDotworkspaceFolderMod.DidChangeWorkspaceFoldersParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashdidChangeWorkspaceFolders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeWorkspaceFoldersNotification {
  
  @JSImport("vscode-languageserver-protocol", "DidChangeWorkspaceFoldersNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol", "DidChangeWorkspaceFoldersNotification.method")
  @js.native
  val method: workspaceSlashdidChangeWorkspaceFolders = js.native
  
  @JSImport("vscode-languageserver-protocol", "DidChangeWorkspaceFoldersNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidChangeWorkspaceFoldersParams, Unit] = js.native
}

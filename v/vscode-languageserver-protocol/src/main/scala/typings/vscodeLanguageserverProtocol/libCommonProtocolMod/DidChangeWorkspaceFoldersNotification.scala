package typings.vscodeLanguageserverProtocol.libCommonProtocolMod

import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotworkspaceFolderMod.DidChangeWorkspaceFoldersParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashdidChangeWorkspaceFolders
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeWorkspaceFoldersNotification {
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidChangeWorkspaceFoldersNotification.messageDirection")
  @js.native
  val messageDirection: MessageDirection = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidChangeWorkspaceFoldersNotification.method")
  @js.native
  val method: workspaceSlashdidChangeWorkspaceFolders = js.native
  
  @JSImport("vscode-languageserver-protocol/lib/common/protocol", "DidChangeWorkspaceFoldersNotification.type")
  @js.native
  val `type`: ProtocolNotificationType[DidChangeWorkspaceFoldersParams, Unit] = js.native
}

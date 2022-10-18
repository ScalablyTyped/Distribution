package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.workspaceSlashdidChangeWatchedFiles
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeWatchedFilesParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeWatchedFilesRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeWatchedFilesNotification {
  
  @JSImport("vscode-languageserver", "DidChangeWatchedFilesNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DidChangeWatchedFilesNotification.method")
  @js.native
  val method: workspaceSlashdidChangeWatchedFiles = js.native
  
  @JSImport("vscode-languageserver", "DidChangeWatchedFilesNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidChangeWatchedFilesParams, DidChangeWatchedFilesRegistrationOptions] = js.native
}

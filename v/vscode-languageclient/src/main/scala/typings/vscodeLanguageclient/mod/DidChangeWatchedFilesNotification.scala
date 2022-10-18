package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashdidChangeWatchedFiles
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeWatchedFilesParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.DidChangeWatchedFilesRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidChangeWatchedFilesNotification {
  
  @JSImport("vscode-languageclient", "DidChangeWatchedFilesNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidChangeWatchedFilesNotification.method")
  @js.native
  val method: workspaceSlashdidChangeWatchedFiles = js.native
  
  @JSImport("vscode-languageclient", "DidChangeWatchedFilesNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DidChangeWatchedFilesParams, DidChangeWatchedFilesRegistrationOptions] = js.native
}

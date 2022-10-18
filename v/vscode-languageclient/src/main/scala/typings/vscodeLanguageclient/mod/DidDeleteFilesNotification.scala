package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.workspaceSlashdidDeleteFiles
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.DeleteFilesParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolDotfileOperationsMod.FileOperationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidDeleteFilesNotification {
  
  @JSImport("vscode-languageclient", "DidDeleteFilesNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageclient", "DidDeleteFilesNotification.method")
  @js.native
  val method: workspaceSlashdidDeleteFiles = js.native
  
  @JSImport("vscode-languageclient", "DidDeleteFilesNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolNotificationType[DeleteFilesParams, FileOperationRegistrationOptions] = js.native
}

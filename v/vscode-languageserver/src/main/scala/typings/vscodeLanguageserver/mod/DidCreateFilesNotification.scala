package typings.vscodeLanguageserver.mod

import typings.vscodeLanguageserver.vscodeLanguageserverStrings.workspaceSlashdidCreateFiles
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.CreateFilesParams
import typings.vscodeLanguageserverProtocol.protocolFileOperationsMod.FileOperationRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DidCreateFilesNotification {
  
  @JSImport("vscode-languageserver", "DidCreateFilesNotification.messageDirection")
  @js.native
  val messageDirection: typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection = js.native
  
  @JSImport("vscode-languageserver", "DidCreateFilesNotification.method")
  @js.native
  val method: workspaceSlashdidCreateFiles = js.native
  
  @JSImport("vscode-languageserver", "DidCreateFilesNotification.type")
  @js.native
  val `type`: typings.vscodeLanguageserverProtocol.messagesMod.ProtocolNotificationType[CreateFilesParams, FileOperationRegistrationOptions] = js.native
}
